public class Q1{

    public static void desBubble(int arr[]) {
        int n= arr.length;
        for (int i = 0;  i < n;  i++) {
            for(int j=n-1;  j>i  ;j--){
                 
                if(arr[j]>arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }     
    }

    public static void disp(int arr[]) {
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={45,2,65,14,95,3,64};
        desBubble(arr);
        disp(arr);
    }
}