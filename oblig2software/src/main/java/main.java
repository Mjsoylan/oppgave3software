import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("skriv året du ønsker å sjekke om er skuddår eller ikke");
        int year=sc.nextInt();
        if(isleapyear(year)){
            System.out.println("dette året er et skudår");
        }
        else{
            System.out.println("dette året er et ikke skudår");
        }


    }
    public static boolean isleapyear(int year){
        boolean returnresult;
        if (year%400 == 0){
            returnresult= true;
        }
        else if(year%4==0 && year%100!=0){
            returnresult= true;
        }
        else{
            returnresult = false;
        }
        return returnresult;
    }

}
