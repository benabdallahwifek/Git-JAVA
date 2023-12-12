import java.util.*;

public class AffectationHashMap {
    private HashMap<Employe, Departement> hashMap; // Clé: Nom de l'employé, Valeur: Nom du département


    public AffectationHashMap() {
        hashMap = new HashMap<>();
    }
    public void ajouterEmployeDepartement(Employe e, Departement d)
    {
        hashMap.put(e,d);
    }
    public void afficherEmployesEtDepartements()
    {
        Set<Map.Entry<Employe, Departement>> couples = hashMap.entrySet();
        for (Map.Entry<Employe, Departement> couple : couples) {
            System.out.println("L'employe :  " + couple.getKey().getIdentifiant()+ " ayant le "+couple.getKey().getNom() + " travaille dans le departement " + couple.getValue().getNom_departement());
        }
    }
    public void supprimerEmploye (Employe e)
    {
        hashMap.remove(e);
    }
    public void supprimerEmployeEtDepartement (Employe e, Departement d)
    {
        if(hashMap.get(e).equals(d))
            hashMap.remove(e);

    }
    public void afficherLesEmployes() {
        Set<Employe> keys = hashMap.keySet();
        for (Employe employe : keys) {
            System.out.println(employe);
        }
    }
    public void afficherLesDepartements() {
        Collection<Departement> departements = hashMap.values();
        for (Departement dep : departements) {
            System.out.println(dep);
        }
    }
    public boolean rechercherEmploye (Employe e)
    {
        return hashMap.containsKey(e);
    }
    public boolean rechercherDepartement (Departement d)
    {
        return hashMap.containsValue(d);
    }
    public TreeMap<Employe, Departement> trierMap()
    {
        TreeMap<Employe, Departement> tree = new TreeMap<>(hashMap);
    }
}
