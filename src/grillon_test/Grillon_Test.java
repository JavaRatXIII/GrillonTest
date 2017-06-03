package grillon_test;
import javax.swing.*;
public class Grillon_Test {

    public static void main(String[] args) {
        int points = 0;
        
        int Age;
        int GentleMen_Rate;
        int Kindness_Rate;
        int Trust_Rate;
        int Smart_Rate;
        int Strength_Rate;
        int Likability_Rate;
        int Happy_Rate;
        String Like;
        
        int Age2;
        int GentleMen_Rate2;
        int Kindness_Rate2;
        int Trust_Rate2;
        int Smart_Rate2;
        int Strength_Rate2;
        int Likability_Rate2;
        int Happy_Rate2;
        
        Age = (getInput("Enter your age:"));
        GentleMen_Rate = (getInput("Rate how classy you are from 1 to 10 (10 being very classy):"));
        Kindness_Rate = (getInput("Rate how kind you are from 1 to 10 (10 being very kind):"));
        Trust_Rate = (getInput("Rate how turstworthy you are from 1 to 10 (10 being very turstworthy):"));
        Smart_Rate = (getInput("Rate how inteligent you are from 1 to 10 (10 being very inteligent):"));
        Strength_Rate = (getInput("Rate how strong you are from 1 to 10 (10 being very strong):"));
        Likability_Rate = (getInput("Rate how likeable you are from 1 to 10 (10 being very likealbe):"));
        Happy_Rate = (getInput("Rate how happy they make you feel from 1 to 10 (10 being very happy):"));
        Like = JOptionPane.showInputDialog("Do you like them? [Yes] [No] [Maybe}");
        
        Age2 = (getInput("Enter their age:"));
        GentleMen_Rate2 = (getInput("Rate how classy they are from 1 to 10 (10 being very classy):"));
        Kindness_Rate2 = (getInput("Rate how kind they are from 1 to 10 (10 being very kind):"));
        Trust_Rate2 = (getInput("Rate how turstworthy they are from 1 to 10 (10 being very turstworthy):"));
        Smart_Rate2 = (getInput("Rate how inteligent they are from 1 to 10 (10 being very inteligent):"));
        Strength_Rate2 = (getInput("Rate how strong they are from 1 to 10 (10 being very strong):"));
        Likability_Rate2 = (getInput("Rate how likeable they are from 1 to 10 (10 being very likealbe):"));
        Happy_Rate2 = (getInput("Rate how happy you make them feel from 1 to 10 (10 being very happy):"));
        
        
        if(Age > Age2+10)
        {
            System.out.println("Your too old");
        }
        else if(Age+12 < Age2)
        {
            System.out.println("They're too old");
        }
        
        
        if(GentleMen_Rate > GentleMen_Rate2+3)
        {
            System.out.println("Your classier then them");
        }
        else if(GentleMen_Rate+3 < GentleMen_Rate2)
        {
            System.out.println("They're classier than you");
        }
        else
        {
            System.out.println("You're about as classy as they are");
            points++;
        }
        
        
        if(Kindness_Rate > Kindness_Rate2+3)
        {
            System.out.println("You're very kind but don't let them hurt you");
        }
        else if(Kindness_Rate+3 < Kindness_Rate2)
        {
            System.out.println("They are nicer than you, so you must cherish them");
            points++;
        }
        else
        {
            System.out.println("You're about as kind as they are");
            points++;
        }
        
        
        if(Trust_Rate > Trust_Rate2+3)
        {
            System.out.println("Make sure they don't misuse your trust");
            points++;
        }
        else if(Trust_Rate+3 < Trust_Rate2)
        {
            System.out.println("It's good that they're trustworthy");
        }
        else
        {
            System.out.println("You're about as trustworthy as they are");
            points++;
        }
        
        
        if(Smart_Rate > Smart_Rate2+3)
        {
            System.out.println("They should study a little more");
        }
        else if(Smart_Rate+3 < Smart_Rate2)
        {
            System.out.println("You're about as smart as they are");
        }
        else
        {
            System.out.println("You're about as smart as they are");
            points++;
        }
        
        
        if(Strength_Rate > Strength_Rate2+3)
        {
            System.out.println("Your stonger then them");
        }
        else if(Strength_Rate+3 < Strength_Rate2)
        {
            System.out.println("They're very strong");
            points++;
        }
        else
        {
            System.out.println("You're about as strong as they are");
            points++;
        }
        
        
        if(Likability_Rate > Likability_Rate2+3)
        {
            System.out.println("You're very likeable");
            points++;
        }
        else if(Likability_Rate+3 < Likability_Rate2)
        {
            System.out.println("They're very likeable");
            points++;
        }
        else
        {
            System.out.println("You're about as lieable as they are");
            points++;
        }
        if((Likability_Rate < 3) || (Likability_Rate2 < 3))
        {
            points--;
        }
        
        
        if(Happy_Rate > Happy_Rate2+3)
        {
            System.out.println("They should try to make you happy as you make them");
        }
        else if(Happy_Rate+3 < Happy_Rate2)
        {
            System.out.println("It's good they make you happy, you should try making them happy too");
            points++;
        }
        else
        {
            System.out.println("It's good you two are happy together");
            points++;
        }
        
        if((Like.equals("Yes")) || (Like.equals("yes")))
        {
            System.out.println("You like them so maybe you should keep trying");
            points++;
        }
        else if((Like.equals("No")) || (Like.equals("no")))
        {
            System.out.println("You don't even like them");
        }
        else
        {
            System.out.println("You should try to understand what you feel for them");
        }
        
        GrillonTest(points);
    }
    
    public static int getInput(String word)
    {
        int v = Integer.parseInt(JOptionPane.showInputDialog(word));
        return v;
    }
    
    public static void GrillonTest(int points)
    {
        if(points >= 3)
        {
            JOptionPane.showMessageDialog(null, "The tow of you scaored a " + points + "You two don't seam very compatible");
        }
        else if((points <= 4) && (points <= 6))
        {
            JOptionPane.showMessageDialog(null, "The tow of you scaored a " + points + "You two may work but you both should try harder to avoid failur");
        }
        else if(points >= 7)
        {
            JOptionPane.showMessageDialog(null, "The two of you scaored a " + points + "You two are so good together");
        }
    }
    
}
