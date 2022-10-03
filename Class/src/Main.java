public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager1 = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();

        customerManager2 =  customerManager1;
        // indicates that two separate objects hold the same reference number

        customerManager1.add();
        customerManager1.delete();
        customerManager1.update();


        //Value type and reference type

        int num1 = 10;
        int num2 = 25;
        num2 = num1;
        num1 = 36;
        System.out.println(num2); //10
        //primitive date types are value type

        int[] nums1 = new int[]{1,2,3};
        int[] nums2 = new int[] {4,5,6};
        nums2 = nums1;
        nums1[0] = 25;
        System.out.println(nums2[0]); //25
        //Arrays are reference type
    }
}