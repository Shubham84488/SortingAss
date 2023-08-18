public class Q4 {

    public static void desBubble(int arr[]) {
        int n= arr.length;
        for (int i = 0; i < n; i++) {
            boolean swap=false;
            for(int j=n-1;j>i;j--){
                if(arr[j]>arr[j-1]){
                    swap=true;
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }

            if(!swap){
                System.out.println("The number of passes are :"+i);
                break;
            }
        }     
    }

    public static void main(String[] args) {
        int input[]={3,5,1,6,0};
        desBubble(input);

    }
    
}
