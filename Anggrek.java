public class Anggrek extends Plant{
    private final String jenis;
    
    public Anggrek(){
        super();
        jenis = "Anggrek";
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
