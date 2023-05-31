public class Circle1 {
    // public / tipul clasei / static nu e felexibila / final , nu se schimba / double felul variabilei.
    public static final double radius = 7.5;

    public static void main(String[] args) {
        double perimetre = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimetre is =" + perimetre);
        System.out.println("Are is =" + area);
    }
}