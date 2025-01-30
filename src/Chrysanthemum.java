public class Chrysanthemum extends Flower{
    public Chrysanthemum(String name, double price, double neededArea, double chanceOfGrowth) {
        super(name, price, neededArea, chanceOfGrowth);
    }

    @Override
    public void water() {
        setChanceOfGrowth(this.chanceOfGrowth+50);
    }

    public void breed(){
        price *=3;
    }


}
