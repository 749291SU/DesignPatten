package demo;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * @projectName: LearnJava
 * @package: demo
 * @className: Demeter
 * @author: 749291
 * @description: TODO
 * @date: 2/21/2023 4:13 PM
 * @version: 1.0
 */

public class Demeter {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployeeList(new CollegeManager());
    }
}

@AllArgsConstructor
@Getter
class SchoolEmployee {
    private int id;
}

@AllArgsConstructor
@Getter
class CollegeEmployee {
    private int id;
}

class SchoolManager {
    public List<SchoolEmployee> getSchollEmployeeList() {
        List<SchoolEmployee> schoolEmployeeList = new ArrayList<>();
        for (int i = 0; i < 5; i ++) {
            schoolEmployeeList.add(new SchoolEmployee(i));
        }
        return schoolEmployeeList;
    }

    public void printAllEmployeeList(CollegeManager collegeManager) {
        collegeManager.printCollegeEmployeeList();
        List<SchoolEmployee> schoolEmployeeList = getSchollEmployeeList();
        for (SchoolEmployee schoolEmployee : schoolEmployeeList) {
            System.out.println("school Employee id: " + schoolEmployee.getId());
        }
    }
}

class CollegeManager {
    public List<CollegeEmployee> getCollegeEmployee() {
        List<CollegeEmployee> collegeEmployeeList = new ArrayList<>();
        for (int i = 0; i < 10; i ++) {
            collegeEmployeeList.add(new CollegeEmployee(i));
        }
        return collegeEmployeeList;
    }

    public void printCollegeEmployeeList() {
        List<CollegeEmployee> collegeEmployeeList = getCollegeEmployee();
        for (CollegeEmployee collegeEmployee : collegeEmployeeList) {
            System.out.println("collegeEmployee id: " + collegeEmployee.getId());
        }
    }
}