public class Chicken extends Animal{
    public Chicken(String type, String name, String specialCare) {
        super(type, name, Size.SMALL, specialCare);
    }

    @Override
    public String makeNoise() {
        return "Cluck Cluck";
    }
}
