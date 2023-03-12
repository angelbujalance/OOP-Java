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

}
