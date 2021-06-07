import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;
    @Before
    public void before(){printer = new Printer(5);}

    @Test
    public void hasPaper(){
        assertEquals(5, printer.getPaper());
    }

    @Test
    public void canPrint(){
        printer.print(2, 2);
        assertEquals(1, printer.getPaper());
    }

    @Test
    public void cantPrintDueToPaper(){
        printer.print(4, 4);
        assertEquals(5, printer.getPaper());
    }

    @Test
    public void reduceToner(){
        printer.print(2, 2);
        assertEquals(96, printer.getToner());
    }

    @Test
    public void cantPrintDueToToner(){
        printer.setPaper(10000);
        printer.print(4, 26);
        assertEquals(100, printer.getToner());
    }

}
