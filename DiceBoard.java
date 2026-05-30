public class DiceBoard {
    static void board(int current, int target,String result){
        if(current==target){
            System.out.println(result);
              return;
        }
        if(current>target){
            return;
        }
        for(int dice=1;dice<=6;dice++){
            board(current+dice , target, result+dice);
        }
    }
    public static void main(String[] args) {
        int target=5;
       board(0 , target, "");
    } 
}
