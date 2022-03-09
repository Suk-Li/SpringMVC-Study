package site.whatsblog.controller;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.whatsblog.pojo.User;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/3/9 16:05</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
@RestController
public class UserController {
    @Autowired
    ObjectMapper mapper;

    @RequestMapping("/json")
    public String json() throws JsonProcessingException {
        User user = new User("你好", 18, 1);
        return mapper.writeValueAsString(user);
    }

    @RequestMapping("/json2")
    public List<User> json2(){
        List<User> users = new ArrayList<>();
        users.add(new User("Suk1",18,1));
        users.add(new User("Suk2",18,1));
        users.add(new User("Suk3",18,1));
        users.add(new User("Suk4",18,1));
        users.add(new User("Suk5",18,1));
        return users;
    }

    @RequestMapping("/json3")
    public String json3() throws JsonProcessingException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return mapper.writeValueAsString(sdf.format(new Date()));
    }
    @RequestMapping("/json4")
    public String json4(){
        List<User> users = new ArrayList<>();
        users.add(new User("Suk1",18,1));
        users.add(new User("Suk2",18,1));
        users.add(new User("Suk3",18,1));
        users.add(new User("Suk4",18,1));
        users.add(new User("Suk5",18,1));
        return JSONObject.toJSONString(users);
    }
}
