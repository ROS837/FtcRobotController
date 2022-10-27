package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@com.qualcomm.robotcore.eventloop.opmode.TeleOp(name = "TeleOp", group = "teleOp")
public class teleOp extends LinearOpMode {  
    Robot robot;

    @Override
    public void runOpMode() throws InterruptedException {
        robot = new Robot(this);

        waitForStart();

        while(opModeIsActive()){
            if(gamepad1.a){
                robot.lF.setPower(0.3);
            }else{
                robot.lF.setPower(0);
            }
        }
    }
}