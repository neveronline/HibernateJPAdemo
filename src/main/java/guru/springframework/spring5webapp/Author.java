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
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String firstName;
    private String LastName;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books = new HashSet<Book>();

    public Author() {
    }

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        LastName = lastName;
    }

    public Author(String firstName, String lastName, Set<Book> books) {
        this.firstName = firstName;
        LastName = lastName;
        this.books = books;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
