public class TransportasiAir {
    protected int jumlahKursi;
    protected int biaya;
    
    
        public int jumlahKursi(){
            return this.jumlahKursi();
        }
        public int biaya(){
            return this.biaya();
        }
       
        
        public TransportasiAir(int jumlahKursi, int biaya){
            this.jumlahKursi = jumlahKursi;
            this.biaya = biaya;
        }
        public void informasi(){
            System.out.println("Transportasi Air jenis" +  "dengan kursi berjumlah" + jumlahKursi + "ditetapkan dengan biaya sebesar" + biaya );
        }

        public void berlayar(){
            System.out.println("Transportasi Air dengan jenis yang tidak diketahui sedang berlayar");
        }

        public void berlabuh(){
            System.out.println("Transportasi Air dengan jenis yang tidak diketahui berlabuh di pantai");
        }
    }