package warehouse;

import java.util.ArrayList;
import java.util.List;

public class IndustrialProcess extends Process {
    private List<IOperation> operations;

    public IndustrialProcess(String id) {
        super(id);                 // ✅ sets the process ID
        operations = new ArrayList<>();
    }

    public void addOperation(IOperation op) {
        operations.add(op);
    }

    @Override
    public double processDuration() {
        double total = 0;
        for (IOperation op : operations) {
            total += op.getDuration();
        }
        return total;
    }

    @Override
    public double processResources() {
        double total = 0;
        for (IOperation op : operations) {
            total += op.getEnergyConsumption();
        }
        return total;
    }

    @Override
    public int countAGVs() {
        int total = 0;
        for (IOperation op : operations) {
            total += op.getAGVCount();
        }
        return total;
    }
}
