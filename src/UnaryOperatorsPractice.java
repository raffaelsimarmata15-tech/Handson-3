public class UnaryOperatorsPractice {
    public static void main(String[] args) {
        // ===== OPERATOR INCREMENT DAN DECREMENT =====
        System.out.println("\\n=== OPERATOR INCREMENT DAN DECREMENT ===");

        // Latihan 1: Increment dan decrement dasar
        // - Buat variabel 'counter' dengan nilai 5
        int counter = 5;

        System.out.println("Nilai awal counter: " + counter); // Output: 5

        // - Gunakan pre-increment (++counter) dan print hasilnya
        // Pre-increment: nilai counter akan dinaikkan DULU, baru digunakan
        System.out.println("Hasil pre-increment (++counter): " + (++counter)); // Output: 6
        System.out.println("Nilai counter setelah pre-increment: " + counter); // Output: 6

        // - Gunakan post-increment (counter++) dan print hasilnya
        // Post-increment: nilai counter akan digunakan DULU, baru dinaikkan
        System.out.println("Hasil post-increment (counter++): " + (counter++)); // Output: 6
        System.out.println("Nilai counter setelah post-increment: " + counter); // Output: 7

        // - Reset counter ke 5, lalu gunakan pre-decrement (--counter) dan print hasilnya
        counter = 5;

        System.out.println("\n--- Setelah reset counter ke 5 ---");
        System.out.println("Nilai counter setelah reset: " + counter); // Output: 5

        // Pre-decrement: nilai counter akan diturunkan DULU, baru digunakan
        System.out.println("Hasil pre-decrement (--counter): " + (--counter)); // Output: 4
        System.out.println("Nilai counter setelah pre-decrement: " + counter); // Output: 4

        // - Gunakan post-decrement (counter--) dan print hasilnya
        // Post-decrement: nilai counter akan digunakan DULU, baru diturunkan
        System.out.println("Hasil post-decrement (counter--): " + (counter--)); // Output: 4
        System.out.println("Nilai counter setelah post-decrement: " + counter); // Output: 3
        System.out.println();

        // ===== PERILAKU PRE vs POST INCREMENT =====
        System.out.println("\\n=== PERILAKU PRE vs POST INCREMENT ===");

        // Latihan 2: Pahami perbedaan antara pre dan post increment
        // - Buat dua variabel: a = 10, b = 10
        int a = 10;
        int b = 10;

        System.out.println("Nilai awal a: " + a); // Output: 10
        System.out.println("Nilai awal b: " + b); // Output: 10

        // - Buat variabel 'result1' dan assign nilai dari ++a (pre-increment)
        System.out.println("\n--- Menggunakan Pre-increment (++a) ---");
        int result1 = ++a; // a akan menjadi 11 DULU, baru nilai 11 di-assign ke result1

        // - Print kedua 'a' dan 'result1' - amati nilainya
        System.out.println("Nilai 'a' setelah ++a: " + a);       // Output: 11
        System.out.println("Nilai 'result1': " + result1);     // Output: 11

        // - Buat variabel 'result2' dan assign nilai dari b++ (post-increment)
        System.out.println("\n--- Menggunakan Post-increment (b++) ---");
        int result2 = b++;

        // - Print kedua 'b' dan 'result2' - amati nilainya
        System.out.println("Nilai 'b' setelah b++: " + b);       // Output: 11
        System.out.println("Nilai 'result2': " + result2);     // Output: 10

        // - Jelaskan dalam komentar apa yang Anda amati tentang perbedaannya
        // Pada post-increment, nilai 'b' yang sebelum di-increment diberikan ke 'result2'. Kemudian, setelah assignment, 'b' baru di-increment. Jadi, 'b' (11) dan 'result2' (10) memiliki nilai yang berbeda.
        System.out.println();

        // ===== PERILAKU PRE vs POST DECREMENT =====
        System.out.println("\\n=== PERILAKU PRE vs POST DECREMENT ===");

        // Latihan 3: Pahami perbedaan antara pre dan post decrement
        // - Buat dua variabel: x = 8, y = 8
        int x = 8;
        int y = 8;

        System.out.println("Nilai awal x: " + x); // Output: 8
        System.out.println("Nilai awal y: " + y); // Output: 8

        // - Print nilai dari --x (pre-decrement) dan kemudian print x lagi
        System.out.println("\n--- Menggunakan Pre-decrement (--x) ---");
        System.out.println("Nilai --x (di dalam print): " + (--x)); // Output: 7
        // Penjelasan: Decrement terjadi SEBELUM nilai 'x' digunakan dalam ekspresi.
        // Jadi, x menjadi 7 dulu, lalu 7 dicetak.
        System.out.println("Nilai x setelah --x: " + x); // Output: 7

        // - Print nilai dari y-- (post-decrement) dan kemudian print y lagi
        System.out.println("\n--- Menggunakan Post-decrement (y--) ---");
        System.out.println("Nilai y-- (di dalam print): " + (y--)); // Output: 8
        // Penjelasan: Nilai 'y' (yaitu 8) digunakan DULU dalam ekspresi (dicetak).
        // Decrement (y menjadi 7) terjadi SETELAH nilai 'y' digunakan dan ekspresi selesai.
        System.out.println("Nilai y setelah y--: " + y); // Output: 7
        System.out.println();

        // ===== UNARY PLUS DAN MINUS =====
        System.out.println("\\n=== UNARY PLUS DAN MINUS ===");

        // Latihan 4: Berlatih operator unary plus dan minus
        // - Buat variabel integer positif 'positive' dengan nilai 42
        int positive = 42;

        System.out.println("Nilai 'positive' awal: " + positive); // Output: 42

        // - Buat variabel integer negatif 'negative' menggunakan operator unary minus pada positive
        int negative = -positive; // Menggunakan unary minus untuk mengubah tanda

        System.out.println("Nilai 'negative' (-positive): " + negative); // Output: -42

        // - Buat variabel 'backToPositive' menggunakan unary minus pada negative (membuatnya positif lagi)
        int backToPositive = -negative; // Menggunakan unary minus lagi untuk mengembalikan ke positif

        System.out.println("Nilai 'backToPositive' (-negative): " + backToPositive); // Output: 42

        // - Demonstrasikan bahwa unary plus tidak mengubah nilai (buat variabel dengan +positive)
        int unchangedPositive = +positive; // Unary plus tidak mengubah tanda atau nilai

        System.out.println("Nilai 'unchangedPositive' (+positive): " + unchangedPositive); // Output: 42
        System.out.println("Nilai 'positive' asli tetap: " + positive); // Output: 42
        System.out.println("\n--- Ringkasan ---");
        System.out.println("positive: " + positive);
        System.out.println("negative: " + negative);
        System.out.println("backToPositive: " + backToPositive);
        System.out.println("unchangedPositive: " + unchangedPositive);
        System.out.println();

        // ===== OPERATOR BOOLEAN NOT =====
        System.out.println("\\n=== OPERATOR BOOLEAN NOT ===");

        // Latihan 5: Berlatih operator boolean NOT
        // - Buat variabel boolean 'isReady' dengan nilai true
        boolean isReady = true;
        System.out.println("Nilai 'isReady': " + isReady); // Output: true

        // - Buat boolean lain 'isNotReady' menggunakan operator NOT (!) pada isReady
        boolean isNotReady = !isReady; // !true akan menjadi false
        System.out.println("Nilai 'isNotReady' (!isReady): " + isNotReady); // Output: false

        // - Buat ekspresi boolean yang mengecek apakah suatu angka TIDAK sama dengan nol
        // Gunakan angka apapun dan print hasilnya
        int angka = 123;
        boolean angkaTidakSamaDenganNol = (angka != 0); // Cara yang lebih langsung
        // Atau menggunakan operator NOT: !(angka == 0)
        boolean angkaTidakSamaDenganNolDenganNot = !(angka == 0);

        System.out.println("\n--- Mengecek Angka Tidak Sama dengan Nol ---");
        System.out.println("Angka: " + angka);
        System.out.println("Apakah angka TIDAK sama dengan nol (angka != 0)? " + angkaTidakSamaDenganNol); // Output: true
        System.out.println("Apakah angka TIDAK sama dengan nol (!(angka == 0))? " + angkaTidakSamaDenganNolDenganNot); // Output: true

        angka = 0; // Coba dengan angka nol
        boolean angkaNolTidakSamaDenganNol = !(angka == 0);

        System.out.println("\nAngka: " + angka);
        System.out.println("Apakah angka TIDAK sama dengan nol (!(angka == 0))? " + angkaNolTidakSamaDenganNol); // Output: false

        // - Rangkai beberapa operator NOT: buat variabel dengan !!isReady dan amati hasilnya
        boolean doubleNotIsReady = !!isReady; // !!true akan menjadi !false, yang menghasilkan true

        System.out.println("\n--- Rangkaian Operator NOT ---");
        System.out.println("Nilai 'isReady': " + isReady);             // Output: true
        System.out.println("Nilai 'doubleNotIsReady' (!!isReady): " + doubleNotIsReady); // Output: true
        System.out.println();

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\\n=== APLIKASI PRAKTIS ===");

        // Latihan 6: Gunakan unary operators dalam skenario praktis
        // - Buat variabel 'attempts' dimulai dari 0
        int attempts = 0;

        System.out.println("Jumlah percobaan awal: " + attempts);

        // - Simulasikan tiga percobaan login yang gagal dengan increment 'attempts' setiap kali
        System.out.println("\n--- Simulasi Percobaan Login Gagal ---");

        // Percobaan 1
        attempts++; // Post-increment adalah umum di sini karena Anda bisa melihat nilai sebelum atau sesudah
        System.out.println("Attempt: " + attempts); // Output: Attempt: 1

        // Percobaan 2
        attempts++;
        System.out.println("Attempt: " + attempts); // Output: Attempt: 2

        // Percobaan 3
        attempts++;
        System.out.println("Attempt: " + attempts); // Output: Attempt: 3
        System.out.println("Login gagal setelah " + attempts + " percobaan.");

        // - Buat variabel 'lives' dimulai dari 3
        int lives = 3;
        System.out.println("\nJumlah nyawa awal: " + lives);

        // - Simulasikan kehilangan nyawa dalam game dengan decrement 'lives'
        System.out.println("\n--- Simulasi Kehilangan Nyawa Game ---");
        // Kehilangan nyawa 1
        lives--; // Post-decrement juga umum di sini
        System.out.println("Lives remaining: " + lives); // Output: Lives remaining: 2

        // Kehilangan nyawa 2
        lives--;
        System.out.println("Lives remaining: " + lives); // Output: Lives remaining: 1

        // Kehilangan nyawa 3
        lives--;
        System.out.println("Lives remaining: " + lives); // Output: Lives remaining: 0
        System.out.println("Game Over! Tidak ada nyawa tersisa.");
        System.out.println();

        // Latihan 7: Loop counters dengan increment/decrement
        // - Gunakan while loop yang berjalan 5 kali menggunakan post-increment
        // Buat variabel 'i' dimulai dari 1, kondisi: i <= 5, increment: i++
        // Print loop counter setiap iterasi
        System.out.println("\\n=== Loop 5 kali dengan Post-Increment ===");
        int i = 1; // Inisialisasi counter
        while (i <= 5) { // Kondisi loop
            System.out.println("Iterasi (i++): " + i);
            i++; // Post-increment
        }
        System.out.println("Loop selesai. Nilai akhir i: " + i); // Output: 6

        // - Gunakan while loop yang menghitung mundur dari 3 ke 1 menggunakan post-decrement
        // Buat variabel 'countdown' dimulai dari 3, kondisi: countdown > 0, decrement: countdown--
        // Print "Countdown: " + countdown setiap iterasi
        System.out.println("\n--- Countdown dengan Post-Decrement ---");
        int countdown = 3; // Inisialisasi counter mundur
        while (countdown > 0) { // Kondisi loop
            System.out.println("Countdown: " + countdown);
            countdown--; // Post-decrement
        }
        System.out.println("Loop countdown selesai. Nilai akhir countdown: " + countdown); // Output: 0
        System.out.println();

        // ===== SKENARIO MENANTANG =====
        System.out.println("\\n=== SKENARIO MENANTANG ===");

        // Latihan 8: Skenario increment/decrement kompleks
        // - Buat variabel 'value' dengan nilai awal 5
        int value = 5;
        System.out.println("Nilai awal 'value': " + value); // Output: 5

        // Prediksi:
        // 1. value++: Menggunakan nilai 'value' saat ini (5) untuk ekspresi. Setelah itu, 'value' jadi 6.
        // 2. ++value: Meng-increment 'value' (yang sekarang 6) menjadi 7. Lalu, menggunakan nilai baru (7) untuk ekspresi.
        // Ekspresi menjadi: 5 + 7
        // result1 = 12
        // Nilai akhir 'value' = 7
        int hasil1 = value++ + ++value;
        System.out.println("\n--- Perhitungan: value++ + ++value ---");
        System.out.println("Hasil 'hasil1': " + hasil1); // Output: 12
        System.out.println("Nilai akhir 'value': " + value); // Output: 7
        // Observasi: Prediksi benar!

        // - Reset value ke 5, lalu hitung: --value + value--
        value = 5;
        System.out.println("\n--- Reset 'value' ke " + value + " ---");
        System.out.println("Nilai 'value' setelah reset: " + value); // Output: 5
        // Print kedua hasil dan nilai akhir dari 'value'

        // Prediksi:
        // 1. --value: Meng-decrement 'value' (yang sekarang 5) menjadi 4. Lalu, menggunakan nilai baru (4) untuk ekspresi.
        // 2. value--: Menggunakan nilai 'value' saat ini (4) untuk ekspresi. Setelah itu, 'value' jadi 3.
        // Ekspresi menjadi: 4 + 4
        // result2 = 8
        // Nilai akhir 'value' = 3
        int hasil2 = --value + value--;
        System.out.println("\n--- Perhitungan: --value + value-- ---");
        System.out.println("Hasil 'hasil2': " + hasil2); // Output: 8
        System.out.println("Nilai akhir 'value': " + value); // Output: 3
        // Observasi: Prediksi benar!
        System.out.println();

        // Latihan 9: Increment/Decrement dengan pemanggilan method
        System.out.println("\\n=== INCREMENT/DECREMENT DENGAN PEMANGGILAN METHOD ===");
        // - Buat variabel 'score' dengan nilai 10
        int score = 10;
        System.out.println("Nilai awal 'score': " + score); // Output: 10

        // - Print hasil dari Math.max(++score, 12)
        // Prediksi:
        // 1. ++score: 'score' di-increment dulu menjadi 11.
        // 2. Math.max(11, 12) dievaluasi.
        // Hasil: 12.
        // Nilai 'score' akhir: 11.
        System.out.println("\n--- Menggunakan Math.max(++score, 12) ---");
        System.out.println("Hasil Math.max(++score, 12): " + Math.max(++score, 12)); // Output: 12
        // - Kemudian print nilai score saat ini
        System.out.println("Nilai 'score' setelah operasi: " + score); // Output: 11
        // Observasi: Prediksi benar. 'score' menjadi 11 sebelum diteruskan ke Math.max.

        score = 10;
        System.out.println("\n--- Reset 'score' ke " + score + " ---");
        System.out.println("Nilai 'score' setelah reset: " + score); // Output: 10

        // - Print hasil dari Math.max(score++, 12)
        // Prediksi:
        // 1. score++: Nilai 'score' saat ini (10) diteruskan ke Math.max.
        // 2. Setelah itu, 'score' di-increment menjadi 11.
        // 3. Math.max(10, 12) dievaluasi.
        // Hasil: 12.
        // Nilai 'score' akhir: 11.
        System.out.println("\n--- Menggunakan Math.max(score++, 12) ---");
        System.out.println("Hasil Math.max(score++, 12): " + Math.max(score++, 12)); // Output: 12
        // - Kemudian print nilai score saat ini
        System.out.println("Nilai 'score' setelah operasi: " + score); // Output: 11
        // Observasi: Prediksi benar. Nilai 10 diteruskan ke Math.max, baru setelah itu 'score' menjadi 11.


        // - Komentari perbedaan perilaku yang Anda amati
        System.out.println("\n--- Perbedaan Perilaku ---");
        System.out.println("Meskipun hasil akhir dari Math.max() adalah sama (12) di kedua kasus,");
        System.out.println("perilaku operator increment pada variabel 'score' di dalam argumen method berbeda:");
        System.out.println("- Dengan '++score' (pre-increment), 'score' di-increment menjadi 11 DULU,");
        System.out.println("  baru nilai 11 tersebut diteruskan sebagai argumen pertama ke Math.max().");
        System.out.println("- Dengan 'score++' (post-increment), nilai 'score' saat ini (10) diteruskan");
        System.out.println("  sebagai argumen pertama ke Math.max(). Kemudian, SETELAH method dipanggil,");
        System.out.println("  baru 'score' di-increment menjadi 11.");
        System.out.println("Nilai akhir 'score' setelah kedua operasi sama-sama 11,");
        System.out.println("namun nilai yang dilewatkan ke method berbeda.");
    }
}