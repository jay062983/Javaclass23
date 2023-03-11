package Polymorphism;

public class Student {

    public void dailyPresence(){
        System.out.println("Must be over 90%");
    }
    public void schoolFee(){
        System.out.println("tution fee must be paid");
    }
    public void score(){
        System.out.println("Must have 3.0 to pass the test");
    }
    public void attitude(){
        System.out.println("Should posses great attitude");
    }
}
class SyntaxStudent extends Student{
    public void dailyPresence(){
        System.out.println("Must be over 90%");
    }
    public void Doquizes() {
        System.out.println("should be done all the quizes");
    }
    public void schoolFee(){
        System.out.println("tution fee must be paid");
    }
    public void score(){
        System.out.println("Must have 3.0 to pass the test");
    }
    public void attitude(){
        System.out.println("Should posses great attitude");
    }
}


class CollegeStudent extends Student{
    public void dailyPresence(){
        System.out.println("Must be over 90%");
    }
    public void schoolFee(){
        System.out.println("tution fee must be paid");
    }
    public void score(){
        System.out.println("Must have 3.0 to pass the test");
    }
    public void attitude(){
        System.out.println("Should posses great attitude");
    }
}


class SchoolStudent extends Student{
    public void dailyPresence(){
        System.out.println("Must be over 90%");
    }
    public void sports(){
        System.out.println("should participate at least one physical activity");
    }
    public void schoolFee(){
        System.out.println("tution fee must be paid");
    }
    public void score(){
        System.out.println("Must have 3.0 to pass the test");
    }
    public void attitude(){
        System.out.println("Should posses great attitude");
    }
}


