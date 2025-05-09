////////////////////////////////////////////////////////////////////
// [Gabriele] [Disa] [2075545]
// [Tommaso] [Tombacco] [2076447]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class IntegerToRomanTest {
    
    @Test
    public void testConvert() {
        //Arrange 
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 14, 38, 41, 50, 94, 455, 975};


        //Act
        List<String> romanNumbers = new ArrayList<>();
        for (int i : numbers) {
            try{
                romanNumbers.add(IntegerToRoman.convert(i));
            }catch (IllegalArgumentException e) {;
            }
        }

        //Assert
        String expected[] = {"I","II","III","IV","V","VI","VII","VIII","IX","X","XIV","XXXVIII","XLI","L","XCIV","CDLV", "CMLXXV"};
        assertArrayEquals(expected, romanNumbers.toArray(new String[0]));
    }

    @Test
    public void testConvertIllegalArgument() {
        try {
            IntegerToRoman.convert(0);
            org.junit.Assert.fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Number must be between 1 and 1000", e.getMessage());
        }

        try {
            IntegerToRoman.convert(1001);
            org.junit.Assert.fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Number must be between 1 and 1000", e.getMessage());
        }
    }

}
