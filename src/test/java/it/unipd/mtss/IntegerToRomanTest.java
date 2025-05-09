////////////////////////////////////////////////////////////////////
// [Gabriele] [Disa] [2075545]
// [Tommaso] [Tombacco] [2076447]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class IntegerToRomanTest {
    
    @Test
    public void testConvert() {
        //Arrange 
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 14};

        //Act
        List<String> romanNumbers = new ArrayList<>();
        for (int i : numbers) {
            romanNumbers.add(IntegerToRoman.convert(i));
        }

        //Assert
        String expected[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XIV"};
        assertArrayEquals(expected, romanNumbers.toArray(new String[0]));
    }

}
