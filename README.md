Nama : Reza Afzaal Faizullah Taqy <br>
NRP  : 5025241051

<img width="1491" height="776" alt="image" src="https://github.com/user-attachments/assets/98fe7f7b-eb8d-41c0-9eb6-2db82bb4bb19" />


A. `Fungsi Program` <br>
Program ini adalah sistem manajemen backend sederhana untuk bisnis rental kendaraan. Program berfungsi untuk:

1. Manajemen Inventaris: Menyimpan berbagai jenis kendaraan (Mobil, Motor, Truk) dalam satu wadah data yang terpadu menggunakan konsep pewarisan.

2. Kalkulasi Biaya: Menghitung total biaya sewa secara otomatis berdasarkan harga harian kendaraan dikalikan durasi sewa.

3. Tracking Status: Memantau ketersediaan unit agar kendaraan yang sedang disewa tidak bisa dipesan ganda (double booking).

4. Reporting: Menghasilkan laporan struk transaksi yang merinci penyewa, unit, durasi, dan total harga.


B. `Cara Kerja Program` <br>
Alur kerja program ini didesain sequential dengan validasi logika sebagai berikut:

1. Inisialisasi (Setup):

Program dimulai di MainApp. Objek SistemRental dibuat sebagai pengontrol utama.

Kendaraan ditambahkan ke dalam sistem. Di sini terjadi proses Upcasting, di mana objek Mobil, Motor, dan Truk dimasukkan ke dalam List<Kendaraan>.

2. Display Ketersediaan:

Sistem melakukan iterasi (looping) pada daftar inventaris. Hanya kendaraan dengan status isAvailable = true yang ditampilkan.

Method getInfoSpesifik() dipanggil. Karena Polimorfisme, output yang keluar akan menyesuaikan jenis objeknya (misal: Mobil menampilkan Transmisi, Truk menampilkan Tonase), meskipun variabel referensinya adalah Kendaraan.

3. Proses Transaksi:

User (via kode main) meminta sewa dengan input: Plat Nomor, Objek Pelanggan, dan Durasi.

Sistem mencari kendaraan berdasarkan plat nomor.

Validasi: Jika kendaraan ditemukan DAN tersedia, status kendaraan diubah menjadi false (tidak tersedia).

Sistem menghitung biaya menggunakan method hitungBiaya() dari kelas induk.

4. Output Laporan:

Sistem mencetak riwayat transaksi yang berisi detail penyewa dan total biaya yang harus dibayar.

<img width="586" height="429" alt="image" src="https://github.com/user-attachments/assets/cfda7df5-565e-4ae0-8941-18552c1868ae" />


C. `Penjelasan Masing Masing Class` <br>

1. Kendaraan <br>
Superclass (Induk). Class ini mendefinisikan "cetak biru" umum. Berisi atribut merk, plat, dan hargaSewa. Memiliki method hitungBiaya() yang logic-nya diwariskan ke semua anak. Menggunakan access modifier protected agar bisa diakses langsung oleh subclass. <br>

2. Mobil <br>
Subclass. Mewarisi Kendaraan. Menambahkan atribut spesifik transmisi (Manual/Matic). Melakukan Overriding pada method getInfoSpesifik() untuk menampilkan data transmisi tersebut. <br>

3. Motor <br>
Subclass. Mewarisi Kendaraan. Fokus pada atribut spesifik jenisMotor (Sport/Bebek). Ini menunjukkan bahwa satu induk bisa memiliki banyak bentuk turunan (Is-A Relationship). <br>

4. Truk <br>
Subclass. Mewarisi Kendaraan. Memiliki atribut unik kapasitasTon. Digunakan untuk mendemonstrasikan bahwa sistem bisa menangani jenis kendaraan niaga, bukan hanya penumpang. <br>

5. Pelanggan <br>
Entity Class. Kelas sederhana yang menerapkan Encapsulation (atribut private) untuk menyimpan data penyewa (Nama, No KTP) agar aman dan terstruktur. <br>

6. Transaksi <br>
Association Class. Kelas ini menghubungkan (Has-A relationship) antara Pelanggan dan Kendaraan. Bertugas menyimpan state transaksi seperti durasi sewa dan hasil kalkulasi total biaya. <br>

7. SistemRental <br>
Manager / Logic Layer. Pusat logika program. Mengelola List<Kendaraan> dan List<Transaksi>. Di sinilah logika bisnis utama (validasi ketersediaan, pengubahan status sewa) terjadi. <br>

8. MainApp <br>
Driver Class. Class yang berisi public static void main. Berfungsi sebagai simulator user yang menjalankan skenario penggunaan program.
