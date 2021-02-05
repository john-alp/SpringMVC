package com.johnAlp.spring.mvc;


import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Friend {
    @Size(min = 2, max = 30, message = " Sorry, name must be min 2 symbols, max 30 symbols")
    private String name;
    // @NotNull()
    // @NotEmpty()
    @NotBlank(message = "Sorry, surname is required field")
    private String surName;
    @Min(value = 30001, message = "must be greater than 30000")
    @Max(value = 100001, message = "must be greater than 100000")
    private int salary;
    private String department;
    private Map<String, String> departments;
    private String carBrand;
    private Map<String, String> carBrands;
    private String[] languages;
    private Map<String, String> languageList;
    @Pattern(regexp = "\\d{3}-\\d{3}-\\d{2}-\\d{2}", message = "Please use pattern XXX-XXX-XX-XX")
    private String phoneNumber;

    public Friend() {
        if (departments == null) {
            departments = new HashMap<>();
            departments.put("Information Technology", "IT");
            departments.put("Human Resources", "HR");
            departments.put("Sales", "Sales");
            departments.put("Cleaning service", "Cleaning");
        }
        carBrands = new HashMap<>();
        carBrands.put("BMW", "BMW");
        carBrands.put("Mazda", "Mazda");
        carBrands.put("Mercedes-Benz", "MB");
        carBrands.put("Lada", "Lada");

        languageList = new HashMap<>();
        languageList.put("English", "EN");
        languageList.put("Deutch", "DE");
        languageList.put("French", "FR");
        languageList.put("languages of the far north", "NO");
    }

    public Friend(String name, String surName, int salary) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(Map<String, String> languageList) {
        this.languageList = languageList;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
