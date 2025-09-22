public class ExpressionPractice {
    public static void main(String[] args) {
        // ===== EXPRESSIONS =====
        System.out.println("=== EXPRESSIONS ===");

        // Latihan 1: Buat arithmetic expressions dan simpan hasilnya
        int a = 10;
        int b = 5;

        System.out.println("Nilai a: " + a);
        System.out.println("Nilai b: " + b);

        // - Buat expression yang menjumlahkan a dan b, simpan dalam variabel 'sum'
        int sum = a + b; // Ini adalah arithmetic expression
        System.out.println("Penjumlahan (a + b): " + sum); // Output: 15

        // - Buat expression yang mengalikan a dan b, simpan dalam variabel 'product'
        int product = a * b; // Ini adalah arithmetic expression
        System.out.println("Perkalian (a * b): " + product); // Output: 50

        // - Buat boolean expression yang mengecek apakah a lebih besar dari b
        boolean isAGreaterThanB = (a > b); // Ini adalah boolean (relational) expression
        System.out.println("Apakah a lebih besar dari b (a > b)? " + isAGreaterThanB); // Output: true

        // - Buat string expression yang menggabungkan "Hello" dan "World"
        String greeting = "Hello" + "World"; // Ini adalah string concatenation expression
        System.out.println("Gabungan String (\"Hello\" + \"World\"): " + greeting); // Output: HelloWorld

        // - Buat method call expression menggunakan Math.pow(2, 3)
        double powerResult = Math.pow(2, 3); // Ini adalah method call expression
        System.out.println("Hasil Math.pow(2, 3): " + powerResult); // Output: 8.0
        System.out.println();

        // ===== STATEMENTS =====
        System.out.println("\\n=== STATEMENTS ===");

        // Latihan 2: Buat berbagai jenis statements
        // - Buat declaration statement untuk variabel integer 'score'
        int score;

        // - Buat assignment statement untuk memberikan nilai 85 ke score
        score = 85;

        // - Buat conditional statement yang mencetak "Pass" jika score >= 60, "Fail" jika sebaliknya
        if (score >= 60) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // - Buat loop statement yang mencetak angka 1 sampai 3
        int counter = 1;
        while (counter <= 3) {
            System.out.println(counter);
            counter++;
        }
        // ===== BLOCKS =====
        System.out.println("\n=== BLOCKS ===");

        // Latihan 3: Buat dan gunakan blocks
        int x = 15;
        System.out.println("Nilai x awal: " + x);

        // - Buat if block yang mengecek apakah x > 10
        if (x > 10) { // Awal if block
            // Di dalam block, deklarasikan variabel 'category' dan assign "High"
            String category = "High"; // Variabel 'category' scope-nya hanya di dalam block ini
            // Print kedua nilai x dan category
            System.out.println("\n--- Di dalam if block ---");
            System.out.println("Nilai x: " + x);
            System.out.println("Kategori: " + category);
            // Setelah block ini berakhir, 'category' tidak bisa diakses lagi
        } // Akhir if block
        // System.out.println(category); // Ini akan menyebabkan error kompilasi karena 'category' di luar scope

        System.out.println("\n--- Setelah if block ---");
        System.out.println("Nilai x (tetap bisa diakses): " + x);


        // - Buat for loop block yang melakukan iterasi 3 kali
        System.out.println("\n--- Di dalam for loop block ---");
        for (int i = 0; i < 3; i++) { // Awal for loop block
            // Di dalam block, deklarasikan variabel 'iteration' yang menunjukkan nomor loop saat ini
            int iteration = i + 1; // Variabel 'iteration' scope-nya hanya di dalam block ini per iterasi
            // Print nomor iterasi
            System.out.println("Iterasi ke: " + iteration);
            // Setelah setiap iterasi berakhir, 'iteration' direset atau dibuat ulang untuk iterasi berikutnya
        } // Akhir for loop block
        // System.out.println(i); // Ini akan menyebabkan error kompilasi karena 'i' di luar scope
        // System.out.println(iteration); // Ini akan menyebabkan error kompilasi karena 'iteration' di luar scope

        System.out.println("\n--- Setelah for loop block ---");
        // Semua variabel yang dideklarasikan di dalam loop tidak dapat diakses di sini
        System.out.println();

        // Latihan 4: Demonstrasikan variable scope dengan blocks
        System.out.println("\\n=== DEMONSTRASI VARIABLE SCOPE DENGAN BLOCKS ===");

        int outerVariable = 100;
        System.out.println("Nilai 'outerVariable' sebelum block: " + outerVariable); // Output: 100

        { // Awal block baru
            // - Di dalam block ini, deklarasikan variabel 'innerVariable' dengan nilai 50
            int innerVariable = 50; // 'innerVariable' scope-nya hanya di dalam block ini

            // - Print kedua outerVariable dan innerVariable
            System.out.println("\n--- Di dalam block ---");
            System.out.println("Nilai 'outerVariable' di dalam block: " + outerVariable); // Output: 100
            System.out.println("Nilai 'innerVariable' di dalam block: " + innerVariable); // Output: 50

            // - Modifikasi outerVariable di dalam block ini (tambahkan 25)
            outerVariable += 25; // outerVariable sekarang menjadi 125
            System.out.println("Nilai 'outerVariable' setelah dimodifikasi di dalam block: " + outerVariable); // Output: 125
        } // Akhir block baru

        // - Print outerVariable setelah block (seharusnya menunjukkan nilai yang sudah dimodifikasi)
        System.out.println("\n--- Setelah block ---");
        System.out.println("Nilai 'outerVariable' setelah block: " + outerVariable); // Output: 125 (Nilai yang sudah dimodifikasi)

        // - Coba print innerVariable di sini - apa yang terjadi? (Comment baris ini setelah testing)
        // System.out.println("Nilai 'innerVariable' setelah block: " + innerVariable);
        // Apa yang terjadi:
        // Baris di atas akan menghasilkan ERROR KOMPILASI:
        // "error: cannot find symbol variable innerVariable"
        // Ini karena 'innerVariable' dideklarasikan di dalam block,
        // sehingga scope-nya terbatas pada block tersebut. Setelah block berakhir,
        // 'innerVariable' tidak lagi "hidup" atau dapat diakses.
    }
}