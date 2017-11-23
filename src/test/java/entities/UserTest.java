package entities;

import org.junit.Test;

import entitites.User;

public class UserTest {

    @Test
    public void test1() {
        User user = new User();
        user.setFirstName("Jean");
//        Assert.assertThat(user.getLastName(), IsEqual.equalTo("Jean"));
    }

    @Test
    public void test2() {
        User user = new User();
        user.setLastName("Dupont");
//        Assert.assertThat(user.getLastName(), IsEqual.equalTo("Dupont"));
    }

}
