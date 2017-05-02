package pl.nataliana.reportcard;

public class ReportCard {

    //Variables used in class
    private static final String COURSE_MATH = "Math";
    private static final String COURSE_ENGLISH = "English";
    private static final String COURSE_BIOLOGY = "Biology";
    private int[] courseGradesMath;
    private int[] courseGradesEnglish;
    private int[] courseGradesBiology;
    private int averageGradeMath;
    private int averageGradeEnglish;
    private int averageGradeBiology;


    //Constructor
    public ReportCard (int courseGradesMath, int courseGradesEnglish, int courseGradesBiology, int averageGradeMath, int averageGradeEnglish, int averageGradeBiology){
        this.averageGradeMath = averageGradeMath;
        this.averageGradeEnglish = averageGradeEnglish;
        this.averageGradeBiology = averageGradeBiology;
    }
    //Constructor for a particular student
    public ReportCard() {
        courseGradesMath = new int[]{4, 5, 4, 5, 4, 5, 5};
        courseGradesEnglish = new int[]{4, 3, 4, 4, 4};
        courseGradesBiology = new int[]{2, 3, 3, 3};
        averageGradeMath = 0;
        averageGradeEnglish = 0;
        averageGradeBiology = 0;

    }

    //Methods to calculate average grade for different courses
    public int calculateAwerageGradeMath() {
        for (int i : courseGradesMath)
            averageGradeMath += i;
        averageGradeMath = (averageGradeMath / courseGradesMath.length);
        return averageGradeMath;
    }

    public int calculateAwerageGradeEnglish() {
        for (int i : courseGradesEnglish)
            averageGradeEnglish += i;
        averageGradeEnglish = (averageGradeEnglish / courseGradesEnglish.length);
        return averageGradeEnglish;
    }

    public int calculateAwerageGradeBiology() {
        for (int i : courseGradesBiology)
            averageGradeBiology += i;
        averageGradeBiology = (averageGradeBiology / courseGradesBiology.length);
        return averageGradeBiology;
    }

    //Method to get student name
    private String getStudentName(String studentName){
        return studentName;
    }

    //Methods to get final grading
    private String getOpinionMath(int averageGradeMath) {
        if (averageGradeMath >= 4.5) {
            return "Very good!";
        } else if (averageGradeMath >= 4) {
            return "Good!";
        } else if (averageGradeMath >= 3.5) {
            return "OK";
        } else if (averageGradeMath >= 3) {
            return "Acceptable";
        } else {
            return "Unacceptable";
        }
    }

    private String getOpinionEnglish(int averageGradeEnglish) {
        if (averageGradeEnglish >= 4.5) {
            return "Very good!";
        } else if (averageGradeEnglish >= 4) {
            return "Good!";
        } else if (averageGradeEnglish >= 3.5) {
            return "OK";
        } else if (averageGradeEnglish >= 3) {
            return "Acceptable";
        } else {
            return "Unacceptable";
        }

    }

    private String getOpinionBiology(int averageGradeBiology) {
        if (averageGradeBiology >= 4.5) {
            return "Very good!";
        } else if (averageGradeBiology >= 4) {
            return "Good!";
        } else if (averageGradeBiology >= 3.5) {
            return "OK";
        } else if (averageGradeBiology >= 3) {
            return "Acceptable";
        } else {
            return "Unacceptable";
        }
    }

    //Method displaying info to the user
    @Override
    public String toString() {
        return "Student:" + getStudentName("Natalia Nazaruk") + " grades:\n" + COURSE_MATH + ": " + getOpinionMath(averageGradeMath) +
                "\n" + COURSE_ENGLISH + ": " + getOpinionEnglish(averageGradeEnglish) + "\n" + COURSE_BIOLOGY + ": " + getOpinionBiology(averageGradeBiology);

    }
}
