public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 82;
        double index = service.calculate(weight);
        System.out.println("body mass index:");
        System.out.println((int) index);
    }
}