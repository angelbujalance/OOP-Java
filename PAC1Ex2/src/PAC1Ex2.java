public class PAC1Ex2 {

    public static double twoDecimals(double number) {
        return Math.round(number * 100d) / 100d;
    }

    public static int incomeTaxRate(double amount) {
        //a partir de una factura devuelve el
        //impuesto a la renta correspondiente
        if (amount > 24800) {
            return 22;
        } else if (amount > 15000) {
            return 18;
        } else if (amount > 0) {
            return 15;
        } else {
            return -1;
        }
    }

    public static double totalIncomeTaxVAT(double amount) {
        //devuelve el importe final de una factura
        int rate = incomeTaxRate(amount);
        if (rate != -1) { //si la cantidad no es negativa
            float taxRate = (float) (amount * rate / 100.00);
            float taxIVA = (float) (amount * 0.21);
            return twoDecimals(amount - (taxRate) + (taxIVA));
        } else {
            return 0;  //si la cantidad es negativa, devuelve 0
        }
    }

    public static double[] invoicesTotal(double[][] invoices) {
        //devuelve el importe total de
        double[] invoicesTotal = new double[invoices.length];
        for (int row = 0; row<invoices.length; row++) {
            // cada row corresponde a un cliente
            int invoicesClient = 0; //suma de las facturas del cliente
            for (int col = 0; col < invoices[row].length; col++) {
                invoicesClient += invoices[row][col];
            }
            // lista con la suma total de importes de cada cliente
            invoicesTotal[row] = totalIncomeTaxVAT(invoicesClient);
            System.out.printf("Client %d: %.2f \n",
                    row + 1, invoicesTotal[row]);
        }
        return invoicesTotal;
    }
}
