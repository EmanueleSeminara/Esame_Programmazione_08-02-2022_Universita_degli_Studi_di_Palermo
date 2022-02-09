import java.util.*;

public class Database{
    List<Televisore> lista1 = new ArrayList<>();
    List<Televisore> lista2 = new ArrayList<>();

    public boolean addLista1(Televisore tv){
        return lista1.add(tv);
    }

    public boolean addLista2(Televisore tv){
        return lista2.add(tv);
    }

    public Televisore minDimensione(){
        Televisore min;
        if(!lista1.isEmpty()){
            min = lista1.get(0);
        }
        else if(!lista2.isEmpty()){
            min = lista2.get(0);
        }
        else{
            throw new NoSuchElementException();
        }

        for(Televisore tv : lista1){
            if(tv.getCosto() < min.getCosto()){
                min = tv;
            }
        }
        for(Televisore tv : lista2){
            if(tv.getCosto() < min.getCosto()){
                min = tv;
            }
        }
        return min;
    }

    public static void main(String[] args){
        Database database = new Database();
        database.addLista1(new Televisore(150.50, "pino", "pino", 60, 0));
        database.addLista1(new Televisore(15.50, "pino", "pino", 60, 0));
        database.addLista2(new Televisore(400.50, "pino", "pino", 60, 0));
        System.out.println(database.minDimensione().getCosto());
    }
}