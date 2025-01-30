import java.util.Random;

public class Rabbit extends Animal{
    Random rd = new Random();
    private boolean isFunny = false;
    public Rabbit(String type, String name, String specialCare) {
        super(type, name, Size.SMALL, specialCare);
    }

    @Override
    public String makeNoise() {
        if (rd.nextInt(500) == 1){
            isFunny = true;
            return "Hippity Hoppity, your farm is now my property >;3";
        }else {
            return "SQUEAKK";
        }
    }

    public boolean isFunny() {
        return isFunny;
    }
}
