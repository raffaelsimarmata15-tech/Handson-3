public class ComparisonOperationsPractice {
    public static void main(String[] args) {
        // ===== PERBANDINGAN NUMERIK DASAR =====
        System.out.println("\\n=== PERBANDINGAN NUMERIK DASAR ===");

        // Latihan 1: Berlatih semua operator perbandingan dengan integers
        // - Buat dua variabel integer: firstNum = 25, secondNum = 18
        int firstNum = 25;
        int secondNum = 18;

        System.out.println("firstNum = " + firstNum);
        System.out.println("secondNum = " + secondNum);

        // - Bandingkan firstNum > secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println("Apakah firstNum lebih besar dari secondNum (firstNum > secondNum)? " + (firstNum > secondNum)); // Output: true

        // - Bandingkan firstNum < secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println("Apakah firstNum lebih kecil dari secondNum (firstNum < secondNum)? " + (firstNum < secondNum)); // Output: false

        // - Bandingkan firstNum >= secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println("Apakah firstNum lebih besar dari atau sama dengan secondNum (firstNum >= secondNum)? " + (firstNum >= secondNum)); // Output: true

        // - Bandingkan firstNum <= secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println("Apakah firstNum lebih kecil dari atau sama dengan secondNum (firstNum <= secondNum)? " + (firstNum <= secondNum)); // Output: fals

        // - Bandingkan firstNum == secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println("Apakah firstNum sama dengan secondNum (firstNum == secondNum)? " + (firstNum == secondNum)); // Output: false

        // - Bandingkan firstNum != secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println("Apakah firstNum TIDAK sama dengan secondNum (firstNum != secondNum)? " + (firstNum != secondNum)); // Output: true
        System.out.println();

        // ===== PERBANDINGAN FLOATING-POINT =====
        System.out.println("\\n=== PERBANDINGAN FLOATING-POINT ===");

        // Latihan 2: Bekerja dengan perbandingan angka floating-point
        // - Buat dua variabel double: price1 = 19.99, price2 = 20.0
        double price1 = 19.99;
        double price2 = 20.0;

        System.out.println("Price 1: " + price1);
        System.out.println("Price 2: " + price2);

        // - Bandingkan harga mana yang lebih murah menggunakan operator perbandingan yang sesuai
        boolean isPrice1Cheaper = (price1 < price2);
        System.out.println("Apakah Price 1 lebih murah dari Price 2? " + isPrice1Cheaper); // Output: true

        // - Periksa apakah perbedaan antara harga kurang dari 1.0
        double priceDifference = Math.abs(price1 - price2); // Gunakan Math.abs untuk nilai absolut
        boolean isDifferenceLessThanOne = (priceDifference < 1.0);

        System.out.println("Perbedaan harga: " + priceDifference);
        System.out.println("Apakah perbedaan harga kurang dari 1.0? " + isDifferenceLessThanOne); // Output: true

        // - Buat skenario dimana dua nilai double seharusnya "sama" tetapi tidak karena presisi
        System.out.println("\n--- Masalah Presisi Floating-Point ---");
        double num1 = 0.1;
        double num2 = 0.2;
        double sum = num1 + num2; // Seharusnya 0.3
        double expected = 0.3;

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        System.out.println("sum (num1 + num2): " + sum); // Output: 0.30000000000000004
        System.out.println("expected: " + expected);     // Output: 0.3

        boolean areTheyEqual = (sum == expected);
        System.out.println("Apakah sum == expected? " + areTheyEqual); // Output: false
        double epsilon = 0.0000001; // Toleransi kecil
        boolean areTheyEqualWithEpsilon = (Math.abs(sum - expected) < epsilon);
        System.out.println("Apakah sum == expected (dengan epsilon)? " + areTheyEqualWithEpsilon); // Output: true
        System.out.println();

        // ===== PERBANDINGAN KARAKTER =====
        System.out.println("\\n=== PERBANDINGAN KARAKTER ===");

        // Latihan 3: Bandingkan karakter menggunakan operator perbandingan
        // - Buat dua variabel char: letter1 = 'A', letter2 = 'B'
        char letter1 = 'A';
        char letter2 = 'B';

        System.out.println("letter1: '" + letter1 + "'");
        System.out.println("letter2: '" + letter2 + "'");

        // - Bandingkan letter1 < letter2 dan jelaskan mengapa hasilnya masuk akal (nilai ASCII)
        boolean isLetter1Smaller = (letter1 < letter2);
        System.out.println("Apakah '" + letter1 + "' < '" + letter2 + "'? " + isLetter1Smaller); // Output: true
        // Penjelasan: Hasilnya 'true' karena di belakang layar, Java membandingkan nilai numerik
        // dari karakter-karakter tersebut berdasarkan tabel ASCII atau Unicode.
        // Nilai ASCII untuk 'A' adalah 65, sedangkan untuk 'B' adalah 66.
        // Karena 65 < 66, ekspresi tersebut menghasilkan 'true'.

        // - Bandingkan huruf kecil dengan huruf besar dan amati hasilnya
        char lowerCaseA = 'a';
        char upperCaseB = 'B';

        System.out.println("\nlowerCaseA: '" + lowerCaseA + "'");
        System.out.println("upperCaseB: '" + upperCaseB + "'");

        boolean isLowerSmallerThanUpper = (lowerCaseA < upperCaseB);

        System.out.println("Apakah '" + lowerCaseA + "' < '" + upperCaseB + "'? " + isLowerSmallerThanUpper); // Output: false
        // Penjelasan: 'false' karena nilai ASCII untuk 'a' (97) lebih besar dari 'B' (66).
        // Oleh karena itu, penting untuk memperhatikan huruf besar/kecil saat membandingkan karakter.

        // - Periksa apakah suatu karakter adalah digit dengan membandingkannya dengan '0' dan '9'
        char digitChar = '7';
        char nonDigitChar = 'H';

        System.out.println("\ndigitChar: '" + digitChar + "'");
        System.out.println("nonDigitChar: '" + nonDigitChar + "'");

        boolean isDigit = (digitChar >= '0' && digitChar <= '9');
        System.out.println("Apakah '" + digitChar + "' adalah digit? " + isDigit); // Output: true

        boolean isNonDigit = (nonDigitChar >= '0' && nonDigitChar <= '9');
        System.out.println("Apakah '" + nonDigitChar + "' adalah digit? " + isNonDigit); // Output: false
        System.out.println();

        // ===== PERBANDINGAN STRING =====
        System.out.println("\\n=== PERBANDINGAN STRING ===");

        // Latihan 4: Pahami jebakan perbandingan string dan metode yang benar
        // - Buat dua variabel String dengan konten yang sama: name1 = "Java", name2 = "Java"
        String name1 = "Java";
        String name2 = "Java";
        System.out.println("name1: \"" + name1 + "\"");
        System.out.println("name2: \"" + name2 + "\"");

        // - Bandingkan name1 == name2 dan print hasilnya
        boolean comparison1 = (name1 == name2);
        System.out.println("name1 == name2? " + comparison1); // Output: true
        // Penjelasan: Ini menghasilkan 'true' karena Java "interning" string literal.
        // Ketika dua string literal memiliki konten yang sama, mereka biasanya merujuk
        // ke objek String yang SAMA di memory (String Pool) untuk efisiensi.
        // Jadi, '==' membandingkan referensi objek, dan karena referensinya sama, hasilnya true.

        // - Buat string lain: name3 = new String("Java")
        String name3 = new String("Java"); // Membuat objek String BARU di heap
        System.out.println("\nname3: \"" + name3 + "\" (dibuat dengan new String())");

        // - Bandingkan name1 == name3 dan print hasilnya - jelaskan mengapa berbeda dari di atas
        boolean comparison2 = (name1 == name3);
        System.out.println("name1 == name3? " + comparison2); // Output: false
        // Penjelasan: Ini menghasilkan 'false' karena 'name1' merujuk ke objek String
        // di String Pool, sedangkan 'name3' merujuk ke objek String yang BERBEDA
        // yang baru dibuat di heap dengan operator 'new'.
        // Meskipun KONTEN (nilai) kedua string sama, '==' membandingkan apakah
        // kedua variabel merujuk ke OBJEK yang SAMA di memori. Karena objeknya berbeda,
        // hasilnya false. Inilah jebakan utama dalam perbandingan String!

        // - Gunakan metode .equals() untuk membandingkan name1 dan name3 dengan benar
        boolean comparison3 = name1.equals(name3);
        System.out.println("name1.equals(name3)? " + comparison3); // Output: true
        // Penjelasan: Metode .equals() membandingkan KONTEN (urutan karakter) dari dua string.
        // Karena "Java" secara karakter sama dengan "Java", hasilnya true.
        // Ini adalah CARA YANG BENAR untuk membandingkan nilai string.

        // - Demonstrasikan perbandingan case-sensitive dengan .equals()
        String name4 = "java"; // Huruf kecil
        System.out.println("\nname4: \"" + name4 + "\"");
        boolean comparison4 = name1.equals(name4); // "Java" vs "java"
        System.out.println("name1.equals(name4) (case-sensitive)? " + comparison4); // Output: false
        // Penjelasan: .equals() adalah case-sensitive. "Java" tidak sama dengan "java".

        // - Demonstrasikan perbandingan case-insensitive dengan .equalsIgnoreCase()
        boolean comparison5 = name1.equalsIgnoreCase(name4); // "Java" vs "java"
        System.out.println("name1.equalsIgnoreCase(name4) (case-insensitive)? " + comparison5); // Output: true
        // Penjelasan: .equalsIgnoreCase() mengabaikan perbedaan huruf besar/kecil saat membandingkan konten.
        // Jadi, "Java" dianggap sama dengan "java".
        System.out.println();

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\\n=== APLIKASI PRAKTIS ===");

        // Latihan 5: Gunakan perbandingan dalam skenario dunia nyata
        // - Buat variabel untuk pengecekan nilai siswa
        // grade = 85, passingGrade = 60, honorRoll = 90
        int grade = 85;
        int passingGrade = 60;
        int honorRoll = 90;

        System.out.println("Nilai siswa: " + grade);
        System.out.println("Nilai minimum lulus: " + passingGrade);
        System.out.println("Nilai minimum Honor Roll: " + honorRoll);

        // - Periksa apakah siswa lulus menggunakan operator perbandingan
        boolean hasPassed = (grade >= passingGrade);
        System.out.println("Apakah siswa lulus? " + hasPassed); // Output: true (85 >= 60)

        // - Periksa apakah siswa memenuhi syarat untuk honor roll
        boolean isOnHonorRoll = (grade >= honorRoll);
        System.out.println("Apakah siswa masuk daftar Honor Roll? " + isOnHonorRoll); // Output: false (85 >= 90 is false)

        // - Buat skenario verifikasi usia
        int age = 17;
        int drivingAge = 16;
        int votingAge = 18;
        int drinkingAge = 21;

        System.out.println("\nUsia: " + age);
        System.out.println("Usia minimum mengemudi: " + drivingAge);
        System.out.println("Usia minimum memilih: " + votingAge);
        System.out.println("Usia minimum minum alkohol: " + drinkingAge);

        // age = 17, drivingAge = 16, votingAge = 18, drinkingAge = 21
        // - Periksa kelayakan untuk mengemudi, memilih, dan minum menggunakan perbandingan
        boolean canDrive = (age >= drivingAge);
        System.out.println("Bisa mengemudi? " + canDrive); // Output: true (17 >= 16)

        boolean canVote = (age >= votingAge);
        System.out.println("Bisa memilih? " + canVote); // Output: false (17 >= 18 is false)

        boolean canDrink = (age >= drinkingAge);
        System.out.println("Bisa minum alkohol? " + canDrink); // Output: false (17 >= 21 is false)
        System.out.println();

        // Latihan 6: Skenario shopping dan discount
        System.out.println("\\n=== SKENARIO SHOPPING ===");

        // - Buat variabel untuk skenario belanja
        double originalPrice = 100.0;
        double discountThreshold = 50.0; // Pembelian di atas nilai ini dapat diskon
        int customerAge = 65;
        int seniorAge = 60; // Usia minimum untuk diskon senior

        System.out.printf("Harga asli pembelian: $%.2f%n", originalPrice);
        System.out.printf("Ambang batas diskon bulk: $%.2f%n", discountThreshold);
        System.out.println("Usia pelanggan: " + customerAge);
        System.out.println("Usia minimum diskon senior: " + seniorAge);

        // - Periksa apakah pembelian memenuhi syarat untuk diskon bulk (harga > threshold)
        boolean qualifiesForBulkDiscount = (originalPrice > discountThreshold);
        System.out.println("\nApakah pembelian memenuhi syarat untuk diskon bulk? " + qualifiesForBulkDiscount); // Output: true (100 > 50)

        // - Periksa apakah pelanggan memenuhi syarat untuk diskon senior
        boolean qualifiesForSeniorDiscount = (customerAge >= seniorAge);
        System.out.println("Apakah pelanggan memenuhi syarat untuk diskon senior? " + qualifiesForSeniorDiscount); // Output: true (65 >= 60)

        // - Gabungkan kondisi untuk menentukan kelayakan akhir
        // Di sini kita bisa menggunakan operator logika AND (&&) atau OR (||).
        // Mari kita asumsikan pelanggan mendapat diskon jika memenuhi salah satu syarat (OR).
        // Atau, jika kita ingin diskon hanya jika memenuhi KEDUANYA (AND).
        // Untuk latihan ini, mari kita tentukan syaratnya adalah JIKA SALAH SATU terpenuhi.
        boolean finalDiscountEligibility = qualifiesForBulkDiscount || qualifiesForSeniorDiscount;
        System.out.println("\nApakah pelanggan berhak atas diskon (bulk ATAU senior)? " + finalDiscountEligibility); // Output: true

        // Jika kita mau mencoba dengan syarat KEDUA-DUANYA harus terpenuhi:
        // boolean finalDiscountEligibilityBoth = qualifiesForBulkDiscount && qualifiesForSeniorDiscount;
        // System.out.println("Apakah pelanggan berhak atas diskon (bulk DAN senior)? " + finalDiscountEligibilityBoth); // Output: true
        System.out.println();

        // ===== PENGUJIAN BATAS =====
        System.out.println("\\n=== PENGUJIAN BATAS ===");

        // Latihan 7: Test edge cases dan kondisi batas
        // - Buat variabel 'score' dengan nilai 100
        int score = 100;
        System.out.println("Nilai awal score: " + score);

        // - Periksa apakah score berada dalam rentang yang valid (0 sampai 100) menggunakan dua operasi perbandingan
        boolean isValidScore = (score >= 0 && score <= 100);
        System.out.println("Apakah score " + score + " berada dalam rentang [0, 100]? " + isValidScore); // Output: true

        // - Test nilai batas: apa yang terjadi dengan score = 0, score = 100, score = -1, score = 101
        System.out.println("\n--- Pengujian Nilai Batas Score ---");
        // Test score = 0 (batas bawah)
        score = 0;
        isValidScore = (score >= 0 && score <= 100);
        System.out.println("Score: " + score + ", Valid? " + isValidScore); // Output: true

        // Test score = 100 (batas atas)
        score = 100;
        isValidScore = (score >= 0 && score <= 100);
        System.out.println("Score: " + score + ", Valid? " + isValidScore); // Output: true

        // Test score = -1 (di bawah batas bawah)
        score = -1;
        isValidScore = (score >= 0 && score <= 100);
        System.out.println("Score: " + score + ", Valid? " + isValidScore); // Output: false

        // Test score = 101 (di atas batas atas)
        score = 101;
        isValidScore = (score >= 0 && score <= 100);
        System.out.println("Score: " + score + ", Valid? " + isValidScore); // Output: false

        // - Buat pengecekan rentang suhu (rentang valid: -10 sampai 40 derajat Celsius)
        System.out.println("\n--- Pengecekan Rentang Suhu ---");
        int minTemp = -10;
        int maxTemp = 40;
        double currentTemp;
        boolean isValidTemperature;

        // Test suhu di dalam rentang
        currentTemp = 25.0;
        isValidTemperature = (currentTemp >= minTemp && currentTemp <= maxTemp);
        System.out.println("Suhu: " + currentTemp + "°C, Valid? " + isValidTemperature); // Output: true

        // Test suhu di batas bawah
        currentTemp = -10.0;
        isValidTemperature = (currentTemp >= minTemp && currentTemp <= maxTemp);
        System.out.println("Suhu: " + currentTemp + "°C, Valid? " + isValidTemperature); // Output: true

        // Test suhu di batas atas
        currentTemp = 40.0;
        isValidTemperature = (currentTemp >= minTemp && currentTemp <= maxTemp);
        System.out.println("Suhu: " + currentTemp + "°C, Valid? " + isValidTemperature); // Output: true

        // Test suhu di bawah batas bawah
        currentTemp = -10.1;
        isValidTemperature = (currentTemp >= minTemp && currentTemp <= maxTemp);
        System.out.println("Suhu: " + currentTemp + "°C, Valid? " + isValidTemperature); // Output: false

        // Test suhu di atas batas atas
        currentTemp = 40.1;
        isValidTemperature = (currentTemp >= minTemp && currentTemp <= maxTemp);
        System.out.println("Suhu: " + currentTemp + "°C, Valid? " + isValidTemperature); // Output: false
        System.out.println();

        // Latihan 8: Rantai perbandingan dan kondisi kompleks
        System.out.println("=== RANTAI PERBANDINGAN DAN KONDISI KOMPLEKS ===");

        // - Buat variabel: height = 175, minHeight = 160, maxHeight = 200
        int height = 175;
        int minHeight = 160;
        int maxHeight = 200;

        System.out.println("Tinggi: " + height);
        System.out.println("Tinggi minimum yang dapat diterima: " + minHeight);
        System.out.println("Tinggi maksimum yang dapat diterima: " + maxHeight);

        // - Periksa apakah tinggi berada dalam rentang yang dapat diterima menggunakan operator perbandingan
        // Menggunakan operator logika AND (&&) untuk memastikan kedua kondisi terpenuhi
        boolean isHeightAcceptable = (height >= minHeight) && (height <= maxHeight);
        System.out.println("Apakah tinggi dalam rentang yang dapat diterima? " + isHeightAcceptable); // Output: true

        // - Buat sistem penilaian menggunakan beberapa perbandingan:
        // score >= 90: "A", score >= 80: "B", score >= 70: "C", score >= 60: "D", selainnya: "F"
        // score >= 90: "A", score >= 80: "B", score >= 70: "C", score >= 60: "D", selainnya: "F"
        int Score = 85;

        System.out.println("\n--- Sistem Penilaian ---");
        System.out.println("Nilai: " + Score);

        String Grade;
        if (Score >= 90) {
            Grade = "A";
        } else if (Score >= 80) {
            Grade = "B";
        } else if (Score >= 70) {
            Grade = "C";
        } else if (Score >= 60) {
            Grade = "D";
        } else {
            Grade = "F";
        }
        System.out.println("Nilai huruf: " + Grade); // Output:

    }
}