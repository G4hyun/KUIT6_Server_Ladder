public class Ladder {

    private final int[][] rows;

    //constructor
    public Ladder(int row, int numberOfPerson) {
        rows = new int[row][numberOfPerson];
    }

    public void drawLine(Position position) {
            if(position.isValid(rows.length, rows[0].length)){ //행, 열 크기를 보내줌
            int line1 = position.getLine1() - 1;
            int line2 = position.getLine2() - 1;
            int height = position.getHeight() - 1;
            for (int i = line1; i <= line2; i++) {
                rows[height][i] = 1;             //이어진 다리 true 대신 1로 표시
            }
        }
    }

    public void showLadder() {
        for (int[] row : rows) {
            for (int j = 0; j < rows[0].length; j++) {
                System.out.print(row[j] + " ");
            }
            System.out.println();
        }
    }

    public int run(int startNum) {
        Coord pres = new Coord(0, startNum - 1);
        //우선순위: 오른쪽->아래->왼쪽 사다리를 따라감
        int down, left, right;
        down = pres.getRow();
        left = right = pres.getCol();
        do {
            moveCoord(pres, down, left, right);
        } while (pres.getRow() != rows.length - 1); //가장 마지막 row 까지 좌표이동 반복
        System.out.println("result: "+(pres.getCol()+1));
        return pres.getCol()+1;
    }

    //실제 좌표를 이동하는 메서드
    public void moveCoord(Coord pres, int down, int left, int right) {
        if (pres.getRow() < rows.length - 1) {
            down = pres.getRow() + 1;
        }
        if (pres.getCol() > 0) {
            left = pres.getCol() - 1;
        }
        if (pres.getCol() < rows[0].length - 1) {
            right = pres.getCol() + 1;
        }

        //좌표 이동 반복
        if (rows[pres.getRow()][right] == 1) {
            rows[pres.getRow()][pres.getCol()] = 0;         //왔던 곳 제외하기 위한 flag: 0찍고 넘어가기
//                while(rows[pres.getRow()][pres.getCol()]==1&&pres.getCol()<rows[0].length-1) {
//                pres.setCol(right++);
//            }
            pres.setCol(right);
            return;
        }
        if (rows[pres.getRow()][left] == 1) {
            rows[pres.getRow()][pres.getCol()] = 0;
//            while(rows[pres.getRow()][pres.getCol()]==1&&pres.getCol()>0) {
//                pres.setCol(left--);
//            }
            pres.setCol(left);
            return;
        }
        pres.setRow(down);
    }
}
