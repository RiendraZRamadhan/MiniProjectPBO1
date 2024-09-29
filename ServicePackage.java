package service;

import model.DonorDarah;
import java.util.ArrayList;
import java.util.List;

public class BankDarahService {
    private static final List<DonorDarah> daftarDonor = new ArrayList<>();
    private static int idCounter = 1;

    public void tambahDonor(String nama, String golonganDarah) {
        String id = "D" + String.format("%03d", idCounter++);
        DonorDarah donor = new DonorDarah(id, nama, golonganDarah);
        daftarDonor.add(donor);
        System.out.println("Donor berhasil ditambahkan: " + donor);
    }

    public void tampilkanDaftarDonor() {
        if (daftarDonor.isEmpty()) {
            System.out.println("Daftar donor kosong.");
        } else {
            System.out.println("Daftar Donor Darah:");
            for (DonorDarah donor : daftarDonor) {
                System.out.println(donor);
            }
        }
    }

    public void updateDonor(String id, String namaBaru, String golonganDarahBaru) {
        for (DonorDarah donor : daftarDonor) {
            if (donor.getId().equals(id)) {
                donor.setNama(namaBaru);
                donor.setGolonganDarah(golonganDarahBaru);
                System.out.println("Data donor berhasil diupdate: " + donor);
                return;
            }
        }
        System.out.println("Donor dengan ID " + id + " tidak ditemukan.");
    }

    public void hapusDonor(String id) {
        DonorDarah donorToRemove = null;
        for (DonorDarah donor : daftarDonor) {
            if (donor.getId().equals(id)) {
                donorToRemove = donor;
                break;
            }
        }
        if (donorToRemove != null) {
            daftarDonor.remove(donorToRemove);
            System.out.println("Donor berhasil dihapus: " + donorToRemove);
        } else {
            System.out.println("Donor dengan ID " + id + " tidak ditemukan.");
        }
    }
}
