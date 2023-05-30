public class BmiService {
    public double calculate(double cost) {
        double BmiServiceValue = cost / Math.pow(1.74, 2);
        return BmiServiceValue;
    }
}
