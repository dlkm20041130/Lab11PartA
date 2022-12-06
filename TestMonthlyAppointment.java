package PartA;
import org.junit.*;

import static org.junit.Assert.assertEquals;
public class TestMonthlyAppointment {
    private MonthlyAppointment MA;
    @Before
    public void setUp(){
        MA=new MonthlyAppointment(11,30,"BirthDay Celebration");
    }
    @Test
    public void testGetEvent(){
        assertEquals("BirthDay Celebration",MA.getEvent());
    }
    @Test
    public void testEquals(){
        assertEquals(true,MA.dateEquals(11,30));
    }

}
