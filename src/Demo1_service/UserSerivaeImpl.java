package Demo1_service;

import org.springframework.stereotype.Component;

@Component("userService")
public class UserSerivaeImpl implements UserService {
    @Override
    public void save() {
        System.out.println("保存用户。。。");
    }

    @Override
    public void add() {
        System.out.println("增加用户。。。");
    }

    @Override
    public void delete() {
        System.out.println("删除用户。。。");
    }

    @Override
    public void update() {
        System.out.println("更新用户。。。");
    }
}
