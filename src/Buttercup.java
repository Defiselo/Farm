public class Buttercup extends Flower{
    public Buttercup(String name, double price, double neededArea, double chanceOfGrowth) {
        super(name, price, neededArea, chanceOfGrowth);
    }

    @Override
    public void water() {
        setChanceOfGrowth(this.chanceOfGrowth+20);
    }
}
