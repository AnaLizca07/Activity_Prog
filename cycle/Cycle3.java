package cycle;

public class Cycle3 {
    public int start;
    public int end;
    public void showCycle(){
        do{
            System.out.println(start);
            start++;
        } while (start<=end);
    }
}
