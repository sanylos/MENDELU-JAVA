package cviceni2;

public class Backpack {
    private final int VOLUME;
    private final int LOAD_CAPACITY;

    private int remainingVolume;
    private int remainingLoadCapacity;

    public Backpack(int volume, int load_capacity) {
        this.VOLUME = volume;
        this.LOAD_CAPACITY = load_capacity;
        remainingVolume = this.VOLUME;
        remainingLoadCapacity = this.LOAD_CAPACITY;
    }

    public int getVolume() {
        return VOLUME;
    }

    public int getLoadCapacity() {
        return LOAD_CAPACITY;
    }

    public int getRemainingVolume() {
        return remainingVolume;
    }

    public int getRemainingLoadCapacity() {
        return remainingLoadCapacity;
    }

    public boolean putItem(Item item) {
        if(remainingVolume >= item.getVolume() && remainingLoadCapacity >= item.getWeight()) {
            remainingLoadCapacity -= item.getWeight();
            remainingVolume -= item.getVolume();
            return true;
        }
        return false;
    }
}
