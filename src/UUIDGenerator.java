import java.util.UUID;

public class UUIDGenerator {
    UUID u;
    public UUIDGenerator(){
        this.u= UUID.randomUUID();
}

    public UUID getU() {
        return u;
    }
}