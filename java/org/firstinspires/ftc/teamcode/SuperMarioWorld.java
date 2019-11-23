package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous (name = "SuperMarioWorld")
public class SuperMarioWorld extends LinearOpMode {

    Robot robot = new Robot();

    @Override
    public void runOpMode() throws InterruptedException{

        waitForStart();
        robot.hardwareMap(hardwareMap);
        robot.Forward(0.5);
        sleep(1000);
        robot.Stop();
        sleep(10);
        robot.Strafe(-0.5);
        sleep(1500);
    }

}

