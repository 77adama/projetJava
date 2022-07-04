package models;

public class Etudiant extends User {
    

    protected String matricule;
    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    protected int telephone;
    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    protected String dateNaissance;
    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    // protected String type;

    // public String getType() {
    //     return type;
    // }

    // public void setType(String type) {
    //     this.type = type;
    // }

    @Override
    public String toString() { 
        return "Etudiant [id=" + id + ", nom=" + nom + 
        ", prenom=" + prenom + ", email=" + email + ", password=" + password + 
        ",matricule=" + matricule +
        " ,telephone=" + telephone + "dateNaissance=" + dateNaissance + "]";
    }
    
}
