import java.util.*

fun main() {
    val length:Float
    val width:Float
    val height:Int
    val scanner=Scanner(System.`in`)
    println("歡迎使用郵局便利箱系統")
    println("please enter object's length:")
    length=scanner.nextFloat()
    println("please enter object's width:")
    width=scanner.nextFloat()
    println("please enter object's height:")
    height=scanner.nextInt()
    var box3=kotlinBox3()
    var box5=kotlinBox5()
    if (box3.validate(length, width, height)) {
        println("Box3")
    } else if (box5.validate(length, width, height)) {
        println("Box5")
    } else {
        println("目前便利箱皆沒有符合你物品裝箱的箱子 暫不能提供服務")
    }

}
open class Box(var length: Float,var width: Float,var height: Int){

    fun validate(length:Float,width:Float,height:Int):Boolean=this.length> length && this.width > width && this.height > height

    }

class kotlinBox3():Box(23f,14f,13){

}

class kotlinBox5():Box(39.5f,27.5f,23){

}
