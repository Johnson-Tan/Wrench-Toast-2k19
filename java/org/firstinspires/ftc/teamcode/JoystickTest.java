package org.firstinspires.ftc.teamcode;

import static org.junit.Assert.assertEquals;
import org.junit.*;

import java.util.List;

public class JoystickTest {

    @Before
    public void setUp(){

    }

    @After
    public void tearDown(){

    }

    @Test
    public void joystickForwardTest(){
        List<Double> motorValues = TestOp.joystickToDriveControl(0.5,0.1,1.0);
        assertEquals((double)motorValues.get(0), -0.375, 0.001);

    }

    @Test
    public void JoystickBackLeftTest(){
        List<Double> motorValues = TestOp.joystickToDriveControl(-1, -0.5, 0.5);
        assertEquals((double)motorValues.get(0), -0.75, 0.001);
        assertEquals((double)motorValues.get(1), -1.5, 0.001);
        assertEquals((double)motorValues.get(2), -0.75, 0.001);
        assertEquals((double)motorValues.get(3), 0, 0.001);
    }
}
