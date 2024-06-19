package piece;

import main.GamePanel;
import main.Type;

public class Rook extends Piece {
    public Rook(int color, int row, int col) {
        super(color, row, col);

        type = Type.ROOK;

        if(color == GamePanel.WHITE) {
            image = getImage("/piece/w-rook");
        }
        else {
            image = getImage("/piece/b-rook");
        }
    }

    public boolean canMove(int targetCol, int targetRow) {

        if(isWithinBoard(targetCol,targetRow) && isSameSquare(targetCol,targetRow) == false) {
            // Rook can move as long as either its col or row is the same
            if(targetCol == preCol || targetRow == preRow) {
                if(isValidSquare(targetCol,targetRow) && pieceIsOnStraightLine(targetCol,targetRow) == false) {
                    return true;
                }
            }
        }
        return false;
    }
}
