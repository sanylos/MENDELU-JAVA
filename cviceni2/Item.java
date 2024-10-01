package cviceni2;

public class Item {
    private final int VOLUME;
    private final int WEIGHT;

    public Item(int volume, int weight) {
        this.VOLUME = volume;
        this.WEIGHT = weight;
    }

    public int getVolume() {
        return VOLUME;
    }

    public int getWeight() {
        return WEIGHT;
    }
}
