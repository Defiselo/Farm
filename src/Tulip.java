public class Tulip extends Flower{
    public Tulip(String name, double price, double neededArea, double chanceOfGrowth) {
        super(name, price, neededArea, chanceOfGrowth);
    }

    @Override
    public void water() {
       setChanceOfGrowth(chanceOfGrowth + 40);
    }

}
