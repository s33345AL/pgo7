public class Lion extends Feline {
    @Override
    public void makeNosie() {
        super.makeNosie();
        System.out.println("roar");
    }

    @Override
    public void sleep() {
        System.out.println("Lion is ");
        super.sleep();
    }
}
