import org.junit.*;
import static org.junit.Assert.assertEquals;

public class BusTest {

  Bus bus;
  People people;

  @Before
  public void before(){
    this.bus = new Bus("Dalry", 25);
    this.people = new People();
  }

  @Test
  public void hasDestination(){
    String destination = bus.getDestination();
    assertEquals("Dalry", destination);
  }

  @Test
  public void hasRouteNumber(){
    int number = bus.getRouteNumber();
    assertEquals(25, number);
  }
}
