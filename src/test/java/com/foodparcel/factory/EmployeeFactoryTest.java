package com.foodparcel.factory;

/**
 * Author: Nico Fortuin
 * Student number: 216237912
 * */

import com.foodparcel.entity.Employee;
import org.junit.Assert;
import org.junit.Test;

import java.util.UUID;
import static org.junit.Assert.*;

public class EmployeeFactoryTest {

    @Test
    public void getEmployee() {
        Employee employee = EmployeeFactory.createEmployee(
                "123456","Nico", "Fortuin", "1 June 2020");

        System.out.println(employee);

        Assert.assertNotNull(employee);
        Assert.assertNotEquals(UUID.randomUUID().toString(), employee.getEmployeeNumber());
    }
}