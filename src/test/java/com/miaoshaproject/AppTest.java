package com.miaoshaproject;

import static org.junit.Assert.assertTrue;

import com.miaoshaproject.dao.UserDOMapper;
import com.miaoshaproject.dataobject.UserDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

/**
 * Unit test for simple App.
 */

@ContextConfiguration
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    @Autowired(required = false)
    private UserDOMapper userDOMapper;

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void MapperTest() {
        System.out.println(userDOMapper.selectByPrimaryKey(1));
        UserDO userDO = new UserDO();
        userDO.setName("pang");
        userDO.setGender(new Byte(String.valueOf(1)));
        userDO.setAge(12);
        userDO.setId(2);
        userDO.setRegisterMode("byphone");
        userDO.setTelphone("123");
        userDOMapper.insertSelective(userDO);
    }
}
