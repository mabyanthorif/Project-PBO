
package kebunku;

public class Lily extends Plant {
    private final String jenis;

    public Lily(){
        super();
        jenis = "Lily";
    }

    @Override
    public void cekKondisiTumbuh(){
        if(getJumlahAir() >=3 && getJumlahPupuk() >=1){
            tumbuh();
        }
    }

    @Override
    public void tumbuh(){
        if(getStatusTumbuh() <4){
            setJumlahAir(getJumlahAir() - 2);
            setJumlahPupuk(getJumlahPupuk() -2);
            setStatusTumbuh(getStatusTumbuh() +1);
        }
    }

    public String getJenis(){
        return jenis;
    }
}