package tests;

import com.company.PistonForce;
import org.junit.*;
import static org.junit.Assert.*;


public class PistonForceTest {

    @Test
    public void calculateTest(){

        PistonForce test = new PistonForce(5,1);
        int force = (int) test.calculateForce();
        assertEquals(78, force);
    }
}
