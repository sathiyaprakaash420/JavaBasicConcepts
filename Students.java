public class Students {
    
    
    // How many ways we can store the data into variable(constructor explanation)

    int sid;                                          // class varaible can be aacceses by all method
    String sname;
    char grad ;

    void printStudentData(){

        System.out.println(sid+" "+sname+" "+grad);
    }


    void setStudentData(int id, String name, char gr){  // local varaible can only accessed by this method

        sid = id;
        sname = name;
        grad = gr;
    }

    Students(int ide, String namee, char grd){
    sid = ide;
    sname = namee;
    grad = grd;


    }

    public static void main(String[] args) {

        // using object reference variable
     // Students s1 = new Students();
     // s1.sid = 101;
     // s1.sname = "sathiya";
     // s1.grad = 'A';
     // s1.printStudentData();

      // using method
      // Students s2 = new Students();
      // s2.setStudentData(102,"Prakaash",'D');
      // s2.printStudentData();

       // using constructor we can store data into variables
       Students s3 = new Students(103, "sathiyaprakaash",'c');
       s3.printStudentData();
    
}
}
