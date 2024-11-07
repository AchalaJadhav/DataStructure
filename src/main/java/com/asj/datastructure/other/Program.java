package com.asj.datastructure.other;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Program {

    public static void main(String[] args) {

//        new  EmployeeAnalysis().sortSimpleArray();

//        new  EmployeeAnalysis().sortWithAge();

        new  EmployeeAnalysis().sortWithAgeAndSalary();

    }
}

@Data
@AllArgsConstructor
class Emp {

    public String name;
    public int age;
    public int salary;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

class EmployeeAnalysis
{
    public void sortWithAge()
    {
        List<Emp> employeeList = new ArrayList<>();
        employeeList.add(new Emp("Ravi Kumar", 28, 50000));
        employeeList.add(new Emp("Arjun Verma", 32, 65000));
        employeeList.add(new Emp("Neha Singh", 45, 82000));
        employeeList.add(new Emp("Aditi Sharma", 32, 75000));
        employeeList.add(new Emp("Priya Patil", 25, 45000));

        List<Emp> sortedList = new ArrayList<>();

        System.out.println("GivenList");
        System.out.println(employeeList);

        employeeList.forEach(employee ->{

            int i=0;

            while(i < sortedList.size() && sortedList.get(i).getAge() < employee.getAge())
            {
                i++;
            }
            sortedList.add(i,employee);

        });

        System.out.println("sortedList");
        System.out.println(sortedList);

    }

    public void sortWithAgeAndSalary()
    {
        List<Emp> employeeList = new ArrayList<>();
        employeeList.add(new Emp("Ravi Kumar", 28, 50000));
        employeeList.add(new Emp("Arjun Verma", 32, 50000));
        employeeList.add(new Emp("Neha Singh", 32, 75000));
        employeeList.add(new Emp("Aditi Sharma", 32, 75000));
        employeeList.add(new Emp("Priya Patil", 25, 45000));

        List<Emp> sortedList = new ArrayList<>();

        System.out.println("GivenList");
        System.out.println(employeeList);

        employeeList.forEach(employee ->{

            int i=0;

            while(i < sortedList.size() && (
                    //32(75)
                    //28 32(65) 45
                    sortedList.get(i).getAge() < employee.getAge() || sortedList.get(i).getSalary() < employee.getSalary()))
            {
                i++;
            }

            sortedList.add(i,employee);

        });

        //Single Line using sort
        employeeList.sort(Comparator.comparing(Emp::getAge).thenComparing(Emp::getSalary).reversed());
        List<String> stringList= employeeList.stream().map(e -> e.name).toList();

        //Single Line using stream (most efficient)
        List<Emp> sortInOneLineUsingStream = employeeList.stream().sorted(Comparator.comparing( Emp::getAge).thenComparing(Emp::getSalary)).toList();

        //Single Line using stream and 2 sorted with comparing( e -> e.getAge()) instead of comparing(Employee::getAge)
        List<Emp> sortInOneLine = employeeList.stream().sorted(Comparator.comparing(e -> e.getAge())).sorted(Comparator.comparing(e -> e.getSalary())).toList();

        System.out.println("sortedList");
        System.out.println(sortInOneLine);

    }

    public void sortSimpleArray()
    {

        List<Integer> integerList = Arrays.asList(7,5,2,6,9);
        List<Integer> sortedList = new ArrayList<>();

        System.out.println("GivenList");
        System.out.println(integerList);

        integerList.forEach(num ->{

            int i=0;

            while(i < sortedList.size() && sortedList.get(i) > num)
            {
                i++;
            }
            sortedList.add(i,num);

        });

        System.out.println("sortedList");
        System.out.println(sortedList);
    }
}