public class Coord {
    private int row;
    private int col;

    public Coord(int row, int col) {
        this.row = row;
        this.col = col;
    }

    //getter
    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    //setter
    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }
}
