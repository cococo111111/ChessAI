package dk.dtu.ait.chess.at.chess;

import dk.dtu.ait.chess.at.chess.figures.Figure;

/**
 * This class represents a move.
 *
 * Therefore it saves the value of the field and the figure on this field where the moves starts ("old"-values),
 * and the field where the move goes ("new"-values). Additional there is a special-variable, containing if there is
 * a move like a pawn promotion or a castling.
 */
public class Move {
    /**
     * The field on which the move starts
     */
    private int oldField;
    /**
     * The field on which the move ends
     */
    private int newField;
    /**
     * Indicates if this instance is a special move
     */
    private boolean special;
    /**
     * The figure standing on the starting (old) field
     */
    private Figure oldFigure;
    /**
     * The figure standing on the ending (new) field
     */
    private Figure newFigure;



    /**
     * Returns the field on which the move starts
     * @return The field on which the move starts
     */
    public int getOldField() {
        return oldField;
    }

    /**
     * Returns the field on which the move ends
     * @return The field on which the move ends
     */
    public int getNewField() {
        return newField;
    }

    /**
     * Returns if the move is a special one
     * @return True if the move is a special one, otherwise false
     */
    public boolean getSpecial() {
        return special;
    }

    /**
     * Returns the figure standing on the starting field
     * @return The figure standing on the starting field
     */
    public Figure getOldFigure() {
        return oldFigure;
    }

    /**
     * Returns the figure standing on the ending field
     * @return The figure standing on the ending field
     */
    public Figure getNewFigure() {
        return newFigure;
    }

    public void setNewField(int newField) {
        this.newField = newField;
    }

    public void setNewFigure(Figure newFigure) {
        this.newFigure = newFigure;
    }

    public void setOldField(int oldField) {
        this.oldField = oldField;
    }

    public void setOldFigure(Figure oldFigure) {
        this.oldFigure = oldFigure;
    }

    public void setSpecial(boolean special) {
        this.special = special;
    }
}
