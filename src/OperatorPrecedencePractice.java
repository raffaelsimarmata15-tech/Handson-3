public class OperatorPrecedencePractice {
    public static void main(String[] args) {
        // ===== PRECEDENCE OPERATOR ARITMATIKA =====
        System.out.println("=== PRECEDENCE OPERATOR ARITMATIKA ===");

        // Latihan 1: Precedence aritmatika dasar
        // - Buat variabel: a = 10, b = 5, c = 2
        int a = 10;
        int b = 5;
        int c = 2;
        System.out.println("Variabel: a = " + a + ", b = " + b + ", c = " + c);

        // - Hitung hasil dari: a + b * c
        // Prediksi:
        // Perkalian (b * c) dievaluasi lebih dulu karena memiliki precedence lebih tinggi.
        // 5 * 2 = 10
        // Kemudian, penjumlahan (a + 10) dievaluasi.
        // 10 + 10 = 20
        // Prediksi hasil: 20
        int result1 = a + b * c;
        System.out.println("\n(a + b * c) = " + result1);
        System.out.println("Prediksi vs Hasil: Prediksi benar.");

        // - Hitung hasil dari: (a + b) * c
        // Penjelasan: Tanda kurung () memiliki precedence tertinggi, jadi ekspresi di dalamnya dievaluasi terlebih dahulu.
        // a + b = 10 + 5 = 15
        // Kemudian, perkalian dengan c.
        // 15 * 2 = 30
        int result2 = (a + b) * c;
        System.out.println("(a + b) * c = " + result2);
        System.out.println("Hasilnya berbeda karena tanda kurung mengubah urutan evaluasi.");

        // - Hitung hasil dari: a * b + c / 2
        // Penjelasan:
        // 1. Perkalian (a * b) dievaluasi lebih dulu: 10 * 5 = 50.
        // 2. Pembagian (c / 2) dievaluasi kedua: 2 / 2 = 1.
        // 3. Terakhir, penjumlahan: 50 + 1 = 51.
        int result3 = a * b + c / 2;
        System.out.println("a * b + c / 2 = " + result3);

        // - Hitung hasil dari: a / b + c * 2
        // Penjelasan: Karena '/' dan '*' memiliki precedence yang sama, evaluasi dilakukan dari kiri ke kanan.
        // 1. Pembagian (a / b) dievaluasi pertama: 10 / 5 = 2.
        // 2. Perkalian (c * 2) dievaluasi kedua: 2 * 2 = 4.
        // 3. Terakhir, penjumlahan: 2 + 4 = 6.
        int result4 = a / b + c * 2;
        System.out.println("a / b + c * 2 = " + result4);
        System.out.println();

        // ===== PRECEDENCE PERBANDINGAN DAN ARITMATIKA =====
        System.out.println("\\n=== PRECEDENCE PERBANDINGAN DAN ARITMATIKA ===");

        // Latihan 2: Mencampur operator aritmatika dan perbandingan
        // - Buat variabel: x = 15, y = 10, z = 20
        int x = 15;
        int y = 10;
        int z = 20;
        System.out.println("Variabel: x = " + x + ", y = " + y + ", z = " + z);

        // - Evaluasi: x + y > z - 5
        // 1. x + y (aritmatika, kiri ke kanan) -> 15 + 10 = 25
        // 2. z - 5 (aritmatika, kiri ke kanan) -> 20 - 5 = 15
        // 3. 25 > 15 (perbandingan, setelah semua aritmatika) -> true
        boolean Result1 = x + y > z - 5;
        System.out.println("x + y > z - 5 = " + result1); // Output: true

        // - Evaluasi: x > y + z / 4
        // Urutan evaluasi:
        // 1. z / 4 (pembagian, precedence tertinggi di aritmatika) -> 20 / 4 = 5
        // 2. y + 5 (penjumlahan) -> 10 + 5 = 15
        // 3. x > 15 (perbandingan) -> 15 > 15 = false
        boolean Result2 = x > y + z / 4;
        System.out.println("x > y + z / 4 = " + result2); // Output: false

        // - Evaluasi: (x + y) > (z - 5) && x < z
        // Urutan evaluasi:
        // 1. (x + y) (tanda kurung, tertinggi) -> 15 + 10 = 25
        // 2. (z - 5) (tanda kurung, tertinggi) -> 20 - 5 = 15
        // 3. 25 > 15 (perbandingan) -> true
        // 4. x < z (perbandingan) -> 15 < 20 = true
        // 5. true && true (operator logika AND) -> true
        boolean Result3 = (x + y) > (z - 5) && x < z;
        System.out.println("(x + y) > (z - 5) && x < z = " + result3); // Output: true

        // - Buat ekspresi kompleks: x * 2 + y > z && y < x + 5
        // Prediksi:
        // Bagian Kiri (x * 2 + y > z):
        // 1. x * 2 -> 15 * 2 = 30
        // 2. 30 + y -> 30 + 10 = 40
        // 3. 40 > z -> 40 > 20 = true
        //
        // Bagian Kanan (y < x + 5):
        // 1. x + 5 -> 15 + 5 = 20
        // 2. y < 20 -> 10 < 20 = true
        //
        // Final: true && true -> true
        // Prediksi hasil: true
        boolean Result4 = x * 2 + y > z && y < x + 5;
        System.out.println("x * 2 + y > z && y < x + 5 = " + result4); // Output: true
        System.out.println("Prediksi vs Hasil: Prediksi benar.");
        System.out.println();

        // ===== PRECEDENCE OPERATOR LOGIKA =====
        System.out.println("\\n=== PRECEDENCE OPERATOR LOGIKA ===");

        // Latihan 3: Memahami precedence operator logika
        // - Buat variabel boolean: p = true, q = false, r = true
        boolean p = true;
        boolean q = false;
        boolean r = true;
        System.out.println("Variabel: p = " + p + ", q = " + q + ", r = " + r);

        // - Evaluasi: p && q || r
        // Penjelasan: Operator '&&' memiliki precedence lebih tinggi dari '||'.
        // 1. p && q dievaluasi pertama: true && false = false
        // 2. Kemudian, false || r dievaluasi: false || true = true
        boolean esult1 = p && q || r;
        System.out.println("p && q || r = " + esult1); // Output: true

        // - Evaluasi: p || q && r
        // Penjelasan: Kembali, '&&' dievaluasi lebih dulu.
        // 1. q && r dievaluasi pertama: false && true = false
        // 2. Kemudian, p || false dievaluasi: true || false = true
        boolean esult2 = p || q && r;
        System.out.println("p || q && r = " + esult2); // Output: true
        System.out.println("Hasilnya sama seperti sebelumnya karena '&&' tetap dievaluasi duluan.");

        // - Evaluasi: !p && q || r
        // Penjelasan: Operator '!' memiliki precedence tertinggi di antara operator logika.
        // 1. !p dievaluasi pertama: !true = false
        // 2. Kemudian, &&: false && q dievaluasi: false && false = false
        // 3. Kemudian, ||: false || r dievaluasi: false || true = true
        boolean esult3 = !p && q || r;
        System.out.println("!p && q || r = " + esult3); // Output: true

        // - Gunakan tanda kurung untuk mengubah evaluasi: p && (q || r)
        // Penjelasan: Tanda kurung () mengubah urutan evaluasi.
        // 1. (q || r) dievaluasi pertama karena tanda kurung: false || true = true
        // 2. Kemudian, p && true dievaluasi: true && true = true
        boolean esult4 = p && (q || r);
        System.out.println("p && (q || r) = " + esult4); // Output: true
        System.out.println("Perbandingan dengan p && q || r: Dalam contoh ini kebetulan hasilnya sama (true),");
        System.out.println("tetapi urutan evaluasinya jelas berbeda. Tanpa kurung, (p && q) dihitung dulu,");
        System.out.println("dengan kurung, (q || r) dihitung dulu. Ini sangat penting untuk diperhatikan!");
        System.out.println();

        // ===== TIPE OPERATOR CAMPURAN =====
        System.out.println("\\n=== TIPE OPERATOR CAMPURAN ===");

        // Latihan 4: Menggabungkan operator aritmatika, perbandingan, dan logika
        // - Buat variabel: num1 = 25, num2 = 15, num3 = 30
        int num1 = 25;
        int num2 = 15;
        int num3 = 30;
        System.out.println("Variabel: num1 = " + num1 + ", num2 = " + num2 + ", num3 = " + num3);

        // --- num1 > num2 + 5 && num3 / 2 < num1 ---
        // Urutan evaluasi lengkap:
        // 1. num2 + 5 (Aritmatika, Penjumlahan): 15 + 5 = 20
        // 2. num3 / 2 (Aritmatika, Pembagian): 30 / 2 = 15
        // 3. num1 > 20 (Perbandingan): 25 > 20 = true
        // 4. 15 < num1 (Perbandingan): 15 < 25 = true
        // 5. true && true (Logika AND): true
        boolean REsult1 = num1 > num2 + 5 && num3 / 2 < num1;
        System.out.println("\nnum1 > num2 + 5 && num3 / 2 < num1 = " + REsult1); // Output: true

        // - Evaluasi: num1 + num2 > 30 || num3 - num1 < 10 && num2 > 10
        // Evaluasi step-by-step:
        // Ekspresi ini bisa dipecah menjadi (A || B && C)
        // A = (num1 + num2 > 30)
        // B = (num3 - num1 < 10)
        // C = (num2 > 10)

        // Evaluasi bagian A (num1 + num2 > 30):
        // 1. num1 + num2 (Penjumlahan): 25 + 15 = 40
        // 2. 40 > 30 (Perbandingan): true  => A = true

        // Evaluasi bagian B (num3 - num1 < 10):
        // 1. num3 - num1 (Pengurangan): 30 - 25 = 5
        // 2. 5 < 10 (Perbandingan): true    => B = true

        // Evaluasi bagian C (num2 > 10):
        // 1. num2 > 10 (Perbandingan): 15 > 10 = true => C = true

        // Sekarang ekspresi menjadi: true || true && true
        // Precedence: && dievaluasi sebelum ||
        // 1. true && true (Logika AND): true
        // 2. true || true (Logika OR): true
        boolean REsult2 = num1 + num2 > 30 || num3 - num1 < 10 && num2 > 10;
        System.out.println("num1 + num2 > 30 || num3 - num1 < 10 && num2 > 10 = " + REsult2); // Output: true

        // - Gunakan tanda kurung untuk memaksa evaluasi berbeda: (num1 + num2 > 30 || num3 - num1 < 10) && num2 > 10
        // Evaluasi step-by-step:
        // Ekspresi ini bisa dipecah menjadi ( (A || B) && C )
        // A = (num1 + num2 > 30) => true (dari perhitungan sebelumnya)
        // B = (num3 - num1 < 10) => true (dari perhitungan sebelumnya)
        // C = (num2 > 10)        => true (dari perhitungan sebelumnya)

        // Precedence: Tanda kurung terluar () dievaluasi terlebih dahulu.
        // 1. (num1 + num2 > 30 || num3 - num1 < 10):
        //    => (true || true) (Logika OR di dalam kurung) => true
        // 2. Kemudian, hasil ini dikombinasikan dengan C: true && C
        // 3. true && true (Logika AND) => true
        boolean REsult3 = (num1 + num2 > 30 || num3 - num1 < 10) && num2 > 10;
        System.out.println("(num1 + num2 > 30 || num3 - num1 < 10) && num2 > 10 = " + REsult3); // Output: true

        System.out.println("\nPerbandingan hasil dan penjelasan perbedaan:");
        System.out.println("Dalam contoh ini, kedua ekspresi (result2 dan result3) kebetulan menghasilkan 'true'.");
        System.out.println("Namun, urutan evaluasinya *berbeda* karena penggunaan tanda kurung.");
        System.out.println("Untuk result2 (tanpa kurung): num1 + num2 > 30 || (num3 - num1 < 10 && num2 > 10)");
        System.out.println("   - Bagian AND dievaluasi dulu: (true && true) -> true");
        System.out.println("   - Lalu bagian OR: true || true -> true");
        System.out.println("Untuk result3 (dengan kurung): (num1 + num2 > 30 || num3 - num1 < 10) && num2 > 10");
        System.out.println("   - Bagian OR di dalam kurung dievaluasi dulu: (true || true) -> true");
        System.out.println("   - Lalu bagian AND: true && true -> true");
        System.out.println("Meskipun hasilnya sama, pemahaman urutan evaluasi sangat penting. Jika nilai variabelnya berbeda,");
        System.out.println("hasilnya bisa jadi berbeda. Tanda kurung adalah alat yang ampuh untuk mengontrol dan memperjelas urutan.");
        System.out.println();

        // ===== UNARY OPERATORS DAN PRECEDENCE =====
        System.out.println("\\n=== UNARY OPERATORS DAN PRECEDENCE ===");

        // Latihan 5: Unary operators dengan operasi lain
        int value = 8;
        System.out.println("Nilai awal 'value': " + value);

        // --- Evaluasi: ++value * 2 ---
        // Penjelasan: Prefix '++' memiliki precedence lebih tinggi dari perkalian.
        // 1. ++value: 'value' di-increment dulu menjadi 9.
        // 2. 9 * 2: Kemudian perkalian dievaluasi menjadi 18.
        int RESult1 = ++value * 2;
        System.out.println("++value * 2 = " + result1 + ", 'value' sekarang: " + value); // Output: 18, 9

        // --- Reset value ke 8, lalu evaluasi: value++ * 2 ---
        value = 8;
        System.out.println("Nilai 'value' setelah reset: " + value);
        // Penjelasan: Postfix '++' memiliki precedence lebih tinggi dari perkalian, TAPI
        // nilai 'value' yang digunakan dalam ekspresi adalah nilai SEBELUM increment.
        // 1. value++: Nilai 8 digunakan dalam perkalian. Setelah itu, 'value' di-increment menjadi 9.
        // 2. 8 * 2: Kemudian perkalian dievaluasi menjadi 16.
        int RESult2 = value++ * 2;
        System.out.println("value++ * 2 = " + RESult2 + ", 'value' sekarang: " + value); // Output: 16, 9
        System.out.println("Perbandingan: Hasilnya berbeda karena '++value' mengincrement sebelum digunakan,");
        System.out.println("sedangkan 'value++' mengincrement setelah digunakan dalam ekspresi.");


        // --- Reset value ke 8, lalu evaluasi: 2 * ++value ---
        value = 8;
        System.out.println("Nilai 'value' setelah reset: " + value);
        // Penjelasan: Precedence '++' tetap lebih tinggi dari perkalian.
        // Juga, operator aritmatika dievaluasi kiri ke kanan, tetapi unary operator di operan kanannya
        // dievaluasi lebih dulu.
        // 1. ++value: 'value' di-increment dulu menjadi 9.
        // 2. 2 * 9: Kemudian perkalian dievaluasi menjadi 18.
        int RESult3 = 2 * ++value;
        System.out.println("2 * ++value = " + RESult3 + ", 'value' sekarang: " + value); // Output: 18, 9
        System.out.println("Urutan evaluasi tetap sama untuk '++value' (increment dulu),");
        System.out.println("posisi operator perkalian tidak mengubah perilaku '++value'.");


        // --- Reset value ke 8, lalu evaluasi: -value + 10 ---
        value = 8;
        System.out.println("Nilai 'value' setelah reset: " + value);
        // Penjelasan: Unary minus '-' memiliki precedence lebih tinggi dari penjumlahan '+'.
        // 1. -value: Mengambil nilai negatif dari 'value' -> -8.
        // 2. -8 + 10: Kemudian penjumlahan dievaluasi menjadi 2.
        int RESult4 = -value + 10;
        System.out.println("-value + 10 = " + RESult4 + ", 'value' sekarang: " + value); // Output: 2, 8
        System.out.println("Unary minus mengubah tanda nilai 'value' sebelum penjumlahan dilakukan.");
        System.out.println();

        // ===== PRECEDENCE OPERATOR ASSIGNMENT =====
        System.out.println("\\n=== PRECEDENCE OPERATOR ASSIGNMENT ===");
        // Latihan 6: Operator assignment dan precedence
        int d = 5;
        int e = 10;
        System.out.println("Variabel: a = " + d + ", b = " + e);

        // --- Evaluasi dan jelaskan: a += b * 2 ---
        // Penjelasan: Operator aritmatika (multiplication) memiliki precedence lebih tinggi dari assignment (+=).
        // 1. b * 2 dievaluasi terlebih dahulu: 10 * 2 = 20.
        // 2. Kemudian, a += 20 dievaluasi, yang setara dengan a = a + 20.
        // 3. a = 5 + 20 = 25.
        d += e * 2;
        System.out.println("a += b * 2 = " + d); // Output: 25

        // --- Reset a ke 5, lalu evaluasi: a *= b + 3 ---
        d = 5;
        System.out.println("Variabel setelah reset: a = " + d + ", b = " + e);
        // Penjelasan: Operator aritmatika (addition) memiliki precedence lebih tinggi dari assignment (*=).
        // 1. b + 3 dievaluasi terlebih dahulu: 10 + 3 = 13.
        // 2. Kemudian, a *= 13 dievaluasi, yang setara dengan a = a * 13.
        // 3. a = 5 * 13 = 65.
        d *= e + 3;
        System.out.println("a *= b + 3 = " + d); // Output: 65

        // --- Evaluasi: a = b > 5 ? b * 2 : b / 2 ---
        // Penjelasan: Ternary operator (?:) memiliki precedence lebih tinggi dari operator assignment (=).
        // 1. Kondisi b > 5 dievaluasi: 10 > 5 = true.
        // 2. Karena kondisi true, ekspresi b * 2 dievaluasi: 10 * 2 = 20.
        // 3. Kemudian, nilai 20 di-assign ke 'a'.
        d = e > 5 ? e * 2 : e / 2;
        System.out.println("a = b > 5 ? b * 2 : b / 2 = " + d); // Output: 20
        System.out.println("Ternary operator dievaluasi sepenuhnya untuk menghasilkan nilai,");
        System.out.println("kemudian nilai tersebut di-assign ke variabel 'a'.");
        System.out.println();

        // ===== TANDA KURUNG DAN OVERRIDE PRECEDENCE =====
        System.out.println("\\n=== TANDA KURUNG DAN OVERRIDE PRECEDENCE ===");

        // Latihan 7: Menggunakan tanda kurung untuk mengontrol evaluasi
        int t = 8;
        int u = 4;
        int v = 2;
        int w = 6;
        System.out.println("Variabel: a=" + t + ", b=" + u + ", c=" + v + ", d=" + w);

        // --- Bandingkan hasil dari: a + b * c - d dan (a + b) * (c - d) ---
        // Ekspresi 1: a + b * c - d
        // Langkah kalkulasi:
        // 1. b * c (Perkalian, tertinggi): 4 * 2 = 8
        // 2. a + 8 (Penjumlahan, kiri ke kanan): 8 + 8 = 16
        // 3. 16 - d (Pengurangan, kiri ke kanan): 16 - 6 = 10
        int expr1 = t + u * v - w;
        System.out.println("\nEkspresi 1: a + b * c - d = " + expr1); // Output: 10

        // Ekspresi 2: (a + b) * (c - d)
        // Langkah kalkulasi:
        // 1. (a + b) (Tanda kurung, tertinggi): 8 + 4 = 12
        // 2. (c - d) (Tanda kurung, tertinggi): 2 - 6 = -4
        // 3. 12 * -4 (Perkalian): -48
        int expr2 = (t + u) * (v - w);
        System.out.println("Ekspresi 2: (a + b) * (c - d) = " + expr2); // Output: -48
        System.out.println("Perbandingan: Hasilnya sangat berbeda (-48 vs 10).");
        System.out.println("Tanda kurung sepenuhnya mengubah urutan operasi, memaksa penjumlahan/pengurangan");
        System.out.println("dilakukan sebelum perkalian, yang sebaliknya akan dilakukan terlebih dahulu.");


        // --- Bandingkan hasil dari: a > b && c < d || a == b dan a > b && (c < d || a == b) ---
        // Ekspresi 3: a > b && c < d || a == b
        // Langkah kalkulasi:
        // 1. a > b (Perbandingan): 8 > 4 = true
        // 2. c < d (Perbandingan): 2 < 6 = true
        // 3. a == b (Perbandingan): 8 == 4 = false
        // 4. true && true (Logika AND, lebih tinggi dari OR): true
        // 5. true || false (Logika OR): true
        boolean expr3 = t > u && v < w || t == u;
        System.out.println("\nEkspresi 3: a > b && c < d || a == b = " + expr3); // Output: true

        // Ekspresi 4: a > b && (c < d || a == b)
        // Langkah kalkulasi:
        // 1. a > b (Perbandingan): 8 > 4 = true
        // 2. (c < d || a == b) (Tanda kurung, tertinggi):
        //    a. c < d (Perbandingan di dalam kurung): 2 < 6 = true
        //    b. a == b (Perbandingan di dalam kurung): 8 == 4 = false
        //    c. true || false (Logika OR di dalam kurung): true
        // 3. true && true (Logika AND): true
        boolean expr4 = t > u && (v < w || t == u);
        System.out.println("Ekspresi 4: a > b && (c < d || a == b) = " + expr4); // Output: true
        System.out.println("Perbandingan: Dalam kasus ini, kedua ekspresi menghasilkan 'true'.");
        System.out.println("Namun, urutan evaluasi berbeda.");
        System.out.println("Tanpa kurung (Expr3), (a > b && c < d) dievaluasi dulu.");
        System.out.println("Dengan kurung (Expr4), (c < d || a == b) dievaluasi dulu.");
        System.out.println("Ini menunjukkan bahwa meskipun hasil akhir mungkin sama, tanda kurung");
        System.out.println("memberi Anda kontrol eksplisit atas bagaimana logika dievaluasi,");
        System.out.println("yang sangat penting untuk kejelasan dan kebenaran kode.");


        // --- Buat ekspresi nested kompleks menggunakan beberapa level tanda kurung ---
        // Contoh: ((a + b) * c) / (d - 2) > (a - b)
        // Variabel: a = 8, b = 4, c = 2, d = 6
        System.out.println("\n--- Ekspresi Nested Kompleks: ((a + b) * c) / (d - 2) > (a - b) ---");
        // Evaluasi step-by-step:
        // Bagian Kiri: ((a + b) * c) / (d - 2)
        // 1. (a + b) (Kurung terdalam): 8 + 4 = 12
        // 2. (12 * c) (Perkalian): 12 * 2 = 24
        // 3. (d - 2) (Kurung lain): 6 - 2 = 4
        // 4. 24 / 4 (Pembagian): 6
        //
        // Bagian Kanan: (a - b)
        // 1. (a - b) (Kurung): 8 - 4 = 4
        //
        // Perbandingan Akhir: 6 > 4 (Relational) -> true
        boolean complexExpr = ((t + u) * v) / (w - 2) > (t - u);
        System.out.println("Hasil ekspresi kompleks: " + complexExpr); // Output: true
    }
}