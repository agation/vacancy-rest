package system.demo.vacanciesrest.model.entity;

import javax.persistence.*;

@Entity
public class Vacancy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(length = 100)
    private String name;

    private int salary;
    @Column(length = 500)
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
