import java.util.Scanner;

public class Main {
    // constructor functions
    public static boolean isInteger(char a){
        return Character.isDigit(a);
    }
    public static int swap(int[] a){
        int temp = a[0];
        a[0] = a[1];
        a[1] = temp;
        return temp;
    }



    public static void first() {
        String text = "Happy 19th anniversary and it is will be your day. Today is 21th October 2024";
        int sum = 0, number = 0, length = text.length() - 1;

        for (int i = 0; i < length; i++) {
            char element1 = text.charAt(i), element2 = text.charAt(i + 1);

            if (isInteger(element1) && isInteger(element2)){
                number = number * 10 + (element1 - '0');
            } else if (isInteger(element1) && !isInteger(element2)) {
                number = number * 10 + (element1 - '0');
                sum = sum + number;
                number = 0;
            }
        }
        if (isInteger(text.charAt(length - 1))) {
            number = number * 10 + (text.charAt(length - 1) - '0');
        }

        sum = sum + number;
        System.out.println(sum);
    }

    public static int second(String str, char a){
        int sum = 0,length = str.length();

        for(int i = 0; i < length; i++){
            char element = str.charAt(i);

            if(element==a){
                sum ++;
            }

        }

        return sum;
    }

    public static int third(){
        String word = "Hello World";
        int length = word.length(),sum = 0;
        for(int i = 0; i < length; i++){
            char element = word.charAt(i);
            if (element >= 65 && element <= 90){
                sum ++;
            }
        }

        return sum;

    }

    public static void fourth() {
        int[] arr = {1, 9, 3, 4, 2, 6, 3, 6, 8, 4, 0};
        int length = arr.length;

        for(int i = 0; i < length; i++){
            for (int j = i+1; j < length; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(arr[0]);
    }

    public static void fifth(){
        String string = "cBBbBaA";
        int len = string.length();
        char [] letters = new char[len];
        for(int i = 0; i < len; i++){
            letters[i] = string.charAt(i);
        }
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < len-1; j++) {
                if(letters[j] > letters[j+1]){
                    char temp = letters[j];
                    letters[j] = letters[j+1];
                    letters[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < len; i++) {
            System.out.print(letters[i]);
        }


    }

    public static boolean sixth(){
        Scanner input = new Scanner(System.in);
        int size,count = 0;
        System.out.print("Please enter the size of the array: ");
        size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = input.nextInt();
        }

        for(int i = 0; i < size; i++){
            for (int j = i+1; j < size; j++){
                if (j - i <= 3 && arr[i] == arr[j]){
                    count++;
                }else{
                    count = 0;
                }
                if (count == 3){
                    return true;
                }

            }
        }
        return false;
    }

    public static boolean seventh(){
        String card_number = "9860123456788901";
        int sum = 0,l = card_number.length(),o = 0;
        int[] card_number_in_array = new int[l],reversed_card_number_in_array = new int[l];
        for (int i = 0; i < card_number.length(); i++) {
            card_number_in_array[i] = card_number.charAt(i) - '0';
        }
        for (int i = l - 1; i >= 0; i--) {
            reversed_card_number_in_array[o] = card_number_in_array[i];
            o ++;
        }
        for (int i = 0; i < card_number.length(); i++) {
            if(i % 2 != 0){
                if (reversed_card_number_in_array[i] * 2 > 9){
                    reversed_card_number_in_array[i] = reversed_card_number_in_array[i] * 2 - 9;
                }
                else{
                    reversed_card_number_in_array[i] = reversed_card_number_in_array[i] * 2;
                }
            }
        }
        for (int i = 0; i < card_number.length(); i++) {
            sum = sum + reversed_card_number_in_array[i];
        }
        return sum % 10 == 0;

    }

    public static void main(String[] args) {
        System.out.print(seventh());
    }
}
