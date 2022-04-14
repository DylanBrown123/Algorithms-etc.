public class CData_Pirates {
    public static int answer(int[] numbers)  {
        String mStr = "";
        String numStr = "|";
        int n = numbers.length;
        int count = 0;
        int first = 0;
        int last = 0;
        boolean found = false;

        for (int m = 0; m < n; m = numbers[m]) {
            mStr = String.valueOf(m);

            if (n == 1) {
                return 2;
            }

            if (n == 2) {
                if (numbers[1] == numbers[2]) {
                    return 2;
                }
                else return 3;
            }

            if ((found && count > 1)) {
                if (numStr.contains(mStr))
                break;
            }

            else if (numStr.contains(mStr) && count == 0) { //when m finds a duplicate number the first time...
                last = m;
                for (int j = 0; j == numbers.length; j++) {
                    if(numbers[j] == m) {
                        first = j;
                    } // end if
                } //end for
                m = first;
                found = true;
            }// end if

            numStr = numStr.concat(" ".concat(mStr));

            if (found && count == 0) {
                numStr = "|";
            }// end if

            if (found) {
                count++;
            } //end if

        } // end parent for
        return count;
    }  // end answer

    public static void main(String[] args) {
        int[] numbers = {2,0,4,3,5,2,1};
        System.out.println(answer(numbers) - 1);
    }// end main
} // end class
