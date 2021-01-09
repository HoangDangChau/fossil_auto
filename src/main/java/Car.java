public class Car {

    public final static int WHEELS = 4;
    public final static int DOORS = 4;
    public final static int SEATS = 5;

    int wheels;
    int doors;
    int seats;
    int maxSpeed;

    public Car(int wheels, int doors, int seats, int maxSpeed) {
        this.wheels = wheels;
        this.doors = doors;
        this.seats = seats;
        this.maxSpeed = maxSpeed;
    }

    public Car(int maxSpeed) {
        this.wheels = WHEELS;
        this.doors = DOORS;
        this.seats = SEATS;
        this.maxSpeed = maxSpeed;
    }


    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("Max speed is: " + maxSpeed);
        }
    }

    public void info(){
        StringBuilder sb = new StringBuilder();
        sb.append("wheels = ").append(wheels);
        sb.append("\n").append("doors = ").append(doors);
        sb.append("\n").append("seats = ").append(seats);
        sb.append("\n").append("maxSpeed = ").append(maxSpeed);
        System.out.println(sb.toString());
    }


}

