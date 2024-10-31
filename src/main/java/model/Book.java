package model;

import dad.openlibrary.api.Doc;
import javafx.beans.property.*;

public class Book {

    private final StringProperty title = new SimpleStringProperty();
    private final StringProperty author = new SimpleStringProperty();
    private final StringProperty isbn = new SimpleStringProperty();
    private final StringProperty publisher = new SimpleStringProperty();
    private final IntegerProperty pages = new SimpleIntegerProperty();

    private final ReadOnlyBooleanWrapper hasPages = new ReadOnlyBooleanWrapper();

    public Book(Doc doc) {
        title.set(doc.getTitle());
        author.set(doc.getAuthorName() != null && !doc.getAuthorName().isEmpty() ? doc.getAuthorName().getFirst() : "");
        isbn.set(doc.getIsbn() != null && !doc.getIsbn().isEmpty() ? doc.getIsbn().getFirst() : "");
        publisher.set(doc.getPublisher() != null && !doc.getPublisher().isEmpty() ? doc.getPublisher().getFirst() : "");
        pages.set(doc.getNumberOfPagesMedian() != null ? doc.getNumberOfPagesMedian() : 0);

        hasPages.bind(pages.greaterThan(0));
    }

    public String getTitle() {
        return title.get();
    }

    public StringProperty titleProperty() {
        return title;
    }

    public void setTitle(String title) {
        this.title.set(title);
    }

    public String getAuthor() {
        return author.get();
    }

    public StringProperty authorProperty() {
        return author;
    }

    public void setAuthor(String author) {
        this.author.set(author);
    }

    public String getIsbn() {
        return isbn.get();
    }

    public StringProperty isbnProperty() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn.set(isbn);
    }

    public String getPublisher() {
        return publisher.get();
    }

    public StringProperty publisherProperty() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher.set(publisher);
    }

    public int getPages() {
        return pages.get();
    }

    public IntegerProperty pagesProperty() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages.set(pages);
    }

    public boolean hasPages() {
        return hasPages.get();
    }

    public ReadOnlyBooleanProperty hasPagesProperty() {
        return hasPages.getReadOnlyProperty();
    }
}
