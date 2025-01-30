public class Sheep extends Animal{
    public Sheep(String type, String name, String specialCare) {
        super(type, name, Size.BIG, specialCare);
    }

    @Override
    public String makeNoise() {
        return "BAAAAA";
    }
}
