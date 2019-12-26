 public fun main(args:Array<String>){
     shellSort(arrayOf(15,14,13,12,11,10,9,8,7,6,5,4,3,2,1))
//     bogoSort(arrayOf(12,11,10,9,8,7,6,5,4,3,2,1))
 }

 public fun shellSort(arr: Array<Int>){
     var gap=arr.size/2

     while(gap>=1){
         for(right in arr.indices){
             var c=right-gap;
             while(c>=0){
                 if(arr[c]>arr[c+gap]){
                     val buf=arr[c]
                     arr[c]=arr[c+gap]
                     arr[c+gap]=buf
                 }
                 c-=gap
             }
         }
         gap /= 2
     }
     arr.forEach(::println)
 }

 public fun shuttleSort(arr: Array<Int>){
     var i=0;
     while(i<arr.size-1){
         if(arr[i]>arr[i+1]){
             val buf=arr[i]
             arr[i]=arr[i+1]
             arr[i+1]=buf
             var j=i
             while(j>0){
                 if(arr[j]<arr[j-1]){
                     val buf1=arr[j]
                     arr[j]=arr[j-1]
                     arr[j-1]=buf1
                 }
                 else
                     break
                 j--
             }
         }
         i++
     }
     arr.forEach(::println)
 }
 public fun selectionSort(arr:Array<Int>){
     for(left in arr.indices){
         var i=left
         var min=left
         while(i<arr.size){
             if(arr[i]<arr[min]){
                 min=i
             }
             i++
         }
         val buf=arr[left]
         arr[left]=arr[min]
         arr[min]=buf
     }
     arr.forEach(::println)
 }
 public fun bogoSort(arr: Array<Int>){
     val start=System.currentTimeMillis()

     do{
         for(i in arr.indices){
             val rand=(0..arr.size-1).random();
             val buf=arr[i]
             arr[i]=arr[rand]
             arr[rand]=buf;
         }
     }
     while (!isSorted(arr))
     arr.forEach(::println)


     println("bogosort time: ${System.currentTimeMillis()-start}")
 }

 public fun isSorted(arr:Array<Int>):Boolean{
     var i=1;
     while(i<arr.size){
         if(arr[i]<arr[i-1]) return false
         i++;
     }
     return true
 }
 public fun insertionSort(arr:Array<Int>){
     val start=System.currentTimeMillis()
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
     println("insertion sort time: ${System.currentTimeMillis()-start}")
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