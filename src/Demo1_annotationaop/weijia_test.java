package Demo1_annotationaop;

import Demo1_service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)//帮我们创建容器

//指定创建容器使用哪个配置文件
@ContextConfiguration("classpath:Demo1_annotationaop/applicationContext.xml")
public class weijia_test {
    @Resource(name = "userService")
    private UserService us;

    @Test
    public void fun1(){
        us.update();
    }
}
