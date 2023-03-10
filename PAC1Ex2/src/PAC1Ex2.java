//package edu.uoc.pac1;

public class PAC1Ex2 {

    public static double twoDecimals(double number){
        return Math.round(number * 100d) / 100d;
    }

    public static int incomeTaxRate(double amount){
        if (amount > 24800){
            return 22;
        }
        else if (amount > 1500){
            return 18;
        }
        else if (amount > 0){
            return 15;
        }
        else {
            return -1;
        }
    }
    public static double totalIncomeTaxVAT(double amount) {
        int rate = incomeTaxRate(amount);
        if (rate != -1) {
            float taxRate = (float) (amount*rate/100.00);
            float taxIva = (float) (amount*0.21);
            return twoDecimals(amount-(taxRate+taxIva));
        }
        else {
            return 0;
        }
    }

    public static double[] invoicesTotal(double[][] invoices) {
        //TODO
    }

}
