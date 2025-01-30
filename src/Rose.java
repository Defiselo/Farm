public class Rose extends Flower {

    public Rose(String name, double price, double neededArea, double chanceOfGrowth) {
        super(name, price, neededArea, chanceOfGrowth);
    }

    @Override
    public void water() {
        setChanceOfGrowth(this.chanceOfGrowth+15);
    }

    public String prickle(){
        return "MWAHAHA GET PRICKLED BOZO";
    }

}
