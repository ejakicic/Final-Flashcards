/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flashcardsJava;

/**
 *
 * @author ejaki
 */
public class Card {
    private String frontInfo;
    private String backInfo;
    private boolean isFlipped;// isFlipped indicates whether the frontInfo or backInfo should be shown in the toString
    
    // Default Constructor
    public Card(){
    }
    
    // Full contructor that always defaults isFlipped to false
    public Card(String frontInfo, String backInfo){
        this.frontInfo = frontInfo;
        this.backInfo = backInfo;
        isFlipped = false;
    }
    
    public void setFrontInfo(String frontInfo){
        this.frontInfo = frontInfo;
    }
    
    public String getFrontInfo(){
        return frontInfo;
    }
    
    public void setBackInfo(String backInfo){
        this.backInfo = backInfo;
    }
    
    public String getBackInfo(){
        return backInfo;
    }
    
    public void flip(){
        if(isFlipped){
            isFlipped = false;
        }
        else{
            isFlipped = true;
        }
    }

    @Override
    public String toString() {
        if(isFlipped){
            return frontInfo;
        }
        else{
            return backInfo;
        }
    }
}
