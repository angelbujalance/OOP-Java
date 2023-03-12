import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PAC1Ex3Test {
    @Test
    public void testcalculateTravelledDistance() {
        int[] travelDistanceTest1 = {0,1,4,7};
        assertEquals(158, PAC1Ex3.calculateTravelledDistance(travelDistanceTest1));
        int[] travelDistanceTest2 = {0,1,4,70};
        assertEquals(-1, PAC1Ex3.calculateTravelledDistance(travelDistanceTest2));
        int[] travelDistanceTest3 = {};
        assertEquals(0, PAC1Ex3.calculateTravelledDistance(travelDistanceTest3));
    }
    @Test
    public void testcalculateTravelCostByMonth() {
        int[] myRoute = {2,1,2};
        assertEquals(-1,
                PAC1Ex3.calculateTravelCostByMonth(myRoute, 12, 3.9, false));
        assertEquals(-1,
                PAC1Ex3.calculateTravelCostByMonth(myRoute, 5, -3.9, false));
        assertEquals(3.69,
                PAC1Ex3.calculateTravelCostByMonth(myRoute, 5, 3.9, false));
    }
    @Test
    public void testcalculateTravelCosts() {
        int[][] myRoute = {{2, 1, 2}, {2, 1, 2}};
        int[] myMonths = {5, 5};
        assertEquals(7.38,
                PAC1Ex3.calculateTravelCosts(myRoute, myMonths, 3.9, false));
    }
    @Test
    public void testIsGasolineCheaper() {
        int[][] myRoute = {{2, 1, 2}, {2, 1, 2}};
        int[] myMonths = {5, 5};
        assertEquals(true,
                PAC1Ex3.isGasolineCheaper(myRoute,myMonths,1, 100));
        assertEquals(false,
                PAC1Ex3.isGasolineCheaper(myRoute,myMonths,100, 1));
    }
}
