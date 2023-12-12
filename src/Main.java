import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        DepartementHashSet departementHashSet = new DepartementHashSet();

        Departement d1 = new Departement(1,50,"informatique");
        Departement d2 = new Departement(1,50,"informatique");
        Departement d3 = new Departement(3,10,"finance");
        Departement d4 = new Departement(6,20,"marketing");


        departementHashSet.ajouterDepartement(d1);
        departementHashSet.aimport java.util.TreeMap;
import java.util.TreeSet;

        public class Main {
            public static void main(String[] args) {
                DepartementHashSet Deps = new DepartementHashSet();
                Departement D1=new Departement(1,"Finance",20);
                Departement D2= new Departement(1,"Gestion",10);
                Departement D3=new Departement(4,"IT",20);
                Departement D4=new Departement(2,"RH",20);
                Deps.ajouterDepartement(D1);
                Deps.ajouterDepartement(D2);
                Deps.ajouterDepartement(D3);
                Deps.ajouterDepartement(D4);
                Deps.displayDepartement();
                Deps.displayDepartement();
                TreeSet<Departement> MyTree = new TreeSet<>();
                MyTree = Deps.trierDepartementById();
                System.out.println("SORTED");
                System.out.println(MyTree);
                System.out.println("-----------------Map---------------");
                AffectationHashMap societe= new AffectationHashMap();
                Employe e = new Employe(1, 10, "nom1", "prenom");
                Employe e1 = new Employe(1, 8, "nom2", "prenom");
                Employe e2 = new Employe(4, 6, "nom3", "prenom");
                Employe e3 = new Employe(3, 5, "nom4", "prenom");
                societe.ajouterEmployeDepartement(e,D2);
                societe.ajouterEmployeDepartement(e1,D4);
                societe.ajouterEmployeDepartement(e2,D1);
                societe.ajouterEmployeDepartement(e3,D3);
                societe.ajouterEmployeDepartement(e1,D1);
                societe.afficherEmployesEtDepartements();
                societe.supprimerEmployeEtDepartement(e1,D1);
                societe.afficherEmployesEtDepartements();


                TreeMap<Employe, Departement> Tree= societe.trierMap();
                System.out.println(Tree);
            }
        }jouterDepartement(d2);
        departementHashSet.ajouterDepartement(d3);
        departementHashSet.ajouterDepartement(d4);


        departementHashSet.displayDepartement();
        System.out.println(departementHashSet.rechercherDepartement(d1));
        System.out.println(departementHashSet.rechercherDepartement("finance"));

        System.out.println(departementHashSet.trierDepartementById());
        departementHashSet.supprimerDepartement(d3);
        departementHashSet.displayDepartement();
    }

}
