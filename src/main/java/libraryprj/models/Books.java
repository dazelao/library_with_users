package libraryprj.models;

public class Books {
    public int getBooksId() {
        return booksId;
    }

    public void setBooksId(int booksId) {
        this.booksId = booksId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearsOfWriting() {
        return yearsOfWriting;
    }

    public void setYearsOfWriting(int yearsOfWriting) {
        this.yearsOfWriting = yearsOfWriting;
    }

    public Books(int booksId, String title, String author, int yearsOfWriting) {
        this.booksId = booksId;
        this.title = title;
        this.author = author;
        this.yearsOfWriting = yearsOfWriting;
    }

    private int booksId;
    private String title;
    private String author;

    private int yearsOfWriting;
}
