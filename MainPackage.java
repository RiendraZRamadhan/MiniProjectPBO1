package main;

import service.BankDarahService;
import java.util.Scanner;

public class ManajemenBankDarah {
    private static final BankDarahService bankDarahService = new BankDarahService();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean lanjut = true;
        while (lanjut) {
            tampilkanMenu();
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (pilihan) {
                case 1 -> tambahDonor();
                case 2 -> bankDarahService.tampilkanDaftarDonor();
                case 3 -> updateDonor();
                case 4 -> hapusDonor();
                case 5 -> {
                    lanjut = false;
                    System.out.println("Terima kasih telah menggunakan sistem Manajemen Bank Darah PMR.");
                }
                default -> System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
        scanner.close();
    }

    private static void tampilkanMenu() {
        System.out.println("\n=== Manajemen Bank Darah PMR ===");
        System.out.println("1. Tambah Donor");
        System.out.println("2. Tampilkan Daftar Donor");
        System.out.println("3. Update Data Donor");
        System.out.println("4. Hapus Donor");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu (1-5): ");
    }

    private static void tambahDonor() {
        System.out.print("Masukkan nama donor: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan golongan darah: ");
        String golonganDarah = scanner.nextLine();
        bankDarahService.tambahDonor(nama, golonganDarah);
    }

    private static void updateDonor() {
        System.out.print("Masukkan ID donor yang akan diupdate: ");
        String id = scanner.nextLine();
        System.out.print("Masukkan nama baru: ");
        String namaBaru = scanner.nextLine();
        System.out.print("Masukkan golongan darah baru: ");
        String golonganDarahBaru = scanner.nextLine();
        bankDarahService.updateDonor(id, namaBaru, golonganDarahBaru);
    }

    private static void hapusDonor() {
        System.out.print("Masukkan ID donor yang akan dihapus: ");
        String id = scanner.nextLine();
        bankDarahService.hapusDonor(id);
    }
}
