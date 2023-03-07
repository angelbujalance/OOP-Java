public class PAC1Task2 {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No data"); //si no hay argumentos hace un print
        } else {

            int min, max, sum; // crea tres valores int vaciós

            min = max = sum = Integer.parseInt(args[0]);

            for (int i = 1; i < args.length; ++i) { //para cada el de los arguments haz:
                int val = Integer.parseInt(args[i]); //el valor se convierte en int
                if (min > val) min = val; // si el valor es el valor min, sobreescribe el valor de min
                if (max < val) max = val; // si el valor es mayor que el valor en max, sobreescribe
                sum += val; // suma el valor a la suma de todos los valores anteriores
            }

            double avg = (double) sum / args.length; //haz la media: suma / n argumentos

            System.out.println(min + "\t" + max + "\t" + avg); // imprime los tres valores separados por espacios
        }
    }

}
