public class exptions {
    public static void main(String[] args) {
       try {
           int[] arr = new int[10];
           arr[10] = 20;
       } catch (Exception e) {
           System.out.println("error:" + e.toString());
       }
    }
}
