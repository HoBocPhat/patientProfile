package org.hobocphatcode;

public class Heart extends Organ{
    private int heartRate;

    public Heart(String name, String meCondition, int heartRate) {
        super(name, meCondition);
        this.heartRate = heartRate;
    }

    @Override
    public void Record() {
        super.Record();
        System.out.println("Heart rate: " + heartRate);
    }

    public void changeRate (int rate) {
        this.setHeartRate(rate);
        System.out.println("Heart rate changed to: " + getHeartRate());
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }
}
