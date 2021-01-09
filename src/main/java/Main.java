public class Main {
    public static void main(String[] args) {
        System.out.println("Car information");
        Car toyota = new Car(100);
        toyota.info();
        toyota.run();
        System.out.println("Car information");
        Car bmw = new Car(200);
        bmw.info();
        bmw.run();

    }
}
