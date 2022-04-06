import java.util.*;
public class Main{
    
        public static class ComplexNumber{
            double real;
            double imaginary;
            
            ComplexNumber(){}
            ComplexNumber(double real,double imaginary){
                this.real = real;
                this.imaginary = imaginary;
            } 
        }
        
         public static ComplexNumber sum(ComplexNumber a, ComplexNumber b){
                ComplexNumber ans = new ComplexNumber();
                ans.real = a.real + b.real;
                ans.imaginary = a.imaginary + b.imaginary;
                return ans;
            }
        public static void main(String[] args){
          
            ComplexNumber c1 = new ComplexNumber(3,5);
            ComplexNumber c2 = new ComplexNumber(4,6);
            
            ComplexNumber ans = sum(c1,c2);
            System.out.println("The addition of two complex numbers is : "+ans.real+" + "+ans.imaginary+"i");
            
            Scanner sc = new Scanner(System.in);
            ComplexNumber num1 = new ComplexNumber();
            ComplexNumber num2 = new ComplexNumber();
            System.out.println("Enter first complex number: \nreal: ");
            num1.real = sc.nextDouble();
            System.out.println("\nimaginary: ");
            num1.imaginary = sc.nextDouble();
            System.out.println("Enter Second complex number: \nreal: ");
            num2.real = sc.nextDouble();
            System.out.println("\nimaginary: ");
            num2.imaginary = sc.nextDouble();
            
            ComplexNumber answer = sum(num1,num2);
            System.out.println("The addition of two complex numbers is : "+answer.real+" + "+answer.imaginary+"i");
            
        }
        
    }