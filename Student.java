
    public class Student {
        private String name;
        private int studentClass;
        int marks;
        public Object department;
    
    
        public Student(String name, int studentClass, int marks) {
            this.name = name;
            this.studentClass = studentClass;
            this.marks = marks;
        }
    
       public String toString(){
              return name + " " + studentClass + " " + marks;
       }
    }
    
  
    

