public class Bola extends BangunRuang {

    double r;

    
    double luasPermukaan(){
        double permukaan = 4 * Math.PI * r * r ;
        System.out.println("Luas Permukaan : "+ permukaan);
        return permukaan;
    }

    double volume(){
        double volume = 4/3 * Math.PI * r * r * r;
        System.out.println("Luas Permukaan Bola :");
        return volume;
    }

}
