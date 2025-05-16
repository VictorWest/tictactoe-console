import java.util.ArrayList;

public class TicTacToe {
    public static int Board(ArrayList<String> arrayList){
        if (arrayList.size() != 9){
            return 1;
        }

        System.out.printf("%s | %s | %s\n", arrayList.get(0), arrayList.get(1), arrayList.get(2));
        System.out.println("----------");
        System.out.printf("%s | %s | %s\n", arrayList.get(3), arrayList.get(4), arrayList.get(5));
        System.out.println("----------");
        System.out.printf("%s | %s | %s\n", arrayList.get(6), arrayList.get(7), arrayList.get(8));
        
        return 0;
    }

    public static String Turn(boolean bool) {
        if (bool) {
            return "X";
        }
        return "O";
    }
    
    public static boolean checkXOWinStatus(ArrayList<String> arrayList, String fillerString){
        for (int i = 0; i < arrayList.size(); i++) {
            // check 1: horizontal
            if (i == 0 || i == 3 || i == 6){
                if ((!arrayList.get(i).equals(fillerString)) && (arrayList.get(i).equals(arrayList.get(i + 1))) && (arrayList.get(i).equals(arrayList.get(i + 2)))){
                    return true;
                }
            }

            // check 2: vertical
            if (i >= 0 && i < 4){
                if ((!arrayList.get(i).equals(fillerString)) && (arrayList.get(i).equals(arrayList.get(i + 3))) && (arrayList.get(i).equals(arrayList.get(i + 6)))){
                    return true;
                }
            }

            // check 3: diagonal
            if (i == 0){
                if ((!arrayList.get(i).equals(fillerString)) && (arrayList.get(i).equals(arrayList.get(4))) && (arrayList.get(i).equals(arrayList.get(8)))){
                    return true;
                }
            }

            if (i == 2){
                if ((!arrayList.get(i).equals(fillerString)) && (arrayList.get(i).equals(arrayList.get(4))) && (arrayList.get(i).equals(arrayList.get(6)))){
                    return true;
                }
            }
            
        }

        return false;
    }
    
}
