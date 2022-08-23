public class TransmissionImpl {
    public static void main(String[] args) {
       Manual manual = new Manual("Manual","MD6",6,3.640f,2.150f,1.360f,1.000f,0.750f,0.630f);
       manual.showSpecs();
       AMT amt = new AMT("Automatic","AMTD5",5,2.950f,1.940f,1.340f,1.000f,0.630f);
        amt.showSpecs();
    }
}
