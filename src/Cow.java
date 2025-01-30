public class Cow extends Animal {
    public Cow(String type, String name, String specialCare) {
        super(type, name, Size.BIG, specialCare);
    }


    @Override
    public String makeNoise() {
        return "MOOOOO";
    }
}
