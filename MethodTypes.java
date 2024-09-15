public class MethodTypes {

// No Paramaeter No return value
   
        void MethodM1(){

            System.out.println("Method M1 No Paramaeter No return value");
        }

// No parameter return value
        String MethodM2(){
         return("Method 2 with No parameter return value");
        }

// Takes parameter no return value

    void MethodM3(String Name){
    System.out.println("Hello "+Name);

    }


 // Takes parameter returns value   

      String MethodM4(String name){
      return("Hello " +name);

      }

    

    public static void main(String[] args){

        MethodTypes m1 = new MethodTypes();
        m1.MethodM1();
        MethodTypes m2 =new MethodTypes();
        // method m2 is printed by object invoking the method
        System.out.println(m2.MethodM2());  
        MethodTypes m3 =new MethodTypes();
        m3.MethodM3("sathiya");
        MethodTypes m4 = new MethodTypes();
        System.out.println(m4.MethodM4("SathiyaPrakaash"));

      
    }
    
}
