package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Servo;



    public class ServoArm extends Subsystembase{

        Servo microservo = new Servo(2);
        Servo _microservo = new Servo(6);

        public ServoArm(int channel){

        }

        public void setAngle(double angle){
            microservo.setAngle(angle);
        }

        public void setAngle2(double angle){
            _microservo.setAngle(angle);
        }
        
    }
