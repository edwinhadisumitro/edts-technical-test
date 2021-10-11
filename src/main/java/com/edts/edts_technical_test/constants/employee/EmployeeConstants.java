package com.edts.edts_technical_test.constants.employee;

import java.util.HashMap;

public class EmployeeConstants {
    public static HashMap<Integer, String> getGradesConstant() {
        // Grade
        HashMap<Integer, String> grade = new HashMap<Integer, String>();
        grade.put(1, "Manager");
        grade.put(2, "Supervisor");
        grade.put(3, "Staff");

        return grade;
    }

    public static HashMap<Integer, Integer> getBonusPercentageConstant() {
        // Bonus Percentage
        HashMap<Integer, Integer> bonusPercentage = new HashMap<Integer, Integer>();
        bonusPercentage.put(1, 10);
        bonusPercentage.put(2, 6);
        bonusPercentage.put(3, 3);

        return bonusPercentage;
    }
}
