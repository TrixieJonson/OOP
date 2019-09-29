/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// keri to 

package box;

/**
 *
 * @author Pat Damaso
 * 
 * 
 */import java.util.Scanner;
   
   public class box {
   
   // st of main 
   public static void main(String [] args){
        Box box = new Box(0,0,0); 
        box.boxA();
        
        
        System.out.println("Box a: " + box.toString());   //cout
        System.out.println("Box a surface area: " + box.getArea()); 
        
        box.boxB();
        System.out.println("Box b: " + box.toString());  //cout
        System.out.println("Box b surface area: "+ box.getArea()); 
        
        System.out.println("Check if Box a and Box b are equal? " + box.equals()); //cout
        
        IsoscelesRight test = new IsoscelesRight(3);    //papasa
        Geometric4Tester tst = new Geometric4Tester(); 
        
        System.out.println("IsoscelesRight c:" + test.toString());   //cout
        System.out.println("IsoscelesRight c area: " + test.getArea());  
        
        System.out.println("IsoscelesRight d:" + test.toString());    //cout 
        System.out.println("IsoscelesRight d area: " + test.getArea());   
                
        System.out.println("Check if IsoscelesRight c and IsoscelesRight d are equal? " + test.equals());
    } //end main
    
    
    
    
    //st r2 
    public static class Rectangle2{
        
        int l,w,h,area;
        String ans;
        
        public int getArea(){
            area = l*w*h;
            return area;
        }
        
        public String toString(){
            return "[Box: length=" + l + ",width=" + w +", height=" + h +"]";
        }
    } //end r2
    
    
    
    //st r2 subc
        public static class Box extends Rectangle2{
        private int height;
       
        public Box(int l, int w, int h){ //superclass cons of r2
            Rectangle2 box = new Rectangle2();
        }
        public int getHeight(){
            return height;
        }
        public int getArea(){
            area = (2*w*l) + (2*l*h) + (2*h*w); //para makuha ang area
            return area;
        }
        public int boxA(){
            l = 2;
            w = 3;
            h = 4;
            return l + w + h;
        }
        public int boxB(){
            l = 4;
            w = 7;
            h = 4;
            return l + w + h;
        }
        public String equals(){
            if (boxA() == boxB()){
                ans = "true";
            }
            else{
                ans = "false";
            }    
           return ans;
        }
    }  //end r2 subc
  
    
       // st t
       public static class Triangle{
       double equalSide = 3, area, sideC;
       String ans;
        
        public String equals(){
            if (equalSide == equalSide){
                ans = "true";
            }
            else{
                ans = "false";
            }        
            return ans;
        }

        
        // basta pag get may return 
        
        
        public double getArea(){
            area = (equalSide*equalSide)/2;
            return area;
        }
        
       }//end t
    
    
    // st isoceles subc t
        public static class IsoscelesRight extends Triangle {
        public IsoscelesRight(double equalSize){
        }
        
        public double getEqualSide(){
            return equalSide;
        }
        
        public double getNotEqualSide(){  //value of side c 
            sideC = equalSide*Math.sqrt(2);
            return sideC;
        }
        
        public String toString(){
            return "[IsoscelesRight: equal side=" + getEqualSide() + ", non-equal side=" + getNotEqualSide();
        }
    }
    //end isoceles subc t
    
        public static class Geometric4Tester{
        
        public Geometric4Tester(){
            IsoscelesRight tst = new IsoscelesRight(3);
            tst.equalSide = 3.0;
        }
    }
}
    
    
    //end of box class
