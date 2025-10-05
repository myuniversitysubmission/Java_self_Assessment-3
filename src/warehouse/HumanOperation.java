package warehouse;

public class HumanOperation extends IOperation {

    public HumanOperation(String id, String description, double nominalTime) {
        super(id, description, nominalTime);
    }

    // For now, no special calculation; just use nominal time
    @Override
    public double getDuration() {
        return super.getDuration();
    }
}
