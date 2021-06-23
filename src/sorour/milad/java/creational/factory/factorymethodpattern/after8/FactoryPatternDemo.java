package sorour.milad.java.creational.factory.factorymethodpattern.after8;

import java.util.function.Supplier;

/**
 * //TODO explain Functionality of this class
 * Revision History:
 * Date            Author           Task ID                         Notes
 * ==========   =================   ==============  ===============================================
 * 2021.06.22   m.sorour
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {

        Supplier<ShapeFactory> shapeFactory =  ShapeFactory::new;

        //call draw method of circle
        shapeFactory.get().getShape("circle").draw();

        //call draw method of Rectangle
        shapeFactory.get().getShape("rectangle").draw();
    }
}
