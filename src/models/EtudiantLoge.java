package models;

public class EtudiantLoge extends EtudiantBoursier {
     
    private Chambre chambre;

    public Chambre getChambre() {
        return chambre;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }

    @Override
    public String toString() { 
        return "EtudiantNonBoursier [id=" + id + ", nom=" + nom + 
        ", prenom=" + prenom + ", email=" + email + ", password=" + password + 
        ",matricule=" + matricule +
        " ,telephone=" + telephone + "dateNaissance=" + dateNaissance +
        "typeBourse=" + typeBourse + ", chambre=" + chambre + "]";
    }
}
