public class ProblemSet7 {
    public static void main(String[] args) {

    }

    /*
     * Exercise 1.
     *
     * Given two strings, return a new string built by surrounding in with the first
     * and last two characters of out.
     */
    public static String surroundMe(String in, String out) {

        if((in == null) || (out == null) || (out.length() != 4)) {

            return in;

        }

        else {

            return out.substring(0, 2) + in + out.substring(2, 4);

        }

    }

    /*
     * Exercise 2.
     *
     * Given a string and an integer, return a new string that represents the first
     * and last n characters of text (overlapping, as needed).
     */
    public String endsMeet(String text, int n) {

        String resultString = "";

        if (text == null || text.length() < 1 || text.length() >10 || n < 1 || n > text.length()) {

            return text;

        }

        else {

            for (int x = 0; x < n; x++) {

                resultString += text.substring(x, x+1);

            }

            for (int j = text.length() - n; j < text.length(); j++) {

                resultString += text.substring(j, j+1);

            }

            return resultString;

        }




    }

    /*
     * Exercise 3.
     *
     * Given a string, return a new string using the middle three characters of text.
     */
    public String middleMan(String text) {
        String first;
        String middle;
        String last;
        double n;
        String result;

        if (text == null || text.length() < 3 || text.length() % 2 == 0) {
            result = text;
            return result;
        } else {
            n = Math.ceil(text.length() / 2);
            int l = (int) n;
            middle = text.substring(l, l + 1);
            first = text.substring(l - 1, l);
            last = text.substring(l + 1, l + 2);
            result = first.concat(middle);
            result = result.concat(last);

            return result;
        }
    }

    /*
     * Exercise 4.
     *
     * Given two strings, determine whether or not target is equivalent to the middle
     * three characters of text.
     */
    public boolean isCentered(String text, String target) {
        String first;
        String middle;
        String last;
        double n;
        String result;

        if (text == null || target == null || target.length() != 3 || text.length() < 3 || text.length() % 2 == 0) {
            return false;
        } else {
            n = Math.ceil(text.length() / 2);
            int l = (int) n;
            middle = text.substring(l, l + 1);
            first = text.substring(l - 1, l);
            last = text.substring(l + 1, l + 2);
            result = first.concat(middle);
            result = result.concat(last);

            return target.equals(result);
        }
    }

    /*
     * Exercise 5.
     *
     * Given a string and a character, compute the number of words that end in suffix.
     */
    public int countMe(String text, char suffix) {
        String suffix1 = Character.toString(suffix);
        int counter = 0;

        if (text == null || !(Character.isLetter(suffix))) {
            return -1;
        } else {
            String [] words;
            words = text.split(" ", 1000);

            for (String word : words) {
                if (word.endsWith(suffix1)) {
                    counter++;
                }
            }

            return counter;
        }


    }

    /*
     * Exercise 6.
     *
     * Given a string, compute the number of triplets in text.
     */
    public int triplets(String text) {
        int count = -1;

        if (text == null) {
            return -1;
        }
        else {
            count = 0;
            for (int k = 1; k < text.length()-1; k++) {
                if (text.charAt(k) == (text.charAt(k-1)) && text.charAt(k) == text.charAt(k+1)) {
                    count +=1;
                }
            }
            return count;
        }
    }

    /*
     * Exercise 7.
     *
     * Given a string, compute the sum of the digits in text.
     */
    public long addMe(String text) {
        char character;
        int sum = 0;
        int number;

        if (text == null) {
            return -1;
        } else {
            for (int n = 0; n < text.length(); n++) {
                character = text.charAt(n);

                if (Character.isDigit(character)) {
                    number = Character.getNumericValue(character);
                    sum += number;
                }
            }

            return sum;
        }

    }

    /*
     * Exercise 8.
     *
     * Given a string, compute the length of the longest sequence.
     */
    public long sequence(String text) {
        if(text == null) {
            return -1;
        } else {
            int count = 0;
            int temp = 0;
            for(int i = 1; i < text.length(); i++) {
                if(text.charAt(i) == text.charAt(i - 1)) {
                    temp++;
                } else {
                    if(temp > count) {
                        count = temp;
                    }
                    temp = 0;
                }
            }
            return count;
        }
    }

    /*
     * Exercise 9.
     *
     * Given two strings, return a new string built by intertwining each of the
     * characters of a and b.
     */
    public String intertwine(String a, String b) {
        if(a == null || b == null) {
            return null;
        } else {
            String result = "";
            int twineLength = Math.min(a.length(), b.length());
            for(int i = 0; i < twineLength; i++) {
                result += a.charAt(i) + b.charAt(i);
            }
            if(a.length() > b.length()) {
                result += a.substring(twineLength);
            } else {
                result += b.substring(twineLength);
            }
            return result;
        }
    }

    /*
     * Exercise 10.
     *
     * Given a string, determine whether or not it is a palindrome.
     */
    public boolean isPalindrome(String text) {
        if(text == null) {
            return false;
        } else {
            String reverse = "";
            for(int i = text.length() - 1; i >= 0; i--) {
                reverse += text.charAt(i);
            }
            return reverse.equals(text);
        }
    }

}
