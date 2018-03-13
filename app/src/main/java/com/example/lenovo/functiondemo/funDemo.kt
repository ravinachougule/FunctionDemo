package com.example.lenovo.functiondemo

/**
 * Created by LENOVO on 13/03/2018.
 */
//function is assing to the variable
val fn: (no1: Int)-> Unit = fun (no1: Int) {
    println("number is $no1")
}

val fn1:(no:Int)->Unit={no->"number is $no"}
val fn2:(nm:String,num:Int)->Unit={nm,num->"name is $nm and no is $num"}


//function is passing as a parameter

fun fun1(f1: () -> Boolean)
{
    f1()
}


//calling function
fun callFun1(){
    //type1
    fun1(fun(): Boolean
    {
        return true
    })

    //Type2

    fun1({->true})

    //Type3

    fun1{true}

}
//function is passing as a parameter which contain one parameter
fun fun2(f2:(num1:Int)-> Boolean)
{
    f2(20)
}

fun callFun2()
{
    fun2(fun(_):Boolean
    {
        return true
    })

    fun2 { _ ->true}

    fun2({
        println("Value of num1 is $it")
        true
    })

}

//function is returning function

//type1
fun funDemo():()->Unit{
    return fun(){}
}
//type2

fun funDemo1():()->Unit{
    return{

    }
}

fun main(args: Array<String>){
    fn(10)
    fn2("Ravina",10)
}
