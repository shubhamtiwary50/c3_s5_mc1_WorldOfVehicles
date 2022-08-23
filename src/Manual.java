
public class Manual extends Transmission
{
    private float sixthGearRatio;


    public Manual( String transmissionType, String model, int forwardGears, float firstGearRatio, float secondGearRatio, float thirdGearRatio, float fourthGearRatio,
                  float fifthGearRatio, float sixthGearRatio)
    {
        super( transmissionType, model, forwardGears, firstGearRatio, secondGearRatio, thirdGearRatio, fourthGearRatio,
                fifthGearRatio);
    }

    public float getSixthGearRatio() {
        return sixthGearRatio;
    }

    public void setSixthGearRatio(float sixthGearRatio) {
        this.sixthGearRatio = sixthGearRatio;
    }
    public void showSpecs()
    {
    System.out.println("Transmission Type : "+getTransmissionType()+" Transmission Model No : "+getModel());
    System.out.println("Key Specifications : ");
    System.out.println("1. Forward Gear : "+getForwardGears());
    System.out.println("2. First Gear ratio : "+getFirstGearRatio());
    System.out.println("3. Second Gear Ratio : "+getSecondGearRatio());
    System.out.println("4. Third Gear Ratio : "+getThirdGearRatio());
    System.out.println("5. Fourth Gear ratio : "+getFourthGearRatio());
    System.out.println("6. Fifth Gear Ratio : "+getFifthGearRatio());
    System.out.println("7. Sixth Gear Ratio : "+getSixthGearRatio());
   }
}
