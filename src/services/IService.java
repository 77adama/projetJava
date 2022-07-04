package services;

import models.EtudiantLoge;
import models.EtudiantNonBoursier;
import models.Chambre;
import models.Etudiant;
import models.Pavillon;
import models.Rp;

public interface IService {
    public void addRp(Rp rp);
    public void listerRp();

    public void addPavillon(Pavillon pavillon);
    public void deletePavillon(Pavillon pavillon);
    public void listerPavillon();  

    public void addChambre(Chambre chambre);
    public void archiverChambre(Chambre chambre);
    public void listerChambre();
    public void listerChambreDunPavillon(Pavillon pavillon);

    public void addEtudiant(Etudiant etudiant);
    public void listerEtudiant();
    
    public void addEtudiantNonBoursier(EtudiantNonBoursier etudiantNonBoursier);
    public void listerEtudiantNonBoursier();
    

    public void addEtudiantLoge(EtudiantLoge etudiantLoge);
    public void listerEtudiantLoge();
    

    public void listerEtudiantChambre(Chambre chambre);
    
    public void affecterChambrePavillon(Chambre chambre,Pavillon pavillon);

    public void affecterChambreBoursierLoge(Chambre chambre,EtudiantLoge Etudiantloge);

}
