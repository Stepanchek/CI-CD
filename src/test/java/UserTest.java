import org.example.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class UserTest {
    @Test
    void test(){
        int money = 100;
        String name = "Stepan";
        String username = "Zdjor";

        User user = new User(1000,"Stepan","Zdjor");

        assertNotEquals(money,user.getMoney());
        assertEquals(name, user.getName());
        assertEquals(username, user.getUsername());
    }
}
