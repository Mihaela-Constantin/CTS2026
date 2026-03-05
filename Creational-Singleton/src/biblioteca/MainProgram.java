package biblioteca;

public class MainProgram {
    public static void main(String[] args) {
        Bibliotecar bibliotecar1 = new Bibliotecar();
        bibliotecar1.setNumeBibliotecar("Ion Marin");
        bibliotecar1.getBiblioteca().setAdresa("Splaiul Independentei");
        bibliotecar1.getBiblioteca().setNumeBiblioteca("Biblioteca Centrala");
        bibliotecar1.getBiblioteca().setNrTotalCarti(1000);
        System.out.println("bibliotecar1 dupa setteri este " + bibliotecar1);

        Bibliotecar bibliotecar2 = new Bibliotecar("Costache Andrei");
        bibliotecar2.getBiblioteca().setAdresa("Bulevardul Unirii");
        bibliotecar2.getBiblioteca().setNumeBiblioteca("Biblioteca Judeteana");
        bibliotecar2.getBiblioteca().setNrTotalCarti(700);
        System.out.println("bibliotecar1 dupa setteri este " + bibliotecar1);
        System.out.println("bibliotecar2 dupa setteri este " + bibliotecar2);

        if (bibliotecar1.getBiblioteca() == bibliotecar2.getBiblioteca()) {
            System.out.println("Referinte identice");
        } else {
            System.out.println("Referintele nu sunt identice.");
        }

        bibliotecar2.adaugaCarti(10);
        System.out.println("bibliotecar1 dupa adaugare carti este " + bibliotecar1);
        System.out.println("bibliotecar2 dupa adaugare carti este " + bibliotecar2);
    }
}
