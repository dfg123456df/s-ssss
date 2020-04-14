package it.chen;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import it.chen.domain.User;
import it.chen.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest("classes=UserApplication.class")
public class MybatisTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void find() throws JsonProcessingException {

        BoundValueOperations<String, String> valueOperations = redisTemplate.boundValueOps("findall");
        String jsonvalue = valueOperations.get();
        if(null==jsonvalue){
            List<User> all = userMapper.findAll();
            ObjectMapper objectMapper = new ObjectMapper();
            jsonvalue = objectMapper.writeValueAsString(all);
            redisTemplate.boundValueOps("findall").set(jsonvalue);
            System.out.println("数据库");

        }else {

            System.out.println("缓存。");
        }

        System.out.println(jsonvalue);
        System.out.println(valueOperations);
        System.out.println(".....................");
    }
}
