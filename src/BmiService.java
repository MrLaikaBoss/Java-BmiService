public class BmiService {
    public double calculate(double weight, double height) {
        double bmiServiceValue = weight / (height * height);
        return bmiServiceValue;
    }
}
