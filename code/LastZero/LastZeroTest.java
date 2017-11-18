import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LastZeroTest
{
   // this test fails!
   @Test public void multipleZeroes()
   {
      int arr[] = {0, 1, 0};
      assertEquals("Multiple zeroes: should find last one", 2, LastZero.lastZero(arr));
   }

   @Test public void anyZeroes()
   {
      int arr[] = {2, 1, 3};
      assertEquals("Any zeroes: not should find zeroes", -1, LastZero.lastZero(arr));
   }
   
   @Test public void uniqueZero()
   {
      int arr[] = {2, 1, 0};
      assertEquals("Unique zero: should find last one", 2, LastZero.lastZero(arr));
   }
}
