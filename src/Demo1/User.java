package Demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

//<bean name="user" class="Demo1.User">

    //@Service("user") Service层
    //@Controller("user") Web层
    //@Repository("user") dao层

//指定对象的注入范围
@Scope(scopeName = "singleton")
@Component("user")
public class User {
    @Value("Tom")
    private String name;
    @Value(value="18")
    private int age;

   // @Autowired//自动装配         存在的问题：如果匹配多个类型一致的对象，将无法选择具体注入哪一个对象
   // @Qualifier("car2") //使用@Qualifier()注解告诉spring容器自动装配哪个名称的对象，可与@AutoWired配对使用
    @Resource(name = "car2") //手动注入指定对象（最好的方式）
    private Car car;

    @PostConstruct  //在对象被构造后调用  ==  init-method
    public void init(){
        System.out.println("我是初始化方法。。。");
    }

    @PreDestroy   //在销毁前使用    ==  destory-method
    public void destory(){
        System.out.println("我是销毁方法。。。");
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Car getCar() {
        return car;
    }
}
