package sr;

import ai_lejos.interfaces.Constants;

import lejos.nxt.LCD;
import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.addon.CompassHTSensor;
import lejos.nxt.UltrasonicSensor;

public class SensorListener implements Runnable, Constants {

    LightSensor s1;
    LightSensor s2;
    LightSensor s3;
    CompassHTSensor c1;
    UltrasonicSensor u1;
    //SensorValues values;

    public SensorListener(SensorValues values, LightSensor s1, LightSensor s2, LightSensor s3, CompassHTSensor c1,UltrasonicSensor u1) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.c1 = c1;
        this.u1 = u1;
  
        //this.values = values;
    }

    @Override
    public void run() {
        while (true) {
            SensorValues.lightR = s1.getLightValue();
            SensorValues.lightL = s2.getLightValue();
            SensorValues.light3 = s3.getLightValue();
            SensorValues.compass = c1.getDegrees();
            SensorValues.ultraDist = u1.getDistance();
            SensorValues.ultra = u1.getRange();
            
            
            
            
            
            
            SensorValues.setTachoValue(TachoA, Motor.A.getTachoCount());
            SensorValues.setTachoValue(TachoB, Motor.B.getTachoCount());
            SensorValues.setTachoValue(TachoC, Motor.C.getTachoCount());
            


            LCD.drawString("LightSensorR: " + Integer.toString(SensorValues.lightR), 0, 0);
            LCD.drawString("LightSensorL: " + Integer.toString(SensorValues.lightL), 0, 1);
            LCD.drawString("LightSensor3: " + Integer.toString(SensorValues.light3), 0, 2);
            
            LCD.drawString("TachoA " + Integer.toString(SensorValues.getTachoValue(TachoA)), 0, 3);
            LCD.drawString("TachoB " + Integer.toString(SensorValues.getTachoValue(TachoB)), 0, 4);
            LCD.drawString("TachoC " + Integer.toString(SensorValues.getTachoValue(TachoC)), 0, 5);
            LCD.drawString("URange "+ Float.toString(SensorValues.ultra), 0,6);
            LCD.drawString("UDist "+ Integer.toString(SensorValues.ultraDist), 0,7);
            
           
            //LCD.drawString("Compass" + Float.toString(SensorValues.compass),0,7);
            
            
        }
    }
}
