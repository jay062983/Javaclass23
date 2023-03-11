package Polymorphism;

public class StudentTester {
    public static void main(String[] args) {


        Student[] students = {new CollegeStudent(), new SyntaxStudent(), new SchoolStudent()};
        for (Student st : students) {
st.dailyPresence();
st.attitude();
st.schoolFee();
st.score();

        }
    }}
