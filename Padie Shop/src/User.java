public class User {
    String nama;
    String Email;
    String Password;

    void PrintAcc() {
        System.out.println("=====Selamat akun mu sudah terdaftar=====");
        System.out.println("=====        Silahkan Login         =====");
        System.out.printf("Nama saya adalah %s\n", nama);
        System.out.printf("Email saya adalah %s\n", Email);
        System.out.printf("Password saya adalah %s", Password);
    }
}
