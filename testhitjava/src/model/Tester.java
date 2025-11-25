package model;

import service.IDebuggable;
import service.IWordable;

public class Tester extends Employee implements IWordable {
    private int bugsDetectedCount;

    public Tester() {
    }

    public Tester(String name, int age, double basicSalary, Device device, int bugsDetectedCount) {
        super(name, age, basicSalary, device);
        this.bugsDetectedCount = bugsDetectedCount;
    }

    @Override
    public double caculateSalary() {
        return getBasicSalary() + BASE_SALARY_RATE * this.bugsDetectedCount;
    }
    @Override
    public void word() {
        System.out.println("Dang test case");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", basicSalary=" + getBasicSalary() +
                ", device=" + getDevice() +
                ", BASE_SALARY_RATE=" + BASE_SALARY_RATE +
                ", bugsDetectedCount=" + this.bugsDetectedCount +
                ", caculateSalary=" + caculateSalary() +
                '}';
    }

}
