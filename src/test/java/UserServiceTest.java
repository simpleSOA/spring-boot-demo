import com.springboot.Application;
import com.springboot.domain.User;
import com.springboot.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class UserServiceTest {

    @Resource
    private UserService service;

    @Test
    public void save(){
        User user = new User();
        user.setName("first");
        user.setId(1L);
        service.insertUser(user);
    }
}
