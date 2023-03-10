
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PAC1Ex2Test {
    @Test
    public void testIncomeTaxRate() {
        assertEquals(18, PAC1Ex2.incomeTaxRate(24800));
    }

    @Test
    public void testTotalIncomeTaxVAT() {
        assertEquals(11285, PAC1Ex2.totalIncomeTaxVAT(18500));
    }

}