public class BmiService {
    public double calculate(double Weight, double Height) {
        double BmiServiceValue = Weight / (Height * Height);
        return BmiServiceValue;
    }
}
