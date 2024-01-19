public class Balok extends BangunRuang{
    double panjang;
    double lebar;
    double tinggi;

    double luas(){
        double Permukaanluas = 2 * (panjang*lebar+panjang*tinggi+lebar*tinggi);
        System.out.println("Luas Permukaan Balok : "+Permukaanluas);
        return Permukaanluas;
    }

    double volume(){
        double volume = panjang*lebar*tinggi;
        System.out.println("Volume Balok : "+volume);
        return volume;
    }

}
