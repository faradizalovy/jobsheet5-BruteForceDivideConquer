public class MainNilai09 {
    public static void main(String[] args) {
        
        mahasiswa09[] mhs = {
            new mahasiswa09("Galih","220101001",2022,78,82),
            new mahasiswa09("Rey","220101002",2022,85,88),
            new mahasiswa09("Netta","220101003",2021,90,87),
            new mahasiswa09("Dfa","220101004",2021,76,79),
            new mahasiswa09("Dauz","220101005",2023,92,95),
            new mahasiswa09("Aji","220101006",2020,88,85),
            new mahasiswa09("Fia","220101007",2023,80,83),
            new mahasiswa09("Abe","220101008",2020,82,84)};

        nilai09 nilai = new nilai09(mhs);

        int utsTertinggi = nilai.utsTertinggiDC(0, mhs.length-1);
        int utsTerendah = nilai.utsTerendahDC(0, mhs.length-1);
        double rataUAS = nilai.rataUASBF();

        System.out.println("Nilai UTS Tertinggi (DC) : " + utsTertinggi);
        System.out.println("Nilai UTS Terendah (DC) : " + utsTerendah);
        System.out.println("Rata-rata UAS (BF) : " + rataUAS);
    }
}
