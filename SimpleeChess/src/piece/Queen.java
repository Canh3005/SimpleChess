package piece;

import main.GamePanel;
import main.Type;

public class Queen extends Piece {
    public Queen(int color, int row, int col) {
        super(color, row, col);

        type = Type.QUEEN;

        if(color == GamePanel.WHITE) {
            image = getImage("/piece/w-queen");
        }
        else {
            image = getImage("/piece/b-queen");
        }
    }

    public boolean canMove(int targetCol, int targetRow) {

        if(isWithinBoard(targetCol,targetRow) && isSameSquare(targetCol,targetRow) == false) {

            // Vertical & Horizontal
            if(targetCol == preCol || targetRow == preRow) {
                if(isValidSquare(targetCol,targetRow) && pieceIsOnStraightLine(targetCol,targetRow) == false) {
                    return true;
                }
            }
            // Diagonal
            if(Math.abs(targetCol - preCol) == Math.abs(targetRow - preRow)) {
                if (isValidSquare(targetCol, targetRow) && pieceIsOnDiagonalLine(targetCol, targetRow) == false) {
                    return true;
                }
            }
        }
        return false;
    }
}
