public class Pegawai {
    private String nama, nip;
    private double gjpokok=0, uanglembur=0, uangMakan=0, uangtransport=0, gjtotal=0;
    private int jumlahJamKerja;
       
    Pegawai(String namaa, String niip){
    this.nama = namaa;
    this.nip = niip;
        
    }

    public void GajiPerHari(){
        if(jumlahJamKerja > 0 && jumlahJamKerja <= 7){
            gjpokok = 2000 * jumlahJamKerja;
            gjtotal = gjpokok;
        }else if(jumlahJamKerja > 7 && jumlahJamKerja < 9){
            gjpokok = 2000 * 7;
            uanglembur = (jumlahJamKerja - 7) * 3000;
            uangMakan = 3500;
            gjtotal = gjpokok + uanglembur + uangMakan;
        }else if(jumlahJamKerja >= 9){
            gjpokok = 2000*7;
            uanglembur = (jumlahJamKerja-7)*3000;
            uangMakan = 3500;
            uangtransport = 4000;
            gjtotal = gjpokok + uanglembur + uangMakan + uangtransport;
        }
    }
       
    public void setJamKerja(int jumlahJamKerja){
    this.jumlahJamKerja = jumlahJamKerja;

    }
        
    public int getJamKerja(){
    return jumlahJamKerja;
        
    }
       
    public void cetakPenghasilan(){
    System.out.println("Nama : " + nama);
    System.out.println("NIP : " + nip);
    System.out.println("Gaji Pokok : " + gjpokok);
    System.out.println("Uang Lembur : " + uanglembur);
    System.out.println("Uang Makan : " + uangMakan);
    System.out.println("Uang Transport : " + uangtransport);
    System.out.println("Total Gaji : " + gjtotal);
    }
}
