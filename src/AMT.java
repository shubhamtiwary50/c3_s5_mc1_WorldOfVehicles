public class AMT extends Transmission{
    public AMT(String transmissionType, String model, int forwardGears, float firstGearRatio, float secondGearRatio, float thirdGearRatio, float fourthGearRatio, float fifthGearRatio) {
        super(transmissionType, model, forwardGears, firstGearRatio, secondGearRatio, thirdGearRatio, fourthGearRatio, fifthGearRatio);
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
    }
}
