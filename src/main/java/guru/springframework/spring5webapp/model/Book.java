package guru.springframework.spring5webapp.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Author: Leo
 * Email: haojun02@meituan.com
 * Date:4/2/18
 * Time:12:10 AM
 * ------------------------------------
 * Desc:
 */
@Entity
public class Book {
    // IDNTITY 保证了ID Value 不串表
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookId;
    private String title;
    private String ISBN;
    private String publisher;

    @ManyToMany
    @JoinTable(name = "Author_Book_Relation", joinColumns = @JoinColumn (name = "book_id"),
    inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> authors = new HashSet<>();

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    public Book(String title, String ISBN, String publisher, Set<Author> authors) {
        this.title = title;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.authors = authors;
    }

    public Book(String title, String ISBN, String publisher) {
        this.title = title;
        this.ISBN = ISBN;
        this.publisher = publisher;
    }

    public Book() {

    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    // equal hashcode 主要用于set 判断两个object 是否需要去重


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return bookId != null ? bookId.equals(book.bookId) : book.bookId == null;
    }

    @Override
    public int hashCode() {
        return bookId != null ? bookId.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", publisher='" + publisher + '\'' +
                ", authors=" + authors +
                '}';
    }
}
