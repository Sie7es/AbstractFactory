package products;

import interfaces.Storage;

/**
 * Created by Victor on 22/5/16.
 */
public class HDDdrive implements Storage {
    float size;
    float capacity;

    public HDDdrive(float size, float capacity) {
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
        return "HDD con " + capacity + " GB de capacidad y " + size + " de tamaño";
    }
}
