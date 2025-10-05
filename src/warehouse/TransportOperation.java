package warehouse;

public class TransportOperation extends IOperation {

    public TransportOperation(String id, String description, double nominalTime) {
        super(id, description, nominalTime);
    }

    // If you want to change duration calculation (e.g., based on AGV speed), you can override getDuration()
    @Override
    public double getDuration() {
        // For now, just use nominal time
        return super.getDuration();
    }
}
