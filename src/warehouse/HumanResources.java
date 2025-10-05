package warehouse;

public class HumanResources extends Resources {
    private String name;
    private int skillLevel;

    public HumanResources(String id, String name, int skillLevel) {
        super(id);
        this.name = name;
        this.skillLevel = skillLevel;
    }

    @Override
    public double getConsumption() {
        // Example: human energy consumption based on skill
        return 0.5 * skillLevel;
    }
}
