import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class SILab2Test extends SILab2 {


  public void test(){

    User user = new User("Elanur", "password","elanurlilai@gmail.com" );
    List<String> users = new ArrayList<>();
    users.add("Elanur");
    users.add("ela");
    assertEquals(SILab2.function(user,users), true);
    users.add("ela@gmail.com");
    users.add("elanurlilai@gmail.com");
    assertEquals(SILab2.function(user,users), true);

  }
}