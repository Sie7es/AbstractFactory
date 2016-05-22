import factorias.concretes.HDDFactory;
import factorias.concretes.SSDFactory;
import interfaces.Storage;

/**
 * Created by Victor on 22/5/16.
 */
public class Run {
    public static void main(String[] args) {
        Storage sdd = new SSDFactory(120, 2.5f).createStorage();
        System.out.println(sdd.toString());

        Storage hdd = new HDDFactory(240, 3.5f).createStorage();
        System.out.println(hdd.toString());
    }
}
