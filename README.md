# PBO-TUGAS-PEWARISAN
# Program Bangun Geometri dengan Java

## Deskripsi
Proyek ini merupakan latihan Pemrograman Berorientasi Objek (Object-Oriented Programming/OOP) menggunakan Java. Program mendefinisikan beberapa kelas bangun geometri, yaitu `Bentuk`, `BujurSangkar`, `Lingkaran`, dan `Silinder`, lalu menjalankannya melalui kelas `Main`.

## Fitur
- Menyimpan dan mengubah warna bangun.
- Menghitung luas bujur sangkar.
- Menghitung luas lingkaran.
- Menghitung volume silinder.
- Menampilkan informasi bangun melalui method `printInfo()`.

## Struktur File
```text
.
├── Bentuk.java
├── BujurSangkar.java
├── Lingkaran.java
├── Silinder.java
└── Main.java
```

## Penjelasan Kelas

### `Bentuk`
Kelas dasar yang menyimpan atribut `warna`. Menyediakan constructor, getter dan setter `getWarna()` serta `setWarna()`, dan method `printInfo()` untuk menampilkan warna bangun.

### `BujurSangkar`
Kelas turunan dari `Bentuk` yang memiliki atribut `sisi`. Method `hitungLuas()` menghitung luas dengan rumus:

```text
luas = sisi × sisi
```

Method `printInfo()` menampilkan warna dan luas bujur sangkar.

### `Lingkaran`
Kelas turunan dari `Bentuk` yang memiliki atribut `radius` dan konstanta `PHI` bernilai `3.14`. Method `hitungLuas()` menghitung luas dengan rumus:

```text
luas = 3.14 × radius × radius
```

Method `printInfo()` menampilkan warna dan luas lingkaran.

### `Silinder`
Kelas turunan dari `Lingkaran` yang memiliki atribut `tinggi`. Method `hitungVolume()` menghitung volume dengan rumus:

```text
volume = luas alas × tinggi
```

Luas alas diperoleh dari method `hitungLuas()` milik kelas `Lingkaran`. Method `printInfo()` menampilkan warna dan volume silinder.

### `Main`
Kelas utama yang menjalankan contoh objek:
- `Bentuk` dengan warna Merah.
- `BujurSangkar` dengan sisi 5 dan warna Biru.
- `Lingkaran` dengan radius 7 dan warna Hijau.
- `Silinder` dengan tinggi 10, radius 7, dan warna Kuning.

## Konsep OOP yang Digunakan
- **Inheritance (pewarisan):** `BujurSangkar` dan `Lingkaran` mewarisi `Bentuk`, sedangkan `Silinder` mewarisi `Lingkaran`.
- **Encapsulation (enkapsulasi):** atribut seperti `warna`, `sisi`, `radius`, dan `tinggi` dibuat `private`, lalu diakses atau diubah melalui getter dan setter yang tersedia.
- **Method overriding:** kelas turunan menimpa method `printInfo()` untuk menampilkan informasi sesuai jenis bangunnya.
- **Pemanggilan constructor:** `super(...)` digunakan untuk meneruskan nilai ke constructor kelas induk.

## Persyaratan
- Java Development Kit (JDK) terpasang.
- Seluruh file `.java` berada dalam direktori yang sama.

## Cara Menjalankan
Kompilasi seluruh file:

```bash
javac Bentuk.java BujurSangkar.java Lingkaran.java Silinder.java Main.java
```

Jalankan program melalui kelas `Main`:

```bash
java Main
```

## Contoh Output
Dengan rumus dan nilai yang digunakan pada kode saat ini, output yang diharapkan adalah:

```text
Bentuk berwarna Merah
BujurSangkar berwarna Biru, luas = 25.0
Lingkaran Hijau, luas = 153.86
Silinder warna Kuning, volume = 15386.0
```
