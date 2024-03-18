import java.util.Scanner;

public class Kubus extends BangunRuang{
    Scanner scanner = new Scanner(System.in);
    private double sisi;

    Kubus(String nameBangun) {
        super(nameBangun);
    }// menambahkan keyword super sesuai yang di modul

    public void inputnilai(){
        super.inputNilai();
        System.out.print("Input sisi: ");// menambahkam sout karna sebelumnya cman System.o
        sisi = scanner.nextDouble();// sebelumnya Nextnext dignti jadi NextDouble
    }

    public void luasPermukaan(){
        double hasil = 6 * sisi * sisi;
        super.luasPermukaan();//sebelumnya luasaan diganti jadi luaspermukaan
        System.out.println("Hasil luas permukaan: " + hasil);//kurang system sebelumnya out.printlin saja
    }

    public void volume(){
        double hasil = Math.pow(sisi, 3);
        super.volume();
        System.out.println("Hasil volume: " + hasil);
    }
}