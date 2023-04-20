package S1_08_N3;

public class Alumne {
    private String nom;
    private int edat;
    private String curs;
    private int nota;


    public Alumne(String nom, int edat, String curs, int nota) {
        this.nom = nom;
        this.edat = edat;
        this.curs = curs;
        this.nota = nota;
    }


    public String getNom() {
        return this.nom;
    }
    public int getEdat() {
        return this.edat;
    }
    public String getCurs() {
        return this.curs;
    }
    public int getNota() {
        return this.nota;
    }

    @Override
    public String toString() {
        return "Alumne{" +
                "nom='" + nom + '\'' +
                ", edat=" + edat +
                ", curs='" + curs + '\'' +
                ", nota=" + nota +
                '}';
    }
}
