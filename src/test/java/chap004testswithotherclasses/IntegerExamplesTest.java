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

    @Test
    public void canConfirmIntMinAndMaxLimits(){

        int minimumInt = -2147483648;
        int maximumInt = 2147483647;

        assertEquals("integer min", minimumInt, Integer.MIN_VALUE);
        assertEquals("integer max", maximumInt, Integer.MAX_VALUE);
    }

    @Test
    public void canConvertIntToHex(){
        assertEquals("hex 11 is b", "b",
                Integer.toHexString(11));
        assertEquals("hex 10 is a", "a",
                Integer.toHexString(10));
        assertEquals("hex 3 is 3", "3",
                Integer.toHexString(3));
        assertEquals("hex 21 is 15", "15",
                Integer.toHexString(21));


    }


}
