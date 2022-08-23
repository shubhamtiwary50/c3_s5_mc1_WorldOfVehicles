
public class Transmission {

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getForwardGears() {
        return forwardGears;
    }

    public void setForwardGears(int forwardGears) {
        this.forwardGears = forwardGears;
    }

    public float getFirstGearRatio() {
        return firstGearRatio;
    }

    public void setFirstGearRatio(float firstGearRatio) {
        this.firstGearRatio = firstGearRatio;
    }

    public float getSecondGearRatio() {
        return secondGearRatio;
    }

    public void setSecondGearRatio(float secondGearRatio) {
        this.secondGearRatio = secondGearRatio;
    }

    public float getThirdGearRatio() {
        return thirdGearRatio;
    }

    public void setThirdGearRatio(float thirdGearRatio) {
        this.thirdGearRatio = thirdGearRatio;
    }

    public float getFourthGearRatio() {
        return fourthGearRatio;
    }

    public void setFourthGearRatio(float fourthGearRatio) {
        this.fourthGearRatio = fourthGearRatio;
    }

    public float getFifthGearRatio() {
        return fifthGearRatio;
    }

    public void setFifthGearRatio(float fifthGearRatio) {
        this.fifthGearRatio = fifthGearRatio;
    }

    private String transmissionType;
    private String model;
    private int forwardGears;
    private float firstGearRatio;
    private float secondGearRatio;
    private float thirdGearRatio;
    private float fourthGearRatio;
    private float fifthGearRatio;


    public Transmission(String transmissionType, String model, int forwardGears, float firstGearRatio, float secondGearRatio, float thirdGearRatio, float fourthGearRatio, float fifthGearRatio) {
        this.transmissionType = transmissionType;
        this.model = model;
        this.forwardGears = forwardGears;
        this.firstGearRatio = firstGearRatio;
        this.secondGearRatio = secondGearRatio;
        this.thirdGearRatio = thirdGearRatio;
        this.fourthGearRatio = fourthGearRatio;
        this.fifthGearRatio = fifthGearRatio;
    }

}

