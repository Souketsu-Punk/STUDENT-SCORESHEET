import java.util.Scanner;

public class ReportCard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // INPUT SCHOOL INFORMATION
        System.out.print("Enter School Name: ");
        String schoolName = sc.nextLine();

        System.out.print("Enter Teacher Name: ");
        String teacherName = sc.nextLine();

        System.out.print("Enter Grade: ");
        String grade = sc.nextLine();

        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        System.out.println("Enter no. of students: ");
        final int STUDENT_COUNT = sc.nextInt();

        String[] studentNames = new String[STUDENT_COUNT];
        String[] subjects = {
                "English",
                "Math",
                "History",
                "Geography",
                "Science",
                "Programming"
        };

        double[] english = new double[STUDENT_COUNT];
        double[] math = new double[STUDENT_COUNT];
        double[] history = new double[STUDENT_COUNT];
        double[] geography = new double[STUDENT_COUNT];
        double[] science = new double[STUDENT_COUNT];
        double[] programming = new double[STUDENT_COUNT];

        double[] total = new double[STUDENT_COUNT];
        char[] rank = new char[STUDENT_COUNT];

        sc.nextLine();

        for (int i = 0; i < STUDENT_COUNT; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Name: ");
            studentNames[i] = sc.nextLine();

            for (int s = 0; s < subjects.length; s++) {
                System.out.print(subjects[s] + " Marks: ");
                double mark = sc.nextDouble();

                switch (s) {
                    case 0: english[i] = mark; break;
                    case 1: math[i] = mark; break;
                    case 2: history[i] = mark; break;
                    case 3: geography[i] = mark; break;
                    case 4: science[i] = mark; break;
                    case 5: programming[i] = mark; break;
                }
            }

            sc.nextLine();
        }

        //COMPUTE TOTAL AND RANK
        int countA = 0, countB = 0, countC = 0, countD = 0, countF = 0;

        for (int i = 0; i < STUDENT_COUNT; i++) {
            total[i] = english[i] + math[i] + history[i] + geography[i] + science[i] + programming[i];

            if (total[i] >= 540) {
                rank[i] = 'A'; countA++;
            } else if (total[i] >= 480) {
                rank[i] = 'B'; countB++;
            } else if (total[i] >= 420) {
                rank[i] = 'C'; countC++;
            } else if (total[i] >= 360) {
                rank[i] = 'D'; countD++;
            } else {
                rank[i] = 'F'; countF++;
            }
        }


        double totalSub1 = 0, totalSub2 = 0, totalSub3 = 0, totalSub4 = 0, totalSub5 = 0, totalSub6 = 0, totalmarks=0;

        for (int i = 0; i < STUDENT_COUNT; i++) {
            totalSub1 += english[i];
            totalSub2 += math[i];
            totalSub3 += history[i];
            totalSub4 += geography[i];
            totalSub5 += science[i];
            totalSub6 += programming[i];
        }

        for (int i = 0; i < STUDENT_COUNT; i++) {
            totalmarks += total[i];
        }


        //REPORT
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println("                            School Name : " + schoolName);
        System.out.println("                                Teacher : " + teacherName);
        System.out.println("                                   Grade: " + grade);
        System.out.println("                                    Year: " + year);
        System.out.println("=========================================================================================================");

        System.out.printf("%-18s %-10s %-10s %-10s %-12s %-10s %-15s %-8s %-5s\n",
                "Student Name","English","Math","History","Geography","Science","Programming","Total","Rank");

        System.out.println("=========================================================================================================");

        for (int i = 0; i < STUDENT_COUNT; i++) {
            System.out.printf(
                    "%-18s %-10.2f %-10.2f %-10.2f %-12.2f %-10.2f %-15.2f %-8.2f %-5c\n",
                    studentNames[i], english[i], math[i], history[i], geography[i],
                    science[i], programming[i], total[i], rank[i]
            );
        }
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.printf("%-18s %-10.2f %-10.2f %-10.2f %-12.2f %-10.2f %-15.2f %-8.2f\n",
                " ", totalSub1, totalSub2, totalSub3, totalSub4,
                totalSub5, totalSub6,totalmarks);
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.printf("%-18s %-10.2f %-10.2f %-10.2f %-12.2f %-10.2f %-15.2f %-8.2f\n",
                " ", totalSub1/STUDENT_COUNT, totalSub2/STUDENT_COUNT, totalSub3/STUDENT_COUNT, totalSub4/STUDENT_COUNT, totalSub5/STUDENT_COUNT, totalSub6/STUDENT_COUNT, totalmarks/STUDENT_COUNT);
        System.out.println("=========================================================================================================");
        System.out.printf("%-18s %-10s A's: %-5d B's: %-5d C's: %-7d D's: %-5d F's: %-5d\n",
                " ", "Ranks", countA, countB, countC, countD, countF);
    }
}
