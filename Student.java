
package project;

public class Student {
    
     String name;
    int matric;
    String program;
    double coursework;
    double exam;
    
    public Student (String n, int m, String p, double c, double e){
        name = n;
        matric = m;
        program = p;
        coursework = c;
        exam = e;
      
}
 
    public String computeGrade(){
        double totalmark;
        String grade;
        
         totalmark = (coursework*0.6) + (exam*0.4);
         
         if(totalmark>= 90){
            grade = "A+";
        }
        else if(totalmark>= 80){
            grade = "A";
        }
        else if(totalmark>= 75){
            grade = "A-";
        }
        else if(totalmark>= 70){
            grade = "B+";
        }
        else if(totalmark>= 65){
            grade = "B";
        }
        else if(totalmark>= 60){
            grade = "B-";
        }
        else if(totalmark>= 55){
            grade = "C+";
        }
        else if(totalmark>= 50){
            grade = "C";
        }
        else if(totalmark>= 45){
            grade = "C-";
        }
        else if(totalmark>= 40){
            grade = "D+";
        }
        else if(totalmark>= 35){
            grade = "D";
        }
        else{
            grade = "F";
        }
        
        return grade;
    }
    

    public String getStudent(){
        return name;
    }
    
    public int getMatric(){
        return matric;
    }
    
    public double getCoursework(){
        return coursework;
    }
    
    public double getExam(){
        return exam;
    }
    
    public String getProgram(){
        return program;
    }
    

}
