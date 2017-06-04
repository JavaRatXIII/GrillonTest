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
            if(Like.toLowerCase().equals("yes"))
            {
                points++;
            }
        
        Age2 = (getInput("Enter their age:"));
            if(Age > Age2+10)
            {
                System.out.println("Your too old");
            }
            else if(Age+12 < Age2)
            {
                System.out.println("They're too old");
            }
        
        GentleMen_Rate2 = (getInput("Rate how classy they are from 1 to 10 (10 being very classy):"));
            points = Test(GentleMen_Rate,GentleMen_Rate2,points);
            
        Kindness_Rate2 = (getInput("Rate how kind they are from 1 to 10 (10 being very kind):"));
            points = Test(Kindness_Rate,Kindness_Rate2,points);
            
        Trust_Rate2 = (getInput("Rate how turstworthy they are from 1 to 10 (10 being very turstworthy):"));
            points = Test(Trust_Rate,Trust_Rate2,points);
            
        Smart_Rate2 = (getInput("Rate how inteligent they are from 1 to 10 (10 being very inteligent):"));
            points = Test(Smart_Rate,Smart_Rate2,points);
            
        Strength_Rate2 = (getInput("Rate how strong they are from 1 to 10 (10 being very strong):"));
            points = Test(Strength_Rate,Strength_Rate2,points);
            
        Likability_Rate2 = (getInput("Rate how likeable they are from 1 to 10 (10 being very likealbe):"));
            points = Test(Likability_Rate,Likability_Rate2,points);
            
        Happy_Rate2 = (getInput("Rate how happy you make them feel from 1 to 10 (10 being very happy):"));
            points = Test(Happy_Rate,Happy_Rate2,points);
        
        GrillonTest(points);
    }
    public static int Test(int quiztakerval, int personval, int points)
    {
        if((quiztakerval == personval) || (quiztakerval+1 == personval) || (quiztakerval-1 == personval) || (quiztakerval == personval-1) || (quiztakerval == personval+1))
        {
            points++;
        }
        return points;
    }
    
    public static int getInput(String word)
    {
        int v = Integer.parseInt(JOptionPane.showInputDialog(word));
        return v;
    }
    
    public static void GrillonTest(int points)
    {
        if(points <= 3)
        {
            JOptionPane.showMessageDialog(null, "The two of you scaored a " + points + " You two don't seam very compatible. I'm not saying you should give up, but if you think they're worth it you need to try harder.");
        }
        else if((points <= 4) && (points <= 6))
        {
            JOptionPane.showMessageDialog(null, "The two of you scaored a " + points + " You two may work but you both should try harder to avoid problems in the future");
        }
        else if(points >= 7)
        {
            JOptionPane.showMessageDialog(null, "The two of you scaored a " + points + " You two are so good together");
        }
    }
    
}
