package dk.dtu.ait.chess.at.chess.figures;

import dk.dtu.ait.chess.at.chess.Board;
import dk.dtu.ait.chess.at.chess.Move;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *   This class is the base class for all the figures
 *
 *   It defines the main functions a figure must be able to perform
 */
public abstract class Figure {


    public enum FigureType {
     QUEEN, KING, BISHOP, KNIGHT, PAWN, ROOK
    }
    protected int position;
    private Color color;
    protected int moves;



    public Figure(int position, Color color)
    {
        this.color = color;
        this.position = position;
        this.moves = 0;
    }

    /**
     * Returns the position of the Figure on the Board.
     * @return the position
     */
    public int getPosition() {
        return position;
    }

    /**
     * Sets the position of the figure on the board
     * @param position The new position of the figure
     */
    public void setPosition(int position) {
        this.position = position;
    }

    /**
     * Returns the getColor of the figure
     * @return the getColor of the figure
     */
    public Color getColor()
    {
        return color;
    }

    /**
     * Returns true if the figure has already been moved, otherwise false
     * @return True if the figure has already been moved, otherwise false
     */
    public boolean hasMoved()
    {
       return moves != 0;
    }

    public void increaseMoves() {
        ++moves;
    }

    public void decreaseMoves() {
        --moves;
    }

    /**
     * This function is used to get all the Moves the figure can execute.
     * @return a list with all the possible moves inside.
     */
    public abstract List<Move> getMoves(Board board, ArrayList<Move> firsMoves, Integer first);

    public abstract List<Move> getMoves(Board board, Integer first);


    /**
     * Returns the name of the figure. Not sure if ever used.
     * @return the name of the figure
     */
    public String getName()
    {
        String[] name = this.getClass().getName().split("\\.");
        return name[name.length - 1];
    }

    public abstract FigureType getType();

}
