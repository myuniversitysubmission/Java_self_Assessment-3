package warehouse;

public class WarehouseSimulation {
    public static void main(String[] args) {

        System.out.println("=== Warehouse Process Simulation ===");

        // -----------------------
        // Create AGV resources
        // -----------------------
        AGV agv1 = new AGV("AGV1", 100, 5, 30, "Dock1", 20, 15);
        AGV agv2 = new AGV("AGV2", 90, 6, 25, "Dock2", 18, 12);
        AGV agv3 = new AGV("AGV3", 85, 4, 20, "Dock3", 22, 16);

        // -----------------------
        // Create Human resources
        // -----------------------
        HumanResources worker1 = new HumanResources("W1", "John", 2);
        HumanResources worker2 = new HumanResources("W2", "Maria", 2);

        // -----------------------
        // Create Operations
        // -----------------------
        TransportOperation op1 = new TransportOperation("OP1", "Load items with AGV", 15);
        op1.addResource(agv1);

        TransportOperation op2 = new TransportOperation("OP2", "Transport items to storage", 20);
        op2.addResource(agv2);
        op2.addResource(agv3);

        HumanOperation op3 = new HumanOperation("OP3", "Inspect items manually", 10);
        op3.addResource(worker1);

        HumanOperation op4 = new HumanOperation("OP4", "Pack items for shipment", 12);
        op4.addResource(worker2);

        // -----------------------
        // Create Industrial Process
        // -----------------------
        IndustrialProcess process = new IndustrialProcess("Process1");
        process.addOperation(op1);
        process.addOperation(op2);
        process.addOperation(op3);
        process.addOperation(op4);

        // -----------------------
        // Simulation Results
        // -----------------------
        System.out.println("Process ID: " + process.getId());
        System.out.println("Total Process Duration: " + process.processDuration() + " minutes");
        System.out.println("Total AGVs used: " + process.countAGVs());
        System.out.println("Total Energy Consumption: " + process.processResources() + " units");
    }
}
