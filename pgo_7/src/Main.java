public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
        System.out.println("==================");
        System.out.println("==================");
        Lion lion = new Lion();
        lion.makeNosie();
        lion.sleep();
        Feline feline = new Feline();
        feline.roam();
        Wolf wolf = new Wolf();
        wolf.sleep();
    }
}