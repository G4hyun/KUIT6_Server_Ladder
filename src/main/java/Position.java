public class Position {
        private int line1;
        private int line2;
        private int height;

    public Position(int line1, int line2, int height) {
        this.line1=line1;
        this.line2=line2;
        this.height=height;
    }

    //getter
    public int getLine1() {
        return line1;
    }
    public int getLine2() {
        return line2;
    }
    public int getHeight() {
        return height;
    }
    //row, col 이 범위 내의 숫자인지 확인
    public boolean isValid(int rowLength, int colLength) {
        if (isInRange(height, rowLength) && isInRange(line1, colLength)
                && isInRange(line2, colLength)) {
            //연속으로 이어진 다리를 허용함
            return true;
        }
        System.out.println("error: invalid range");
        return false;
    }

    public boolean isInRange(int value, int boundary) {
        if (value-1 <= boundary && value-1>=0)
            return true;
        return false;
    }

}