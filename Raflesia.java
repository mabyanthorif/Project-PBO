public class Raflesia extends Plant {
    private final String jenis;
    
    public Raflesia(){
        super();
        jenis = "Raflesia";
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
            setJumlahAir(getJumlahAir() - 3);
            setJumlahPupuk(getJumlahPupuk() -1);
            setStatusTumbuh(getStatusTumbuh() +1);
        }
    }
    
    public String getJenis(){
        return jenis;
    }
}
