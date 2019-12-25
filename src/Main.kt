 public fun main(args:Array<String>){
        bogoSort(arrayOf(14,15,13,12,11,10,9,8,7,6,5,4,3,2,1))
//     var i=0;
//     var j=5;
//     for(a in j downTo i){
//         println(a)
//     }
 }

 public fun bogoSort(arr: Array<Int>){
     val start=System.currentTimeMillis()

     do{
         for(i in arr.indices){
             val rand=(arr.indices).random();
             val buf=arr[i]
             arr[i]=arr[rand]
             arr[rand]=buf;
         }
     }
     while (!isSorted(arr))



     println("bogosort time: ${System.currentTimeMillis()-start}")
 }

 public fun isSorted(arr:Array<Int>):Boolean{
    val i=1;
     while(i<arr.size){
         if(arr[i]<arr[i-1]) return false
     }
     return true
 }
 public fun insertionSort(arr:Array<Int>){
     var i=1
     while(i<arr.size){
         val currentValue=arr[i]
         var j=i-1
         while(j>=0){
             if(arr[j]>currentValue) {
                 arr[j + 1] = arr[j];
                 arr[j] = currentValue;
                 j--
             }
             else{
                 break
             }
         }
         i++
     }
     arr.forEach(::println)
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