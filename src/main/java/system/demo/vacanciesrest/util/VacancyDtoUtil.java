package system.demo.vacanciesrest.util;

import system.demo.vacanciesrest.model.dto.VacancyDTO;
import system.demo.vacanciesrest.model.entity.Vacancy;

import java.util.List;
import java.util.stream.Collectors;

public class VacancyDtoUtil {
    public static Vacancy dtoToVacancy(VacancyDTO dto) {
        if (dto == null) {
            return null;
        }

        Vacancy vacancy = new Vacancy();
        vacancy.setName(dto.getName());
        vacancy.setSalary(dto.getSalary());
        vacancy.setRequiredWorkExperience(dto.getRequiredWorkExperience());
        vacancy.setCity(dto.getCity());
        return vacancy;
    }

    public static VacancyDTO vacancyToDto(Vacancy vacancy) {
        if (vacancy == null) {
            return null;
        }

        VacancyDTO dto = new VacancyDTO();
        dto.setId(vacancy.getId());
        dto.setName(vacancy.getName());
        dto.setSalary(vacancy.getSalary());
        dto.setRequiredWorkExperience(vacancy.getRequiredWorkExperience());
        dto.setCity(vacancy.getCity());
        return dto;
    }

    public static List<VacancyDTO> vacancyToDto(List<Vacancy> vacancy) {
        return vacancy.stream().map(VacancyDtoUtil::vacancyToDto).collect(Collectors.toList());
    }
}
