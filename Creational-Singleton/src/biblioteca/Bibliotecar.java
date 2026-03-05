package biblioteca;

public class Bibliotecar {
    private String numeBibliotecar;
    private BibliotecaLazy biblioteca;

    public Bibliotecar() {
        biblioteca = BibliotecaLazy.getInstance();
    }

    public Bibliotecar(String numeBibliotecar) {
        this.numeBibliotecar = numeBibliotecar;
        biblioteca = BibliotecaLazy.getInstance();
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

    public BibliotecaLazy getBiblioteca() {
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
