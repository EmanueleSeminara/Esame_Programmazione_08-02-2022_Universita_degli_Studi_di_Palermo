import java.util.Scanner;

public class MacchinaCaffe extends Elettrodomestico implements Pulizia{
    private int ID;
    private String modello;
    private String tipologia;

    public MacchinaCaffe(){
        setID(0);
        setModello("Default");
        setTipologia("cialde");
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public void setModello(String modello){
        this.modello = modello;
    }

    public void setTipologia(String tipologia){
        if(tipologia.equals("cialde") || tipologia.equals("capsule")){
            this.tipologia = tipologia;
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    @Override
    public int getID(){
        return this.ID;
    }

    public String getModello(){
        return this.modello;
    }

    public String getTipologia(){
        return this.tipologia;
    }

    public void setValues(int ID, String modello, String tipologia){
        setID(ID);
        setModello(modello);
        setTipologia(tipologia);
    }

    @Override
    public void pulisci(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero di erogazioni a vuoto: ");
        sc.nextInt();
    }
}