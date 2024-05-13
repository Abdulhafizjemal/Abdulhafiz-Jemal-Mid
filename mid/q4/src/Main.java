

public class Main {
    public static void main(String[] args) {
        char[]alpha = {'a', 't','y','u'};




        for (int i = 1; i < alpha.length-1;i++) {
            for (int j = 0;j < alpha.length-i-1;j++){
                if (alpha[j]>alpha[j+1]){
                    char temp = alpha[j];
                    alpha[j]=alpha[j+1];
                    alpha[j+1]=temp;
                }
            }




        return;


        }
    }
}