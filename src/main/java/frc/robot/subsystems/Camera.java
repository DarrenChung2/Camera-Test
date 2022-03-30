// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
 
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.cscore.CvSink;
import edu.wpi.first.cscore.CvSource;
import edu.wpi.first.cscore.MjpegServer;
import edu.wpi.first.cscore.UsbCamera;
import edu.wpi.first.cscore.VideoSink;
import edu.wpi.first.cscore.VideoMode.PixelFormat;
public class Camera extends SubsystemBase {
  /** Creates a new Camera. */
  public Camera() {
    // Creates a Usbcamera and  a server (1181 is default) and connects them togethers
    CameraServer.startAutomaticCapture();
    // Creates a CvSink (storage space) and connects it to the UsbCamera 
    CvSink cvSink = CameraServer.getVideo();
    
    // Creates the CvSource(output) and a second server then connects them
    CvSource outputStream = CameraServer.putVideo("Test", 640, 480);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
