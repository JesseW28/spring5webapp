package jesse.udemycourse.spring5webapp.repositories;

import jesse.udemycourse.spring5webapp.domain.Book;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends EntityRepository<Book> {
}
