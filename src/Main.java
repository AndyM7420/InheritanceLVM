public class Main {
    public static void main(String[] args) {
        PhysicalDrive sda=new PhysicalDrive("sda",20);
        PhysicalDrive kiwn=new PhysicalDrive("sda2",20);
        PhysicalDrive sda2=new PhysicalDrive("sda3",20);
        PhysicalDrive sd2a=new PhysicalDrive("sda43",20);
        PhysicalDrive sad=new PhysicalDrive("sda6u",20);
        sd2a.getListOfDrive();



        System.out.println(sda);
        PVs old= new PVs("vgl",sda);
        old.lvList();
    }
}
