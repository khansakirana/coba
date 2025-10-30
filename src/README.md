# Program Catatan Pengeluaran

Program *Catatan Pengeluaran* adalah aplikasi sederhana berbasis console yang digunakan untuk mencatat, menampilkan, dan menghitung total pengeluaran harian.
Dibuat menggunakan bahasa pemrograman *Java, program ini memanfaatkan konsep **Object-Oriented Programming (OOP)* seperti kelas, objek, dan enkapsulasi.

---

## Fitur Utama

1. *Tambah Pengeluaran*
   Pengguna dapat menambahkan data pengeluaran dengan mengisi tanggal, keterangan, dan jumlah uang yang dikeluarkan.

2. *Lihat Daftar Pengeluaran*
   Menampilkan seluruh data pengeluaran yang telah dicatat beserta total pengeluarannya.

3. *Keluar dari Program*
   Mengakhiri program dengan pesan penutup.

---

## Struktur Kelas

Program terdiri dari beberapa kelas berikut:

### 1. Pengeluaran

Menyimpan data pengeluaran berupa:

* tanggal — tanggal transaksi (format YYYY-MM-DD)
* keterangan — deskripsi singkat pengeluaran
* jumlah — nilai uang yang dikeluarkan

Memiliki method toString() untuk menampilkan data dalam format teks.

### 2. CatatanPengeluaran

Berfungsi sebagai wadah penyimpanan daftar pengeluaran.
Fungsi utama:

* tambah() — menambahkan data pengeluaran ke dalam list
* hitungTotal() — menghitung total seluruh pengeluaran
* tampilkan() — menampilkan seluruh pengeluaran dan totalnya

### 3. InputHelper

Membantu proses input dari pengguna melalui Scanner.
Fungsi utama:

* inputPengeluaran() — meminta input tanggal, keterangan, dan jumlah
* tampilkanMenu() — menampilkan menu utama dan mengembalikan pilihan pengguna

### 4. pengeluaranApp (Main Class)

Kelas utama yang menjalankan program.
Menampilkan menu interaktif dan mengatur alur antara input pengguna, pencatatan, dan tampilan data.

---

## Cara Menjalankan Program

1. Pastikan Java sudah terinstal di perangkat Anda (java --version).
2. Simpan semua file dalam satu folder dengan nama pengeluaranApp.java.
3. Buka terminal/command prompt di folder tersebut.
4. Jalankan perintah berikut:

   bash
   javac pengeluaranApp.java
   java pengeluaranApp

5. Pilih menu sesuai kebutuhan:

    * 1 → Tambah Pengeluaran
    * 2 → Lihat Pengeluaran
    * 3 → Keluar dari Program

---

## Contoh Tampilan Program


1. Tambah Pengeluaran
2. Lihat Pengeluaran
3. Keluar
   Pilih menu: 1
   Masukkan tanggal (YYYY-MM-DD): 2025-10-30
   Masukkan keterangan: Makan siang
   Masukkan jumlah: 25000

1. Tambah Pengeluaran
2. Lihat Pengeluaran
3. Keluar
   Pilih menu: 2
   2025-10-30 - Makan siang : Rp25000.0
   Total Pengeluaran: Rp25000.0


---

## Konsep OOP yang Digunakan

* *Encapsulation* → data disimpan dalam objek Pengeluaran
* *Abstraction* → kelas InputHelper memisahkan logika input dari logika utama
* *Composition* → CatatanPengeluaran memiliki daftar objek Pengeluaran
* *Polymorphism (implicit)* → penggunaan toString() untuk representasi teks objek

---

## Lisensi

Program ini dibuat untuk keperluan pembelajaran dasar Java dan bebas digunakan untuk tujuan akademik atau pribadi.