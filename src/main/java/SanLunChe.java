public class SanLunChe implements Tradable, Drivable{

    private int maxSpeed;

    public SanLunChe() {
        maxSpeed = 10;
    }

    /**
     * this is a bad documentation for the method sound()
     */
    public String sound() {
        return "Onichan daisuki";
    }

    @Override
    public int getPrice() {
        return 10000;
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed += 10;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed -= 10;

    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
