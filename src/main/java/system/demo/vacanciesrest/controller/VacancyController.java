package system.demo.vacanciesrest.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import system.demo.vacanciesrest.model.dto.VacancyDTO;
import system.demo.vacanciesrest.model.dto.VacancyListDTO;
import system.demo.vacanciesrest.model.entity.Vacancy;
import system.demo.vacanciesrest.service.VacancyService;
import system.demo.vacanciesrest.util.VacancyDtoUtil;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/vacancy")
public class VacancyController {

    @Autowired
    private VacancyService vacancyService;

    @PutMapping(consumes = MediaType.APPLICATION_XML_VALUE)
    public void addVacancy(@RequestBody VacancyDTO dto) {
        log.debug("save vacancy, DTO: {}", dto);
        this.vacancyService.addVacancy(VacancyDtoUtil.dtoToVacancy(dto));
    }

    @GetMapping(produces = MediaType.APPLICATION_XML_VALUE)
    public VacancyListDTO allVacancies() {
        List<Vacancy> result = this.vacancyService.getAllVacancies();
        return new VacancyListDTO(VacancyDtoUtil.vacancyToDto(result));
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_XML_VALUE)
    public VacancyDTO getVacancy(@PathVariable("id") long id) {
        Vacancy result = this.vacancyService.getVacancyById(id);
        return VacancyDtoUtil.vacancyToDto(result);
    }

    @DeleteMapping(path = "/{id}")
    public void removeVacancy(@PathVariable("id") long id) {
        this.vacancyService.removeVacancy(id);
        log.debug("Vacancy remove by id ({})", id);
    }
}
