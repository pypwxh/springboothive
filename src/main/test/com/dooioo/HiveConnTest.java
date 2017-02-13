package com.dooioo;


import com.dooioo.model.BaseItem;
import com.dooioo.model.BaseItemMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Starter.class)
@WebAppConfiguration
public class HiveConnTest {

    @Resource(name = "hiveJdbcTemplate")
    private JdbcTemplate hiveJdbcTemplate;
    @Resource(name = "impalaJdbcTemplate")
    private JdbcTemplate impalaJdbcTemplate;

    @Test
    public void hiveConnTest(){
        String sql = "select * from personadw.person_weiliao";
        List<BaseItem> baseItemList = hiveJdbcTemplate.query(sql, new BaseItemMapper());
        System.out.println("count:"+baseItemList.size());
    }

    @Test
    public void impalaConnTest(){
        String sql = "select * from personadw.person_weiliao";
        List<BaseItem> baseItemList = hiveJdbcTemplate.query(sql, new BaseItemMapper());
        System.out.println("count:"+baseItemList.size());
    }
}
