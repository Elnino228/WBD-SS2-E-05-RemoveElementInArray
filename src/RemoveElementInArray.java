public class RemoveElementInArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,0,0,0,0};
        int ele_del=1;
        int index_del=-1;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==ele_del){
                index_del=i;
                break;
            }
        }
        if (index_del==-1){
            System.out.println("Not found!");
        } else {
            for (int i=index_del;i<arr.length-1;i++){
                if (i==arr.length-2){
                    arr[i]=arr[i+1];
                    arr[i+1]=0;
                } else {
                    arr[i]=arr[i+1];
                }
            }
        }
        //print new array
        System.out.println("New array: ");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"\t");
        }
    }
}
