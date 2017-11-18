import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class CountPositiveTest
{
   // this test fails!
   @Test public void arrayContainsZeroes()
   {
      int arr[] = {-4, 2, 0, 2};
      assertEquals("Array contains zeroes", 2, CountPositive.countPositive(arr));
   }

   @Test public void arrayNotContainsZeroes()
   {
      int arr[] = {-4, 2, -3, 2};
      assertEquals("Array not contains zeroes", 2, CountPositive.countPositive(arr));
   }
}
