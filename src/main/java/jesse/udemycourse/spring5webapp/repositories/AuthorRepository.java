package jesse.udemycourse.spring5webapp.repositories;

import jesse.udemycourse.spring5webapp.domain.Author;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends EntityRepository<Author> {
}
