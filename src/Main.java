import exception.NombreNegatifException;
import model.EntierNaturel;

public class Main {
    public static void main(String[] args) {
        try{
            EntierNaturel entierNaturel = new EntierNaturel(7);
            System.out.printf("val : %s\n", entierNaturel.getVal());

            entierNaturel.setVal(-1);
            System.out.printf("val : %s\n", entierNaturel.getVal());

            entierNaturel.setVal(0);
            entierNaturel.decrementer();
        }catch (NombreNegatifException e){
            System.out.println("Error: "+e.getMessage());
        }

    }
}