package services;

import models.Chambre;
import models.Etudiant;
import models.EtudiantLoge;
import models.EtudiantNonBoursier;
import models.Pavillon;
import models.Rp;

public class ServiceTableau implements IService {

    private final int TAILLE=10;
    private Pavillon[] pavillons=new Pavillon[TAILLE];
    private int indexPavillon;
    @Override
    public void addPavillon(Pavillon pavillon) {
      if (indexPavillon<TAILLE) {
        pavillons[indexPavillon]=pavillon;
        indexPavillon++; 
      } else {
        System.out.println("le tableau est plein");
      }
        
    }

    @Override
    public void deletePavillon(Pavillon pavillon) {
        
        
    }

    @Override
    public void listerPavillon() {
        for (Pavillon p : pavillons) {
            if (p!=null) {
                System.out.println(p);
            }
        }
       
    }

    private Chambre[] chambres=new Chambre[TAILLE];
    private int indexChambre;
    @Override
    public void addChambre(Chambre chambre) {
        if (indexChambre<TAILLE) {
            chambres[indexChambre]=chambre;
            indexChambre++; 
          } else {
            System.out.println("le tableau est plein");
          }
        
    }

    @Override
    public void archiverChambre(Chambre chambre) {
     
        
    }

    @Override
    public void listerChambre() {
        for (Chambre c : chambres) {
            if (c!=null) {
                System.out.println(c);
            }
        }
        
    }

    @Override
    public void listerChambreDunPavillon(Pavillon pavillon) {
       
        
    }

    private Etudiant[] etudiants=new Etudiant[TAILLE];
    private int indexEtudiant;
    @Override
    public void addEtudiant(Etudiant etudiant) {
        if (indexEtudiant<TAILLE) {
            etudiants[indexEtudiant]=etudiant;
            indexEtudiant++; 
          } else {
            System.out.println("le tableau est plein");
          }
    }

    @Override
    public void listerEtudiant() {
        for (Etudiant e : etudiants) {
            if (e!=null) {
                System.out.println(e);
            }
        }
    }

    private EtudiantNonBoursier[] etudiantnonboursiers=new EtudiantNonBoursier[TAILLE];
    private int indexEtudiantNonBoursier;
    @Override
    public void addEtudiantNonBoursier(EtudiantNonBoursier etudiantNonBoursier) {
        if (indexEtudiantNonBoursier<TAILLE) {
            etudiantnonboursiers[indexEtudiantNonBoursier]=etudiantNonBoursier;
            indexEtudiantNonBoursier++; 
          } else {
            System.out.println("le tableau est plein");
          }
        
    }

    @Override
    public void listerEtudiantNonBoursier() {
        for (EtudiantNonBoursier e : etudiantnonboursiers) {
            if (e!=null) {
                System.out.println(e);
            }
        }

    }

    @Override
    public void listerEtudiantChambre(Chambre chambre) {
      
        
    }

    @Override
    public void affecterChambrePavillon(Chambre chambre, Pavillon pavillon) {
        
        
    }

    @Override
    public void affecterChambreBoursierLoge(Chambre chambre, EtudiantLoge Etudiantloge) {
        
        
    }

    private Rp[] rps=new Rp[TAILLE];
    private int indexRp;
    @Override
    public void addRp(Rp rp) {
        if (indexEtudiant<TAILLE) {
            rps[indexRp]=rp;
            indexRp++; 
          } else {
            System.out.println("le tableau est plein");
          }
        
    }

    @Override
    public void listerRp() {
        for (Rp r : rps) {
            if (r!=null) {
                System.out.println(r);
            }
        }
        
    }

    private EtudiantLoge[] etudiantLoges=new EtudiantLoge[TAILLE];
    private int indexEtudiantLoge;
    @Override
    public void addEtudiantLoge(EtudiantLoge etudiantLoge) {
        if (indexEtudiantLoge<TAILLE) {
            etudiantLoges[indexEtudiantLoge]=etudiantLoge;
            indexEtudiantLoge++; 
          } else {
            System.out.println("le tableau est plein");
          }
        
    }

    @Override
    public void listerEtudiantLoge() {
        for (EtudiantLoge e : etudiantLoges) {
            if (e!=null) {
                System.out.println(e);
            }
        }
        
    }

    

   
    
    
}
