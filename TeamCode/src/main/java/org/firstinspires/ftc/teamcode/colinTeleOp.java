/*package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@com.qualcomm.robotcore.eventloop.opmode.TeleOp(name = "TeleOp", group = "teleOp")
public class colinTeleOp extends LinearOpMode {
    Robot robot;

    @Override
    public void runOpMode() throws InterruptedException {
        robot = new Robot(this);

        double x; // JOYPAD X
        double y; // JOYPAD Y

        waitForStart();

        while(opModeIsActive()){
            x = gamepad1.left_stick_x;
            y = gamepad1.left_stick_y;
            robot.lF.setPower(0);
            robot.lB.setPower(0);
            robot.rF.setPower(0);
            robot.rB.setPower(0);
            if (y != 0) {
                if (y > 0) {
                    robot.lF.setDirection(DcMotorSimple.Direction.FORWARD);
                    robot.rB.setDirection(DcMotorSimple.Direction.REVERSE);
                    robot.rF.setDirection(DcMotorSimple.Direction.REVERSE);
                    robot.lB.setDirection(DcMotorSimple.Direction.FORWARD);
                    robot.lF.setPower(y);
                    robot.lB.setPower(y);
                    robot.rF.setPower(y);
                    robot.rB.setPower(y);
                } else {
                    robot.lF.setDirection(DcMotorSimple.Direction.REVERSE);
                    robot.rB.setDirection(DcMotorSimple.Direction.FORWARD);
                    robot.rF.setDirection(DcMotorSimple.Direction.FORWARD);
                    robot.lB.setDirection(DcMotorSimple.Direction.REVERSE);
                    robot.lF.setPower(Math.abs(y));
                    robot.lB.setPower(Math.abs(y));
                    robot.rF.setPower(Math.abs(y));
                    robot.rB.setPower(Math.abs(y));
                }
            }
        }
    }
}
*/