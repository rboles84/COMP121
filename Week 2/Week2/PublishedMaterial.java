import java.util.*;
/**
 * Write a description of class PublishedMaterial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PublishedMaterial {
    private Date writingDeadline;
    private Date preproductionDeadline;
    private Date productionDeadline;
    private Date editingDeadline;
    private Double royalties;
    private String ISBN;
    
    
    public enum Stage {
        Writing,
        Editing,
        PreProduction,
        Production
    }
    
    public String getISBN() {
        stage = Stage.Writing;
        switch(stage) {
            case Writing:
                break;
        }
        return this.ISBN;
    }
    
}
    
