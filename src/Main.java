import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        GradeAnalyzer gradeAnalyzer = new GradeAnalyzer();

        System.out.println("Kac ögrencinin notunu gireceksiniz?");
        int numOfStudent = scanner.nextInt();
        gradeAnalyzer.getGrades(numOfStudent);

        System.out.println("Ortalama : "+ gradeAnalyzer.calculateAverage());
        System.out.println("Maximum : "+ gradeAnalyzer.findMax());
        System.out.println("Minumum : "+ gradeAnalyzer.findMin());

        System.out.print("Alt sınır: ");
        int minRange = scanner.nextInt();
        System.out.print("Üst sınır: ");
        int maxRange = scanner.nextInt();

        System.out.println(minRange + " ile " + maxRange + " arasındaki öğrenci sayısı: " + gradeAnalyzer.countGradesRange(minRange, maxRange));



    }
}
