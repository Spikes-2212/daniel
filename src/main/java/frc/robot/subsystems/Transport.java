package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class Transport extends SubsystemBase {
    MotorController motorController;

    public void Shooter(MotorController motorcontroller) {
        this.motorController = motorController;
    }

    public void setSpeed(double speed) {
        motorController.set(speed);
    }

    public void stop() {
        this.motorController.stopMotor();
    }


}