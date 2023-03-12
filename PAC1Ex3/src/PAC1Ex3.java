import java.util.Arrays;
public class PAC1Ex3 {

    public static double twoDecimals(double number){
        return Math.round(number * 100d) / 100d;
    }

    static final double[] GASOLINE = {1.49,1.559,1.637,1.93,1.858,2.026,2.121,1.903,1.794,1.687,1.766,1.695};
    static final double[] DIESEL = {1.354,1.44,1.522,1.852,1.892,1.892,2.078,1.894,1.901,1.814,1.975,1.77};

    static final int[][] distanceMatrix = {
            //Barcelona
            {0,13,13,34,24,97,33,108,102,158,159,12,15,17,18},
            //Hospitalet de Llobregat
            {10,0,25,32,29,89,41,99,107,150,151,17,3,9,18},
            //Badalona
            {13,25,0,32,22,118,22,128,98,175,176,5,27,29,23},
            //Terrassa
            {35,32,31,0,10,107,50,118,104,146,148,25,34,36,17},
            //Sabadell
            {27,31,23,11,0,105,38,116,90,155,157,18,33,34,13},
            //Tarragona
            {97,90,117,109,109,0,137,14,190,101,101,111,87,88,97},
            //Mataró
            {33,41,22,49,38,136,0,146,69,185,187,25,42,49,44},
            //Reus
            {108,100,127,119,120,16,147,0,200,93,94,122,98,98,108},
            //Girona
            {103,108,91,104,91,190,69,200,0,226,227,94,109,119,97},
            //Lleida
            {159,151,174,147,157,102,187,92,227,0,2,169,147,146,147},
            //Centre Històric
            {162,154,177,150,160,103,190,93,230,2,0,171,149,149,150},
            //Santa Coloma de Gramenet
            {12,18,5,25,15,111,26,121,93,167,169,0,18,23,16},
            //Cornellà de Llobregat
            {15,3,27,35,36,87,43,98,116,146,147,18,0,5,24},
            //Sant Boi de Llobregat
            {16,7,28,37,38,86,48,97,118,145,146,23,4,0,26},
            //Sant Cugat del Vallès
            {17,18,24,17,14,97,45,107,98,146,147,19,18,26,0},
    };

    public static int calculateTravelledDistance(int[] route) {
        int[] indexSorted = route.clone();
        Arrays.sort(indexSorted);
        if (route.length == 0) {
            System.out.println("[ERROR]: The route is empty");
            return 0;
        }

        else if (indexSorted[0] < 0 || indexSorted[route.length-1] > distanceMatrix.length) {
            System.out.println("[ERROR]: The route contains invalid destination points");
            return -1;
        }

        else {
            int routeSum = 0; // suma las distancias entre las ciudades de la ruta
            for (int i=1; i<route.length; i++) {

                int initCityIndex = route[i-1];
                int destCityIndex = route[i];
                routeSum += distanceMatrix[initCityIndex][destCityIndex];
            }
            return routeSum;
        }
    }

    public static double calculateTravelCostByMonth(int[] route, int month, double litersPer100KM, boolean isGasoline) {
        if (month < 0 | month > 11) {
            System.out.println("[ERROR]:Invalid month");
            return -1;
        }
        else if (litersPer100KM <= 0) {
            System.out.println("[ERROR]: Invalid litersPer100KM value");
            return -1;
        }
        else {
            int distanceTraveled = calculateTravelledDistance(route);
            float litersPerKM = (float) litersPer100KM/100;
            float litersMonth = distanceTraveled*litersPerKM;
            if (isGasoline == true) {
                double TravelCostByMonth = Math.round((GASOLINE[month] * litersMonth)*100.00)/100.00;
                return TravelCostByMonth;
            }
            else {
                double TravelCostByMonth = Math.round((DIESEL[month] * litersMonth)*100.00)/100.00;
                return TravelCostByMonth;
            }
        }
    }

    public static double calculateTravelCosts(int[][] routes, int[] months, double litersPer100KM, boolean isGasoline) {
        //TODO
        return 0;
    }

    //public static boolean isGasolineCheaper(int[][] routes, int[] months, double litersPer100KMGasoline, double litersPer100KMDiesel) {
        //TODO
    //    return ()0;
    //}

}
