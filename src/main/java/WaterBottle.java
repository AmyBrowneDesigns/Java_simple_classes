public class WaterBottle {
    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }

    public int haveDrink(int sip) {
        return this.volume -= sip;
    }

    public int emptyBottle() {
        return this.volume = 0;
    }

    public int fillBottle() {
        if (this.volume == 100) {
            return this.volume;
        } else {
            int result = 100 - this.volume;
            return result + this.volume;
        }
     }

}
