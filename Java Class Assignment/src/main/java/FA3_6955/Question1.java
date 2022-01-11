/*Laikin Barnard 6955*/
package FA3_6955;
import javax.swing.JOptionPane;

public class Question1 {   
    public enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,THURSDAY, FRIDAY, SATURDAY;
    };

    public static void main(String[] args) {
        enumDayMood();
    }
    
    private static void enumDayMood() {
        telDayMood();
    }
    
    private static String GetDay() {
        return JOptionPane.showInputDialog("Please Pick a day of the week").toUpperCase();
    }
    
    private static void telDayMood() {
        
        Day day = null;
        
        try{
            day = Day.valueOf(GetDay());
        }
        
        catch(Exception e){
            
            System.exit(0);
        }
        
        switch (day) {
        case MONDAY: 
            JOptionPane.showMessageDialog (null, "Mondays are bad.");
        break;

        case FRIDAY:
        JOptionPane.showMessageDialog (null, "Fridays are better.");
        break;
        
        case SATURDAY: case SUNDAY:
        JOptionPane.showMessageDialog (null, "Weekends are best.");
        break;
        
        default:
        JOptionPane.showMessageDialog (null, "Midweek days are so-so");
        break;
        }
    }
    
}
