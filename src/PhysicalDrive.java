import jdk.dynalink.beans.StaticClass;

import javax.swing.*;
import java.util.ArrayList;
import java.util.UUID;

public class PhysicalDrive{
    String name;
    UUID UUIDs;
    int Storage;
    public static ArrayList<PhysicalDrive> own=new ArrayList<PhysicalDrive>();
    public PhysicalDrive(String name, int Storage){
        own.add(this);
        this.name=name;
        UUIDGenerator s=new UUIDGenerator();
        UUIDs=s.getU();
        this.Storage=Storage;
    }

    @Override
    public String toString() {
        return  name  +"["+Storage+"GB"+"]"+"["+UUIDs+"]";
    }

    public String getName() {
        return name;
    }
    public void getListOfDrive(){
        for (PhysicalDrive physicalDrive : own) {
            System.out.println(physicalDrive.getName() + " " +"["+physicalDrive.getStorage()+"G]"+ " ["+physicalDrive.getUUIDs()+"]");
        }
    }

    public UUID getUUIDs() {
        return UUIDs;
    }

    public int getStorage() {
        return Storage;
    }
}
