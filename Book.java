public class Book {
    private String title;
    private String authorName;
    private int numberOfPages;
    private double price;
    private String published;

    private static int numberBook;

    protected String genre;
    protected String country;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public String getPublished() {
        return published;
    }

    @Override
    public String toString() {
        return "Book [authorName=" + authorName + ", country=" + country + ", genre=" + genre + ", numberOfPages="
                + numberOfPages + ", price=" + price + ", published=" + published + ", title=" + title + "]";
    }

    public static void printStaticNumberBook() {
        System.out.println(numberBook);
    }

    public static void printNumberBook() {
        System.out.println(numberBook);
    }

    public void resetValues(String title, String authorName, int numberOfPages, double price, String published,
            String genre, String country) {

    }

    Book() {

    }

    Book(String title, String authorName, int numberOfPages, double price) {
        setTitle(title);
        setAuthorName(authorName);
        setNumberOfPages(numberOfPages);
        setPrice(price);
    }

    Book(String title, String authorName, int numberOfPages, double price, String published, String genre,
            String country) {
        Book(title, authorname, numberOfPages, price);
        setPublished(published);
        this.genre = genre;
        this.country = country;

    }

}
