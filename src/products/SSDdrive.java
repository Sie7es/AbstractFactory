package products;

import interfaces.Storage;

/**
 * Created by Victor on 22/5/16.
 */
public class SSDdrive implements Storage {
    private float size;
    private float capacity;

    public SSDdrive(float size, float capacity) {
        this.size = size;
        this.capacity = capacity;
    }

    @Override
    public float getSize() {
        return size;
    }

    @Override
    public float getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "SSD con " + capacity + " GB de capacidad y " + size + " de tamaño";
    }
}
