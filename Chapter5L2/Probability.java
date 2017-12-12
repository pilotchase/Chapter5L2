public class Probability implements Comparable<Probability>, ProbabilityCalc
{
    public int compareTo(Probability other){
        if(p1 > p2){
            return 1;
        } 
    }
    
    public double probabilityAND(Probability p2){
      return 2.0;  
    }
    
    public double probabilityOR(Probability p2, double overlap)
    {
        return 2.0;
    }
}
