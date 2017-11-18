import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class OddOrPosTest
{
   // this test fails!
   @Test public void negativeOddNumbers()
   {
      int arr[] = {-3, -2, 0, 1, 4};
      assertEquals("Negative odd numbers in array", 3, OddOrPos.oddOrPos(arr));
   }

   @Test public void postiveOddNumbers()
   {
      int arr[] = {-4, -2, 0, 1, 4};
      assertEquals("Positive odd numbers in array", 2, OddOrPos.oddOrPos(arr));
   }
}
