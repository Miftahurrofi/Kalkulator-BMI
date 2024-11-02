
package BMICalculator;
import java.util.Scanner;
public class KalkulatorBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int JenisKelamin, hasil;
        float berat, tinggi, bmi, meter;
        double broca;
        System.out.println("Kalkulator Penghitung Berat Badan Ideal");
        System.out.println("1. Laki-laki");
        System.out.println("2. Perempuan");
        System.out.print("Masukkan Jenis Kelamin :");
        JenisKelamin = input.nextInt();
        System.out.println("Masukkan Berat Badan :");
        berat = input.nextInt();
        System.out.println("Masukkan Tinggi Badan :");
        tinggi = input.nextInt();
        meter = tinggi / 100;
        bmi = (berat / (meter * meter));
        System.out.println("BMI :" + bmi + " "); 
        if (bmi < 18.5){
        System.out.println("Kurus");
    }
        else if (bmi <= 22.9){
            System.out.println("Normal");
        }
        else if (bmi < 24.9){
            System.out.println("Gemuk");
        }
        else {
            System.out.println("Obesitas");
        }
        
        broca = switch (JenisKelamin) {
            case 1 -> (tinggi - 100)-(0.10 * (tinggi - 100));
            case 2 -> (tinggi - 100)-(0.15 * (tinggi - 100));
            default -> 0;
        };
        hasil = (int)broca;
        System.out.println("Berat Badan Anda Menurut Broca :" + hasil + "kg");
    }
}
