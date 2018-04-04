package guru.springframework.spring5webapp.repository;

import guru.springframework.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Author: Leo
 * Email: haojun02@meituan.com
 * Date:4/3/18
 * Time:5:55 PM
 * ------------------------------------
 * Desc:
 */
public interface BookRepository extends CrudRepository<Book, Integer>{
}
