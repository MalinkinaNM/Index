public class BmiService {
    public double calculate(int a, double b) {
        int weight = a;
        double height = b;
        int result = (int) (a / (b * b));
        return result;
    }
}
