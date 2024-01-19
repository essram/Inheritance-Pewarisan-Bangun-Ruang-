import java.util.*;
public class Main {
    public static void main(String[] args) {
    
        
    //membuat objek bangum ruang
    BangunRuang bangunRuang = new BangunRuang();

    //membuat objek balok
    Balok balok = new Balok();
    Scanner input = new Scanner(System.in);
    System.out.print("Masukan panjang Balok : ");
    balok.panjang = input.nextDouble();
    System.out.print("Masukan lebar Balok : ");
    balok.lebar = input.nextDouble();
    System.out.print("Masukan tinggi Balok : ");
    balok.tinggi = input.nextDouble();

    //membuat objek limas segitiga
    LimasSegitiga limasSegitiga = new LimasSegitiga();
    System.out.print("Masukan Luas Alas LimasSegitiga : ");
    limasSegitiga.luasAlas = input.nextDouble();
    System.out.print("Masukkan Tinggi LimasSegitiga : ");
    limasSegitiga.tLimas = input.nextDouble();
    System.out.print("Masukkan Luas Sisi Tegak LimasSegitiga : ");
    limasSegitiga.luasSisiTegak = input.nextDouble();

    // limasSegitiga.tSegitiga = 15.0;
    // limasSegitiga.tLimas = 12.0;
    // limasSegitiga.luasSisiTegak = 12.0;
    // tinggiLimas
    // luasSisiTegak

    //membuat objek tabung
    Tabung tabung = new Tabung();
    System.out.print("Masukkan Selimut Tabung : ");
    tabung.selimutTabung = input.nextDouble();
    System.out.print("Masukkan Alas Tabung : ");
    tabung.alasTabung = input.nextDouble();
    System.out.print("Masukkan Tutup Tabung : ");
    tabung.tutupTabung = input.nextDouble();
    // tabung.selimutTabung = 10.0;
    // tabung.alasTabung = 10.0;
    // tabung.tutupTabung = 10;

    //membuat objek bola
    Bola bola = new Bola();
    System.out.print("Masukkan Jari Jari Bola : ");
    bola.r = input.nextDouble();
    // bola.r = 7;

    // //memanggil method luas dan keliling

    bola.volume();
    bola.luasPermukaan();

    tabung.volume();
    tabung.luasPermukaan();

    balok.volume();
    balok.luas();

    limasSegitiga.volume();
    limasSegitiga.luasPermukaan();

    }
}
