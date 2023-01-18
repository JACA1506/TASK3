/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Joshua
 */
public class LogicForKrepeating {
    
    
    public boolean validateArrays(String arrayString) {
        List<String> arrayFormated = null;
        boolean validArray = true;
        try {
            String[] arraySplited = arrayString.split(",");
            arrayFormated = Arrays.asList(arraySplited);
            for (String element : arrayFormated) {
                if (!isNumeric(element)) {
                    validArray = false;
                }

            }
            return validArray;
        } catch (Exception ex) {
            return false;
        }

    }
    
     public  boolean isNumeric(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
    
    public int findKrepeating(String  array , String k){
        List<String> arrayFormated1 = formatArrays(array);
        int kInt = Integer.parseInt(k);
        int count =0;
        for(String element : arrayFormated1 ){
            String cheaking = element;
            for(String element2 : arrayFormated1 ){
                 if(cheaking.equals(element2)){
                     count ++;
                 }
            }
            count --;
            if(count >= kInt  ){
               return  Integer.parseInt(element);
            }
        }
   
        return -1; //if dont find any 
    }
    
    
    private List<String> formatArrays (String array1){
         List<String> arrayFormated = null;
        try{
            String[] arraySplited = array1.split(",");
            arrayFormated = Arrays.asList(arraySplited); 
            return arrayFormated;
            
        }catch (Exception ex) {
            return null;
        }
    }
    
}
