package guru.springframework.spring5webapp.repository;

import guru.springframework.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Author: Leo
 * Email: haojun02@meituan.com
 * Date:4/6/18
 * Time:12:41 AM
 * ------------------------------------
 * Desc:
 */
public interface PublisherRepository extends CrudRepository<Publisher,Integer>{
}
