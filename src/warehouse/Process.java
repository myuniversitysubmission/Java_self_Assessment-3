package warehouse;

public abstract class Process {
    protected String id;

    public Process(String id) {
        this.id = id;
    }

    // ✅ This method fixes the error
    public String getId() {
        return id;
    }

    public abstract double processDuration();
    public abstract double processResources();
    public abstract int countAGVs();
}
