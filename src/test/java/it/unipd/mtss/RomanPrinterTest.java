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
        int number_94 = 94;
        int number_455 = 455;
        int number_975 = 975;

        // Act
        String actual = RomanPrinter.print(number);
        String actual_4 = RomanPrinter.print(number_4);
        String actual_10 = RomanPrinter.print(number_10);
        String actual_14 = RomanPrinter.print(number_14);
        String actual_41 = RomanPrinter.print(number_41);
        String actual_94 = RomanPrinter.print(number_94);
        String actual_455 = RomanPrinter.print(number_455);
        String actual_975 = RomanPrinter.print(number_975);

        // Assert
        assertEquals(RomanPrinterTest.expected_I, actual);
        assertEquals(RomanPrinterTest.expected_IV, actual_4);
        assertEquals(RomanPrinterTest.expected_X, actual_10);
        assertEquals(RomanPrinterTest.expected_XIV, actual_14);
        assertEquals(RomanPrinterTest.expected_XLI, actual_41);
        assertEquals(RomanPrinterTest.expected_XCIV, actual_94);
        assertEquals(RomanPrinterTest.expected_CDLV, actual_455);
        assertEquals(RomanPrinterTest.expected_CMLXXV, actual_975);
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

    static String expected_XCIV =
    "__   __   ____   _____  __      __ \n"+
    "\\ \\ / /  / ___| |_   _| \\ \\    / / \n"+
    " \\ V /  | |       | |    \\ \\  / /  \n"+
    "  > <   | |       | |     \\ \\/ /   \n"+
    " / . \\  | |___   _| |_     \\  /    \n"+
    "/_/ \\_\\  \\____| |_____|     \\/     \n";

    static String expected_CDLV =
    "  ____   _____    _       __      __ \n" +
    " / ___| |  __ \\  | |      \\ \\    / / \n" +
    "| |     | |  | | | |       \\ \\  / /  \n" +
    "| |     | |  | | | |        \\ \\/ /   \n" +
    "| |___  | |__| | | |____     \\  /    \n" +
    " \\____| |_____/  |______|     \\/     \n";

    static String expected_CMLXXV = 
    "  ____   __  __   _       __   __ __   __ __      __ \n"+
    " / ___| |  \\/  | | |      \\ \\ / / \\ \\ / / \\ \\    / / \n"+
    "| |     | \\  / | | |       \\ V /   \\ V /   \\ \\  / /  \n"+
    "| |     | |\\/| | | |        > <     > <     \\ \\/ /   \n"+
    "| |___  | |  | | | |____   / . \\   / . \\     \\  /    \n"+
    " \\____| |_|  |_| |______| /_/ \\_\\ /_/ \\_\\     \\/     \n";
}
