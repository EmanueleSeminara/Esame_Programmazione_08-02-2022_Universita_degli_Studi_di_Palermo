import java.util.*;
public class Database{
    private Map<Integer, Elettrodomestico> elettrodomestici = new HashMap<>();

    public Elettrodomestico add(Elettrodomestico o){
        return elettrodomestici.put(o.getID(), o);
    }

    public void avviaPulizia(){
        for(Elettrodomestico e : elettrodomestici.values()){
            e.pulisci();
        }
    }

    public static void main(String[] args){
        Database db = new Database();

        db.add(new MacchinaCaffe());
        db.avviaPulizia();
    }
}