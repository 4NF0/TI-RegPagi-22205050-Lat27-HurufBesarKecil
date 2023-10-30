/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan27;
import java.util.Scanner;
/**
 *
 * @author nm
 */
public class Latihan27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kalimat : ");
        String masukkalimat = scanner.nextLine();
        System.out.println("====Hasil Formatting====");

        System.out.println("Huruf Besar: " +masukkalimat.toUpperCase());
        System.out.println("Huruf Kecil: " +masukkalimat.toLowerCase());
    }
    
}
