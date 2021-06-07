import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;
    @Before
    public void before(){ calculator = new Calculator();}

    @Test
    public void canAdd(){
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void canSubtract(){
        assertEquals(5, calculator.subtract(7,2));
    }

    @Test
    public void canMultiply(){
        assertEquals(5, calculator.multiply(5,1));
    }

    @Test
    public void canDivide(){
        assertEquals(5, calculator.divide(25,5), 0.0);
    }

}
