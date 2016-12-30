import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by cj on 2016/12/30.
 */
public class testspring {

    @Test
    public void initBean(){
        BeanFactory xmlBeanFactory = new ClassPathXmlApplicationContext("spring.xml");
        testMybean mytestBean = (testMybean) xmlBeanFactory.getBean("mytestBean");
        System.out.println(mytestBean.getName());
    }
}
