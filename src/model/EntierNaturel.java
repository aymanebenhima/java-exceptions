package model;

import exception.NombreNegatifException;

public class EntierNaturel {

    private int val;

    public EntierNaturel(int val) throws NombreNegatifException {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) throws NombreNegatifException {
        if(val < 0) throw new NombreNegatifException("La valeur passée en paramètre est négative.");
        else this.val = val;
    }

    public void decrementer() throws NombreNegatifException{
        int i = this.getVal() - 1;
        if(i < 0) throw new NombreNegatifException("La resultat de la décrémentation est négative.");
    }
}
