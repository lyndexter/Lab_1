package project;

public class Book {

	private int edition;

	private String authorName;

	private int numberOfPages;

	private double priceInUAH;

	private String published;

	private static int numberBookInList;

	protected String genre;

	protected String country;

	public void setTitle(int title) {
		this.edition = title;
	}

	public int getTitle() {
		return edition;
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
		this.priceInUAH = price;
	}

	public double getPrice() {
		return priceInUAH;
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
				+ numberOfPages + ", price=" + priceInUAH + ", published=" + published + ", title=" + edition + "]";
	}

	public static void printStaticNumberBook() {
		System.out.println(numberBookInList);
	}

	public void printNumberBook() {
		System.out.println(numberBookInList);
	}

	public void resetValues(int title, String authorName, int numberOfPages, double price, String published,
			String genre, String country) {
		this.edition = title;
		this.authorName = authorName;
		this.numberOfPages = numberOfPages;
		this.priceInUAH = price;
		this.published = published;
		this.genre = genre;
		this.country = country;
	}

	Book() {
		numberBookInList++;
	}

	Book(int title, String authorName, int numberOfPages, double price, String published, String genre,
			String country) {
		this.edition = title;
		this.authorName = authorName;
		this.numberOfPages = numberOfPages;
		this.priceInUAH = price;
		this.published = published;
		this.genre = genre;
		this.country = country;
		numberBookInList++;
	}

	Book(int title, String authorName, int numberOfPages, double price) {
		this(title, authorName, numberOfPages, price, null, null, null);
		numberBookInList++;
	}

}
