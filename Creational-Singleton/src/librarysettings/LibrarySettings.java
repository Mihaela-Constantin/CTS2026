package librarysettings;

public class LibrarySettings {

    private static LibrarySettings instance = null;

    private int maxBorrowDays;
    private int maxBooksPerMember;
    private float finePerLateDay;
    private String libraryName;

    private LibrarySettings(int maxBorrowDays, int maxBooksPerMember, float finePerLateDay, String libraryName) {
        this.maxBorrowDays = maxBorrowDays;
        this.maxBooksPerMember = maxBooksPerMember;
        this.finePerLateDay = finePerLateDay;
        this.libraryName = libraryName;
    }

    public static LibrarySettings getInstanta() {
        if (instance == null)
            instance = new LibrarySettings(10, 3, 2.5f, "Biblioteca Centrala");
        return instance;
    }

    public int getMaxBorrowDays() {
        return maxBorrowDays;
    }

    public void setMaxBorrowDays(int maxBorrowDays) {
        this.maxBorrowDays = maxBorrowDays;
    }

    public int getMaxBooksPerMember() {
        return maxBooksPerMember;
    }

    public void setMaxBooksPerMember(int maxBooksPerMember) {
        this.maxBooksPerMember = maxBooksPerMember;
    }

    public float getFinePerLateDay() {
        return finePerLateDay;
    }

    public void setFinePerLateDay(float finePerLateDay) {
        this.finePerLateDay = finePerLateDay;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }
}
