 public fun main(args:Array<String>){
        shakerSort(arrayOf(15,14,13,12,11,10,9,8,7,6,5,4,3,2,1))
//     var i=0;
//     var j=5;
//     for(a in j downTo i){
//         println(a)
//     }
 }

 public fun bubbleSort(arr:Array<Int>){
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

 public fun shakerSort(arr:Array<Int>){
     var left=0
     var right=arr.size-1
     var flag=true;

     while((left<right) && flag){
         flag=false;
         for(i in left until right){
             if(arr[i]>arr[i+1]){
                 val buf=arr[i]
                 arr[i]=arr[i+1]
                 arr[i+1]=buf
                 flag=true
             }
         }
         right--
         for(i in right downTo left+1){
             if(arr[i-1]>arr[i]){
                 val buf=arr[i]
                 arr[i]=arr[i-1]
                 arr[i-1]=buf
                 flag=true
             }
         }
         left++
     }
     arr.forEach (::println)
 }