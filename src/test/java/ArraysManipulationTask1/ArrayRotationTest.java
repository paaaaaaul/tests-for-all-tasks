package ArraysManipulationTask1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class ArrayRotationTest {

    @Test
    public void testArrayRotation() {

//        ArrayRotation arrayRotationTest = new ArrayRotation();
        int [] arr = {1, 4, 7, 9, 99, 5};
        int [] arrExp = {1, 4, 9, 99, 5, 7};

        assertEquals(arrExp, ArrayRotation.moveToEnd(arr ,2,6));

    }

}