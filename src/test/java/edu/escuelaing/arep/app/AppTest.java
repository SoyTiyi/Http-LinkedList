package edu.escuelaing.arep.app;

import static org.junit.Assert.assertNotEquals;
import junit.framework.TestCase;
import org.junit.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    @Test
    public void testMeanCorrect(){
        LinkedList list = new LinkedList();
        list.add(12.0);
        list.add(14.0);
        list.add(20.0);
        assertEquals(15.33,Statics.mean(list));
    }

    @Test
    public void testMeanIncorrect(){
        LinkedList list = new LinkedList();
        list.add(12.0);
        list.add(14.0);
        list.add(20.0);
        assertNotEquals(9,Statics.mean(list));
    }

    @Test
    public void testStandartDesviationCorrect(){
        LinkedList list = new LinkedList();
        list.add(12.0);
        list.add(14.0);
        list.add(20.0);
        assertEquals(4.16, Statics.standardDesviation(list));
    }

    @Test
    public void testStandartDesviationIncorrect(){
        LinkedList list = new LinkedList();
        list.add(12.0);
        list.add(14.0);
        list.add(20.0);
        assertNotEquals(5.91,Statics.standardDesviation(list));
    }

    @Test
    public void testMeanExampleOfTheTeacher(){
        LinkedList list = new LinkedList();
        list.add(186.0);
        list.add(699.0);
        list.add(132.0);
        list.add(272.0);
        list.add(291.0);
        list.add(331.0);
        list.add(199.0);
        list.add(1890.0);
        list.add(788.0);
        list.add(1601.0);
        assertEquals(638.9,Statics.mean(list));
    }

    @Test
    public void testDesviationEampleOfTheTeacher(){
        LinkedList list = new LinkedList();
        list.add(186.0);
        list.add(699.0);
        list.add(132.0);
        list.add(272.0);
        list.add(291.0);
        list.add(331.0);
        list.add(199.0);
        list.add(1890.0);
        list.add(788.0);
        list.add(1601.0);
        assertEquals(625.63,Statics.standardDesviation(list));
    }

    @Test
    public void testMeanColumnOneOfTheTeacher(){
        LinkedList list = new LinkedList();
        list.add(160.0);
        list.add(591.0);
        list.add(114.0);
        list.add(229.0);
        list.add(230.0);
        list.add(270.0);
        list.add(128.0);
        list.add(1657.0);
        list.add(624.0);
        list.add(1503.0);
        assertEquals(550.60,Statics.mean(list));
    }

    @Test
    public void testDesviationColumnOneOfTheTeacher(){
        LinkedList list = new LinkedList();
        list.add(160.0);
        list.add(591.0);
        list.add(114.0);
        list.add(229.0);
        list.add(230.0);
        list.add(270.0);
        list.add(128.0);
        list.add(1657.0);
        list.add(624.0);
        list.add(1503.0);
        assertEquals(572.02,Statics.standardDesviation(list));
    }

    @Test
    public void testMeanColumnTwoOfTheTeacher(){
        LinkedList list = new LinkedList();
        list.add(15.0);
        list.add(69.0);
        list.add(6.5);
        list.add(22.4);
        list.add(28.4);
        list.add(65.9);
        list.add(19.4);
        list.add(198.7);
        list.add(38.8);
        list.add(138.2);
        assertEquals(60.23,Statics.mean(list));
    }

    @Test
    public void testDesviationColumnTwoOfTheTeacher(){
        LinkedList list = new LinkedList();
        list.add(15.0);
        list.add(69.0);
        list.add(6.5);
        list.add(22.4);
        list.add(28.4);
        list.add(65.9);
        list.add(19.4);
        list.add(198.7);
        list.add(38.8);
        list.add(138.2);
        assertEquals(60.23,Statics.mean(list));
    }
   
}
