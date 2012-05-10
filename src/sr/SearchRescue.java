package sr;

import lejos.nxt.Button;
import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.NXT;
import lejos.nxt.SensorPort;
import lejos.nxt.addon.CompassHTSensor;
import lejos.nxt.addon.NXTCam;
import lejos.nxt.UltrasonicSensor;

public class SearchRescue {

    public static void main(String[] args) {

        LightSensor s1;
        LightSensor s2;
        LightSensor s3;
        CompassHTSensor c1;
        NXTCam n1;
        UltrasonicSensor u1;




        s1 = new LightSensor(SensorPort.S1);
        s2 = new LightSensor(SensorPort.S2);
        s3 = new LightSensor(SensorPort.S3);
        c1 = new CompassHTSensor(SensorPort.S4);
        u1 = new UltrasonicSensor(SensorPort.S1);

        SensorValues sensorValues = new SensorValues();
        SensorListener sensorListener = new SensorListener(sensorValues, s1, s2, s3, c1, u1);

        new Thread(sensorListener).start();

        Motor.C.suspendRegulation();
        //Motor.C.setStallThreshold(800, 10);
Motor.A.setSpeed(800);
Motor.B.setSpeed(800);


        Motor.C.setSpeed(100);

        while (true) {
            
            Motor.C.backward();
            
            Motor.A.backward();
            Motor.B.backward();

            //while (!Motor.C.isStalled()) {
                
            //}
            //Motor.C.stop();        
            
            Button.waitForAnyPress();
            
            Motor.C.forward();
            
            Motor.A.forward();
            Motor.B.forward();
            
            //while (!Motor.C.isStalled()) {
                
            //}
            //Motor.C.stop();
            Button.waitForAnyPress();
        }


    }
}
