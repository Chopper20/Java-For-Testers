package chap004testswithotherclasses;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerExamplesTest {

    @Test
    public void integerExploration(){
        Integer four = new Integer(4); //what is a constructor method?
        assertEquals("intValue returns int 4" ,
                4, four.intValue());
    }




}
