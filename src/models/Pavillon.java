package models;

public class Pavillon {
    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    private int numero;
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    private int nmbrEtage;
    public int getNmbrEtage() {
        return nmbrEtage;
    }
    public void setNmbrEtage(int nmbrEtage) {
        this.nmbrEtage = nmbrEtage;
    }
    
    @Override
    public String toString() {
        return "Pavillon [id=" + id + ", nmbrEtage=" + nmbrEtage + ", numero=" + numero + "]";
    }
}
