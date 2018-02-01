package com.candy.crud.test;

import com.candy.crud.dao.DepartmentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * 测试dao层工作
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class EmployeeMapperTest {

    @Autowired
    DepartmentMapper departmentMapper;
    @Test
    public void  testCRUD()
    {

        System.out.println(departmentMapper);
    }
}
