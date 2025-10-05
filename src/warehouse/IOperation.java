package warehouse;

import java.util.ArrayList;
import java.util.List;

public abstract class IOperation {
    protected String id;
    protected String description;
    protected double nominalTime;        // time required in minutes
    protected List<Resources> resources; // list of resources used

    public IOperation(String id, String description, double nominalTime) {
        this.id = id;
        this.description = description;
        this.nominalTime = nominalTime;
        this.resources = new ArrayList<>();
    }

    // Add a resource to the operation
    public void addResource(Resources res) {
        resources.add(res);
    }

    // Get duration (subclasses may override this if needed)
    public double getDuration() {
        return nominalTime;
    }

    // Calculate energy consumption of all resources in this operation
    public double getEnergyConsumption() {
        double energy = 0;
        for (Resources r : resources) {
            energy += r.getConsumption();
        }
        return energy;
    }

    // Count all AGVs used in this operation
    public int getAGVCount() {
        int count = 0;
        for (Resources r : resources) {
            if (r instanceof AGV) count++;
        }
        return count;
    }
}
