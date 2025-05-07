////////////////////////////////////////////////////////////////////
// [Gabriele] [Disa] [2075545]
// [Tommaso] [Tombacco] [2076447]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanPrinterTest {

    @Test
    public void testPrintAsciiArt() {
        // Arrange
        int number = 1;
        int number_4 = 4;
        String expected_I = 
            " _____  \n" +
            "|_   _| \n" +
            "  | |   \n" +
            "  | |   \n" +
            " _| |_  \n" +
            "|_____| \n";

        String expected_IV =
        " _____  __      __ \n" +
        "|_   _| \\ \\    / / \n" +
        "  | |    \\ \\  / /  \n" +
        "  | |     \\ \\/ /   \n" +
        " _| |_     \\  /    \n" +
        "|_____|     \\/     \n";
    

        // Act
        String actual = RomanPrinter.print(number);
        String actual_4 = RomanPrinter.print(number_4);

        // Assert
        assertEquals(expected_I, actual);
        assertEquals(expected_IV, actual_4);
    }

}
