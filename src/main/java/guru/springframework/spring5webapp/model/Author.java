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
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer authorId;
    private String firstName;

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Author author = (Author) o;

        return authorId != null ? authorId.equals(author.authorId) : author.authorId == null;
    }

    @Override
    public int hashCode() {
        return authorId != null ? authorId.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorId=" + authorId +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", books=" + books +
                '}';
    }
}
