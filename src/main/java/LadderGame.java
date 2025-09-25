public class LadderGame {
        private int nuberOfLines;
        private int rowSize;
        private int numberOfPerson;

    private LadderGame(int rowSize, int numberOfPerson) {
        this.nuberOfLines = (int)(rowSize*numberOfPerson*0.3);
        this.rowSize = rowSize;
        this.numberOfPerson = numberOfPerson;
    }

//    public static LadderGame createRandomLadderGame(){
//
//    }
}
