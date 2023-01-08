/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kebunku;

import java.util.Scanner;
public class Plantmain {
    public static int main(String[] args){
        Plant p = new Plant();
        Dahlia a = new Dahlia();
        Lily b = new Lily();
        Krisan c = new Krisan();

        Scanner sc = new Scanner(System.in);
        int inp = 0;
        do{
            System.out.println("Masukkan: 0 untuk memberi air, 1 untuk memberi pupuk, 3 untuk keluar");
            inp = sc.nextInt();
            switch(inp){
                case 0: p.beriAir();
                        break;
                case 1: p.beriPupuk();
                        break;
            }
            p.displayPlant();
        }while (inp!=3);
        return 0;
    }
}
