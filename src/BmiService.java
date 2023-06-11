public class BmiService {
    public double calculate(double weight, double height) {
        double BmiServiceValue = weight / (height * height);
        return BmiServiceValue;
    }
}
