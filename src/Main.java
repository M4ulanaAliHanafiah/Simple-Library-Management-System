import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int menu;

        do{
            // Menampilkan Menu
            System.out.println("Simple Management Library System");
            System.out.println("+------------------------------+");
            System.out.println("|       Tampilkan Menu         |\n" +
                            "|       1. Buku                |\n" +
                            "|       2. Anggota             |\n" +
                            "|       3. Peminjaman          |\n" +
                            "|       4. Keluar              |\n" +
                            "+------------------------------+\n");
            
            // Input Menu
            System.out.println("+------------------------------+");
            System.out.println("|     Pilih Menu (1/2/3/4)     |");
            System.out.print("Menu yang dipilih : ");
            menu = input.nextInt();

            // Memilih Menu
            switch(menu) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Terima kasih. Program selesai.");   
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while(menu != 4);
        

        input.close();
        
    }
}
