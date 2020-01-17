package project;

public class BookDescriptor {

	public static void main(String[] args) {
		Book bibleStories = new Book();
		Book harryPotter = new Book(1000, "J. K. Rowling", 500, 300, "26 June 1997", "fantasy", "United Kingdom");
		Book magicBook = new Book(2000, "Horvad Kent", 254, 480.6);

		System.out.println(harryPotter);
		System.out.println(magicBook);
		System.out.println(bibleStories);
		Book.printStaticNumberBook();
		harryPotter.printNumberBook();
		int iterator = 0;
		int sizeArray = 4;
		Book[] array = new Book[sizeArray];

		while (iterator < sizeArray) {
			array[iterator] = new Book();
			iterator++;
		}

		for (Book object : array) {
			System.out.println(object);
		}
	}
}
