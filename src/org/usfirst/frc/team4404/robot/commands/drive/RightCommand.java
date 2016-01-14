package org.usfirst.frc.team4404.robot.commands.drive;

import org.usfirst.frc.team4404.robot.Robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Command;

public class RightCommand extends Command {
	
	private RobotDrive drive;
	private double speed = 1;
	
	/**
	 * A command that turns full speed to the right.
	 */
	public RightCommand() {
	}
	
	/**
	 * A command that turns at a specified speed to the right.
	 * @param speed speed for robot to move at.
	 */
	public RightCommand(double speed) {
		this.speed = speed;
	}

	@Override
	protected void initialize() {
		requires(Robot.driveSubsystem);
		
		drive = Robot.driveSubsystem.getDrive();
	}

	@Override
	protected void execute() {
		drive.arcadeDrive(0, -1 * speed);
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
		drive.arcadeDrive(0, 0);
	}

	@Override
	protected void interrupted() {
		drive.arcadeDrive(0, 0);
	}

}
