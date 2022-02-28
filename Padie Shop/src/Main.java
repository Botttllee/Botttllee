import java.util.Scanner;

public class Main {

 public static void main(String[] args){
     Product menu = new Product();
     User account = new User();
    // User Guest   = new User();
     Scanner scan = new Scanner(System.in);

     int opsi , opsi2 = 0;

     System.out.println("=====Selamat datang di Padie Shop=====");
     System.out.println("1. Login");
     System.out.println("2. Register");
     System.out.println("3. Guest mode");
     System.out.println("4. Exit");
     opsi = scan.nextInt();

     switch (opsi){
         case 1:
             System.out.println("Email :");
             System.out.println("Password :");

         case 2:
             System.out.println("Masukan nama/username");
             account.nama = scan.next();
             System.out.println("Masukan email :");
             account.Email = scan.next();
             System.out.println("Masukan Password :");
             account.Password = scan.next();
             account.PrintAcc();
             break;
         case 3:
             System.out.println("=====Welcome to guest mode=====");
             System.out.println("=====Silahkan datang di menu utama=====");
             System.out.println("1. Bahan makanan");
             System.out.println("2. Minuman");
             System.out.println("3. Snack");
             opsi2 = scan.nextInt();
             switch (opsi2){
                 case 1:
                     menu.Menu_Bahan_makanan();
                     break;
                 case 2:
                     menu.Menu_Minuman();
                     break;
                 case 3:
                     menu.Menu_Snack();
                     break;
             }
         case 4:
             break;
         }
    }
 }
