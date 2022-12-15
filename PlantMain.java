import java.util.Scanner;

public class PlantMain {
    public static void main(String[] args) {
        Plant p = new Plant();
        Anggrek a = new Anggrek();
        Tulip b = new Tulip();
        Raflesia c = new Raflesia();
        Scanner sc = new Scanner(System.in);
        int inp = 0;
        int pilih;
        do{
            System.out.println("Masukkan: 0 untuk memberi air, 1 untuk memberi pupuk, 999 untuk keluar");
            inp = sc.nextInt();
            switch(inp){
                case 0: p.beriAir();
                        break;
                case 1: p.beriPupuk();
                        break;
            }
            p.displayTumbuhan();
        }while (inp!=3);
    }
}
