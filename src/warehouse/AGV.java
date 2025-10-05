package warehouse;

public class AGV extends Resources {
    private double batteryLoad;     // percentage
    private double consumption;     // energy per operation
    private double chargingTime;    // in minutes
    private String position;
    private float maxSpeed;
    private float actSpeed;

    public AGV(String id, double batteryLoad, double consumption,
               double chargingTime, String position, float maxSpeed, float actSpeed) {
        super(id);
        this.batteryLoad = batteryLoad;
        this.consumption = consumption;
        this.chargingTime = chargingTime;
        this.position = position;
        this.maxSpeed = maxSpeed;
        this.actSpeed = actSpeed;
    }

    @Override
    public double getConsumption() {
        return consumption;
    }
}
