import java.util.ArrayList;
import java.util.Iterator;

// Interface untuk operasi dasar
interface Operation<T> {
    void add(T item);
    void remove(String code);
    void edit(String code, T newItem);
    void display();
}

// Kelas POJO untuk ATK
class ATK {
    private String code;
    private String jenis;
    private String nama;
    private int stok;

    public ATK(String code, String jenis, String nama, int stok) {
        this.code = code;
        this.jenis = jenis;
        this.nama = nama;
        this.stok = stok;
    }

    @Override
    public String toString() {
        return "Kode: " + code + ", Jenis: " + jenis + ", Nama: " + nama + ", Stok: " + stok;
    }

    // Getters and Setters
    // ...
}

// Kelas POJO untuk Bag
class Bag {
    private String code;
    private String jenis;
    private String nama;
    private int stok;

    public Bag(String code, String jenis, String nama, int stok) {
        this.code = code;
        this.jenis = jenis;
        this.nama = nama;
        this.stok = stok;
    }

    @Override
    public String toString() {
        return "Kode: " + code + ", Jenis: " + jenis + ", Nama: " + nama + ", Stok: " + stok;
    }

    // Getters and Setters
    // ...
}

// Kelas generik untuk mengelola data
class Inventory<T> implements Operation<T> {
    private ArrayList<T> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    @Override
    public void add(T item) {
        items.add(item);
    }

    @Override
    public void remove(String code) {
        Iterator<T> iterator = items.iterator();
        while (iterator.hasNext()) {
            T item = iterator.next();
            // Hapus item dengan kode tertentu
            // Implementasi bergantung pada struktur kode yang digunakan
        }
    }

    @Override
    public void edit(String code, T newItem) {
        // Temukan item dengan kode tertentu dan ubah dengan newItem
        // Implementasi bergantung pada struktur kode yang digunakan
    }

    @Override
    public void display() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}

public class main {
    public static void main(String[] args) {
        // Pengelolaan ATK
        Inventory<ATK> atkInventory = new Inventory<>();
        atkInventory.add(new ATK("A001", "Pulpen", "Snowman Board Marker", 100));
        atkInventory.add(new ATK("A002", "Pensil", "Faber Castell 2B", 50));
        // Tambahkan data lainnya

        // Pengelolaan Bag
        Inventory<Bag> bagInventory = new Inventory<>();
        bagInventory.add(new Bag("C001", "Tempat Pensil", "Kotak Pensil Plastik", 30));
        bagInventory.add(new Bag("C002", "Tas", "Tas Sekolah Anak", 20));
        // Tambahkan data lainnya

        // Tampilkan data ATK
        System.out.println("Data ATK:");
        atkInventory.display();

        // Tampilkan data Bag
        System.out.println("\nData Bag:");
        bagInventory.display();
    }
}