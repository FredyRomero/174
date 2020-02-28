

import java.util.Scanner;

public class _174Anyo2013 {
    public static void main(String[] args) {
    	Scanner tec = new Scanner(System.in);

        int num = 0, temp_num,left, right,cont = 0, 
        casos = tec.nextInt();
        boolean repe, temp;
     

       while (casos > cont) {
            num = tec.nextInt();
            if(num >= 1000 && num <= 1000000){
            repe = repetido(String.valueOf(num));
            temp = repe;
            temp_num = num;
            
            left = 0;
            while (temp == repe) {
                temp = repetido(String.valueOf(temp_num));
                if (temp == repe) {
                    temp_num--;
                    left++;
                }
            }
            left--;
            temp_num = num;
            temp = repe;

            right = 0;
            while (temp == repe) {
                temp = repetido(String.valueOf(temp_num));
                if (temp == repe) {
                    temp_num++;
                    right++;
                }
            }
            cont ++;
            System.out.println((num - left) + " " + (left + right));
            }else{
            	break;
            }
      
          }

    }
    
    static boolean repetido(String r) {
        for (int i = 0; i < r.length() - 1; i++) {
            for (int j = i + 1; j < r.length(); j++) {
                if (r.charAt(i) == r.charAt(j)){ 
                	return true;
                }
            }
        }
        return false;
    }

}
