public class exception {
    public static void main(String[] args) {
        Integer[] arr = {null, 10, null};
        int sum = 0;

        for (Integer num : arr) {
            if (num != null) {
                sum += num;
            } else {
                sum += 0;
            }
        }

        System.out.println("Total sum: " + sum);

        // Integer []arr={null,null,null};
        // int x=arr[1];
        // System.out.println(x);
    }
    
}
