package main;

import classes.LibrarySettings;

public class MainLibrarySettings {
    public static void main(String[] args) {
        LibrarySettings ls1 = LibrarySettings.getInstanta();
        LibrarySettings ls2 = LibrarySettings.getInstanta();
        ls2.setLibraryName("Biblioteca Judet Giurgiu");
        System.out.println(ls1.getLibraryName());

        System.out.println(ls1 == ls2); // true

    }
}
