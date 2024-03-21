import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Queuel<String> queue = new Queuel<>();
        Scanner sc = new Scanner(System.in);
        boolean lanjut = true;
        while (lanjut) {
            System.out.println("1. tambah data");
            System.out.println("2. print data");
            System.out.println("3. hapus data");
            System.out.println("4. print whole data");
            System.out.println("5. done");
            int pilih = sc.nextInt();
            String skip = sc.nextLine();
            switch (pilih) {
                case 1:
                    String tambah = sc.nextLine();
                    queue.queued(tambah);
                    break;
                case 2:
                    System.out.println("Target : " + queue.peek());
                    break;
                case 3:
                    queue.unqueue();
                    break;
                case 4:
                    queue.printAll();
                    break;
                case 5:
                    lanjut = false;
                    break;
                default:
                    System.out.println("salah input");
                    break;
            }
        }

        sc.close();
    }
}