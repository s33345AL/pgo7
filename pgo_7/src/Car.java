public class Car extends Vehicle {
    private int numberofSeats;

    public int getNumberofSeats(){
        return numberofSeats;
    }

    @Override
    public void start() {
        super.start();
        System.out.println("Silnik pracuje poprawnie");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("Silnik wyłączył się poprawnie");
    }
}
