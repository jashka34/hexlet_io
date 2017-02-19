package io.hexlet.xo.controllers;


import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Figure;
import io.hexlet.xo.model.Point;
import io.hexlet.xo.model.exceptions.AlreadyOccupiedException;
import io.hexlet.xo.model.exceptions.InvalidPointException;

public class MoveController {

    public static void applyFigure(final Field field,
                                   final Point point,
                                   final Figure figure)
    // BEGIN (write your solution here)
    throws AlreadyOccupiedException, InvalidPointException
    // END
    {
        // BEGIN (write your solution here)
        if (field.getFigure(point) != null) {
            throw new AlreadyOccupiedException();
        }

        field.setFigure(point,figure);

        // END
        field.setFigure(point, figure);
    }

}
