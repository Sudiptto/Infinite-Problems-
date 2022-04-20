public class Statistics {
  double correct;
  double incorrect; 
  double questions;
  public Statistics(double correct, double incorrect, double questions) {
    this.correct = correct; 
    this.incorrect = incorrect; 
    this.questions = questions;
  }
  // findRatio() command 
  public double findCorrectRatio() {
    return((this.correct / this.questions) * 100 );
  }
  
  public double findIncorrectRatio() {
    return((this.incorrect / this.questions) * 100 );
  }
  
}