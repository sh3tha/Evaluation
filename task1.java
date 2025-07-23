public class task1 {
    public static String[] reverseStudentNames(String[] names) {
        String[] reversedNames = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            reversedNames[i] = new StringBuilder(names[i]).reverse().toString();
        }
        return reversedNames;
    }

    public static char getLetterGrade(int score) {
        if (score >= 90 && score <= 100) {
            return 'A';
        } else if (score >= 80 && score <= 89) {
            return 'B';
        } else if (score >= 70 && score <= 79) {
            return 'C';
        } else if (score >= 60 && score <= 69) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static String[] findFailingStudents(String[] names, int[] scores) {
        int failCount = 0;
        for (int score : scores) {
            if (score < 60) {
                failCount++;
            }
        }

        String[] failingStudents = new String[failCount];
        int index = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 60) {
                failingStudents[index] = names[i];
                index++;
            }
        }

        return failingStudents;
    }

    public static void main(String[] args) {
        String[] studentNames = {"Sam", "Lara", "Tom","Diana"};
        int[] scores = {88,70, 59, 100};

        String[] reversedNames = reverseStudentNames(studentNames);
        System.out.print("reversed names: {");
        for (int i = 0; i < reversedNames.length; i++) {
            System.out.print(reversedNames[i]);
            if (i < reversedNames.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");



        char[] grades = new char[scores.length];
        for (int i = 0; i < scores.length; i++) {
            grades[i] = getLetterGrade(scores[i]);
        }
        System.out.print("Letter Grades: {");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i]);
            if (i < grades.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        String[] failingStudents = findFailingStudents(studentNames, scores);
        System.out.print("Failing Students: {");
        for (int i = 0; i < failingStudents.length; i++) {
            System.out.print(failingStudents[i]);
            if (i < failingStudents.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
