package org.usfirst.frc.team4404.robot.commands.drive;

import org.usfirst.frc.team4404.robot.Robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Command;

public class JoystickCommand extends Command {

	private RobotDrive drive;
	
	/**
	 * Drives the robot using the joystick.
	 */
	public JoystickCommand() {
	}

	@Override
	protected void initialize() {
		requires(Robot.driveSubsystem);

		drive = Robot.driveSubsystem.getDrive();
	}

	@Override
	protected void execute() {
		drive.arcadeDrive(Robot.oi.stick, true);
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
