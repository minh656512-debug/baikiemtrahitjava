package model;

import service.IDebuggable;
import service.IWordable;

public class Developer extends Employee implements IWordable, IDebuggable {
    private int overtimeHours;

    public Developer() {
    }

    public Developer(String name, int age, double basicSalary, Device device, int overtimeHours) {
        super(name, age, basicSalary, device);
        this.overtimeHours = overtimeHours;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double caculateSalary() {
        return getBasicSalary() + BASE_SALARY_RATE * this.overtimeHours;
    }
    @Override
    public void word(){
        System.out.println("Dang lap trinh");
    }

    @Override
    public void fixBug(){
        System.out.println("Dang fix bug");
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
                ", OvertimHours=" + getOvertimeHours() +
                ", caculateSalary=" + caculateSalary() +
                '}';
    }
}
