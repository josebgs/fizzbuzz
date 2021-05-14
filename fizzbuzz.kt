fun main(){
    var cnt = 0
    do{
      when{
        (cnt%15) == 0 -> println("fizzbuzz")
        (cnt%3) == 0 -> println("fizz")
        (cnt%5) == 0 -> println("buzz")
        else -> println("$cnt")
      }
      cnt++
    }while(cnt <100)
}
