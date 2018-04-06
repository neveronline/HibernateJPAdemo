package guru.springframework.spring5webapp.repository;

import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Author: Leo
 * Email: haojun02@meituan.com
 * Date:4/3/18
 * Time:5:55 PM
 * ------------------------------------
 * Desc:
 */

//后者为主key类型
public interface AuthorRepository extends CrudRepository<Author, Integer>{
}
