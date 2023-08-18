public class Q3Insertion {

    public static void desInsertion(int arr[]) {
        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
            for(int j=n-i-2;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
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
        desInsertion(arr);
        disp(arr);

    }
    
}
