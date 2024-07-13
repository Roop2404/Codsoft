import java.util.Scanner;

class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentName;
        double math, java, ai, eng, it, py, totalMarks, avgPercentage;
        char grade;

        System.out.println("Enter Student name:");
        studentName = scanner.nextLine(); // Using nextLine() to read the full name

        System.out.println("Enter obtained Maths marks out of 100:");
        math = scanner.nextDouble();

        System.out.println("Enter obtained Java marks out of 100:");
        java = scanner.nextDouble();

        System.out.println("Enter obtained Artificial Intelligence marks out of 100:");
        ai = scanner.nextDouble();

        System.out.println("Enter obtained English marks out of 100:");
        eng = scanner.nextDouble();

        System.out.println("Enter obtained Information Technology marks out of 100:");
        it = scanner.nextDouble();

        System.out.println("Enter obtained Python marks out of 100:");
        py = scanner.nextDouble();

        totalMarks = math + java + ai + eng + it + py;
        avgPercentage = totalMarks / 6;

        System.out.println("Total Marks: " + totalMarks);

        if (avgPercentage >= 80) {
            grade = 'A';
        } else if (avgPercentage >= 60) {
            grade = 'B';
        } else if (avgPercentage >= 40) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        System.out.println("Average Percentage: " + avgPercentage);
        System.out.println("Grade: " + grade);

        scanner.close(); // Close the scanner to avoid resource leaks
    }
}
