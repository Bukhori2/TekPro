package Week7.soal1;

class Account {
    int balance = 150;
}

public class TransferFulus {
    public static void main(String[] args) throws InterruptedException {
        Account acc1 = new Account();
        Account acc2 = new Account();

        // Thread 1: Menjumlahkan / transfer fulus dari acc1 ke acc2
        Thread t1 = new Thread(() -> {
            synchronized (acc1) { // Lock Ordering, mengunci acc1 untuk memastikan tidak ada thread lain yang bisa mengakses acc1 sampai thread ini selesai dengan blok ini.
                System.out.println("Thread 1 sedang mengunci acc1 dan bersiap untuk transfer fulus ke acc2");
                try { Thread.sleep(100); } catch (Exception e) {} // Simulasi dengan memberikan jeda. Diperlukan Exception handling untuk menangani InterruptedException yang mungkin terjadi saat menggunakan Thread.sleep().

                synchronized (acc2) { // Lock Ordering, mengunci acc2 setelah acc1 untuk memastikan tidak ada thread lain yang bisa mengakses acc2 sampai thread ini selesai dengan blok ini.
                    System.out.println("Menjumlahkan / transfer fulus dari acc1 ke acc2");
                    acc2.balance += acc1.balance;
                }
            }
        });

        // Thread 2: Menjumlahkan / transfer fulus dari acc2 ke acc1
        Thread t2 = new Thread(() -> {
            // sebelumnya Thread 2 mencoba untuk mengunci acc2 terlebih dahulu, tetapi karena Thread 1 sudah mengunci acc1, maka Thread 2 akan menunggu untuk mengunci acc1. Sementara itu, Thread 1 juga menunggu untuk mengunci acc2 yang sudah dikunci oleh Thread 2. Ini menyebabkan deadlock, di mana kedua thread saling menunggu satu sama lain untuk melepaskan kunci yang mereka pegang.
            synchronized (acc1) { // Lock Ordering, mengunci acc1 untuk memastikan tidak ada thread lain yang bisa mengakses acc1 sampai thread ini selesai dengan blok ini.
                System.out.println("Thread 1 sedang mengunci acc1 dan bersiap untuk transfer fulus ke acc2");
                try { Thread.sleep(100); } catch (Exception e) {}

                synchronized (acc2) { // Lock Ordering, mengunci acc2 setelah acc1 untuk memastikan tidak ada thread lain yang bisa mengakses acc2 sampai thread ini selesai dengan blok ini.
                    System.out.println("Menjumlahkan / transfer fulus dari acc2 ke acc1");
                    acc1.balance += acc2.balance;
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("--- HASIL AKHIR ---");
        System.out.println("Saldo Akhir acc1: " + acc1.balance);
        System.out.println("Saldo Akhir acc2: " + acc2.balance);
    }
}

