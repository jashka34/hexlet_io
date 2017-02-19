package io.hexlet.xo.model;


import io.hexlet.xo.model.exceptions.InvalidPointException;


public class Field {

    private static final int MIN_COORDINATE = 0;

    private final Figure[][] field;

    private final int filedSize;

    public Field(final int filedSize) {
        this.filedSize = filedSize;
        field = new Figure[filedSize][filedSize];
    }

    public int getSize() {
        return filedSize;
    }

    public Figure getFigure(final Point point)
    // BEGIN (write your solution here)
    throws InvalidPointException
    // END
    {
        // BEGIN (write your solution here)
        if (point.getX() < 0 || point.getX() > 2 ||
            point.getY() < 0 || point.getY() > 2     ) {
            throw new InvalidPointException();
        }
        // END
        return field[point.getX()][point.getY()];
    }

    public void setFigure(final Point point, final Figure figure)
    // BEGIN (write your solution here
    throws InvalidPointException
    // END
    {
        // BEGIN (write your solution here)
        if (point.getX() < 0 || point.getX() > 2 ||
                point.getY() < 0 || point.getY() > 2     ) {
            throw new InvalidPointException();
        }
        // END
        field[point.getX()][point.getY()] = figure;
    }

    // BEGIN (write your solution here)


    // END

}
