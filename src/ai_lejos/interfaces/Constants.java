package ai_lejos.interfaces;

public interface Constants {
	public static final int FORWARD = 1;
	public static final int LEFT = 2;
	public static final int RIGHT = 3;
        public static final int RELEASE = 4;
        public static final int BREAK = 5;
        public static final int PAUSE =6;
	
	public static final int LightSensorR = 0;
	public static final int LightSensorL = 1;
	public static final int LightSensor3 = 2;
	public static final int TachoA = 0;
	public static final int TachoB = 1;
	public static final int TachoC = 2;
        
 /*
 
S1,S2 = sensor 1 and 2.
MA,MB = motor A and B.
TMA, TMB = tacometer
--
S*(0)=LowLight=?
S*(1)=HighLight=?
--
M*(0)=Stop(0%)
M*(1)=SlowSpeed(30%)
M*(2)=MediumSpeed(90%)
M*(3)=MaxSpeed(100%)
--
TM*(1)=TachoThresshold(200)*/        
        public static final int LowLightThress = 45;
        public static final int HighLightThress = 45;
        
        public static final int Stop = 0;
        public static final int TurnSpeed=250;
        public static final int CompensationSpeed=500;
        public static final int MaxSpeed=400;
        
        public static final int TachoThressStop= 90;
        public static final int TachoThressRelease=70;
        public static final int TachoThressTurn=60;
        public static final int ReleaseAngle=-120;
	
}
