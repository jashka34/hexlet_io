package io.hexlet.xo.view;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Point;
import io.hexlet.xo.model.Figure;
import io.hexlet.xo.model.exceptions.InvalidPointException;
import io.hexlet.xo.view.RandomCoordinateGetter;

public class AICoordinateGetter /*extends RandomCoordinateGetter*/ implements ICoordinateGetter
{

    private Point findTwoPointLines(Field field, Figure figure) {

//        Point nullPoint = null;
//
//        for (int i=0; i < 3; i++) {
//            int count = 0;
//            for (int i2=0; i2 < 3; i2++) {
//                Point curPoint = new Point(i, i2);
//                Figure curFigure = field.getFigure(curPoint);
//                if (curFigure == figure){
//                    count += 1;
//                } else if (curFigure == null) {
//                    nullPoint = new Point(curPoint.getX(),curPoint.getY());
//                }
//            }
//            if (count == 2) {
//                break;
//            } else {
//                nullPoint = null;
//            }
//        }
//
//        if (nullPoint == null) {
//            for (int i = 0; i < 3; i++) {
//                int count = 0;
//                for (int i2 = 0; i2 < 3; i2++) {
//                    Point curPoint = new Point(i2, i);
//                    Figure curFigure = field.getFigure(curPoint);
//                    if (curFigure == figure) {
//                        count += 1;
//                    } else if (curFigure == null) {
//                        nullPoint = new Point(curPoint.getX(), curPoint.getY());
//                    }
//                }
//                if (count == 2) {
//                    return nullPoint;
//                } else {
//                    nullPoint = null;
//                }
//            }
//        }
//
//        if (nullPoint != null ) {
//            return  nullPoint;
//        }

        return null;

    }

    public Point getMoveCoordinate(final Field field) {
        // BEGIN (write your solution here)
        //RandomCoordinateGetter cg = new RandomCoordinateGetter();
        //return cg.getMoveCoordinate(field);

//        if (field.getFigure(new Point(1,1)) == null)
//            return new Point(1,1);
//
//        Point pointTwoLinesY = findTwoPointLines(field, Figure.O);
//
//        if (pointTwoLinesY != null) {
//            return pointTwoLinesY;
//        }
//
//        Point pointTwoLinesX =  findTwoPointLines(field, Figure.X);
//        if (pointTwoLinesX != null) {
//            return pointTwoLinesX;
//        }

        RandomCoordinateGetter cg = new RandomCoordinateGetter();
        return cg.getMoveCoordinate(field);

        // END
    }

}
