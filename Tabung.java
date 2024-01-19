public class Tabung extends BangunRuang {
    double r, t;
    double tinggi;
    double selimutTabung;
    double alasTabung;
    double tutupTabung;


    double luasPermukaan(){
        double luasPermukaan = selimutTabung + alasTabung + tutupTabung;
        System.out.println("Luas Permukaan Tabung : "+luasPermukaan);
        return luasPermukaan;
    }

    double volume(){
        double volume = Math.PI * r * r * r * t;
        System.out.println("Volume Tabung : "+volume);
        return volume;
    } 
}
