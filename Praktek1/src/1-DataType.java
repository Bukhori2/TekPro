import java.math.BigInteger;
import java.util.Scanner;  // Import the Scanner class

class DataType {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Input: ");
        int T = input.nextInt(); // deklarasi variabel T untuk menampung jumlah input dari user
        BigInteger [] tests  = new BigInteger [T]; // deklarasi array of BigInteger agar dapat menampung angka yang sangat besar
        for (int i = 0; i < tests.length; i++) { // mengisi array tests dengan input dari user
            tests[i] = input.nextBigInteger();
        }
        for (BigInteger number : tests) { // untuk setiap angka dalam array tests menggunakan for-each loop

            boolean canBeStoredInsideByte =
                    number.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0 &&
                            number.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0;

            boolean canBeStoredInsideShort =
                    number.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0 &&
                            number.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0;

            boolean canBeStoredInsideInt =
                    number.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0 &&
                            number.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0;

            boolean canBeStoredInsideLong =
                    number.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 &&
                            number.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0;
             boolean cannotBeStoredAnywhere =
                    !canBeStoredInsideByte &&
                            !canBeStoredInsideShort &&
                            !canBeStoredInsideInt &&
                            !canBeStoredInsideLong;

            if (cannotBeStoredAnywhere) {
                System.out.println(number + " tidak dapat dimasukkan ke dalam tipe data primitif manapun.");
            } else {
            System.out.println(number + " dapat dimasukkan ke dalam:");
            if (canBeStoredInsideByte) {
                System.out.println("* byte");
            }
            if (canBeStoredInsideShort) {
                System.out.println("* short");
            }
            if (canBeStoredInsideInt) {
                System.out.println("* int");
            }
            if (canBeStoredInsideLong) {
                System.out.println("* long");
            }
        }
        }
    }
}
