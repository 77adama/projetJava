package models;

public class EtudiantBoursier extends Etudiant {
    protected TypeBourse typeBourse;

    public TypeBourse getTypeBourse() {
        return typeBourse;
    }

    public void setTypeBourse(TypeBourse typeBourse) {
        this.typeBourse = typeBourse;
    }
    
}
