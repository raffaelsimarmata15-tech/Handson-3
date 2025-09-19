public class UnaryOperatorsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Unary Operators
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk memahami
         * unary operators, terutama perbedaan antara pre dan post increment/decrement.
         */

        // ===== OPERATOR INCREMENT DAN DECREMENT =====
        System.out.println("=== OPERATOR INCREMENT DAN DECREMENT ===");

        // Latihan 1: Increment dan decrement dasar
        // - Buat variabel 'counter' dengan nilai 5

        // - Gunakan pre-increment (++counter) dan print hasilnya

        // - Gunakan post-increment (counter++) dan print hasilnya

        // - Reset counter ke 5, lalu gunakan pre-decrement (--counter) dan print hasilnya

        // - Gunakan post-decrement (counter--) dan print hasilnya

        // ===== PERILAKU PRE vs POST INCREMENT =====
        System.out.println("\\n=== PERILAKU PRE vs POST INCREMENT ===");

        // Latihan 2: Pahami perbedaan antara pre dan post increment
        // - Buat dua variabel: a = 10, b = 10

        // - Buat variabel 'result1' dan assign nilai dari ++a (pre-increment)
        // - Print kedua 'a' dan 'result1' - amati nilainya

        // - Buat variabel 'result2' dan assign nilai dari b++ (post-increment)
        // - Print kedua 'b' dan 'result2' - amati nilainya

        // - Jelaskan dalam komentar apa yang Anda amati tentang perbedaannya

        // ===== PERILAKU PRE vs POST DECREMENT =====
        System.out.println("\\n=== PERILAKU PRE vs POST DECREMENT ===");

        // Latihan 3: Pahami perbedaan antara pre dan post decrement
        // - Buat dua variabel: x = 8, y = 8

        // - Print nilai dari --x (pre-decrement) dan kemudian print x lagi

        // - Print nilai dari y-- (post-decrement) dan kemudian print y lagi

        // - Tulis komentar yang menjelaskan kapan decrement terjadi pada setiap kasus

        // ===== UNARY PLUS DAN MINUS =====
        System.out.println("\\n=== UNARY PLUS DAN MINUS ===");

        // Latihan 4: Berlatih operator unary plus dan minus
        // - Buat variabel integer positif 'positive' dengan nilai 42

        // - Buat variabel integer negatif 'negative' menggunakan operator unary minus pada positive

        // - Buat variabel 'backToPositive' menggunakan unary minus pada negative (membuatnya positif lagi)

        // - Print ketiga variabel tersebut

        // - Demonstrasikan bahwa unary plus tidak mengubah nilai (buat variabel dengan +positive)

        // ===== OPERATOR BOOLEAN NOT =====
        System.out.println("\\n=== OPERATOR BOOLEAN NOT ===");

        // Latihan 5: Berlatih operator boolean NOT
        // - Buat variabel boolean 'isReady' dengan nilai true

        // - Buat boolean lain 'isNotReady' menggunakan operator NOT (!) pada isReady

        // - Print kedua variabel

        // - Buat ekspresi boolean yang mengecek apakah suatu angka TIDAK sama dengan nol
        // Gunakan angka apapun dan print hasilnya

        // - Rangkai beberapa operator NOT: buat variabel dengan !!isReady dan amati hasilnya

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\\n=== APLIKASI PRAKTIS ===");

        // Latihan 6: Gunakan unary operators dalam skenario praktis
        // - Buat variabel 'attempts' dimulai dari 0

        // - Simulasikan tiga percobaan login yang gagal dengan increment 'attempts' setiap kali
        // Print "Attempt: " + attempts setelah setiap increment

        // - Buat variabel 'lives' dimulai dari 3

        // - Simulasikan kehilangan nyawa dalam game dengan decrement 'lives'
        // Print "Lives remaining: " + lives setelah setiap decrement

        // Latihan 7: Loop counters dengan increment/decrement
        // - Gunakan while loop yang berjalan 5 kali menggunakan post-increment
        // Buat variabel 'i' dimulai dari 1, kondisi: i <= 5, increment: i++
        // Print loop counter setiap iterasi

        // - Gunakan while loop yang menghitung mundur dari 3 ke 1 menggunakan post-decrement
        // Buat variabel 'countdown' dimulai dari 3, kondisi: countdown > 0, decrement: countdown--
        // Print "Countdown: " + countdown setiap iterasi

        // ===== SKENARIO MENANTANG =====
        System.out.println("\\n=== SKENARIO MENANTANG ===");

        // Latihan 8: Skenario increment/decrement kompleks
        // - Buat variabel 'value' dengan nilai awal 5

        // - Hitung dan simpan hasil dari: value++ + ++value
        // Print kedua hasil dan nilai akhir dari 'value'

        // - Reset value ke 5, lalu hitung: --value + value--
        // Print kedua hasil dan nilai akhir dari 'value'

        // - Prediksi hasilnya sebelum menjalankan dan tambahkan komentar dengan prediksi Anda

        // Latihan 9: Increment/Decrement dengan pemanggilan method
        // - Buat variabel 'score' dengan nilai 10

        // - Print hasil dari Math.max(++score, 12)
        // Kemudian print nilai score saat ini

        // - Reset score ke 10, lalu print hasil dari Math.max(score++, 12)
        // Kemudian print nilai score saat ini

        // - Komentari perbedaan perilaku yang Anda amati
    }
}
