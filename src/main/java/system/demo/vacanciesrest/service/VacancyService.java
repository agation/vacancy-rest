package system.demo.vacanciesrest.service;

import system.demo.vacanciesrest.model.entity.Vacancy;

import java.util.List;

public interface VacancyService {

    List<Vacancy> getAllVacancies();

    Vacancy getVacancyById(long id);

    Vacancy addVacancy(Vacancy vacancy);

    void removeVacancy(long vacancy);
}
