import java.util.Scanner;

class CountSay
{
    /**
     * The count say sequence starts with the string "1". Each following string is determined by reading out the count of
     * each repeating character and then the character itself. The following list shows the first 7 terms of the count say
     * sequence:
     *
     * 1: 1
     * 2: 11
     * 3: 21
     * 4: 1211
     * 5: 111221
     * 6: 312211
     * 7: 13112221
     *
     */



    /**
     * This method generates the next term of the sequence given based on the supplied string.
     * the method requires the previous number
     *
     * If input is "1211", then output is "111221".
     */
    static String getNextTerm(String preNum)
    {
        //currentNumber holds the current number
        //timesAppears holds the number of times the current number appears
        int currentNumberInt, timesAppears;
        String currentNumberStr;
        String currentString = "";
        boolean stop;

        //first for loop gets the current number being used
        //the nested while loop counts how many times that number appears in sequence
        for (int x = 0; x<= preNum.length ()-1; x++) {

            stop = false;
            timesAppears = 1;
            currentNumberStr = preNum.substring (x, x+1);
            currentNumberInt = Integer.parseInt (currentNumberStr);

            while (stop == false) {
                if (x+1 > preNum.length ()-1){
                    stop = true;
                }
                else if (preNum.substring(x+1, x+2). equals (currentNumberStr) ) {
                    timesAppears++;
                    x++;
                }
                else{
                    stop = true;
                }

            }


            currentString =currentString + Integer.toString (timesAppears) + currentNumberStr;

        }

        return currentString;
    }

    /**
     * This method returns the nth term of the sequence
     */
    static String getNthTerm (int n) {
        //only loops if n>1 otherwise return "" if empty or "1" if 1

        if (n > 1) {
            String previousSayCount = "1";
            for (int x = 2; x <= n; x++) {
                previousSayCount = CountSay.getNextTerm(previousSayCount);
            }
            return previousSayCount;
        } else if (n == 1) {
            return "1";
        } else {
            return "";
        }
    }

    public static void main(String[] args)
    {
        Scanner reader=new Scanner(System.in);
	           /* if (args.length < 1)
	            {
	                System.err.println("ENTER val:");
	                return ;
	            }
	            int n = Integer.parseInt(args[0]);
	            String result = getNthTerm(n);
	            System.out.println(result);*/
        System.out.println("Enter the value of n:");
        int n=Integer.parseInt(reader.nextLine());
        System.out.println("The nth term is:" + getNthTerm(n));
        System.out.println("Enter the term:");
        String next=reader.nextLine();
        System.out.println("The next term is:" + getNextTerm(next));

    }

}
