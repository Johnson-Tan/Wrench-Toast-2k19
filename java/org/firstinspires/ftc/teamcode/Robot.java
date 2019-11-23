package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.vuforia.VIDEO_BACKGROUND_REFLECTION;

public class Robot {
    DcMotor frontLeft;
    DcMotor backLeft;
    DcMotor frontRight;
    DcMotor backRight;

/*
    DcMotor intakeL;
    DcMotor intakeR;


    Servo drawbridgeL; // 0 second rev
    Servo drawbridgeR; // 0 first rev
     */

    double dbPos = 0;

    public void hardwareMap(HardwareMap hardwareMap) {
        frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
        backLeft = hardwareMap.get(DcMotor.class, "backLeft");
        frontRight = hardwareMap.get(DcMotor.class, "frontRight");
        backRight = hardwareMap.get(DcMotor.class, "backRight");

        frontLeft.setDirection(DcMotor.Direction.REVERSE);
        backLeft.setDirection(DcMotor.Direction.REVERSE);
/*
        intakeL = hardwareMap.get(DcMotor.class, "intakeL");
        intakeR = hardwareMap.get(DcMotor.class, "intakeR");

        intakeL.setDirection(DcMotor.Direction.REVERSE);


        drawbridgeL = hardwareMap.get(Servo.class, "drawbridgeL");
        drawbridgeR = hardwareMap.get(Servo.class, "drawbridgeR");
        drawbridgeL.setPosition(dbPos);
        drawbridgeR.setPosition(dbPos);

        */
    }
        /* maybe?
    public void encodersForward(double inches, double power){
        frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        frontLeft.setTargetPosition((int)inchesToTick(inches));
        frontRight.setTargetPosition((int)inchesToTick(inches));
        backLeft.setTargetPosition((int)inchesToTick(inches));
        backRight.setTargetPosition((int)inchesToTick(inches));

        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        frontLeft.setPower(power);
        frontRight.setPower(power);
        backLeft.setPower(power);
        backRight.setPower(power);

        while (frontLeft.isBusy() && frontRight.isBusy() && backLeft.isBusy() && backRight.isBusy()){

        }

    }
*/
    public void Forward (double Power){

        frontLeft.setPower(Power);
        frontRight.setPower(Power);
        backLeft.setPower(Power);
        backRight.setPower(Power);

    }

    public void Strafe (double Power){

        frontLeft.setPower(-Power);
        frontRight.setPower(Power);
        backLeft.setPower(Power);
        backRight.setPower(-Power);

    }

    public void TurnRight (double Power) {
        frontLeft.setPower(-Power);
        frontRight.setPower(Power);
        backLeft.setPower(-Power);
        backRight.setPower(Power);
    }

    public void TurnLeft (double Power) {
        frontLeft.setPower(Power);
        frontRight.setPower(-Power);
        backLeft.setPower(Power);
        backRight.setPower(-Power);
    }

    public void Stop (){
        frontLeft.setPower(0);
        frontRight.setPower(0);
        backLeft.setPower(0);
        backRight.setPower(0);

    }

    /*
    public double inchesToTick (double inches){
        double circumference = Math.PI*3.937;
        double fullRotation = 1440;
        return ((inches / circumference) * fullRotation);

    }


    public void drawbridge(){
        if (dbPos == 0) {
            dbPos = 0.5;
        } else if (dbPos == 0.5) {
            dbPos = 0;
        } else {
            dbPos = 0;
        }
        drawbridgeL.setPosition(dbPos);
        drawbridgeR.setPosition(dbPos);
    }
    */
}
