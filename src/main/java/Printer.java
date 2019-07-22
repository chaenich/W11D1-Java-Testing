public class Printer {
    private int pagesLeft;
    private int tonerVolume;

    public  Printer(int pagesLeft, int tonerVolume) {
        this.pagesLeft = pagesLeft;
        this.tonerVolume = tonerVolume;
    }

    public int getPagesLeft() {
        return this.pagesLeft;
    }

    public int getTonerVolume() {
        return this.tonerVolume;
    }

    public boolean printPages(int numPages, int numCopies) {
        int totalPages = numPages * numCopies;
        if ( totalPages <= this.pagesLeft) {
            this.pagesLeft -= totalPages;
            this.tonerVolume -= totalPages;
            return true;
        };
        return false;
    }
}
