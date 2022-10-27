package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class Robot {
    LinearOpMode ln;

    DcMotor lF;
    String lFInit = "lF";

    public Robot(LinearOpMode ln){
        lF = ln.hardwareMap.dcMotor.get(lFInit);
    }

}