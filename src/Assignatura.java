import java.util.ArrayList;

public class Assignatura {
    public long id = 0;
    private String nom = "";
    private int hores = 0;
    public int credits = 0;
    private boolean disponible = false;

    public Assignatura(long id, String nom, int hores, int credits, boolean disponible) {
        this.id = id;
        this.nom = nom;
        this.hores = hores;
        this.credits = credits;
        this.disponible = disponible;
    }

    public static void main(String[] args) {
        Assignatura ass1 = new Assignatura(1,"Xarxes",150,6,true);
        Assignatura ass2 = new Assignatura(2,"Sistemes Operatius",100,4,true);
        Assignatura ass3 = new Assignatura(2,"Entorns",75,3,true);
        ArrayList<Assignatura> assignatures = new ArrayList<Assignatura>();
        assignatures.add(ass1);
        assignatures.add(ass2);
        assignatures.add(ass3);
        Matricula prova = new Matricula(2018090103, "Josep", "Garcia Marti", "12345678X", 1, assignatures);
        System.out.print("Cost de la matricula " + prova.costMatricula());
    }
}
