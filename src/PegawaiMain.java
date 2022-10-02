import java.util.Scanner;
public class PegawaiMain {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Total Jumlah Pegawai : ");
        int jumlahPegawai = sc.nextInt();

        for(int i=0; i < jumlahPegawai; i++){
            System.out.println("");
            System.out.print("Nama Pegawai : ");
            String nama = sc.next();
            System.out.print("Nomer Induk Pegawai : ");
            String nipPegawai = sc.next();
            Pegawai pegawai = new Pegawai(nama, nipPegawai);
            System.out.print("Total Jam Kerja : ");
            int totalJam = sc.nextInt();
            pegawai.setJamKerja(totalJam);
            System.out.println("");
            pegawai.GajiPerHari();
            pegawai.cetakPenghasilan();
            System.out.println("");
        }

    }
}
