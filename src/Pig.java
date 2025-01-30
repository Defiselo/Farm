public class Pig extends Animal{
    public Pig(String type, String name, String specialCare) {
        super(type, name, Size.BIG, specialCare);
    }

    @Override
    public String makeNoise() {
        return "OIMNK";
    }
}
