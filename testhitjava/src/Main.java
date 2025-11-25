import model.Developer;
import model.Device;
import model.Employee;
import model.Tester;
import service.IEmployeeService;
import service.impl.IEmployeeServiceImpl;

import java.util.Scanner;

public class Main{


    public static void main(String[] args) {
        IEmployeeServiceImpl employeeService = new IEmployeeServiceImpl();
        Scanner sc = new Scanner(System.in);

        Employee em1 = new Developer("Minh", 24, 500.0, new Device("dell"), 23);
        Employee em2 = new Developer("Nam", 25, 600.0, new Device("levono"), 25);
        Employee em3 = new Developer("Tiep", 26, 700.0, new Device("asus"), 26);
        Employee em4 = new Tester("A", 28, 450.0, new Device("asus"), 15);
        Employee em5 = new Tester("B", 30, 650.0, new Device("dell"), 30);

        employeeService.dSEmployees.add(em1);
        employeeService.dSEmployees.add(em2);
        employeeService.dSEmployees.add(em3);
        employeeService.dSEmployees.add(em4);
        employeeService.dSEmployees.add(em5);



        int choice;
        do{
            System.out.println("----- Menu -----\n" +
                    "1. In ra danh sách tất cả các nhân viên\n" +
                    "2. In ra thông tin nhiên viên theo ID\n" +
                    "3. Lọc ra danh sách nhân viên theo Tên \n" +
                    "4. Thoát");

            System.out.print("Vui long chon chuc nang: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    for(Employee e : employeeService.dSEmployees) {
                        System.out.println(e);
                    }
                    break;
                case 2:
                    System.out.print("Nhap id can tim: ");
                    String id = sc.nextLine();
                    Employee el = employeeService.getEmployeeById(id);
                    if(el!=null){
                        System.out.println(el.toString());
                    }else{
                        System.out.println("Khong tim thay nhan vien co id: " + id);
                    }

                case 3:
                    System.out.print("Nhap ten can tim: ");
                    String name = sc.nextLine();
                    List<Employee> ep = employeeService.getEmployeeByName(name);
                    if(ep!=null){
                        System.out.println(ep.toString());
                    }else{
                        System.out.println("Khong tim thay nhan vien co ten: " + name);
                    }
                case 4:
                    System.out.println("Thoat");
                default:
                    System.out.println("Lua chon khong hop le !!! Yeu cau nhap lai");
            }
        }while (choice != 4);

    }
}
