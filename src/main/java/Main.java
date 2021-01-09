public class Main {
    public static void main(String[] args) {
        System.out.println("Fossil Question 2...");
        Car bmwCar = new Car(200);
        Car toyotaCar = new Car(100);
        Thread bmwThread = new Thread(bmwCar);
        Thread toyotaThread = new Thread(toyotaCar);

        bmwThread.start();
        toyotaThread.start();
    }
}
