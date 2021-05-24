package org.iesfm.examen3.ej2;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Library {

    private String name;

    private Map<String, Book> catalogue;

    private List<BookLend> bookLends;

    public Library(String name, Map<String, Book> catalogue, List<BookLend> bookLends) {
        this.name = name;
        this.catalogue = catalogue;
        this.bookLends = bookLends;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Book> getCatalogue() {
        return catalogue;
    }

    public void setCatalogue(Map<String, Book> catalogue) {
        this.catalogue = catalogue;
    }

    public List<BookLend> getBookLends() {
        return bookLends;
    }

    public void setBookLends(List<BookLend> bookLends) {
        this.bookLends = bookLends;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(name, library.name) && Objects.equals(catalogue, library.catalogue) && Objects.equals(bookLends, library.bookLends);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, catalogue, bookLends);
    }
}
