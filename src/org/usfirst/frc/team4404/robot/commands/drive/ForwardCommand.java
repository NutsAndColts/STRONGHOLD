package org.usfirst.frc.team4404.robot.commands.drive;

import org.usfirst.frc.team4404.robot.Robot;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Command;

public class ForwardCommand extends Command {

	private RobotDrive drive;
	private double speed = 1;
	
	/**
	 * A command that drives full speed forwards.
	 */
	public ForwardCommand() {
	}
	
	/**
	 * A command that drives at a specified speed forwards.
	 * @param speed speed for robot to move at.
	 */
	public ForwardCommand(double speed) {
		this.speed = speed;
	}

	@Override
	protected void initialize() {
		requires(Robot.driveSubsystem);

		drive = Robot.driveSubsystem.getDrive();
	}

	@Override
	protected void execute() {
		drive.arcadeDrive(speed, 0);
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
