import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
       class Barang {
    int id;
    String nama;
    int harga;
    int diskon;

    Barang(int id, String nama, int harga) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.diskon = diskon;
    }
}
    public static int hitung(int totalBelanja) {
        if (totalBelanja < 50000) {
            return 0;
        } else if (totalBelanja >= 50000 && totalBelanja <= 100000) {
            return (int) (totalBelanja * 0.05);
        } else {
            return (int) (totalBelanja * 0.10);
    }
}
    
    public static void main(String[] args) {
        int[] hargaMenu = {35000, 45000, 20000, 15000};
        String[] namaMenu = {"Burger", "Steak", "Spageti", "Kentang"};
        ArrayList<Barang> daftarMenu = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        

        // Menambahkan barang ke daftar
        daftarMenu.add(new Barang(1, "Burger", 35000));
        daftarMenu.add(new Barang(2, "Steak", 45000));
        daftarMenu.add(new Barang(3, "Spageti", 20000));
        daftarMenu.add(new Barang(4, "Kentang", 15000));

        while (true) {
            System.out.println("Menu Kasir");
            System.out.println("1. Lihat daftar makanan dan minuman");
            System.out.println("2. Memesan makanan dan minuman");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Daftar Makanan:");
                    for (Barang produk : daftarMenu) {
                        System.out.println("ID: " + produk.id + ", Nama: " + produk.nama + ", Harga: Rp" + produk.harga);
                    }
                    break;

                case 2:
                    ArrayList<Barang> pesanan = new ArrayList<>();
                    int totalHarga = 0;

                    while (true) {
                        System.out.print("Masukkan ID produk (0 untuk selesai): ");
                        int idProduk = scanner.nextInt();

                        if (idProduk == 0) {
                            break;
                        }

                        Barang produk = null;
                        for (Barang p : daftarMenu) {
                            if (p.id == idProduk) {
                                produk = p;
                                break;
                            }
                        }

                        if (produk != null) {
                            System.out.print("Masukkan jumlah porsi: ");
                            int jumlahPorsi = scanner.nextInt();
                            pesanan.add(produk);
                            totalHarga += produk.harga * jumlahPorsi;
                        } else {
                            System.out.println("Produk tidak ditemukan!");
                        }

                    }

                    System.out.println("Pesanan Anda");
                    for (Barang p : pesanan) {
                        System.out.println("Nama: " + p.nama + ", Harga: Rp" + p.harga);
                    }
                    System.out.println("Total Harga: Rp" + totalHarga);

                    System.out.print("Masukkan uang pembayaran: Rp");
                    int uangPembayaran = scanner.nextInt();
                    int kembalian = uangPembayaran - totalHarga;
                    System.out.println("Kembalian: Rp" + kembalian);
                
                break;
            }
        }
        System.out.println(Nomor2.class.getDeclaredMethods().length); 
    }
}
