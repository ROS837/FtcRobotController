package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.ElapsedTime;

@com.qualcomm.robotcore.eventloop.opmode.Autonomous(name = "Autonomous", group = "Autonomous")
public class auto extends LinearOpMode {
    Robot robot;

    private ElapsedTime runDuration = new ElapsedTime();

    @Override
    public void runOpMode() throws InterruptedException {
        robot = new Robot(this);

        robot.lF.setDirection(DcMotorSimple.Direction.FORWARD);
        robot.rB.setDirection(DcMotorSimple.Direction.REVERSE);
        robot.rF.setDirection(DcMotorSimple.Direction.REVERSE);
        robot.lB.setDirection(DcMotorSimple.Direction.FORWARD);

        waitForStart();

//        robot.lF.setPower(1);
//        robot.lB.setPower(1);
//        robot.rF.setPower(1);
//        robot.rB.setPower(1);
//        Thread.sleep(505);
//        robot.lF.setPower(0);
//        robot.lB.setPower(0);
//        robot.rF.setPower(0);
//        robot.rB.setPower(0);
//        Thread.sleep(300);
//        robot.lF.setPower(1);
//        robot.lB.setPower(1);
//        robot.rF.setPower(0);
//        robot.rB.setPower(0);
//        Thread.sleep(1000);
//        robot.lF.setPower(1);
//        robot.lB.setPower(1);
//        robot.rF.setPower(1);
//        robot.rB.setPower(1);
//        Thread.sleep(1315);
//        robot.lF.setPower(0);
//        robot.lB.setPower(0);
//        robot.rF.setPower(0);
//        robot.rB.setPower(0);
//        Thread.sleep(300);
//        robot.lF.setPower(1);
//        robot.lB.setPower(1);
//        robot.rF.setPower(0);
//        robot.rB.setPower(0);
//        Thread.sleep(1000);
//        robot.lF.setPower(1);
//        robot.lB.setPower(1);
//        robot.rF.setPower(1);
//        robot.rB.setPower(1);
//        Thread.sleep(1315);
//        robot.lF.setPower(0);
//        robot.lB.setPower(0);
//        robot.rF.setPower(0);
//        robot.rB.setPower(0);
//        Thread.sleep(300);
//        robot.lF.setPower(1);
//        robot.lB.setPower(1);
//        robot.rF.setPower(0);
//        robot.rB.setPower(0);
//        Thread.sleep(1000);
//        robot.lF.setPower(1);
//        robot.lB.setPower(1);
//        robot.rF.setPower(1);
//        robot.rB.setPower(1);
//        Thread.sleep(775);
//        robot.lF.setPower(0);
//        robot.lB.setPower(0);
//        robot.rF.setPower(0);
//        robot.rB.setPower(0);
//        Thread.sleep(300);

        robot.lF.setPower(1);
        robot.lB.setPower(1);
        robot.rF.setPower(1);
        robot.rB.setPower(1);
        Thread.sleep(1000);
        robot.lF.setPower(0);
        robot.lB.setPower(0);
        robot.rF.setPower(0);
        robot.rB.setPower(0);

        }
    }