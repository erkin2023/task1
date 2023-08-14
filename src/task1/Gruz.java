package task1;

public class Gruz extends Car{
    public Gruz(String model, String colour, int maxSpeed) {
        super(model, colour, maxSpeed);
    }

    @Override
    public void gas() {
        System.out.println("speed 180 km/5s");
    }

    @Override
    public void brake() {
        System.out.println("100m");
    }
}
