package models;

public class Chambre {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    private int numeroEtage;

    public int getNumeroEtage() {
        return numeroEtage;
    }

    public void setNumeroEtage(int numeroEtage) {
        this.numeroEtage = numeroEtage;
    }
    private int numeroChambre;

    public int getNumeroChambre() {
        return numeroChambre;
    }

    public void setNumeroChambre(int numeroChambre) {
        this.numeroChambre = numeroChambre;
    }
    private TypeChambre type;

    public TypeChambre getType() {
        return type;
    }

    public void setType(TypeChambre type) {
        this.type = type;
    }
    
    @Override
    public String toString() {
        return "Pavillon [id=" + id + ", numeroEtage=" + numeroEtage + ", numeroChambre=" + numeroChambre +  ", type=" + type +"]";
    }
}
