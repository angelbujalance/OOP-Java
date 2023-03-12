//package edu.uoc.pac1;
import java.util.Arrays;
public class PAC1Ex2 {

    public static double twoDecimals(double number){
        return Math.round(number * 100d) / 100d;
    }

    public static int incomeTaxRate(double amount){
        if (amount > 24800){
            return 22;
        }
        else if (amount > 15000){
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
            float taxIVA = (float) (amount*0.21);
            return twoDecimals(amount-(taxRate)+(taxIVA));
        }
        else {
            return 0;
        }
    }

    public static double[] invoicesTotal(double[][] invoices) {
        double[] invoicesTotal = new double[invoices.length];
        for (int row=0; row<invoices.length; row++) {
            //double expensesClient;
            for (int col=0; col<invoices[row].length; col++) {
                double taxInvoice = totalIncomeTaxVAT(invoices[row][col]);
                //System.out.println(taxInvoice);
                //double expensesClient += taxInvoice;
                invoicesTotal[row] += taxInvoice;
            }
            //System.out.println(invoicesTotal[row]);
            System.out.printf("Client %d: %.2f \n", row+1, invoicesTotal[row]);
        }
        //System.out.println(Arrays.toString(invoicesTotal[0]));
    return invoicesTotal;
    }
}
