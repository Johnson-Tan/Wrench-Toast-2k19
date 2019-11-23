package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous (name = "Right")
public class Toasty_Auto_Right extends LinearOpMode {

    Robot robot = new Robot();

    @Override
    public void runOpMode() throws InterruptedException {

        waitForStart();
        robot.hardwareMap(hardwareMap);
        robot.Strafe(0.5);
        sleep(700);
        robot.Stop();
        sleep(300);
        robot.Forward(-0.5);
        sleep(500);

    }
}
