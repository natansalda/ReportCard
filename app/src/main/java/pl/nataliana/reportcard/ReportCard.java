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
    private String studentName;

    //Constructor
    public ReportCard(int[] courseGradesMath, int[] courseGradesEnglish, int[] courseGradesBiology, int averageGradeMath, int averageGradeEnglish, int averageGradeBiology, String studentName) {
        this.courseGradesMath = courseGradesMath;
        this.courseGradesEnglish = courseGradesEnglish;
        this.courseGradesBiology = courseGradesBiology;
        this.averageGradeMath = averageGradeMath;
        this.averageGradeEnglish = averageGradeEnglish;
        this.averageGradeBiology = averageGradeBiology;
        this.studentName = studentName;
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

    public void setCourseGradesMath(int[] courseGradesMath) {
        this.courseGradesMath = courseGradesMath;
    }

    public void setCourseGradesEnglish(int[] courseGradesEnglish) {
        this.courseGradesEnglish = courseGradesEnglish;
    }

    public void setCourseGradesBiology(int[] courseGradesBiology) {
        this.courseGradesBiology = courseGradesBiology;
    }

    public void setAverageGradeMath(int averageGradeMath) {
        this.averageGradeMath = averageGradeMath;
    }

    public void setAverageGradeEnglish(int averageGradeEnglish) {
        this.averageGradeEnglish = averageGradeEnglish;
    }

    public void setAverageGradeBiology(int averageGradeBiology) {
        this.averageGradeBiology = averageGradeBiology;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public static String getCourseMath() {
        return COURSE_MATH;
    }

    public static String getCourseEnglish() {
        return COURSE_ENGLISH;
    }

    public static String getCourseBiology() {
        return COURSE_BIOLOGY;
    }

    public int[] getCourseGradesMath() {
        return courseGradesMath;
    }

    public int[] getCourseGradesEnglish() {
        return courseGradesEnglish;
    }

    public int[] getCourseGradesBiology() {
        return courseGradesBiology;
    }

    public int getAverageGradeMath() {
        return averageGradeMath;
    }

    public int getAverageGradeEnglish() {
        return averageGradeEnglish;
    }

    public int getAverageGradeBiology() {
        return averageGradeBiology;
    }


    public String getStudentName() {
        return studentName;
    }

    //Methods to calculate average grade for different courses
    public int calculateAverageGradeMath() {
        for (int i : courseGradesMath)
            averageGradeMath += i;
        averageGradeMath = (averageGradeMath / courseGradesMath.length);
        return averageGradeMath;
    }

    public int calculateAverageGradeEnglish() {
        for (int i : courseGradesEnglish)
            averageGradeEnglish += i;
        averageGradeEnglish = (averageGradeEnglish / courseGradesEnglish.length);
        return averageGradeEnglish;
    }

    public int calculateAverageGradeBiology() {
        for (int i : courseGradesBiology)
            averageGradeBiology += i;
        averageGradeBiology = (averageGradeBiology / courseGradesBiology.length);
        return averageGradeBiology;
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
        return "Student:" + getStudentName() + " grades:\n" + COURSE_MATH + ": " + getOpinionMath(averageGradeMath) +
                "\n" + COURSE_ENGLISH + ": " + getOpinionEnglish(averageGradeEnglish) + "\n" + COURSE_BIOLOGY + ": " + getOpinionBiology(averageGradeBiology);

    }
}
