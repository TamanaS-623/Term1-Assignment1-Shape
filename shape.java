// Tamana Seddiqi
//Student ID - 991528861
//Java program to find out the area and perimeter of geometrical shapes(rectangular or square)

import java.util.Scanner;
  
  public class shape
{
  public static void main(String[] arg)
  {
    float width,length;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the width of the geometrical shape ");
    width = input.nextFloat();
    System.out.print("Enter the length of the geometrical shape ");
    length = input.nextFloat();
    
    float area,perimeter;
    if(length == width)
    {
      System.out.print("The given geometrical shape is sqaure");
      area = length*length;
      perimeter = 4*length; 
    }
    else
    {
      System.out.print("The given geometrical shape is rectangular");
      area = length*width;
      perimeter = 2*length*width;
    }
    //System.out.print("\nThe area of the given geometrical shape is "+area);
    System.out.print(String.format("\n The area of the given geometrical shape is %.2f",area));
   // System.out.print("\nThe perimeter of the given geometrical shape is "+perimeter);
    System.out.print(String.format("\n The perimeter of geometrical shape is %.2f",perimeter));
  }
 }
    
    
    