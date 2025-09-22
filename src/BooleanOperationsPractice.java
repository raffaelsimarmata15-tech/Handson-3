public class BooleanOperationsPractice {
    public static void main(String[] args) {
        // ===== OPERATOR BOOLEAN DASAR =====
        System.out.println("=== OPERATOR BOOLEAN DASAR ===");

        // Latihan 1: Berlatih operator AND (&&)
        boolean isLoggedIn = true;
        boolean hasPermission = false;
        System.out.println("isLoggedIn: " + isLoggedIn + ", hasPermission: " + hasPermission);

        // - Gunakan operator AND untuk mengecek apakah user bisa akses admin panel (kedua kondisi harus true)
        boolean canAccessAdminPanel = isLoggedIn && hasPermission;
        System.out.println("Bisa akses Admin Panel? (isLoggedIn && hasPermission): " + canAccessAdminPanel); // Output: false

        // - Test keempat kombinasi operator AND:
        System.out.println("\n--- Kombinasi AND (&&) ---");
        System.out.println("true && true: " + (true && true));      // Output: true
        System.out.println("true && false: " + (true && false));    // Output: false
        System.out.println("false && true: " + (false && true));    // Output: false
        System.out.println("false && false: " + (false && false));  // Output: false
        System.out.println();

        // Latihan 2: Berlatih operator OR (||)
        boolean isWeekend = false;
        boolean isHoliday = true;
        System.out.println("\nisWeekend: " + isWeekend + ", isHoliday: " + isHoliday);

        // - Gunakan operator OR untuk mengecek apakah hari libur (salah satu kondisi bisa true)
        boolean isDayOff = isWeekend || isHoliday;
        System.out.println("Apakah hari libur? (isWeekend || isHoliday): " + isDayOff); // Output: true

        // - Test keempat kombinasi operator OR:
        System.out.println("\n--- Kombinasi OR (||) ---");
        System.out.println("true || true: " + (true || true));      // Output: true
        System.out.println("true || false: " + (true || false));    // Output: true
        System.out.println("false || true: " + (false || true));    // Output: true
        System.out.println("false || false: " + (false || false));  // Output: false

        // Latihan 3: Berlatih operator NOT (!)
        boolean isRaining = true;
        System.out.println("\nisRaining: " + isRaining);

        // - Gunakan operator NOT untuk membuat variabel 'isSunny'
        boolean isSunny = !isRaining;
        System.out.println("isSunny (!isRaining): " + isSunny); // Output: false

        // - Terapkan operator NOT dua kali (!(!isRaining)) dan amati hasilnya
        boolean doubleNegative = !(!isRaining);
        System.out.println("!(!isRaining): " + doubleNegative); // Output: true
        System.out.println("Hasilnya kembali ke nilai asli karena dua negasi saling meniadakan.");

        // - Gunakan NOT dengan perbandingan: !(5 > 3) dan jelaskan hasilnya
        boolean notComparison = !(5 > 3);
        System.out.println("!(5 > 3): " + notComparison); // Output: false
        // Penjelasan:
        // 1. Ekspresi di dalam kurung dievaluasi terlebih dahulu: (5 > 3) = true.
        // 2. Kemudian, operator NOT diterapkan pada 'true': !true = false.
        System.out.println();

        // ===== EKSPRESI BOOLEAN GABUNGAN =====
        System.out.println("\\n=== EKSPRESI BOOLEAN GABUNGAN ===");

        // Latihan 4: Gabungkan beberapa operator boolean
        boolean attendanceGood = true;
        boolean gradesHigh = false;
        boolean behaviorGood = true;
        System.out.println("Kehadiran baik: " + attendanceGood);
        System.out.println("Nilai tinggi: " + gradesHigh);
        System.out.println("Perilaku baik: " + behaviorGood);

        // - Buat ekspresi untuk "siswa outstanding": attendanceGood && gradesHigh && behaviorGood
        boolean isOutstanding = attendanceGood && gradesHigh && behaviorGood;
        System.out.println("Siswa Outstanding: " + isOutstanding); // Output: false (karena gradesHigh false)

        // - Buat ekspresi untuk "siswa memuaskan": attendanceGood && (gradesHigh || behaviorGood)
        // Penjelasan: Kurung memaksa (gradesHigh || behaviorGood) dievaluasi duluan.
        // (false || true) = true. Lalu true && true = true.
        boolean isSatisfactory = attendanceGood && (gradesHigh || behaviorGood);
        System.out.println("Siswa Memuaskan: " + isSatisfactory); // Output: true

        // - Buat ekspresi untuk "perlu perbaikan": !attendanceGood || !behaviorGood
        // Penjelasan: !attendanceGood = !true = false. !behaviorGood = !true = false.
        // false || false = false.
        boolean needsImprovement = !attendanceGood || !behaviorGood;
        System.out.println("Perlu Perbaikan: " + needsImprovement); // Output: false
        System.out.println();

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\\n=== APLIKASI PRAKTIS ===");

        // Latihan 5: Sistem kontrol akses
        boolean hasKeyCard = true;
        boolean knowsPassword = false;
        boolean isAuthorizedTime = true;
        boolean isEmergency = false;
        System.out.println("Punya KeyCard: " + hasKeyCard);
        System.out.println("Tahu Password: " + knowsPassword);
        System.out.println("Waktu Resmi: " + isAuthorizedTime);
        System.out.println("Situasi Darurat: " + isEmergency);

        // - Buat logika untuk akses normal: hasKeyCard && knowsPassword && isAuthorizedTime
        boolean normalAccess = hasKeyCard && knowsPassword && isAuthorizedTime;
        System.out.println("Akses Normal: " + normalAccess); // Output: false (karena knowsPassword false)

        // - Buat logika untuk akses darurat: isEmergency || (hasKeyCard && isAuthorizedTime)
        // Penjelasan: Kurung memaksa (hasKeyCard && isAuthorizedTime) dievaluasi duluan.
        // (true && true) = true. Lalu false || true = true.
        boolean emergencyAccess = isEmergency || (hasKeyCard && isAuthorizedTime);
        System.out.println("Akses Darurat: " + emergencyAccess); // Output: true

        // - Buat logika untuk akses ditolak: !(akses normal OR akses darurat)
        // Penjelasan: (normalAccess || emergencyAccess) = (false || true) = true.
        // Lalu !(true) = false.
        boolean accessDenied = !(normalAccess || emergencyAccess);
        System.out.println("Akses Ditolak: " + accessDenied); // Output: false
        System.out.println();

        // Latihan 6: Pengambilan keputusan berdasarkan cuaca
        // - Buat variabel kondisi cuaca
        boolean israining = false;
        boolean isSnowing = true;
        int temperature = -5; // Celsius
        boolean isCloudy = true;
        System.out.println("\n--- Kondisi Cuaca ---");
        System.out.println("Hujan: " + israining);
        System.out.println("Salju: " + isSnowing);
        System.out.println("Suhu: " + temperature + "°C");
        System.out.println("Berawan: " + isCloudy);

        // - Tentukan apakah cuaca bagus untuk aktivitas outdoor
        // Cuaca bagus: tidak hujan AND tidak salju AND suhu > 0
        boolean goodForOutdoor = !israining && !isSnowing && temperature > 0;
        System.out.println("Bagus untuk aktivitas outdoor? " + goodForOutdoor); // Output: false (karena isSnowing true, temperature <=0)

        // - Tentukan apakah Anda butuh payung: isRaining OR (isCloudy AND temperature > 20)
        // Penjelasan: (!isRaining) OR (isCloudy && temperature > 20)
        // false || (true && false) => false || false => false
        boolean needUmbrella = israining || (isCloudy && temperature > 20);
        System.out.println("Butuh payung? " + needUmbrella); // Output: false

        // - Tentukan apakah jalan mungkin berbahaya: isSnowing OR (isRaining AND temperature < 5)
        // Penjelasan: isSnowing OR (isRaining && temperature < 5)
        // true || (false && true) => true || false => true
        boolean roadsDangerous = isSnowing || (israining && temperature < 5);
        System.out.println("Jalan mungkin berbahaya? " + roadsDangerous); // Output: true
        System.out.println();

        // ===== EVALUASI SHORT-CIRCUIT =====
        System.out.println("\\n=== EVALUASI SHORT-CIRCUIT ===");

        // Latihan 7: Demonstrasikan perilaku short-circuit dengan AND
        int a = 5;
        int b = 0; // Sengaja dibuat nol untuk tujuan demonstrasi
        System.out.println("a = " + a + ", b = " + b);

        // - Buat ekspresi boolean: (b != 0) && (a / b > 2)
        // Ini TIDAK seharusnya menyebabkan division by zero karena evaluasi short-circuit
        System.out.print("Mengevaluasi (b != 0) && (a / b > 2): ");
        boolean result1 = (b != 0) && (a / b > 2);
        System.out.println(result1); // Output: false

        // - Buat ekspresi lain: (b == 0) || (a / b > 2)
        // Ini juga TIDAK seharusnya menyebabkan division by zero karena evaluasi short-circuit
        System.out.print("Mengevaluasi (b == 0) || (a / b > 2): ");
        boolean result2 = (b == 0) || (a / b > 2);
        System.out.println(result2); // Output: true

        // - Jelaskan dalam komentar mengapa ekspresi ini aman
        System.out.println("\nPenjelasan mengapa ekspresi ini aman:");
        System.out.println("Untuk ekspresi AND (&&): (b != 0) && (a / b > 2)");
        System.out.println("   - Bagian kiri (b != 0) dievaluasi terlebih dahulu. Karena b adalah 0, (0 != 0) menghasilkan FALSE.");
        System.out.println("   - Karena seluruh ekspresi AND akan menjadi FALSE jika operan pertama FALSE, Java TIDAK AKAN mengevaluasi bagian kanan (a / b > 2).");
        System.out.println("   - Ini mencegah terjadinya 'Division by Zero Error'.");
        System.out.println("Untuk ekspresi OR (||): (b == 0) || (a / b > 2)");
        System.out.println("   - Bagian kiri (b == 0) dievaluasi terlebih dahulu. Karena b adalah 0, (0 == 0) menghasilkan TRUE.");
        System.out.println("   - Karena seluruh ekspresi OR akan menjadi TRUE jika operan pertama TRUE, Java TIDAK AKAN mengevaluasi bagian kanan (a / b > 2).");
        System.out.println("   - Ini juga mencegah terjadinya 'Division by Zero Error'.");
        System.out.println("Perilaku ini disebut 'Short-Circuit Evaluation'.");
        System.out.println();

    }
}