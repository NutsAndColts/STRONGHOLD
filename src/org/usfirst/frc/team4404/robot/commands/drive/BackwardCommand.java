package org.usfirst.frc.team4404.robot.commands.drive;

import org.usfirst.frc.team4404.robot.Robot;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Command;

public class BackwardCommand extends Command {

	private RobotDrive drive;
	private double speed = 1;
	
	/**
	 * A command that drives full speed backwards.
	 */
	public BackwardCommand() {
		requires(Robot.driveSubsystem);
	}

	/**
	 * A command that drives at a specified speed backwards.
	 * @param speed speed for robot to move at.
	 */
	public BackwardCommand(double speed) {
		requires(Robot.driveSubsystem);

		this.speed = speed;
	}

	@Override
	protected void initialize() {
		drive = Robot.driveSubsystem.getDrive();
	}

	@Override
	protected void execute() {
		drive.arcadeDrive(-1 * speed, 0);
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
