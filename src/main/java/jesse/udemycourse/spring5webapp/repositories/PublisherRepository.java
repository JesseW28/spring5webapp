package jesse.udemycourse.spring5webapp.repositories;

import jesse.udemycourse.spring5webapp.domain.Publisher;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends EntityRepository<Publisher> {
}
