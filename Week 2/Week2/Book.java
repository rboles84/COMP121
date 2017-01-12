
/**
 * Write a description of class Book here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Book extends PublishedMaterial {
        private String author;
        private boolean isPaperback;
        private double royaltiesPaid;
        
        public String getAuthor() {
            return this.author;
        }
        
        public boolean isPaperback() {
            return this.isPaperback;
        }
}
