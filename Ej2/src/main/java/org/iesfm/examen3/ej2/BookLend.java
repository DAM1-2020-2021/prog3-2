package org.iesfm.examen3.ej2;

import java.util.Objects;

public class BookLend {
    private String isbn;
    private String memberNif;
    private String lendDate;

    public BookLend(String isbn, String memberNif, String lendDate) {
        this.isbn = isbn;
        this.memberNif = memberNif;
        this.lendDate = lendDate;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getMemberNif() {
        return memberNif;
    }

    public void setMemberNif(String memberNif) {
        this.memberNif = memberNif;
    }

    public String getLendDate() {
        return lendDate;
    }

    public void setLendDate(String lendDate) {
        this.lendDate = lendDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookLend bookLend = (BookLend) o;
        return Objects.equals(isbn, bookLend.isbn) && Objects.equals(memberNif, bookLend.memberNif) && Objects.equals(lendDate, bookLend.lendDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, memberNif, lendDate);
    }
}
