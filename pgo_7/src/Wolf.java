public class Wolf extends Canine {
    @Override
    public void makeNosie() {
        super.makeNosie();
        System.out.println("Auuuu");
    }

    @Override
    public void sleep() {
        System.out.println("Wolf is ");
        super.sleep();
    }
}
