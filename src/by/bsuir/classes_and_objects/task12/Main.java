package by.bsuir.classes_and_objects.task12;

import by.bsuir.classes_and_objects.task15.AuthorComparator;
import by.bsuir.classes_and_objects.task15.PriceComparator;
import by.bsuir.classes_and_objects.task15.TitleComparator;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("1984", "George Orwell", 45, 2));
        books.add(new Book("Lolita", "Vladimir Nabokov", 27, 1));
        books.add(new Book("Fahrenheit 451", "Ray Bradbury", 36, 0));
        books.add(new Book("Lolita", "Vladimir Nabokov", 23, 5));
        books.add(new Book("Animal Farm", "George Orwell", 43, 4));
        books.add(new Book("Confession", "Leo Tolstoy", 38, 7));
        books.add(new Book("Confession", "Jean-Jacques Rousseau", 40, 6));
        books.add(new Book("Anna Karenina", "Leo Tolstoy", 45, 8));

        ArrayList<Comparator<Book>> comparators = new ArrayList<Comparator<Book>>();
        comparators.add(new TitleComparator());
        comparators.add((new TitleComparator()).thenComparing(new AuthorComparator()));
        comparators.add((new AuthorComparator()).thenComparing(new TitleComparator()));
        comparators.add(((new AuthorComparator()).thenComparing(new TitleComparator())).thenComparing(new PriceComparator()));

        for (Comparator<Book> comparator: comparators) {
            books.sort(comparator);
            System.out.println("\nSorted array of books: ");
            for (Book book: books) {
                System.out.println(book.toString());
            }
        }
    }
}
