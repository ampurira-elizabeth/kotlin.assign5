fun main(){
    var x=product (arrayOf(2,9,7,5,8,10))
println(x)
    var y =decimals(arrayOf("dogs",2.0F,3.0,"fruits",10.0,true))
    println(y)
var charArry =vowels(arrayOf('a','T','e','i','R','o','u'))
    println(charArry)
}
fun product(numbers:Array<Int>):Int{
    var num=1
    numbers.forEach { el->
        num*=el
    }
    return num

}
fun decimals(numbers:Array<Any>):Double{
    var sum = 0.0
    numbers.forEach { mals ->
        if (mals is Double || mals is Float)
        {
            sum += mals.toString().toDouble()
        }
    }
    return sum
}
fun vowels(letters:Array<Char>): Int{
    var  c = 0
 letters.forEach { b->
     if(b == 'a'||b == 'e' || b == 'i' || b == 'o' || b == 'u'){
         c++

     }

 }
   return  c
}
    
