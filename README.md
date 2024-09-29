# MiniProjectPBO1

**Tiap File Berbeda Tempat Package**
Saya telah membuat program CRUD Manajemen Bank Darah PMR Berikut adalah penjelasan singkat tentang struktur dan fitur-fitur program:

Program terdiri dari tiga file utama dalam package yang berbeda:

model/DonorDarah.java: Kelas model untuk objek Donor Darah
service/BankDarahService.java: Kelas layanan yang menangani operasi CRUD
main/ManajemenBankDarah.java: Kelas utama dengan menu interaktif


Kelas DonorDarah:

Memiliki 3 properti: id, nama, dan golonganDarah
Menggunakan constructor untuk inisialisasi objek
Memiliki getter dan setter untuk setiap properti
Memiliki method toString() untuk representasi string objek


Kelas BankDarahService:

Menggunakan ArrayList untuk menyimpan data donor
Memiliki method untuk operasi CRUD: tambahDonor, tampilkanDaftarDonor, updateDonor, dan hapusDonor
Menggunakan static keyword untuk daftarDonor dan idCounter


Kelas ManajemenBankDarah:

Mengimplementasikan menu interaktif menggunakan perulangan dan percabangan
Menggunakan Scanner untuk input pengguna
Memanggil method-method dari BankDarahService untuk melakukan operasi CRUD


Fitur-fitur yang diimplementasikan:

Percabangan (if-else dan switch-case)
Penggunaan static keyword
ArrayList dengan perulangan for-each
2 kelas utama (DonorDarah dan BankDarahService) dengan lebih dari 3 properti, beberapa method, dan constructor
3 package berbeda (model, service, dan main)

**Dokumentasi Program**
