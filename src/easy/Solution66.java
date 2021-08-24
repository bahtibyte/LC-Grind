package easy;

public class Solution66 {

    public int[] plusOne(int[] digits) {
        if (digits == null)
            return null;

        for (int i = digits.length - 1; i >= 0; i--) {
            if (++digits[i] > 9){
                digits[i] = 0;
            }else{
                break;
            }
        }

        if (digits[0] != 0){
            return digits;
        }

        int[] out = new int[digits.length + 1];
        out[0] = 1;

        return out;
    }
}
