package switch1;

public class Switch {
    public int option;
    public String showOption(){
        switch (option){
            case 1:{
                return "You win a cap";
            }
            case 2:{
                return "You win a candy";
            }
            default:{
                return "Incorrect option";
            }
        }
    }
}
