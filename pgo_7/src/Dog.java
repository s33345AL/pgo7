public class Dog extends Canine {
    @Override
    public void makeNosie() {
        super.makeNosie();
        System.out.println("Hau");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is ");
        super.sleep();
    }
}
