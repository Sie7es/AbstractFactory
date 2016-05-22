package factorias.concretes;

import factorias.abstracts.StorageAbstractFactory;
import interfaces.Storage;
import products.HDDdrive;

/**
 * Created by Victor on 22/5/16.
 */
public class HDDFactory implements StorageAbstractFactory {
    float size;
    float capacity;

    public HDDFactory(float capacity, float size) {
        this.capacity = capacity;
        this.size = size;
    }


    @Override
    public Storage createStorage() {
        return new HDDdrive(size, capacity);
    }
}
