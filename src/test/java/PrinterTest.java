import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Test
    public void canConfirmNumberOfPagesLeft() {
        printer = new Printer(100, 1000);
        assertEquals(100, printer.getPagesLeft());

    }
    @Test
    public void canConfirmPrintingUsesCorrectAmountofToner() {
        printer = new Printer(2000, 1000);
        int numPages = 25;
        int numCopies = 20;
        printer.printPages(numPages, numCopies);
        assertEquals(500, printer.getTonerVolume());
    }
    @Test
    public void canConfirmOkToPrint() {
        printer = new Printer(100, 1000);
        int numPages = 25;
        int numCopies = 3;
        assertEquals(true, printer.printPages(numPages, numCopies));

    }
    @Test
    public void canConfirmNumberofPagesLeftAfterPrinting() {
        printer = new Printer(100, 1000);
        int numPages = 25;
        int numCopies = 3;
        printer.printPages(numPages, numCopies);
        assertEquals(25, printer.getPagesLeft());

    }
    @Test
    public void canConfirmNotOkToPrint() {
        printer = new Printer(100, 1000);
        int numPages = 25;
        int numCopies = 5;
        assertEquals(false, printer.printPages(numPages, numCopies));
    }
}
