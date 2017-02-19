package io.hexlet.xo.view;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Point;
import io.hexlet.xo.model.exceptions.InvalidPointException;

import java.util.Random;
// BEGIN (write your solution here)
//import io.hexlet.xo.model.Figure;
class RandomCoordinateGetter implements ICoordinateGetter {

    public RandomCoordinateGetter() {
    }

//    private String[][] fillZan(Field field) {
//
//        String ret[][] = new String[3][3];
//
//        for (int i=0; i < 3; i++) {
//            for (int i2=0; i2 < 3; i2++) {
//                if (field.getFigure(new Point(i,i2)) != null)
//                    ret[i][i2] = "X";
//            }
//        }
//        return ret;
//    }
//
    public Point getMoveCoordinate(Field field){
//
//        String zan[][] = fillZan(field);
//
//        Random rnd = new Random();
//        boolean flag = true;
//        int rndX;
//        int rndY;
//
//        do {
//
//            rndX = rnd.nextInt(3);
//            rndY = rnd.nextInt(3);
//
//            if (zan[rndX][rndY] == null) {
//                flag = false;
//            }
//
//        } while (flag);
//
//        return new Point(rndX,rndY);
        return new Point (0,0);
    }

}
// END
// --
