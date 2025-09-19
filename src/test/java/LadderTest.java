import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LadderTest {
        private Ladder ladder;
        @BeforeEach
        void setUp() {
            ladder = new Ladder(7, 7);
            ladder.drawLine(new Position(1, 2, 1));
            ladder.drawLine(new Position(2, 4, 2));
            ladder.drawLine(new Position(3, 4, 3));
            ladder.drawLine(new Position(5, 6, 5));
            ladder.drawLine(new Position(3, 5, 6));
        }

        @Test
        @DisplayName("정상 작동하는 지 테스트")
        void run() {
//        ladder.showLadder();
//            System.out.println(ladder.run(1));
//            ladder.showLadder();
            assertAll(
                    () -> assertEquals(5, ladder.run(1))
//                    () -> assertEquals(3, ladder.run(6)),
//                    () -> assertEquals(3, ladder.run(7))
            );
    }
}