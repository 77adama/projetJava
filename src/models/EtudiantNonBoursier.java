package models;

public class EtudiantNonBoursier extends Etudiant {
    
    private String adresse;

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }


    @Override
    public String toString() { 
        return "EtudiantNonBoursier [id=" + id + ", nom=" + nom + 
        ", prenom=" + prenom + ", email=" + email + ", password=" + password + 
        ",matricule=" + matricule +
        " ,telephone=" + telephone + "dateNaissance=" + dateNaissance +
        "adresse=" + adresse + "]";
    }
}
