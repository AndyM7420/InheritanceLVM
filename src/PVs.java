import java.util.ArrayList;
import java.util.List;

public class PVs extends VG{
    private ArrayList<PhysicalDrive> Lists;
    private String name;
    private PhysicalDrive which;
    public PVs(String name, PhysicalDrive which){
        super(name,which);
        this.name=name;
        this.which=which;
    Lists=new ArrayList<PhysicalDrive>();
    Lists.add(which);
    }
    public void lvList(){
       System.out.println(name+": "+Lists);
    }

}
