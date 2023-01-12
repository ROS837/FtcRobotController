package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

import org.firstinspires.ftc.robotcore.external.tfod.TfodRoverRuckus;

@com.qualcomm.robotcore.eventloop.opmode.TeleOp(name = "TeleOp", group = "teleOp")
public class slide extends LinearOpMode {
    Robot robot;
    String parkingSpot = "C1";
    //@Override

    public void forward(double power){
        robot.lF.setDirection(DcMotorSimple.Direction.FORWARD);
        robot.rB.setDirection(DcMotorSimple.Direction.REVERSE);
        robot.rF.setDirection(DcMotorSimple.Direction.REVERSE);
        robot.lB.setDirection(DcMotorSimple.Direction.FORWARD);
        robot.lF.setPower(power);
        robot.lB.setPower(power);
        robot.rF.setPower(power);
        robot.rB.setPower(power);
    }
    public void backward(double power){
        robot.lF.setDirection(DcMotorSimple.Direction.REVERSE);
        robot.rB.setDirection(DcMotorSimple.Direction.FORWARD);
        robot.rF.setDirection(DcMotorSimple.Direction.FORWARD);
        robot.lB.setDirection(DcMotorSimple.Direction.REVERSE);
        robot.lF.setPower(power);
        robot.lB.setPower(power);
        robot.rF.setPower(power);
        robot.rB.setPower(power);
    }
    public void turnLeft(int power){
        robot.lF.setDirection(DcMotorSimple.Direction.FORWARD);
        robot.rB.setDirection(DcMotorSimple.Direction.FORWARD);
        robot.rF.setDirection(DcMotorSimple.Direction.FORWARD);
        robot.lB.setDirection(DcMotorSimple.Direction.FORWARD);
        robot.lF.setPower(power);
        robot.lB.setPower(power);
        robot.rF.setPower(power);
        robot.rB.setPower(power);
    }
    public void turnRight(int power){
        robot.lF.setDirection(DcMotorSimple.Direction.REVERSE);
        robot.rB.setDirection(DcMotorSimple.Direction.REVERSE);
        robot.rF.setDirection(DcMotorSimple.Direction.REVERSE);
        robot.lB.setDirection(DcMotorSimple.Direction.REVERSE);
        robot.lF.setPower(power);
        robot.lB.setPower(power);
        robot.rF.setPower(power);
        robot.rB.setPower(power);
    }
    public void stopMotors(){
        robot.lF.setPower(0);
        robot.lB.setPower(0);
        robot.rF.setPower(0);
        robot.rB.setPower(0);
    }
    public void runOpMode() throws InterruptedException {
        robot = new Robot(this);

        waitForStart();

        // Move to the first spot (W2)
        forward(1);
        Thread.sleep(500); //tweak this value

        // lower the cone
        // release the cone

        // Move to C1 to pick up another cone
        turnRight(1);
        Thread.sleep(200); // tweak this value
        forward(1);
        Thread.sleep(200); // tweak this value
        stopMotors();

        // grab cone
        // pick up cone

        // Go to X2
        backward(1);
        Thread.sleep(500); // tweak this value
        turnLeft(1);
        Thread.sleep(200); // tweak this value
        forward(1);
        Thread.sleep(50); // tweak this value

        // lower cone
        // release cone
    }
}
