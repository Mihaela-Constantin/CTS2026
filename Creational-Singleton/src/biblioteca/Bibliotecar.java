package biblioteca;

public class Bibliotecar {
    private String numeBibliotecar;
    private Biblioteca biblioteca;

    public Bibliotecar() {
        biblioteca = Biblioteca.getInstance();
    }

    public Bibliotecar(String numeBibliotecar) {
        this.numeBibliotecar = numeBibliotecar;
        biblioteca = Biblioteca.getInstance();
    }

    public void adaugaCarti(int nrCarti) {
        if (nrCarti > 0)
            biblioteca.setNrTotalCarti(biblioteca.getNrTotalCarti() + nrCarti);
    }

    public String getNumeBibliotecar() {
        return numeBibliotecar;
    }

    public void setNumeBibliotecar(String numeBibliotecar) {
        this.numeBibliotecar = numeBibliotecar;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    @Override
    public String toString() {
        return "Bibliotecar{" +
                "numeBibliotecar='" + numeBibliotecar + '\'' +
                ", biblioteca=" + biblioteca +
                '}';
    }
}
