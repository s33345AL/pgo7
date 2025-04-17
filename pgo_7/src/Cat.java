public class Cat extends Feline {
    @Override
    public void makeNosie() {
        super.makeNosie();
        System.out.println("miau");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is ");
        super.sleep();
    }
}
