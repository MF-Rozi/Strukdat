package Kampus;

public class Persegi {
    double sisi;
   public Persegi(int sisi){
        this.sisi = sisi;
    }
    public double luas(){
        return sisi*sisi;
    }
    public double keliling(){
        return 4*sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
}
