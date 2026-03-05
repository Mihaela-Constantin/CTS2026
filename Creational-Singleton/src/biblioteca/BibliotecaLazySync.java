package biblioteca;


public class BibliotecaLazySync {

    private static BibliotecaLazySync instance = null;

    private String numeBiblioteca;
    private String adresa;
    private int nrTotalCarti;

    private BibliotecaLazySync() {
    }

    public static synchronized BibliotecaLazySync getInstance() {
        if (instance == null)
            instance = new BibliotecaLazySync();
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
