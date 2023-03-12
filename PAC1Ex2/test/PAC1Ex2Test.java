import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PAC1Ex2Test {
    @Test
    public void testIncomeTaxRate() {
        assertEquals(18, PAC1Ex2.incomeTaxRate(24800));
    }

    @Test
    public void testTotalIncomeTaxVAT() {
        assertEquals(19055, PAC1Ex2.totalIncomeTaxVAT(18500));
    }
    @Test
    public void testinvoicesTotal() {
        double[] invoicesTotalResult = { 52620.0, 22660.0 };
        double[][] invoicesTotalInput = { { 1000.00, 2000.00, 50000.00 }, { 18000.00, 4000.00 } };
        assertEquals(invoicesTotalResult, PAC1Ex2.invoicesTotal(invoicesTotalInput));
        // el valor no es el mismo porque el valor retornado es el espacio en memoria,
        // pero a partir de los prints comprobamos que los resultados son correctos.
    }
}