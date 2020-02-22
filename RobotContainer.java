/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
//import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
//import edu.wpi.first.wpilibj.XboxController.Button;
//import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Command;
//import edu.wpi.first.wpilibj2.command.button.JoystickButton;
//import frc.robot.subsystems.Climb;
//import frc.robot.subsystems.DriveTrain;
//import frc.robot.subsystems.LED;
//import frc.robot.subsystems.Shooty;
//import edu.wpi.first.wpilibj2.command.RunCommand;
import frc.robot.subsystems.DriveTrain;


public class RobotContainer {

  // SUBSYSTEMS
  //private final Climb m_climb = new Climb();
  DriveTrain m_drive = new DriveTrain();
  //private final LED m_led = new LED();
  //private final Shooty m_shooty = new Shooty();

  // CONTROLLERS
  public static Joystick d_HOES = new Joystick(0);
  //private final Joystick MAD = new Joystick(1);

  public static final int D_FRONT_LEFT = 0;
  public static final int D_FRONT_RIGHT = 0;
  public static final int D_BACK_LEFT = 0;
	public static final int D_BACK_RIGHT = 0;

/**
   *  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    
    configureButtonBindings();

   /* public double getDriverGamepadLeftY() {
      double y = driverGamepad.getLeftY();
      return y;
    }*/

    d_HOES.getY(GenericHID.Hand.kLeft);
    d_HOES.getX(GenericHID.Hand.kRight);

    //m_drive.setDefaultCommand(new RunCommand(() -> m_drive.arcadeDrive(
      //  -d_HOES.getY(GenericHID.Hand.kLeft),
        // d_HOES.getX(GenericHID.Hand.kRight)
  
  }


  private void configureButtonBindings() {
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be
   * created by instantiating a {@link GenericHID} or one of its subclasses
   * ({@link edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then
   * passing it to a {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  //private void configureButtonBindings() {
  //}
   // Change forward direction (Drive Y):
    // new JoystickButton(m_driver, XboxController.Button.kY.value)
    //   .whenPressed(new InstantCommand(m_driveTrain::changeDirection, m_driveTrain));
    // Activate shooter (Manip A):

public Command getAutonomousCommand() {
	return null;
}


  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    //return m_autoCommand;
    */
}

