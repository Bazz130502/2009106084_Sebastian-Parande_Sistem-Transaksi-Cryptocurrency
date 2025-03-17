import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<CryptoCurrency> cryptoList = new ArrayList<>();
    private static ArrayList<Transaction> transactionList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Crypto Management System ===");
            System.out.println("1. Tambah Crypto");
            System.out.println("2. Lihat Daftar Crypto");
            System.out.println("3. Update Crypto");
            System.out.println("4. Hapus Crypto");
            System.out.println("5. Tambah Transaksi");
            System.out.println("6. Lihat Daftar Transaksi");
            System.out.println("7. Update Transaksi");
            System.out.println("8. Hapus Transaksi");
            System.out.println("9. Keluar");
            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (menu) {
                case 1:
                    tambahCrypto();
                    break;
                case 2:
                    lihatCrypto();
                    break;
                case 3:
                    updateCrypto();
                    break;
                case 4:
                    hapusCrypto();
                    break;
                case 5:
                    tambahTransaksi();
                    break;
                case 6:
                    lihatTransaksi();
                    break;
                case 7:
                    updateTransaksi();
                    break;
                case 8:
                    hapusTransaksi();
                    break;
                case 9:
                    System.out.println("Keluar dari program. Sampai jumpa!");
                    return;
                default:
                    System.out.println("Menu tidak valid. Silakan coba lagi.");
            }
        }
    }

    private static void tambahCrypto() {
        System.out.print("Masukkan ID Crypto: ");
        String id = scanner.nextLine();
        System.out.print("Masukkan Nama Crypto: ");
        String name = scanner.nextLine();
        System.out.print("Masukkan Harga Crypto: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        cryptoList.add(new CryptoCurrency(id, name, price));
        System.out.println("Crypto berhasil ditambahkan.");
    }

    private static void lihatCrypto() {
        if (cryptoList.isEmpty()) {
            System.out.println("Tidak ada data crypto.");
        } else {
            for (CryptoCurrency crypto : cryptoList) {
                System.out.println(crypto);
            }
        }
    }

    private static void updateCrypto() {
        System.out.print("Masukkan ID Crypto yang akan diupdate: ");
        String id = scanner.nextLine();
        for (CryptoCurrency crypto : cryptoList) {
            if (crypto.getId().equals(id)) {
                System.out.print("Masukkan Nama Baru: ");
                crypto.setName(scanner.nextLine());
                System.out.print("Masukkan Harga Baru: ");
                crypto.setPrice(scanner.nextDouble());
                scanner.nextLine(); // consume newline
                System.out.println("Data crypto berhasil diupdate.");
                return;
            }
        }
        System.out.println("Crypto dengan ID tersebut tidak ditemukan.");
    }

    private static void hapusCrypto() {
        System.out.print("Masukkan ID Crypto yang akan dihapus: ");
        String id = scanner.nextLine();
        cryptoList.removeIf(crypto -> crypto.getId().equals(id));
        System.out.println("Crypto berhasil dihapus.");
    }

    private static void tambahTransaksi() {
        System.out.print("Masukkan ID Transaksi: ");
        String transactionId = scanner.nextLine();
        System.out.print("Masukkan ID Crypto: ");
        String cryptoId = scanner.nextLine();
        System.out.print("Masukkan Jumlah: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        System.out.print("Masukkan Jenis Transaksi (Buy/Sell): ");
        String type = scanner.nextLine();
        transactionList.add(new Transaction(transactionId, cryptoId, amount, type));
        System.out.println("Transaksi berhasil ditambahkan.");
    }

    private static void lihatTransaksi() {
        if (transactionList.isEmpty()) {
            System.out.println("Tidak ada data transaksi.");
        } else {
            for (Transaction transaction : transactionList) {
                System.out.println(transaction);
            }
        }
    }

    private static void updateTransaksi() {
        System.out.print("Masukkan ID Transaksi yang akan diupdate: ");
        String transactionId = scanner.nextLine();
        for (Transaction transaction : transactionList) {
            if (transaction.getTransactionId().equals(transactionId)) {
                System.out.print("Masukkan ID Crypto Baru: ");
                transaction.setCryptoId(scanner.nextLine());
                System.out.print("Masukkan Jumlah Baru: ");
                transaction.setAmount(scanner.nextDouble());
                scanner.nextLine(); // consume newline
                System.out.print("Masukkan Jenis Transaksi Baru (Buy/Sell): ");
                transaction.setType(scanner.nextLine());
                System.out.println("Data transaksi berhasil diupdate.");
                return;
            }
        }
        System.out.println("Transaksi dengan ID tersebut tidak ditemukan.");
    }

    private static void hapusTransaksi() {
        System.out.print("Masukkan ID Transaksi yang akan dihapus: ");
        String transactionId = scanner.nextLine();
        transactionList.removeIf(transaction -> transaction.getTransactionId().equals(transactionId));
        System.out.println("Transaksi berhasil dihapus.");
    }
}