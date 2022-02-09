public class Televisore{
    private double costo;
    private String marca;
    private String modello;
    private int dimensione;
    private final int ID;

    public Televisore(double costo, String marca, String modello, int dimensione, int ID){
        setCosto(costo);
        setMarca(marca);
        setModello(modello);
        setDimensione(dimensione);
        this.ID = ID;
    }

    public void setCosto(double costo){
        if(costo > 0){
            this.costo = costo;
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModello(String modello){
        this.modello = modello;
    }

    public void setDimensione(int dimensione){
        if(dimensione > 0){
            this.dimensione = dimensione;
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    public double getCosto(){
        return this.costo;
    }

    public String getMarca(){
        return this.marca;
    }

    public String getModello(){
        return this.modello;
    }

    public int getDimensione(){
        return this.dimensione;
    }

    public int getID(){
        return this.ID;
    }

    @Override
    public boolean equals(Object o){
        if (o == this)
            return true;
        if (!(o instanceof Televisore))
            return false;
        Televisore tel = (Televisore)o;
        return this.modello.equals(tel.modello) && this.marca.equals(tel.marca);
    }

    @Override
    public int hashCode(){
        return 31 * this.marca.hashCode() * this.modello.hashCode();
    }

}