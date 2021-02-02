package org.launchcode.studio7;

public abstract class BaseDisc {
    private String dataContents;
    private String name;
    private int spinningSpeed;
    private double storageCapacity;

    public BaseDisc(String dataContents, String name, int spinningSpeed, double storageCapacity){
        this.dataContents= dataContents;
        this.name=name;
        this.spinningSpeed=spinningSpeed;
        this.storageCapacity=storageCapacity;
    }

    public String getDataContents() {
        return dataContents;
    }

    public void setDataContents(String dataContents) {
        this.dataContents = dataContents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpinningSpeed() {
        return spinningSpeed;
    }

    public void setSpinningSpeed(int spinningSpeed) {
        this.spinningSpeed = spinningSpeed;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
}
