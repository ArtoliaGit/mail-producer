package com.artolia.mailproducer;

import com.artolia.mailproducer.entity.MstDict;
import com.artolia.mailproducer.mapper.MstDictMapper;
import com.artolia.mailproducer.service.UserService;
import com.github.pagehelper.PageHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailProducerApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() throws Exception {

        userService.selectList();
    }

    @Resource
    private MstDictMapper mstDictMapper;

    @Test
    public void test1() {
        PageHelper.startPage(1, 2);
        List<MstDict> list = mstDictMapper.selectAll();
        for (MstDict mstDict : list) {
            System.out.println(mstDict.getName());
        }
    }

}
