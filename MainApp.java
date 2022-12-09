public class MainApp {
    public static void main(String[] args) throws Exception {
        System.out.println("Class TransportasiAir");

        TransportasiAir data = new TransportasiAir(4,20000);
        data.informasi();
        data.berlayar();
        data.berlabuh();
        System.out.println("");

        System.out.println("Class Sampan");
        Sampan data2 = new Sampan(50000,2,2);
        data2.informasi();
        data2.berlayar();
        data2.berlabuh(2);
        data2.berlabuh();
        
        System.out.println("Class Kapal");
        Kapal data1 = new Kapal(50,100000,"Nuklir");
        data1.informasi();
        data1.berlayar();
        data1.berlayar(2);
        data1.berlabuh();
        System.out.println("");

    }
}
