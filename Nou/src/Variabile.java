public class Variabile {

    public static void main(String[] args) {
        String nume = "Tavi";
        System.out.println(nume);
        String textulMeu = "imi place java";
        System.out.println(textulMeu);
        int numarumMeuIntreg = 100;
        System.out.println(100);
        double numarulMeuDouble = 55.6;
        System.out.println(numarulMeuDouble);
        float numarulMeuFloat = 44.3f;
        System.out.println(numarulMeuFloat);
        char litera = 'A';
        System.out.println(litera);
        boolean valuare = true;
        System.out.println(true);

        /// Operatorii matematici
        System.out.println(10 + 10);
        System.out.println(100 - 88);
        System.out.println(100 * 3);
        System.out.println(100 / 4);
        System.out.println(7 % 3);
        // Operatorii rationali
        System.out.println(7 == 7);
        System.out.println(7 != 9); // 7 este diferit de 9 '!=9''
        System.out.println(4 + 4 < 100);
        System.out.println(8 + 8 > 10);
        System.out.println(8 >= 8);

        // Operatorii logici
        System.out.println(6 < 10 && 6 < 10); //functia "Si"
        System.out.println(100 < 1000 || 9 > 100); // functia "sau"
        System.out.println(!true);


        //Operatotii de atribuire
        int numar = 5;
        numar++;
        System.out.println(numar);

        int numar2 = 6;
        numar2--;
        System.out.println(numar2);

        int numar3 = 7;
        numar3 += 20; // '+=' pentru incrementarea(adaugarea la un numar existent)
        System.out.println(numar3);
        numar3 += 34;
        System.out.println(numar3);
        System.out.println(numar3 + numar3);
/////////////////////
        ////exercitii


        int numar1 = 1;
        int numar22 = 2;
        System.out.printf("Primul numar este este %d, iar al doilea este %d", numar1, numar22);


        int suma = numar1 + numar22;
        int diferenta = numar1 - numar22;
        int produsul = numar1 * numar22;
        int impartiere = numar22 / numar1;

        System.out.println();

        System.out.println("Suma este " + suma);
        System.out.println("Diferenta este " + diferenta);
        System.out.println("Produsul este " + produsul);
        System.out.println("Impartirea este " + impartiere);

        int suma1 = numar1 + numar22;
        int diferenta2 = numar1 - numar22;
        int produsul3 = numar1 * numar22;
        int impartiere4 = numar22 / numar1;

        System.out.printf("suma este %d , dif este %d,produsul %d, imapartirea %d ", suma1, diferenta2, produsul3, impartiere4);


        System.out.println();
        int num3 = 30;
        System.out.println();

        suma += num3; // ctrl + Alt + L == formatere cod frumos
        diferenta += num3;
        produsul += num3;
        impartiere = +num3;

        System.out.printf("Dupa ce am adaugat %d, am obtinut rezultatul %d ", num3, suma, diferenta, produsul);
        System.out.println();
        System.out.printf("Dupa ce am adaugat %d, am obtinut rezultatul %d ", num3, diferenta);
        System.out.println();
        System.out.printf("Dupa ce am adaugat %d, am obtinut rezultatul %d ", num3, produsul);
        System.out.println();
        System.out.printf("Dupa ce am adaugat %d, am obtinut rezultatul %d ", num3, impartiere);
        System.out.println();

        System.out.println("Hello\nAlexandra Abramov!");
        System.out.println();
        System.out.println(74 + 36);
        System.out.println();
        System.out.println(-5 + 8 * 6);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
        int nr1 = 25;
        int nr2 = 5;
        System.out.println(nr1 + "X" + nr2 + "=" + nr1 * nr2);


    }
}
