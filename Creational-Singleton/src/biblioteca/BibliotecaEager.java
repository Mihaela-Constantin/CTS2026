package biblioteca;

public class BibliotecaEager {

    private static BibliotecaEager instance = new BibliotecaEager();

    private String numeBiblioteca;
    private String adresa;
    private int nrTotalCarti;

    private BibliotecaEager() {
    }

    public static BibliotecaEager getInstance() {
        if (instance == null)
            instance = new BibliotecaEager();
        return instance;
    }

    public String getNumeBiblioteca() {
        return numeBiblioteca;
    }

    public void setNumeBiblioteca(String numeBiblioteca) {
        this.numeBiblioteca = numeBiblioteca;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getNrTotalCarti() {
        return nrTotalCarti;
    }

    public void setNrTotalCarti(int nrTotalCarti) {
        this.nrTotalCarti = nrTotalCarti;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "numeBiblioteca='" + numeBiblioteca + '\'' +
                ", adresa='" + adresa + '\'' +
                ", nrTotalCarti=" + nrTotalCarti +
                '}';
    }
}
