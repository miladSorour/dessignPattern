package sorour.milad.java.creational.factory.factorymethodpattern.after8;

import sorour.milad.java.creational.factory.factorymethodpattern.before8.Circle;
import sorour.milad.java.creational.factory.factorymethodpattern.before8.Rectangle;
import sorour.milad.java.creational.factory.factorymethodpattern.before8.Shape;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * //TODO explain Functionality of this class
 * Revision History:
 * Date            Author           Task ID                         Notes
 * ==========   =================   ==============  ===============================================
 * 2021.06.22   m.sorour
 */
public class ShapeFactory {

    final static Map<String, Supplier<Shape>> map = new HashMap<>();
    static {
        map.put("CIRCLE", Circle::new);
        map.put("RECTANGLE", Rectangle::new);
    }

    public Shape getShape(String shapeType){
        Supplier<Shape> shape = map.get(shapeType.toUpperCase());
        if(shape != null) {
            return shape.get();
        }
        throw new IllegalArgumentException("No such shape " + shapeType.toUpperCase());
    }
}
