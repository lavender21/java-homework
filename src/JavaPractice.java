public class JavaPractice {
    public static void main(String[] args) {
        TriangleExercises triangleExercises = new TriangleExercises();
        System.out.println("Easiest exercise ever\n");
        triangleExercises.easiestExercise();
        System.out.println("Draw a horizontal line\n");
        triangleExercises.drawHorizontalLine(8);
        System.out.println("Draw a horizontal line\n");
        triangleExercises.drawVerticalLine(3);
        System.out.println("Draw a triangle line\n");
        triangleExercises.drawTriangle(3);

        DiamondExercises diamondExercises = new DiamondExercises();
        System.out.println("Isosceles Triangle\n");
        diamondExercises.isoscelesTriangle(3);
        System.out.println("Diamond\n");
        diamondExercises.diamond(3);
        System.out.println("Diamond with name\n");
        diamondExercises.diamondWithName(3,"Bill");

        System.out.println("FizzBuzz:");
        FizzBuzz fb = new FizzBuzz();
        fb.fizzBuzz(100);
        fb.generate(30);
    }
}
