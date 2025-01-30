import java.util.Random;

public abstract class Flower {

    protected String name;
    protected double price;
    protected double neededArea;
    protected double chanceOfGrowth;
    protected boolean isPickable = false;
    Random rd = new Random();

    public Flower(String name, double price, double neededArea, double chanceOfGrowth) {
        this.name = name;
        this.price = price;
        this.neededArea = neededArea;
        setChanceOfGrowth(chanceOfGrowth);
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                '}';
    }

    public String grow(){
        if(rd.nextInt(100)<=chanceOfGrowth){
            price = price*3;
            chanceOfGrowth = 0;
            isPickable = true;
            return "The \"F-F-F-F L O W E R, Destroyer of Gardens\" has grown successfully"; //enter boss music
        }
        return "The flower was too weak and has failed to grow :/";
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getNeededArea() {
        return neededArea;
    }

    public void setNeededArea(double neededArea) {
        this.neededArea = neededArea;
    }

    public double getChanceOfGrowth() {
        return chanceOfGrowth;
    }

    public void setChanceOfGrowth(double chanceOfGrowth) {
        if(chanceOfGrowth < 0){
            this.chanceOfGrowth = 10;
        }else if (chanceOfGrowth > 100){
            this.chanceOfGrowth = 100;
        }else {
        this.chanceOfGrowth = chanceOfGrowth;
        }
    }

    public boolean isPickable() {
        return isPickable;
    }

    public void setPickable(boolean pickable) {
        isPickable = pickable;
    }

    public void water(){
        setChanceOfGrowth(this.chanceOfGrowth + 30);
    }

}
