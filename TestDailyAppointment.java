package PartA;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class TestDailyAppointment {
    private DailyAppointment DA;
    @Before
    public void setUp(){
        DA=new DailyAppointment("Eat");
    }
    @Test
    public void testGetEvent(){
        assertEquals("Eat",DA.getEvent());
    }

}
