package guru.springframework.spring5webapp;

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
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}
