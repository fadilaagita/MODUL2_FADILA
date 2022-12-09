public class Sampan extends TransportasiAir{
        protected int layar;
    
    
        public Sampan(int jumlahKursi, int biaya, int layar){
            super(jumlahKursi, biaya);
            this.layar = layar;
    
        }
    
        @Override
        public void informasi(){
            System.out.print("Transportasi Air jenis Sampan dengan kursi berjumlah" + jumlahKursi + "ditetapkan dengan biaya sebesar" + biaya );
        }
    
        public void berlayar(){
            System.out.print("Transportasi Air jenis Sampan sedang berlayar menggunakan 2 layar");
        }
    
        public void berlabuh(){
            System.out.print("Transportasi Air jenis Sampan sedang berlabuh dipantai tanpa jangkar" );
        }
    
        public void berlabuh(int jangkar){
            System.out.print("Transportasi Air jenis Sampan sedang berlabuh di pantai menggunakan 2 jangkar" );
        }
    }