import com.cjapp.dao.IUserDao;
import com.cjapp.entity.User;
import com.cjapp.service.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.TestExecutionListeners;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by cj on 2016/11/10.
 */
public class testMybaits {
    @Resource
    private IUserService userService = null;

    public void test1(){};

    public static void main(String[] args) {
        System.out.println(23134);
        ApplicationContext ctx=null;
        ctx=new ClassPathXmlApplicationContext("classpath:/spring-mybatis.xml");
        IUserDao userDao = ctx.getBean(IUserDao.class);
        List<User> all = userDao.findAll();
        System.out.println(all);

    }
    @Test
    public void tuser(){
        ApplicationContext ctx=null;
        ctx=new ClassPathXmlApplicationContext("classpath:/spring-mybatis.xml");
        IUserDao userDao = ctx.getBean(IUserDao.class);
        List<User> all = userDao.findAll();
        System.out.println(all);
    }


}
