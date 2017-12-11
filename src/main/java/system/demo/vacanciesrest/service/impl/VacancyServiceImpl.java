package system.demo.vacanciesrest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.demo.vacanciesrest.model.entity.Vacancy;
import system.demo.vacanciesrest.repository.VacancyRepository;
import system.demo.vacanciesrest.service.VacancyService;

import java.util.List;

@Service
public class VacancyServiceImpl implements VacancyService {

    @Autowired
    private VacancyRepository repository;

    @Override
    public List<Vacancy> getAllVacancies() {
        return this.repository.findAllByOrderByNameAsc();
    }

    @Override
    public Vacancy getVacancyById(long id) {
        return this.repository.findOne(id);
    }

    @Override
    public Vacancy addVacancy(Vacancy vacancy) {
        return this.repository.save(vacancy);
    }

    @Override
    public void removeVacancy(long id) {
        this.repository.delete(id);
    }
}
