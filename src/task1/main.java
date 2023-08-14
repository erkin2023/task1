package task1;

public class main {
    public static void main(String[] args) {
        Sedan sedan1 = new Sedan("model x","black",180);
        Sedan sedan2 = new Sedan("model l","white",175);
        Gruz gruz1 = new Gruz("model zl","red",120);
        Gruz gruz2 = new Gruz("model xl","yellow",130);

        Car [] cars = {sedan1,sedan2,gruz1,gruz2};
        for (Car c:cars) {
            c.gas();
            c.brake();
            System.out.println("\n");
        }
    }
}
