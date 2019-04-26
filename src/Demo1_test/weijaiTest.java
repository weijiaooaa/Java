package Demo1_test;

import Demo1.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)//帮我们创建容器

//指定创建容器使用哪个配置文件
@ContextConfiguration("classpath:applicationContext.xml")
public class weijaiTest {
    @Resource(name = "user")
    private User u;

    @Test
    public void fun1(){
        System.out.println(u);
    }

    @Test
    public void fun2(){
        System.out.println(u);
    }@Test
    public void fun3(){
        System.out.println(u);
    }
}
