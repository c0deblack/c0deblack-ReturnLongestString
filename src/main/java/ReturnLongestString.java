
public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr){
        String output = null;;
        int max_len = 0;
        
        if (arr == null) return null;
        if (arr.length == 1) return arr[0];
        
        for(int i = 0; i < arr.length; ++i)
        {
            int curr_len = arr[i].length();
            if(curr_len > max_len)
            {
                max_len = curr_len;
                output = arr[i];
            }
        }
        return output;
    }
}
