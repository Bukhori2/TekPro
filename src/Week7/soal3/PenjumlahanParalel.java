package Week7.soal3;

import java.util.Scanner;

class SumTask extends Thread {
    private int start, end;
    private long partialSum;

    public SumTask(int start, int end, String name) {
        super(name);
        this.start = start;
        this.end = end;
    }

    public void run() {
        partialSum = 0;
        System.out.println(getName() + " menghitung dari " + start + " sampai " + end);

        for (int i = start; i <= end; i++) {
            partialSum += i;
        }

        System.out.println(getName() + " hasil parsial: " + partialSum);
    }

    public long getPartialSum() {
        return partialSum;
    }
}

public class PenjumlahanParalel {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah thread: ");
        int jumlahThread = sc.nextInt();

        System.out.print("Masukkan angka akhir: ");
        int angkaAkhir = sc.nextInt();

        SumTask[] threads = new SumTask[jumlahThread];

        int range = angkaAkhir / jumlahThread;
        int start = 1;

        // Membagi tugas ke setiap thread
        for (int i = 0; i < jumlahThread; i++) {
            int end = (i == jumlahThread - 1) ? angkaAkhir : start + range - 1;

            threads[i] = new SumTask(start, end, "Thread-" + (i + 1));
            threads[i].start();

            start = end + 1;
        }

        long totalSum = 0;

        // Menunggu semua thread selesai
        for (int i = 0; i < jumlahThread; i++) {
            threads[i].join();
            totalSum += threads[i].getPartialSum();
        }

        System.out.println("\n HASIL AKHIR: ");
        System.out.println("Total penjumlahan: " + totalSum);
    }
}
