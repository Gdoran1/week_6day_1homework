import org.junit.*;
import static org.junit.Assert.assertEquals;

public class StopTest {

  Stop stop;
  People people;

  @Before
  public void before(){
    this.stop = new Stop("Haymarket");
    this.people = new People();
  }

  @Test
  public void hasLocation() {
    String location = stop.getLocation();
    assertEquals("Haymarket", location);
  }
}
