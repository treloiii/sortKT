 public fun main(args:Array<String>){
        BubbleSort(arrayOf(15,14,13,12,11,10,9,8,7,6,5,4,3,2,1))
 }

 public fun BubbleSort(arr:Array<Int>){
     arr.forEach {
         for(index1 in (0..arr.size-2)) {
            if(arr[index1]>arr[index1+1]){
                val buf=arr[index1]
                arr[index1]=arr[index1+1]
                arr[index1+1]=buf
            }
         }
     }
     arr.forEach (::println);
 }