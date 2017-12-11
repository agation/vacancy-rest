package system.demo.vacanciesrest.model.dto;

import lombok.ToString;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@ToString
@XmlRootElement(name = "vacancy")
@XmlType(propOrder = {"id", "name", "salary", "requiredWorkExperience", "city"})
public class VacancyDTO {

    private long id;

    private String name;

    private int salary;

    private String requiredWorkExperience;

    private String city;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @XmlElement(name = "required-work-experience")
    public String getRequiredWorkExperience() {
        return requiredWorkExperience;
    }

    public void setRequiredWorkExperience(String requiredWorkExperience) {
        this.requiredWorkExperience = requiredWorkExperience;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
