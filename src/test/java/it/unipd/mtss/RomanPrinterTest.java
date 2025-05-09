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
        int number_10 = 10;
        int number_14 = 14;
        int number_41 = 41;
        

        // Act
        String actual = RomanPrinter.print(number);
        String actual_4 = RomanPrinter.print(number_4);
        String actual_10 = RomanPrinter.print(number_10);
        String actual_14 = RomanPrinter.print(number_14);
        String actual_41 = RomanPrinter.print(number_41);

        // Assert
        assertEquals(RomanPrinterTest.expected_I, actual);
        assertEquals(RomanPrinterTest.expected_IV, actual_4);
        assertEquals(RomanPrinterTest.expected_X, actual_10);
        assertEquals(RomanPrinterTest.expected_XIV, actual_14);
        assertEquals(RomanPrinterTest.expected_XLI, actual_41);
    }

    static String expected_I = 
    " _____  \n" +
    "|_   _| \n" +
    "  | |   \n" +
    "  | |   \n" +
    " _| |_  \n" +
    "|_____| \n";

    static String expected_IV =
    " _____  __      __ \n" +
    "|_   _| \\ \\    / / \n" +
    "  | |    \\ \\  / /  \n" +
    "  | |     \\ \\/ /   \n" +
    " _| |_     \\  /    \n" +
    "|_____|     \\/     \n";

    static String expected_X =
    "__   __ \n" +
    "\\ \\ / / \n" +
    " \\ V /  \n" +
    "  > <   \n" +
    " / . \\  \n" +
    "/_/ \\_\\ \n" ;

    static String expected_XIV = 
    "__   __  _____  __      __ \n" +
    "\\ \\ / / |_   _| \\ \\    / / \n" +
    " \\ V /    | |    \\ \\  / /  \n" +
    "  > <     | |     \\ \\/ /   \n" +
    " / . \\   _| |_     \\  /    \n" +
    "/_/ \\_\\ |_____|     \\/     \n";

    static String expected_XLI =
    "__   __  _        _____  \n" +
    "\\ \\ / / | |      |_   _| \n" +
    " \\ V /  | |        | |   \n" +
    "  > <   | |        | |   \n" +
    " / . \\  | |____   _| |_  \n" +
    "/_/ \\_\\ |______| |_____| \n";
}
