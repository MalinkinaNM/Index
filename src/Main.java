// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int a = 98;
        double b = 1.87;
        int bmi = (int) service.calculate(a, b);
        System.out.println(bmi);

    }
}