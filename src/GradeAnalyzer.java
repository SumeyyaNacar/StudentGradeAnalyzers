import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradeAnalyzer {
    private List<Integer> grades;

    public GradeAnalyzer() {
        this.grades = new ArrayList<>();
    }

    public void getGrades(int numOfStudents){
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<numOfStudents; i++){
            System.out.print("Öğrencinin notunu girin (" + (i + 1) + "/" + numOfStudents + "): ");
            int grade= scanner.nextInt();
            grades.add(grade);
        }
    }

    public double calculateAverage(){
        int sum =0;
        double average;
        for (Integer grade: grades){
            sum = sum+grade;
        }
        average = sum/(double)grades.size();
        return average;
    }

    public int findMax(){
        int max = grades.get(0);
        for (Integer grade:grades){
            if (max<grade){
                max=grade;
            }
        }
        return max;
    }
    public int findMin(){
        int min = grades.get(0);
        for (Integer grade:grades){
            if (min>grade){
                min=grade;
            }
        }
        return min;
    }
    public int countGradesRange(int min, int max){
        int count=0;
        for (int grade: grades){
            if (grade>=min && grade<=max){
                count++;
            }
        }
        return count;

    }

}
