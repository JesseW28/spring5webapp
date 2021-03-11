package jesse.udemycourse.spring5webapp.repositories;


import jesse.udemycourse.spring5webapp.domain.AbstractEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface EntityRepository<T extends AbstractEntity> extends JpaRepository<T, Long> {
}
