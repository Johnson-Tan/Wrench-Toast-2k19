package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous (name = "bluebuild")
public class BlueBuild extends LinearOpMode {

    Robot robot = new Robot();

    @Override
    public void runOpMode() throws InterruptedException {

        waitForStart();
        robot.hardwareMap(hardwareMap);
        robot.Strafe(0.5);
        sleep(2250);
        robot.Stop();
        sleep(10);
        robot.Forward(-0.5);
        sleep(250);
        robot.Stop();
        sleep(10);
        robot.Strafe(-0.5);
        sleep(2250);
        robot.Stop();
        sleep(500);
        robot.Forward(0.5);
        sleep(2250);
        robot.Stop();
        sleep(10);
        robot.TurnRight(-0.5);
        sleep(1800);
        robot.Stop();
        sleep(10);
        robot.Strafe(-0.5);
        sleep(250);
        robot.Stop();
        sleep(10);

    }

}
