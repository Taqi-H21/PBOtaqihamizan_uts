package LibraryManagement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemoLibraryManagementMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        List<theLibrary> pinjamsetor = new ArrayList<>();
        int pilihan;

        do {
            System.out.println("\n--- Menu Peminjaman dan Pengembalian Buku ---");
            System.out.println("1. Pendataan");
            System.out.println("2. Tampilan Peminjaman dan Pengembalian Buku");
            System.out.println("3. Keluar");
            System.out.print("\nMasukkan pilihan Anda: ");
            pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1:
                    inputData(input, pinjamsetor);
                    break;
                case 2:
                    tampilkanData(pinjamsetor);
                    break;
                case 3:
                    System.out.println("Terima kasih, program berakhir.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 3);

        input.close();
	}
	public static void inputData(Scanner input, List<theLibrary> pinjamsetor) {
        System.out.println("\n--- PENDATAAN ---");
        
        System.out.print("Masukkan Nama Anggota: ");
        String anggota = input.nextLine();
        System.out.print("Masukkan Judul Buku: ");
        String buku = input.nextLine();
        String state;
        boolean inputValid = false;
        do {
            System.out.print("Tindakkan (peminjaman atau pengembalian): ");
            state = input.nextLine().toLowerCase();
            if (state.equals("peminjaman")||state.equals("pengembalian")) {
            	inputValid = true;
            } else {
            	System.out.println("Input salah. Ulangi lagi");
            }
        } while (!inputValid);
        theLibrary dataBaru = new theLibrary(anggota, buku, state);
        pinjamsetor.add(dataBaru);

        System.out.println("Data " + state + " buku berhasil disimpan!");		
	}
	public static void tampilkanData(List<theLibrary> pinjamsetor) {
        System.out.println("\n--- DAFTAR PEMINJAMAN DAN PENGEMBALIAN BUKU (" + pinjamsetor.size() + " data) ---");
        
        if (pinjamsetor.isEmpty()) {
            System.out.println("Belum ada data peminjaman dan pengembalian buku.");
            return;
        }

        for (int i = 0; i < pinjamsetor.size(); i++) {
            theLibrary k = pinjamsetor.get(i);
            System.out.println((i + 1) + ". " + k.dataBuku());		
	}
}
}
