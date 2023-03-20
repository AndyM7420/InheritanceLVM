import javax.swing.*;
import java.util.UUID;

public class PhysicalDrive{
    String name;
    UUID UUIDs;
    int Storage;
    public PhysicalDrive(String name, int Storage){
        this.name=name;
        UUIDGenerator s=new UUIDGenerator();
        UUIDs=s.getU();
        this.Storage=Storage;
    }

    @Override
    public String toString() {
        return  name + '\'' +
                ", UUID="  +UUIDs+
                ", Storage=" + Storage +
                '}';
    }

    public String getName() {
        return name;
    }

    public UUID getUUIDs() {
        return UUIDs;
    }

    public int getStorage() {
        return Storage;
    }
}
