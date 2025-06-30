import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

class Program {
private static Scanner input = new Scanner(System.in);

/**
 * Main method: Entry point of the program
 */
public static void main(String[] args) throws IOException {

    // Variable declarations for user data and counters
    String[] npm = new String[300];
    String[] nama = new String[300];
    String[] pw = new String[300];
    String[] ryty = new String[300];
    String setia, namaa, pww, npmm, rytyy, penampung, berlangganan;
    int inputan, kenpm, kenama, kepw, keryty;
    int a, b, c, d, h, i, s;
    double jumlahAccount;

    a = 0;
    b = 0;
    c = 0;
    s = 0;

    BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
    // Start menu display
    System.out.println("=========================");
    System.out.println("Selamat Datang di Em-Food");
    System.out.println("=========================\n");
    System.out.println("Halo! Apa Kabar ?");
    System.out.println("Ini adalah menu awal Aplikasi Em-Food");
    System.out.println("Silakan pilih akses masuk anda^^");
    System.out.println("\n1. Sign up ");
    System.out.println("2. Log In");
    System.out.print("Masukkan pilihan anda : ");
    inputan = input.nextInt();
    // Validate menu input
    while (inputan != 1 && inputan != 2) {
        System.out.println("\nMaaf menu tidak tersedia");
        System.out.println("Silakan pilih kembali");
        System.out.println("1. Sign up ");
        System.out.println("2. Log In");
        System.out.print("Masukkan pilihan anda : ");
        inputan = input.nextInt();
    }
do{
    // Sign Up menu
    if (inputan == 1) {
        // Read existing names from file
        kenama = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("Nama.txt"));
            for (i = 0; i < 300; i++) {
                nama[i] = br.readLine();
                if (nama[i] != null) {
                    kenama = kenama + 1;
                } else {
                    br.close();
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("file tidak ditemukan");
        } catch (IOException e) {
            System.out.println("ada error");
        }

        // Write new name to file
        try {
            File f = new File("Nama.txt");
            PrintWriter Print = new PrintWriter(f);
            System.out.println("\nMENU SIGH UP");
            System.out.println("======================================");
            System.out.print("Masukkan nama anda : ");
            namaa = scanner.readLine();
            // Check if name already exists
            do {
                for (i = 0; i <= kenama - 1; i++) {
                    if (namaa.equals(nama[i])) {
                        System.out.println("Whoops! Nama anda sudah terdaftar, Silahkan masukkan ulang nama anda^^");
                        System.out.print("Masukkan kembali nama anda : ");
                        namaa = scanner.readLine();
                        i = 301;
                        a = 12;
                    } else {
                        a = 1;
                    }
                }
            } while (a == 12);
            // Save name to array and file
            nama[kenama] = namaa;
            for (i = 0; i <= kenama; i++) {
                Print.println(nama[i]);
                if (nama[i] == namaa) {
                    Print.close();
                }
            }
        } catch (IOException e) {
            System.out.println("ada error");
        }

        // Read existing NPM from file
        kenpm = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("NPM.txt"));
            for (i = 0; i < 300; i++) {
                npm[i] = br.readLine();
                if (npm[i] != null) {
                    kenpm = kenpm + 1;
                } else {
                    br.close();
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("file tidak ditemukan");
        } catch (IOException e) {
            System.out.println("ada error");
        }

        // Write new NPM to file
        try {
            File f = new File("NPM.txt");
            PrintWriter Print = new PrintWriter(f);
            System.out.print("Masukkan NPM anda : ");
            npmm = scanner.readLine();
            // Validate NPM input
            do {
                for (i = 0; i <= kenpm - 1; i++) {
                    if (npmm.equals(npm[i])) {
                        System.out.println("Whoops! NPM sudah terpakai nih. Ganti ya!");
                        npmm = scanner.readLine();
                        i = 301;
                        a = 12;
            } else if (!npmm.matches("[0-9]+")) {
                System.out.println("Hayo NPM cuma angka loh ya! Cek lagi kayanya ada typo tuh!");
                npmm = scanner.readLine();
                i = 301;
                a = 12;
            } else if (npmm.length() != 11) {
                System.out.println("Sayangnya NPM cuma sampe 11 nih. Masukkan ulang NPM!");
                npmm = scanner.readLine();
                i = 301;
                a = 12;
            } else {
                        a = 1;
                    }
                }
            } while (a == 12);
            // Save NPM to array and file
            npm[kenpm] = npmm;
            for (i = 0; i <= kenpm; i++) {
                Print.println(npm[i]);
                if (npm[i] == npmm) {
                    Print.close();
                }
            }
        } catch (IOException e) {
            System.out.println("ada error");
        }

        // Read existing passwords from file
        kepw = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("Password.txt"));
            for (i = 0; i < 300; i++) {
                pw[i] = br.readLine();
                if (pw[i] != null) {
                    kepw = kepw + 1;
                } else {
                    br.close();
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("file tidak ditemukan");
        } catch (IOException e) {
            System.out.println("ada error");
        }

        // Write new password to file
        try {
            File f = new File("Password.txt");
            PrintWriter Print = new PrintWriter(f);
            System.out.print("Masukkan password anda (minimal 5) : ");
            pww = scanner.readLine();
            // Validate password length
            do {
                for (i = 0; i <= kepw - 1; i++) {
                    if (pww.length() <= 5) {
                        System.out.println("MINIMAL 5 KARAKTER YA <33");
                        pww = scanner.readLine();
                        i = 301;
                        a = 12;
                    } else {
                        a = 1;
                    }
                }
            } while (a == 12);
            // Save password to array and file
            pw[kepw] = pww;
            for (i = 0; i <= kepw; i++) {
                Print.println(pw[i]);
                if (pw[i] == pww) {
                    Print.close();
                }
            }
        } catch (IOException e) {
            System.out.println("ada error");
        }
        System.out.println("======================================");

        // Membership offer
        setia = "";
        penampung = royalty(setia);
        berlangganan = penampung;

        // Read existing royalty from file
        keryty = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("Royalty.txt"));
            for (i = 0; i < 300; i++) {
                ryty[i] = br.readLine();
                if (ryty[i] != null) {
                    keryty = keryty + 1;
                } else {
                    br.close();
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("file tidak ditemukan");
        } catch (IOException e) {
            System.out.println("ada error");
        }

        // Write new royalty to file
        try {
            File f = new File("Royalty.txt");
            PrintWriter Print = new PrintWriter(f);
            rytyy = berlangganan;
            // Save royalty to array and file
            ryty[keryty] = rytyy;
            for (i = 0; i <= keryty; i++) {
                Print.println(ryty[i]);
                if (ryty[i] == rytyy) {
                    Print.close();
                }
            }
        } catch (IOException e) {
            System.out.println("ada error");
        }

        // Check account data consistency
        jumlahAccount = kenama + kenpm + kepw + keryty;
        if (jumlahAccount % 4 == 0) {
            jumlahAccount = (int) ((double) (kenama + kenpm + kepw + keryty) / 4);
        } else {
            System.out.println("Error, benerin dulu");
        }
        // Show account info after sign up
        System.out.println("\nBerikut adalah account anda");
        System.out.println("======================================");
        System.out.println("Nama : " + nama[kenama]);
        System.out.println("NPM : " + npm[kenpm]);
        System.out.println("Akun kamu ada di tingkat " + ryty[keryty]);
        System.out.println("======================================");
        System.out.println("\nLangsung Log In aja ya!");
        inputan = 2;
    }

    // Log In menu
    else {
        if (inputan == 2) {
            // Read names from file for login
            kenama = 0;
            try {
                BufferedReader br = new BufferedReader(new FileReader("Nama.txt"));
                for (i = 0; i < 300; i++) {
                    nama[i] = br.readLine();
                    if (nama[i] != null) {
                        kenama = kenama + 1;
                    } else {
                        br.close();
                        break;
                    }
                }
            } catch (FileNotFoundException e) {
                System.out.println("file tidak ditemukan");
            } catch (IOException e) {
                System.out.println("ada error");
            }

            // Input and check name for login
            try {
                System.out.println("\nMENU LOG IN");
                System.out.println("======================================");
                System.out.print("Masukkan nama anda : ");
                namaa = scanner.readLine();
                // Validate name exists
                a = 12;
                do {
                    for (i = 0; i <= kenama - 1; i++) {

                        if (namaa.equals(nama[i])) {
                            a = 1;
                            s = i;
                        }
                    }
                    if (a == 12) {
                        System.out.println("Whoops! Nama kamu belum terdaftar. ");
                        System.out.print("Masukkan ulang nama kamu yh :");
                        namaa = scanner.readLine();
                        i = 301;
                        a = 12;
                    }
                } while (a == 12);
            } catch (IOException e) {
                System.out.println("ada error");
            }

            // Read NPMs from file for login
            kenpm = 0;
            try {
                BufferedReader br = new BufferedReader(new FileReader("NPM.txt"));
                for (i = 0; i < 300; i++) {
                    npm[i] = br.readLine();
                    if (npm[i] != null) {
                        kenpm = kenpm + 1;
                    } else {
                        br.close();
                        break;
                    }
                }
            } catch (FileNotFoundException e) {
                System.out.println("file tidak ditemukan");
            } catch (IOException e) {
                System.out.println("ada error");
            }

            // Input and check NPM for login
            try {
                System.out.print("Masukkan npm anda : ");
                npmm = scanner.readLine();
                // Validate NPM exists for this user
                a = 12;
                do {
                    for (i = 0; i <= kenpm - 1; i++) {
                        if (npmm.equals(npm[s])) {
                            a = 1;
                        }
                    }
                    if (a == 12) {
                        System.out.println("Whoops! NPM kamu belum terdaftar. ");
                        System.out.println("Masukkan ulang NPM kamu yh :");
                        npmm = scanner.readLine();
                        i = 301;
                        a = 12;
                    }
                } while (a == 12);
            } catch (IOException e) {
                System.out.println("ada error");
            }

            // Read passwords from file for login
            kepw = 0;
            try {
                BufferedReader br = new BufferedReader(new FileReader("Password.txt"));
                for (i = 0; i < 300; i++) {
                    pw[i] = br.readLine();
                    if (pw[i] != null) {
                        kepw = kepw + 1;
                    } else {
                        br.close();
                        break;
                    }
                }
            } catch (FileNotFoundException e) {
                System.out.println("file tidak ditemukan");
            } catch (IOException e) {
                System.out.println("ada error");
            }

            // Input and check password for login
            try {
                System.out.print("Masukkan password anda : ");
                pww = scanner.readLine();
                // Validate password for this user
                a = 12;
                do {
                    for (i = 0; i <= kepw - 1; i++) {
                        if (pww.equals(pw[s])) {
                            a = 1;                        
                        }
                    }
                    if (a == 12) {
                        System.out.println("Whoops!PASSWORD SALAH! :(. ");
                        System.out.print("Masukkan ulang password :");
                        pww = scanner.readLine();
                        i = 301;
                        a = 12;
                    }
                } while (a == 12);
            } catch (IOException e) {
                System.out.println("ada error");
            }
            System.out.println("======================================");

            // Read royalty info for this user
            keryty = 0;
            try {
                BufferedReader br = new BufferedReader(new FileReader("Royalty.txt"));
                for (i = 0; i < 300; i++) {
                    ryty[i] = br.readLine();
                    if (ryty[i] != null) {
                        keryty = keryty + 1;
                    } else {
                        br.close();
                        break;
                    }
                }
            } catch (FileNotFoundException e) {
                System.out.println("file tidak ditemukan");
            } catch (IOException e) {
                System.out.println("ada error");
            }

            // Show account info after login
            rytyy = ryty[s];
            // Check account data consistency
            jumlahAccount = kenama + kenpm + kepw + keryty;
            if (jumlahAccount % 4 == 0) {
                jumlahAccount = (int) ((double) (kenama + kenpm + kepw + keryty) / 4);
            } else {
                System.out.println("Error, benerin dulu");
            }

            // Output account info
            System.out.println("\nAccount yang terbuka");
            System.out.println("======================================");
            System.out.println("Nama : " + nama[s]);
            System.out.println("NPM : " + npm[s]);
            System.out.println("Akun kamu ada di tingkat " + ryty[s]);
            System.out.println("======================================\n");
            inputan = 1;
        }
    }
}
while (inputan == 2);
        // MAIN MENU after login
        do {
            System.out.println("MAIN MENU");
            System.out.println("1. Take ");
            System.out.println("2. Give ");
            System.out.println("3. Info Promo");
            System.out.print("Masukkan pilihan anda : ");
            inputan = input.nextInt();
            // Validate main menu input
            while (inputan != 1 && inputan != 2 && inputan != 3) {
                System.out.println("Menu tidak ada.");
                System.out.print("Masukkan kembali input anda dengan benar : ");
                inputan = input.nextInt();
            }
            // Handle main menu choices
            if (inputan == 1) {
                System.out.println("\n======================================");
                System.out.println("COMING SOON HEHEHEHEHEHE !!! :D");
                System.out.println("======================================\n");
                d = 0;
            } else if (inputan == 2) {
                System.out.println("\n======================================");
                System.out.println("COMING SOON HEHEHEHEHEHE !!! :D");
                System.out.println("======================================\n");
                d = 1;
            } else if (inputan == 3) {
                promo();
                d = 1;
            } else {
                d = 1;
            }

            // Handle take limit based on membership
            while (d == 0) {
                b = b + 1;
                if (ryty[s].equals("Silver")) {
                    h = 1;
                    while (b == 3) {
                        c = 1;
                        b = 0;
                    }
                    d = 2;
                } else if (ryty[s].equals("Gold")) {
                    h = 1;
                    while (b == 6) {
                        c = 1;
                        b = 0;
                    }
                    d = 2;
                } else if (ryty[s].equals("Platinum")) {
                    h = 1;
                    while (b == 10) {
                        c = 1;
                        b = 0;
                    }
                    d = 2;
                } else {
                    System.out.println("Something Wrong");
                }
            }

            // Ask user to return to main menu or exit
            System.out.println("Kembali ke Menu Utama atau keluar dari program?");
            System.out.print("1. Yes\n2. No\nMasukkan pilihan anda : ");
            h = input.nextInt();
            System.out.println("");

        } while (c != 1 && h == 1);

        // If user has reached take limit
        while (c == 1) {
            System.out.println("\n================================================");
            System.out.println(" Maaf :(( dikarenakan kamu adalah member" + ryty[s]);
            System.out.println("    Kamu tidak bisa melanjutkan program ini");
            System.out.println("      karena kesempatan anda sudah habis");
            System.out.println("================================================");
            c = 2;
        }
        System.out.println("\n  HATUR NUHUN [] TERIMA KASIH [] MATUR SUWON\n\n\n");
}

/**
 * Promo information and sorting
 */
static void promo() {
String temp2;     
int i, j, promo, temp1;
promo = 0; 

int[] harga = new int[3];
harga[0] = 12000;
harga[1] = 1000;
harga[2] = 7000;

String[] nama = new String[3];
nama[0] = "Diskon ShpeFood";
nama[1] = "Diskon GrabFood";
nama[2] = "Diskon GoFood";

int[] tanggal = new int[3];
tanggal[0] = 12;
tanggal[1] = 25;
tanggal[2] = 1;

// Show available promos
System.out.println("\nHii Ada promo nih buat kamu yang lagi ngirit ngiritnyaa !!");
System.out.println("======================================");
System.out.println("Promo Yang Tersedia :");
for (i = 0; i <= 2; i++) {
    System.out.println(nama[i] + " dengan potongan harga sampai dengan Rp. "
        + harga[i] + " berlaku sampai " + tanggal[i] + " Februari 2024");
    }
System.out.println("======================================");
System.out.println("\nKamu mau promo apanih");
System.out.println("1. Promo paling murah");
System.out.println("2. Promo paling deket");
System.out.print("Masukkan pilihan kamu : ");
promo = input.nextInt();
// Validate promo menu input
while (promo != 1 && promo != 2) {
    System.out.println("\nEhh.. Engga ada, adanya");
    System.out.println("1. Promo paling murah");
    System.out.println("2. Promo paling deket");
    System.out.print("Masukkan pilihan kamu : ");
    promo = input.nextInt();
}

// Sort and show promo by price
if (promo==1) {
    for (i = 0; i <= 2; i++) {
        for (j = 0; j <= 2 - 1; j++) {
            if (harga[j] > harga[j + 1]) {
                temp1 = harga[j];
                harga[j] = harga[j + 1];
                harga[j + 1] = temp1;
                temp2 = nama[j];
                nama[j] = nama[j + 1];
                nama[j + 1] = temp2;
            }
        }
    }
    System.out.println("\n======================================");
    System.out.println("Potongan Diskon Dari Terendah Ke Terbesar");
    System.out.println("======================================\n");
    System.out.print("Promo Yang Berlaku\t||\tPotongan Diskon\n");
    for (i = 0; i <= 2; i++) {
        System.out.println(nama[i] + "\t\t\tRp. " + harga[i]);
    }
    System.out.println("======================================\n");
    System.out.println("BURUAANNNN SERBUU PROMONYA SEBELUM ADMIN YANG HABISIN PROMONYA");
    System.out.println("Untuk info lainnya, admin masih cari info juga ehe");
    System.out.println("");

// Sort and show promo by nearest date
} else if (promo == 2) {
    for (i = 0; i <= 2; i++) {
        for (j = 0; j <= 2 - 1; j++) {
            if (tanggal[j] > tanggal[j + 1]) {
                temp1 = tanggal[j];
                tanggal[j] = tanggal[j + 1];
                tanggal[j + 1] = temp1;
                temp2 = nama[j];
                nama[j] = nama[j + 1];
                nama[j + 1] = temp2;
            }
        }
    }
    System.out.println("\n======================================");
    System.out.println("Potongan Diskon Dari Masa Aktif Paling Dekat");
    System.out.println("======================================\n");
    System.out.println("Promo Yang Berlaku\t||\tTanggal diskon paling dekat");
    for (i = 0; i <= 2; i++) {
        System.out.println(nama[i] + "\t\t\ttanggal " + tanggal[i] + " Februari 2024");
    }
    System.out.println("======================================\n");
    System.out.println("BURUAANNNN SERBUU PROMONYA SEBELUM ADMIN YANG HABISIN PROMONYA");
    System.out.println("Untuk info lainnya, admin masih cari info juga ehe");
    System.out.println("");
}

    else { System.out.println("bye"); }
}

/**
 * Membership offer and upgrade logic
 */
public static String royalty(String setia) {
String upgrade, upgradeMemb, pembayaran, platinum;

// Show membership options
System.out.println("=====================");
System.out.println("PENAWARAN MEMBERSHIP");
System.out.println("=====================\n");
System.out.println("1. Silver Membership - 3 Take per bulan - Free");
System.out.println("2. Gold Membership - 6 Take perbulan - Rp. 15.000");
System.out.println("3. Platinum Membership - 10 Take perbulan - Rp. 30.000");
System.out.println("\n=====================");
System.out.println("Akan semakin banyak keuntungan dengan membership.");
System.out.println("Ayok Upgrade membership mu!\n");

// Ask user if they want to upgrade
do {
    System.out.println("Apakah anda ingin mengupgrade membership?");
    System.out.print("1.Iya deh 2.Ga dulu : ");
    upgrade = input.nextLine();
    upgrade = input.nextLine();
    
    if (upgrade.equals("1")) {
        // Choose membership to upgrade
        do {
            System.out.println("\nYaayyyy mau upgrade ke membeship apa mniez?");
            System.out.println("1.Gold ");
            System.out.println("2.Platinum ");
            System.out.print("Masukkan pilihanmu : ");
            upgradeMemb = input.nextLine();
            if (upgradeMemb.equals("1")) {
                System.out.println("Pilihan yang bagus!\n");
                // Payment for Gold
                do {
                    System.out.println("Silahkan pilih pembayaran!");
                    System.out.println("1. Gopay ");
                    System.out.println("2. Dana");
                    System.out.print("Masukkan pilihanmu : ");
                    pembayaran = input.nextLine();
                    if (pembayaran.equals("1")) {
                        System.out.println("\n======================================");
                        System.out.println("Silahkan membayar sebanyak Rp. 15.000");
                        System.out.println("exclude pajak menggunakan Gopay");
                        System.out.println("======================================");
                        System.out.println("\n. . . .\n");
                        System.out.println("======================================");
                        System.out.println("Pembayaran berhasil!!");
                        System.out.println("Selamat anda sudah ter-upgrade menjadi member Gold!!");
                        System.out.println("======================================\n");
                        setia = "Gold";
                    } else if (pembayaran.equals("2")) {
                        System.out.println("\n======================================");
                        System.out.println("Silahkan membayar sebanyak Rp. 15.000");
                        System.out.println("exclude pajak menggunakan Dana");
                        System.out.println("======================================");
                        System.out.println("\n. . . .\n");
                        System.out.println("======================================");
                        System.out.println("Pembayaran berhasil!!");
                        System.out.println("Selamat anda sudah ter-upgrade menjadi member Gold!!");
                        System.out.println("======================================\n");
                        setia = "Gold";
                    } else {
                        System.out.println("Waw anda terlihat sangat antusias!");
                        System.out.println("Sayangnya kami belum menyiadakan pembayaran tersebut.");
                        System.out.println("Silahkan pilih ulang");
                    }
                } while (pembayaran.compareTo("2") > 0 || pembayaran.compareTo("1") < 0);

                // Offer upgrade to Platinum
                System.out.println("\nMasih ada satu member lagi diatas Gold.");
                System.out.println("Apakah anda ingin mengupgrade menjadi member Platinum?");
                System.out.println("Akan ada penawaran lebih banyak lagi lohhhh!");
                System.out.println("Platinum Membership - 10 Take perbulan - Rp. 30.000");
                System.out.println("Khusus untuk anda HANYA MENAMBAH 5000 RUPIAH!!\n");
                do {
                    System.out.println("Apakah anda ingin mengupgrade ke platinum?");
                    System.out.println("1. Upgrade lahh gasss");
                    System.out.println("2. Ga dulu deh");
                    System.out.print(" Masukkan pilihan mu : ");
                    platinum = input.nextLine();
                    if (platinum.equals("1")) {
                        // Payment for Platinum
                        do {
                            System.out.println("Silahkan pilih pembayaran!");
                            System.out.println("1. Gopay");
                            System.out.println("2. Dana");
                            System.out.print("Masukkan pilihan anda : ");
                            pembayaran = input.nextLine();
                            if (pembayaran.equals("1")) {
                                System.out.println("\n======================================");
                                System.out.println("Silahkan membayar sebanyak Rp. 30.000");
                                System.out.println("exclude pajak menggunakan Gopay");
                                System.out.println("======================================");
                                System.out.println("\n. . . .\n");
                                System.out.println("======================================");
                                System.out.println("Pembayaran berhasil!!");
                                System.out.println("Selamat anda sudah ter-upgrade menjadi member Platinum!!");
                                System.out.println("======================================\n");
                                setia = "Platinum";
                            }
                            else if (pembayaran.equals("2")) {
                                System.out.println("\n======================================");
                                System.out.println("Silahkan membayar sebanyak Rp. 30.000");
                                System.out.println("exclude pajak menggunakan Dana");
                                System.out.println("======================================");
                                System.out.println("\n. . . .\n");
                                System.out.println("======================================");
                                System.out.println("Pembayaran berhasil!!");
                                System.out.println("Selamat anda sudah ter-upgrade menjadi member Platinum!!");
                                System.out.println("======================================\n");
                                setia = "Platinum";
                            }
                            else {
                                System.out.println("Waw anda terlihat sangat antusias!");
                                System.out.println("Sayangnya kami belum menyiadakan pembayaran tersebut.");
                                System.out.println("Silahkan pilih ulang");
                            }
                        } while (pembayaran.compareTo("2") > 0 || pembayaran.compareTo("1") < 0);
                    }
                    else if (platinum.equals("2")) {
                        System.out.println("\nYahh sayang sekali");
                        System.out.println("Terimakasih sudah mengikuti membership!!");
                        setia = "Gold";
                    } else {
                        System.out.println("\nTidak ada pilihan itu, silahkan memilih ulang");
                    }
                } while (platinum.compareTo("2") > 0 || platinum.compareTo("1") < 0);
            }
            else if (upgradeMemb.equals("2")) {
                System.out.println("\nPilihan yang bagus!\n");
                // Payment for Platinum
                do {
                    System.out.println("Silahkan pilih pembayaran!");
                    System.out.println("1. Gopay");
                    System.out.println("2. Dana");
                    System.out.print("Masukkan pilihan anda : ");
                    pembayaran = input.nextLine();
                    if (pembayaran.equals("1")) {
                        System.out.println("\n======================================");
                        System.out.println("Silahkan membayar sebanyak Rp. 30.000");
                        System.out.println("exclude pajak menggunakan Gopay");
                        System.out.println("======================================");
                        System.out.println("\n. . . .\n");
                        System.out.println("======================================");
                        System.out.println("Pembayaran berhasil!!");
                        System.out.println("Selamat anda sudah ter-upgrade menjadi member Platinum!!");
                        System.out.println("======================================");
                        setia = "Platinum";
                    }
                    else if (pembayaran.equals("2")) {
                        System.out.println("\n======================================");
                        System.out.println("Silahkan membayar sebanyak Rp. 30.000");
                        System.out.println("exclude pajak menggunakan Dana");
                        System.out.println("======================================");
                        System.out.println("\n. . . .\n");
                        System.out.println("======================================");
                        System.out.println("Pembayaran berhasil!!");
                        System.out.println("Selamat anda sudah ter-upgrade menjadi member Platinum!!");
                        System.out.println("======================================\n");
                        setia = "Platinum";
                    }
                    else {
                        System.out.println("\nWaw anda terlihat sangat antusias!");
                        System.out.println("Sayangnya kami belum menyiadakan pembayaran tersebut.");
                        System.out.println("Silahkan pilih ulang");
                        }
                } while (pembayaran.compareTo("2") > 0 || pembayaran.compareTo("1") < 0);
            } else {
                System.out.println("\nSepertinya anda terlalu bersemangat !");
                System.out.println("Sayangnya membership itu belum ada untuk sekarang.");
                System.out.println("Silahkan memilih ulang");
            }    
        } while (upgradeMemb.compareTo("2") > 0 || upgradeMemb.compareTo("1") < 0);
} else if (upgrade.equals("2")) {
    // User chooses not to upgrade
    System.out.println("\nAkan ada banyak penawaran menarik dengan membership!!");
    System.out.println("Kami menunggu anda menjadi salah satu dari anggota kami!");
    setia = "Silver";
}
else {
    System.out.println("\nPilihannya tidak ada mniez, silahkan memilih ulang yak");
    }
} while (upgrade.compareTo("2") > 0 || upgrade.compareTo("1") < 0);
System.out.println("\n=================================");
System.out.println("I Hope you enjoy our application!");
System.out.println("=================================\n");

return setia;
}
}