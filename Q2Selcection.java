public class Q2Selcection {

    public static void desSelection(int arr[]) {
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int max_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[max_index]){
                    max_index=j;
                }
            }
            if(max_index != i){
                int temp=arr[i];
                arr[i]=arr[max_index];
                arr[max_index]=temp;
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
        desSelection(arr);
        disp(arr);
    }
}
