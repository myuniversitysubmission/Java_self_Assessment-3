package warehouse;

public abstract class Resources {
    protected String id;

    // ✅ Constructor
    public Resources(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    // ✅ Every resource must define how much energy it consumes
    public abstract double getConsumption();
}
