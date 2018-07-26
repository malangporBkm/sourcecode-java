
public class FizzBuzz {

    public String sendAndReturn(int number) {

        String result = ""+ number;

        if(หาร3และ5ลงตัว(number)) {
            result = "FizzBuzz";
        }else if(หาร3ลงตัว(number) ) {
            result = "Fizz";            
        }else if (หาร5ลงตัว(number)) {
            result ="Buzz";
        }
        return result;
  
    }

    private boolean หาร5ลงตัว(int number) {
        return number % 5 == 0;
    }

    private boolean หาร3ลงตัว(int number) {
        return number % 3 == 0;
    }

    private boolean หาร3และ5ลงตัว(int number) {
        return หาร3ลงตัว(number) && หาร5ลงตัว(number);
    }

}
