import com.cjapp.dao.IUserDao;
import com.cjapp.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

/**
 * Created by cj on 2016/11/10.
 */
public class testMybaits {
    @Resource
    private IUserService userService = null;

    public void test1(){};

    public static void main(String[] args) {
        System.out.println(231);
        ApplicationContext ctx=null;
       ctx=new ClassPathXmlApplicationContext("classpath:/spring-mybatis.xml");
        IUserDao userDao = ctx.getBean(IUserDao.class);
       /* String[] beanNamesForType = ctx.getBeanNamesForType(IUserDao.class);
        for (int i = 0; i <beanNamesForType.length ; i++) {
            System.out.println(beanNamesForType[i]);
        }*/
//        IUserDao userDao=(IUserDao) ctx.getBean("userServicerDao");
        System.out.println(userDao);
    }
}
