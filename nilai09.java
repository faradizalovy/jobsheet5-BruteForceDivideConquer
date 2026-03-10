public class nilai09 {
     mahasiswa09[] data;

    nilai09(mahasiswa09[] data){
        this.data = data;
    }
    int utsTertinggiDC(int l, int r){
        if(l == r){
            return data[l].uts;
        }
        int mid = (l + r) / 2;
        int kiri = utsTertinggiDC(l, mid);
        int kanan = utsTertinggiDC(mid + 1, r);

        if(kiri > kanan){
            return kiri;
        } else {
            return kanan;
        }
    }
    int utsTerendahDC(int l, int r){
        if(l == r){
            return data[l].uts;
        }
        int mid = (l + r) / 2;
        int kiri = utsTerendahDC(l, mid);
        int kanan = utsTerendahDC(mid + 1, r);

        if(kiri < kanan){
            return kiri;
        } else {
            return kanan;
        }
    }
    double rataUASBF(){
    double total = 0;
        for(int i = 0; i < data.length; i++){
            total += data[i].uas;
        }
        return total / data.length;
    }
}
