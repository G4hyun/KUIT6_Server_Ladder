import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LadderCreateTest {
    LadderCreator ladderCreator;
    Ladder ladder;

    @BeforeEach
    void setUp() {
        ladderCreator = new LadderCreator(7, 7);
    }

    @Test
    @DisplayName("사다리 생성 확인")
    void createTest(){
        assertThat(ladderCreator).isNotNull();
    }

    @Test
    @DisplayName("사다리 연결")
    void drawAndShowLadder(){
        ladderCreator.drawLine(new Position(1, 2));
        ladderCreator.drawLine(new Position(2, 3));
        ladderCreator.drawLine(new Position(4, 0));
        ladderCreator.drawLine(new Position(5, 5));
        ladder = new Ladder(ladderCreator.getRows());
        ladder.showTotalLadder();
    }

}
