package system.demo.vacanciesrest.model.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "vacancies")
public class VacancyListDTO {

    private List<VacancyDTO> vacancies;

    public VacancyListDTO() {
        this.vacancies = new ArrayList<>();
    }

    public VacancyListDTO(List<VacancyDTO> vacancies) {
        this.vacancies = vacancies;
    }

    @XmlElement(name = "vacancy")
    public List<VacancyDTO> getVacancies() {
        return vacancies;
    }
}
