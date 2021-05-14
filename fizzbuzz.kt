fun main(){

  var cnt = readLine()?.toInt()

  while (cnt != 0){

    when{
        (cnt?.rem(15)) == 0 -> println("fizzbuzz")
        (cnt?.rem(3)) == 0 -> println("fizz")
        (cnt?.rem(5)) == 0 -> println("buzz")
        else -> println("$cnt")
      }
      cnt = readLine()?.toInt()
  }

}
