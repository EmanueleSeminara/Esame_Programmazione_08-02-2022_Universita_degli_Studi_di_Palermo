import java.util.Scanner;

public class Forno extends Elettrodomestico implements Pulizia{
    private int ID;
    private String modello;
    private double temperatura;

    public Forno(){
        setID(0);
        setModello("Default");
        setTemperatura(250);
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public void setModello(String modello){
        this.modello = modello;
    }

    public void setTemperatura(double temperatura){
        this.temperatura = temperatura;
    }

    @Override
    public int getID(){
        return this.ID;
    }

    public String getModello(){
        return this.modello;
    }

    public double getTemperatura(){
        return this.temperatura;
    }

    public void setValues(int ID, String modello, double temperatura){
        setID(ID);
        setModello(modello);
        setTemperatura(temperatura);
    }

    @Override
    public void pulisci(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Temperatura di pulizia: ");
        sc.nextDouble();
    }

}