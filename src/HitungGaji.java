public class HitungGaji{

    public int perhitunganGaji(int jamkerja, int gajiperjam){
        int gajiTotal = 0;
        for (int i = 0; i < jamkerja; i++){
            gajiTotal += gajiperjam;
        }
        return gajiTotal;
    }

    public static void main(String[] args){
        HitungGaji hitung = new HitungGaji();

        int gajiTotal = hitung.perhitunganGaji(40, 250000);
        System.out.println("Gaji karyawan dengan 40 jam kerja = " + gajiTotal);
    }
}