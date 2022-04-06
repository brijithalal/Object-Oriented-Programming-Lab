import java.util.*;  
public class employee {
    String ID;
    String name;
    String phno;
    String r_id;
    String designation;
    String department;
    


    public void read(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter ID : "); 
        ID = sc.nextLine();
        System.out.print("Enter Name : "); 
        name = sc.nextLine();
        System.out.print("Enter phone number: "); 
        phno= sc.nextLine();
        System.out.print("Enter record Id : "); 
        r_id = sc.nextLine();
        System.out.print("Enter Designation: "); 
        designation = sc.nextLine();
        System.out.print("Enter Department : "); 
        department = sc.nextLine();
        
    }

    public void display(){
        System.out.println("-----------------------------------------");
        System.out.println("employee id : "+ ID);
        System.out.println("employee name : "+ name);
        System.out.println("phone number : "+ phno);
        System.out.println("record Id : "+  r_id);
        System.out.println("Designation : "+ designation);
        System.out.println("Department: "+ department);
        System.out.println("-----------------------------------------");
    }
    public static void main(String []args){
        employee emp_1 = new employee();
        emp_1.read();
        emp_1.display();

        employee emp_2 = new employee();
        emp_2.read();
        emp_2.display();
    }
}