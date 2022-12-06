package PartA;
import org.junit.*;

import static org.junit.Assert.assertEquals;
public class TestOneTimeAppointment {
    private OneTimeAppointment OA;
    @Before
    public void setUp(){
        OA=new OneTimeAppointment(2004,11,30,"Born");
    }
    @Test
    public void testGetEvent(){
        assertEquals("Born",OA.getEvent());
    }
    @Test
    public void testEquals(){
        assertEquals(true,OA.dateEquals(2004,11,30));
    }
}
