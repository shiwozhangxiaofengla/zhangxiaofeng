package com.lynn.feign;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by admin on 2019/4/22.
 */
@SpringBootTest(classes = ApplicationFeign.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class ApplicationFeignTest {

    @Autowired
    private ApiService apiService;

    @Test
    public void test(){
        try {
            System.out.println(apiService.index());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}