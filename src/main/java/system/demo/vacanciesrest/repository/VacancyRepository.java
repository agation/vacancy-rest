package system.demo.vacanciesrest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import system.demo.vacanciesrest.model.entity.Vacancy;

import java.util.List;

@Repository
@Transactional
public interface VacancyRepository extends CrudRepository<Vacancy, Long> {
    List<Vacancy> findAllByOrderByNameAsc();
}
