package task1;

public class Sedan extends Car {

    public Sedan(String model, String colour, int maxSpeed) {
        super(model, colour, maxSpeed);
    }

    @Override
    public void gas() {
        System.out.println("speed 120km/5s");
    }

    @Override
    public void brake() {
        System.out.println("100m");

    }
}
