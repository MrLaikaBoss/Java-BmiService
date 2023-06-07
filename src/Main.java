public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double Weight = 98;
        double Height = 1.87;
        double index = service.calculate(Weight, Height);
        System.out.println("body mass index:");
        System.out.println((int) index);
    }
}