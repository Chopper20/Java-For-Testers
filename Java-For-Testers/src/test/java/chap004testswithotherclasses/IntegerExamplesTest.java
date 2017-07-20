package chap004testswithotherclasses;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerExamplesTest {

    @Test
    public void integerExploration(){
        Integer four = new Integer(4); //what is a constructor method?
        assertEquals("intValue returns int 4" ,
                4, four.intValue());
        Integer five = 5;
        assertEquals("intValue returns int 5" ,
                5, five.intValue());
        Integer six = new Integer(6);
        assertEquals("autoboxing assignment for 6" ,  //what is autoboxing?
                6, six.intValue());
    }




}
