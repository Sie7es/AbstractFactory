package factorias.concretes;

import factorias.abstracts.StorageAbstractFactory;
import interfaces.Storage;
import products.SSDdrive;

/**
 * Created by Victor on 22/5/16.
 */
public class SSDFactory implements StorageAbstractFactory {
    private float capacity;
    private float size;

    public SSDFactory(float capacity, float size) {
        this.capacity = capacity;
        this.size = size;
    }

    @Override
    public Storage createStorage() {
        return new SSDdrive(size, capacity);
    }
}
