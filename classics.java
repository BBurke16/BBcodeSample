import java.util.ArrayList;
import java.util.List;

public class classics {

    //Write a program in Java to check if a number is even or odd in Java?
    public String oddOrEven(int number){
        String result;
        if(number % 2 == 0){
            result = "even";
        }else{
            result = "odd";
        }

        return result;
    }


    //Write program to sort an integer array without using API methods?

    public int[] sortArray(int list[]){
        // Bubble Sort with the short circuit if the remaining part of the list is sorted
        // The short circuit potencially reduces the Big O complexity
            int first, innerStep, temp;
            int length = list.length;
            boolean swapped;
            for (first = 0; first < length - 1; first++)
            {
                swapped = false;
                for (innerStep = 0; innerStep < length - first - 1; innerStep++)
                {
                    if (list[innerStep] > list[innerStep + 1])
                    {
                        // swap arr[j] and arr[j+1]
                        temp = list[innerStep];
                        list[innerStep] = list[innerStep + 1];
                        list[innerStep + 1] = temp;
                        swapped = true;
                    }
                }

                // IF no two elements were
                // swapped by inner loop, then break
                if (swapped == false)
                    break;
            }

            return list;
        }


    // Write a Java program to check if a number is a palindrome in Java?

    public boolean isPalendrome( int sample ){
        if(sample <= 9)
            return true;
        if( sample % 10 == getMax(sample)){
            return isPalendrome(sample - ; //TODO: This part is wrong
        }
        return false;
    }

    public int getMax(int sample){
        //123,456
        if(sample <= 9)
            return sample;
        else
            return getMax(sample / 10);
    }


    //Check if a Word/String is a palindrome?

    public boolean isPalendrome(String sample){
        if(sample.isEmpty() || sample.length() == 1)
            return true;
        if(sample.charAt(0) == sample.charAt(sample.length())){
            return isPalendrome(sample.substring(1,sample.length()-1));
        }
        return false;
    }

    //Reverse a string without using StringBuffer



    //Mars Rover


}
