package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Gamepad;


@TeleOp(name = "TelemetryTele")
public class TelemetryTest extends OpMode {
    @Override
    public void init() {
        gamepad1.setJoystickDeadzone(0.05f);
        gamepad2.setJoystickDeadzone(0.05f);
    }

    @Override
    public void loop() {
        telemetry.addData("Joystick X:",gamepad1.left_stick_x);
        telemetry.addData("Joystick Y:",gamepad1.left_stick_y);
    }
}
