import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Point;
import io.hexlet.xo.model.Player;
import io.hexlet.xo.model.Game;
import io.hexlet.xo.model.Figure;
import io.hexlet.xo.model.exceptions.*;
import io.hexlet.xo.view.*;
import io.hexlet.xo.controllers.*;

import java.util.Arrays;


public class Main {

    public static void main(String... args) {
        final Field field = new Field(3);
        final Player p = new Player("Slava", Figure.X);
        final Player p2 = new Player("Gleb", Figure.O);
        final Game g = new Game.Builder().player1(p).player2(p2).field(field).name("XO").build();

        //final MoveController mC = new MoveController();



        if (!g.getPlayer1().equals(p)) throw new RuntimeException(String.format("Game.getPlayer1 returns %s instead of %s", g.getPlayer1(), p));
        if (!g.getPlayer2().equals(p2)) throw new RuntimeException(String.format("Game.getPlayer2 returns %s instead of %s", g.getPlayer2(), p2));

        try {
            field.getFigure(new Point(-1, 1));
            throw new RuntimeException("Field do not throw Exception when reading the (Point -1, -1).");
        } catch (final InvalidPointException e) {}
        try {
            field.setFigure(new Point(-1, 1), Figure.X);
            throw new RuntimeException("Field do not throw Exception when setting to the (Point -1, -1).");
        } catch (final InvalidPointException e) {}

        try {
            MoveController.applyFigure(field, new Point(-1, 99), Figure.X);
            throw new RuntimeException("MoveController do not throw Exception when reading the (Point -1, 99).");
        } catch (final InvalidPointException e) {

        } catch (final AlreadyOccupiedException e) {
            throw new RuntimeException("InvalidPointException was expected (for the point -1, 99), but got AlreadyOccupiedException.");
        }

        try {
            field.setFigure (new Point(1, 1), Figure.X);
            MoveController.applyFigure(field, new Point(1, 1), Figure.X);
            throw new RuntimeException("MoveController do not throw Exception when the Point is already occupied.");
        } catch (final AlreadyOccupiedException e) {

        } catch (final InvalidPointException e) {
            throw new RuntimeException("AlreadyOccupiedException was expected (for the point 1, 1 & Figure.X), but got InvalidPointException.");
        }

    }

}
