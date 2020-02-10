/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package midtermreviewcodeforpartc;

/*OO principle: reusibility and extensibility
 * the feature of code that will allow your class to be reused or extended in another program
   we are allowing each class to delegate responsiblities  so we have a separation of concerns
   our aim is high cohension and low coupling
 * @author YanJun Fang
 */
public class PasswordValidator {
  
    
    public boolean isValid(String password){
        boolean isValid = false;
        int specialCharCount=0;
        for(int i=0;i<password.length(); i++)
            {
                if(!(Character.isLetterOrDigit(password.charAt(i))))
                {
                    //now we know there is at least one special character
                    specialCharCount++;
                }
            }
            if(specialCharCount>0 &&password.length()>7)
            {
                isValid = true;
            }
            return isValid;
    }
}
