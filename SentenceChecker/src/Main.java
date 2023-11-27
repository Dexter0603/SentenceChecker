public class Main {
    public static void main(String[] args) {
        String sentence = "";

        System.out.println(checker(sentence));

    }

    //Checks if the sentence is valid
    public static boolean checker(String sentence) {
        char first = sentence.charAt(0);
        char last = sentence.charAt(sentence.length()-1);
        int count = 0, num = 0;
        String digit = "";

        //Check if the First letter is Capitalised and the last letter is a Period type
        if(Character.isUpperCase(first) && isPeriod(last)){

            //Being checking each Character in the sentence
            for(int i = 0; i < sentence.length() - 1; i++){

                //If any characters other than the final are a period return false
                if(isPeriod(sentence.charAt(i))){
                    return false;
                }

                //Increment count when the character is a quotation mark
                if(sentence.charAt(i)=='"'){
                    count++;
                }

                //Check if the character is a number, then saves it
                if(Character.isDigit(sentence.charAt(i))){
                    digit = digit + sentence.charAt(i);
                } else

                    //Checks if it is the end of a number
                    if((Character.isWhitespace(sentence.charAt(i)) || sentence.charAt(i) == ',') && !digit.isEmpty()){

                        //Turns saved digits into a number
                        num = Integer.valueOf(digit);

                        // any number less than 14 returns false
                    if(num < 13){
                        return false;
                    }

                } else {digit = "";}

            }

            //if there is an odd number of quotation marks return false
            if(count%2!=0){
                return false;
            }
            return true;


        }
        return false;
    }

    //Checks if the character is a period type
    public static boolean isPeriod(char i){

        switch (i){
            case '.':
            case '!':
            case '?':
                return true;
            default: return false;
        }
    }

}