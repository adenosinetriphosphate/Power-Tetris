import static org.junit.Assert.*;
import junit.framework.TestCase;
import org.junit.Test;


public class MainMenuTest extends TestCase {

  @Test
  public void testDefaultConstructor() throws Error {
    try {
      MainMenu mainMenu = new MainMenu();
    }
    catch(Error e) {
      fail("Default Constructor did not exit");
    }
  }
  
  public void testNonDefaultConstructor() throws Error {
    try {
      MainMenu mainMenu = new MainMenu(0);
    }
    catch(Error e) {
      fail("Not yet implemented");  
    }      
  }
  


}
