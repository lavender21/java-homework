public class TriangleExercises {

    public void easiestExercise() {
        System.out.println('*');
    }

    public void drawHorizontalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print('*');
        }
        System.out.println();
    }

    public void drawVerticalLine(int n) {
        for (int i = 0; i < n; i++) {
            this.easiestExercise();
        }
    }

    public void drawTriangle(int n) {
        for (int i = 0; i <= n; i++) {
            this.drawHorizontalLine(i);
        }
    }
}
