package weekFourteen;

public class activity35 {
    private static void mergesorter(int[] arr, int l, int r) {
        if(l <r){
            int mid = (l +r)/2;
            mergesorter(arr, l,mid);//sorts the left half
            mergesorter(arr,mid+1,r);//sorts the right half
            merge(arr, l,mid,r);//merges the two
        }
    }

     static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int lar[] = new int[n1];
        int rar[] = new int[n2];
        for(int i = 0; i <n1; i++){
            lar[i] = arr[l + i];
        }
        for(int i = 0; i <n2; i++){
            rar[i] = arr[mid+1+ i];
        }

        int s = 0;
        int t = 0;
        int u = l;//sorting begins
        while(s <n1 && t <n2){
            if(lar[s]<= rar[t]){
                arr[u] = lar[s];
                s++;//left half
            }else {
                arr[u] = rar[t];
                t++;//right half
            }
            u++;
        }
        while(s <n1){
            arr[u] = lar[s];
            u++;
            s++;//this runs through both the left array and the original value then setting the originals value to the lefts value
        }
        while(t <n2){
            arr[u] = rar[t];
            u++;
            t++;
        }
    }

    public static void main(String args[]){
     int arr[] = {8,4,2,1,6,111,23,82,65};

     for(int i: arr){
         System.out.print(i+" ");
     }
     System.out.println();
     mergesorter(arr, 0, arr.length-1);
     for(int i: arr){
         System.out.print(i + " ");
     }


    }




}
