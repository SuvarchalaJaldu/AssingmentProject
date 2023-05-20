package challenge3;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class WhoIsGoingHomeEarlyTests {
    @Test
    public void example() {
        List<Integer> answer = Challenge.whoIsGoingHomeEarly(5, 3);
        List<Integer> expectedSolution = List.of(4, 3);

        assertTrue(answer.equals(expectedSolution));
    }
}