import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistem de notare pentru examene ");
        Scanner nex = new Scanner(System.in);
        String name = nex.nextLine();
        int total = 100;
        if (total <= 90) {
            System.out.println(total);
        } else {
            System.out.println("A" + " -> " + 90 + " to " + total);
        }

// ex 1 /////////////////////////////
        //ex2
        System.out.println("Nota");
        int nota = nex.nextInt();
        if ( nota >= 90 || nota <= 100 ){
            System.out.println("A");
            
        } ///// Calcul triunghi echilateral
        System.out.println("Tasteaza mai jos latura unui triunchi echilateral::\n");
        float s = nex.nextFloat();
        float a ;
        a = (float)((Math.sqrt(3)/4)*(s*s));
        System.out.println("\n Aria triunchiului echilateral = "+ a );
        //////////


    }


}
