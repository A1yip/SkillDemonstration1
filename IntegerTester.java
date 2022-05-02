import static org.junit.Assert.*;
import org.junit.*;
public class IntegerTester {
    @Test
    public void additionTester() {
        Integer test1 = new Integer(3);
        test1.addition(4);
        assertEquals(7, test1.integer);
    }
}
