import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class DiamondExercises {
    public void isoscelesTriangle(int n) {
        TriangleExercises triangleExercises = new TriangleExercises();
        for (int row = 1, col = 1; row < 2 * n; row = row + 2, col++) {
            int space = n - col;
            while (space-- >= 0) {
                System.out.print(' ');
            }
            triangleExercises.drawHorizontalLine(row);
        }
    }

    public void reverseIsoscelesTriangle(int n) {
        TriangleExercises triangleExercises = new TriangleExercises();
        for (int row = 2 * n - 1, col = 1; row > 0; row = row - 2, col++) {
            int space = col;
            while (space-- > 0) {
                System.out.print(' ');
            }
            triangleExercises.drawHorizontalLine(row);
        }
    }

    public void diamond(int n) {
        this.isoscelesTriangle(n - 1);
        TriangleExercises triangleExercises = new TriangleExercises();
        triangleExercises.drawHorizontalLine(2 * n - 1);
        this.reverseIsoscelesTriangle(n - 1);
    }

    public void diamondWithName(int n, String name) {
        this.isoscelesTriangle(n - 1);
        System.out.println(name);
        this.reverseIsoscelesTriangle(n - 1);
    }
}
