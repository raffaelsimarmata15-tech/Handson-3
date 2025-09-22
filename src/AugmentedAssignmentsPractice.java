public class AugmentedAssignmentsPractice {
    public static void main(String[] args) {
        // ===== AUGMENTED ASSIGNMENTS DASAR =====
        System.out.println("\\n=== AUGMENTED ASSIGNMENTS DASAR ===");

        // Latihan 1: Berlatih semua operator augmented assignment
        // - Deklarasikan variabel 'score' dengan nilai awal 100
        int score = 100;
        System.out.println("Nilai awal score: " + score); // Output: 100

        // - Gunakan += untuk menambah 25 ke score, lalu print hasilnya
        score += 25; // Sama dengan: score = score + 25;
        System.out.println("Score setelah += 25: " + score); // Output: 125

        // - Gunakan -= untuk mengurangi 15 dari score, lalu print hasilnya
        score -= 15; // Sama dengan: score = score - 15;
        System.out.println("Score setelah -= 15: " + score); // Output: 110

        // - Gunakan *= untuk mengalikan score dengan 2, lalu print hasilnya
        score *= 2; // Sama dengan: score = score * 2;
        System.out.println("Score setelah *= 2: " + score); // Output: 220

        // - Gunakan /= untuk membagi score dengan 4, lalu print hasilnya
        score /= 4; // Sama dengan: score = score / 4; (pembagian integer)
        System.out.println("Score setelah /= 4: " + score); // Output: 55

        // - Gunakan %= untuk mendapat sisa bagi ketika score dibagi 10, lalu print hasilnya
        score %= 10; // Sama dengan: score = score % 10;
        System.out.println("Score setelah %= 10: " + score); // Output: 5
        System.out.println();

        // ===== PERBANDINGAN DENGAN REGULAR ASSIGNMENTS =====
        System.out.println("\\n=== PERBANDINGAN: AUGMENTED vs REGULAR ===");

        // Latihan 2: Bandingkan augmented assignments dengan regular assignments
        // - Buat dua variabel identik 'value1' dan 'value2' dengan nilai 50
        int value1 = 50;
        int value2 = 50;
        System.out.println("Nilai awal: value1=" + value1 + ", value2=" + value2); // Output: value1=50, value2=50

        // - Untuk value1, gunakan regular assignment: value1 = value1 + 30
        value1 = value1 + 30;

        // - Untuk value2, gunakan augmented assignment: value2 += 30
        value2 += 30;

        // - Print kedua nilai untuk memastikan keduanya sama
        System.out.println("\nSetelah tambah 30:");
        System.out.println("value1 (regular assignment): " + value1); // Output: 80
        System.out.println("value2 (augmented assignment): " + value2); // Output: 80
        System.out.println("Apakah value1 == value2? " + (value1 == value2)); // Output: true

        // - Reset kedua nilai ke 80
        value1 = 80;
        value2 = 80;
        System.out.println("\nNilai setelah reset: value1=" + value1 + ", value2=" + value2); // Output: value1=80, value2=80

        // - Untuk value1, gunakan regular assignment: value1 = value1 * 3
        value1 = value1 * 3;

        // - Untuk value2, gunakan augmented assignment: value2 *= 3
        value2 *= 3;

        // - Print kedua nilai untuk memastikan keduanya sama
        System.out.println("\nSetelah kali 3:");
        System.out.println("value1 (regular assignment): " + value1); // Output: 240
        System.out.println("value2 (augmented assignment): " + value2); // Output: 240
        System.out.println("Apakah value1 == value2? " + (value1 == value2)); // Output: true
        System.out.println();

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\\n=== APLIKASI PRAKTIS ===");

        // Latihan 3: Gunakan augmented assignments dalam skenario praktis
        // - Buat variabel 'bankBalance' dengan nilai awal 1000
        double bankBalance = 1000.0; // Menggunakan double untuk transaksi finansial
        System.out.printf("Saldo awal bank: $%.2f%n", bankBalance);

        // - Simulasikan deposit: tambahkan 250 ke bankBalance menggunakan +=
        double depositAmount = 250.0;
        bankBalance += depositAmount; // bankBalance = bankBalance + 250.0;
        System.out.printf("Setelah deposit $%.2f: $%.2f%n", depositAmount, bankBalance); // Output: 1250.00

        // - Simulasikan penarikan: kurangi 75 dari bankBalance menggunakan -=
        double withdrawalAmount = 75.0;
        bankBalance -= withdrawalAmount; // bankBalance = bankBalance - 75.0;
        System.out.printf("Setelah penarikan $%.2f: $%.2f%n", withdrawalAmount, bankBalance); // Output: 1175.00

        // - Simulasikan kalkulasi bunga: kalikan bankBalance dengan 1.05 (bunga 5%) menggunakan *=
        double interestRateFactor = 1.05; // 1 + 0.05 (5% bunga)
        bankBalance *= interestRateFactor; // bankBalance = bankBalance * 1.05;
        System.out.printf("Setelah bunga 5%% diterapkan: $%.2f%n", bankBalance); // Output: 1233.75 (approx)

        // - Print saldo akhir
        System.out.printf("\nSaldo akhir bank: $%.2f%n", bankBalance);
        System.out.println();

        // Latihan 4: Pola counter dan accumulator
        System.out.println("\\n=== POLA COUNTER DAN ACCUMULATOR ===");
        // - Buat variabel 'totalSales' dimulai dari 0
        double totalSales = 0.0; // Menggunakan double untuk potensi nilai desimal
        System.out.printf("Total penjualan awal: $%.2f%n", totalSales);

        // - Tambahkan jumlah penjualan harian menggunakan += : hari1 = 150, hari2 = 200, hari3 = 175
        double salesHari1 = 150.0;
        double salesHari2 = 200.0;
        double salesHari3 = 175.0;

        totalSales += salesHari1; // totalSales = 0.0 + 150.0 = 150.0
        System.out.printf("Setelah penjualan hari 1 ($%.2f): $%.2f%n", salesHari1, totalSales);

        totalSales += salesHari2; // totalSales = 150.0 + 200.0 = 350.0
        System.out.printf("Setelah penjualan hari 2 ($%.2f): $%.2f%n", salesHari2, totalSales);

        totalSales += salesHari3; // totalSales = 350.0 + 175.0 = 525.0
        System.out.printf("Setelah penjualan hari 3 ($%.2f): $%.2f%n", salesHari3, totalSales);

        System.out.printf("\nTotal Penjualan Akhir: $%.2f%n", totalSales);

        // - Buat variabel 'productionCount' dimulai dari 1000
        int productionCount = 1000;
        System.out.println("\nJumlah produksi awal: " + productionCount);

        // - Simulasikan barang cacat yang dihapus: kurangi 25 menggunakan -=
        int defectiveItems = 25;
        productionCount -= defectiveItems; // productionCount = 1000 - 25 = 975
        System.out.println("Setelah mengurangi barang cacat (" + defectiveItems + "): " + productionCount);

        // - Simulasikan bonus produksi: kalikan dengan 1.1 menggunakan *=
        double bonusFactor = 1.1; // Bonus 10%
        // Penting: Hasil dari (int * double) adalah double.
        // Kita perlu melakukan casting kembali ke int jika productionCount harus tetap int.
        // Atau, ubah productionCount menjadi double sejak awal jika ingin presisi.
        // Untuk latihan ini, mari kita asumsikan kita ingin tetap di int setelah pembulatan atau pemotongan.
        // Jika tidak, productionCount bisa diubah menjadi double di awal.
        productionCount = (int) (productionCount * bonusFactor); // productionCount = 975 * 1.1 = 1072.5 -> 1072 (setelah casting)
        // Jika productionCount adalah double, hasilnya 1072.5
        System.out.println("Setelah bonus produksi (x" + bonusFactor + "): " + productionCount);

        // - Print kedua totalSales dan productionCount akhir
        System.out.println("\n--- Ringkasan Akhir ---");
        System.out.printf("Total Penjualan Final: $%.2f%n", totalSales);
        System.out.println("Jumlah Produksi Final: " + productionCount);
        System.out.println();

        // ===== BEKERJA DENGAN TIPE DATA BERBEDA =====
        System.out.println("\\n=== TIPE DATA BERBEDA ===");

        // Latihan 5: Berlatih augmented assignments dengan berbagai tipe data
        // - Buat variabel double 'temperature' dengan nilai 20.5
        double temperature = 20.5; // Suhu dalam Celsius
        System.out.printf("Suhu awal Celsius: %.1f°C%n", temperature);

        // - Gunakan += untuk menambah 5.7 ke temperature
        double nilaiTambah1 = 5.7;
        temperature += nilaiTambah1; // temperature = 20.5 + 5.7 = 26.2
        System.out.printf("Setelah menambah %.1f: %.1f°C%n", nilaiTambah1, temperature);

        // - Gunakan *= untuk mengalikan temperature dengan 1.8 (bagian dari konversi Celsius ke Fahrenheit)
        double faktorKaliKonversi = 1.8;
        temperature *= faktorKaliKonversi; // temperature = 26.2 * 1.8 = 47.16
        System.out.printf("Setelah mengalikan dengan %.1f: %.2f°C (sementara)%n", faktorKaliKonversi, temperature);
        // Note: Ini masih belum Fahrenheit, ini adalah (C_awal + 5.7) * 1.8

        // - Gunakan += untuk menambah 32 (melengkapi konversi Celsius ke Fahrenheit)
        double nilaiTambah2Konversi = 32.0; // Menggunakan 32.0 untuk konsistensi double
        temperature += nilaiTambah2Konversi; // temperature = 47.16 + 32.0 = 79.16
        System.out.printf("Setelah menambah %.0f: %.2f°F%n", nilaiTambah2Konversi, temperature);

        // - Print suhu akhir dalam Fahrenheit
        System.out.printf("\nSuhu akhir dalam Fahrenheit: %.2f°F%n", temperature);
        // Contoh konversi Celsius ke Fahrenheit (20.5 C) untuk verifikasi:
        // (20.5 * 9/5) + 32 = (20.5 * 1.8) + 32 = 36.9 + 32 = 68.9 F
        // Dalam latihan ini, ada penambahan 5.7 sebelum dikalikan, jadi hasilnya berbeda dari konversi standar.
        System.out.println();

        // Latihan 6: Penggabungan string dengan +=
        System.out.println("\n=== PENGGABUNGAN STRING DENGAN += ===");
        // - Buat variabel String 'message' dengan nilai "Hello"
        String message = "Hello";
        System.out.println("Pesan awal: \"" + message + "\""); // Output: "Hello"

        // - Gunakan += untuk menambah " World" ke message
        message += " World"; // message = "Hello" + " World" => "Hello World"
        System.out.println("Setelah menambah \" World\": \"" + message + "\""); // Output: "Hello World"

        // - Gunakan += untuk menambah "!" ke message
        message += "!"; // message = "Hello World" + "!" => "Hello World!"
        System.out.println("Setelah menambah \"!\": \"" + message + "\""); // Output: "Hello World!"

        // - Print pesan akhir
        System.out.println("\nPesan akhir: \"" + message + "\"");
        System.out.println();

        // Latihan 7: Tantangan - Hitung nilai majemuk
        System.out.println("\n=== TANTANGAN: HITUNG NILAI MAJEMUK ===");
        // - Buat variabel 'investment' dengan nilai 5000
        double investment = 5000.0;
        double initialInvestment = investment; // Simpan nilai awal untuk perhitungan profit
        double annualGrowthFactor = 1.07; // 1 + 0.07 (7% pertumbuhan)
        int years = 3;

        // - Terapkan pertumbuhan majemuk 3 tahun pada 7% per tahun menggunakan *=
        System.out.println("\n--- Simulasi Pertumbuhan Tahun ke Tahun ---");

        // (Lakukan ini tiga kali: investment *= 1.07)
        System.out.println("\n--- Simulasi Pertumbuhan Tahun ke Tahun ---");
        // Tahun 1
        investment *= annualGrowthFactor; // investment = investment * 1.07
        System.out.printf("Setelah Tahun 1: $%.2f%n", investment);

        // Tahun 2
        investment *= annualGrowthFactor; // investment = investment * 1.07
        System.out.printf("Setelah Tahun 2: $%.2f%n", investment);

        // Tahun 3
        investment *= annualGrowthFactor; // investment = investment * 1.07
        System.out.printf("Setelah Tahun 3: $%.2f%n", investment);

        // - Print nilai investasi akhir
        System.out.printf("\nNilai Investasi Akhir (setelah %d tahun): $%.2f%n", years, investment);

        // - Hitung berapa profit yang didapat (nilai akhir - 5000 awal)
        double profit = investment - initialInvestment;
        System.out.printf("Profit yang didapat: $%.2f%n", profit);
    }
}