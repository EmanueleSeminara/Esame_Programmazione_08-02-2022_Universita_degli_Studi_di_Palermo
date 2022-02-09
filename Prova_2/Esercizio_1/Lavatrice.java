import java.util.Scanner;

public class Lavatrice{
    private String marca;
    private String modello;
    private double capacita;
    private boolean disponibilitaFunzioniSmart;

    public Lavatrice(String marca, String modello, double capacita, boolean disponibilitaFunzioniSmart){
        setMarca(marca);
        setModello(modello);
        setCapacita(capacita);
        setDisponibilitaFunzioniSmart(disponibilitaFunzioniSmart);
    }

    public Lavatrice(){
        setMarca("Samsung");
        setModello("AK123");
        setCapacita(5.2);
        setDisponibilitaFunzioniSmart(false);
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModello(String modello){
        this.modello = modello;
    }

    public void setCapacita(double capacita){
        if(capacita > 0){
            this.capacita = capacita;
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    public void setDisponibilitaFunzioniSmart(boolean disponibilitaFunzioniSmart){
        this.disponibilitaFunzioniSmart = disponibilitaFunzioniSmart;
    }

    public String getMarca(){
        return this.marca;
    }

    public String getModello(){
        return this.modello;
    }

    public double getCapacita(){
        return this.capacita;
    }

    public boolean getDisponibilitaFunzioniSmart(){
        return this.disponibilitaFunzioniSmart;
    }

    public void setValues(){
        Scanner sc = new Scanner(System.in);

        try{
            setMarca(sc.nextLine());
            setModello(sc.nextLine());
            setCapacita(sc.nextDouble());
            setDisponibilitaFunzioniSmart(sc.nextBoolean());
        }
        catch(Exception e){
            System.out.println("Informazioni inserite errate!");
        }
    }

    @Override
    public String toString(){
        return "Marca: " + this.marca + " Modello: " + this.modello + " Capacità: " + this.capacita + " Disponibilità funzioni smart: " + this.disponibilitaFunzioniSmart;
    }
}