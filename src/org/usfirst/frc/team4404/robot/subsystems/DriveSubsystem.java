package org.usfirst.frc.team4404.robot.subsystems;

import org.usfirst.frc.team4404.robot.RobotMap;
import org.usfirst.frc.team4404.robot.commands.drive.JoystickCommand;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveSubsystem extends Subsystem {

	private RobotDrive drive;

	public DriveSubsystem() {
		drive = new RobotDrive(RobotMap.leftMotors[0], RobotMap.leftMotors[1],
				RobotMap.rightMotors[0], RobotMap.rightMotors[1]);
	}

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new JoystickCommand());
	}

	public RobotDrive getDrive() {
		return drive;
	}

}
