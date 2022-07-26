package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_VALUE = 20;
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final Random random = new Random();

    public Drawable getRandomFigure() {
        int shapeNumber = random.nextInt(FIGURE_COUNT);
        Drawable figure = null;

        switch (shapeNumber) {
            case 0:
                figure = new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE));
                break;
            case 1:
                figure = new RightTriangle(
                        colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE)
                );
                break;
            case 2:
                figure = new IsoscelesTrapezoid(
                        colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE)
                );
                break;
            case 3:
                figure = new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE));
                break;
            case 4:
                figure = new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
                break;
            default:
                break;
        }
        return figure;
    }

    public Drawable getDefaultFigure() {
        return new Circle("white", 10);
    }

}