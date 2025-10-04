fun main() {
//    greetPlayer()
//    greetPlayer()
//    showmessage("Балбес")
//    showplayerstats("Arbuz",10000)
//    createCharacter("Арагон",10,"рыцарь")
//    createCharacter("Арагон",10,)
//    createCharacter("Арагон",)
//    createItem("Меч",50)
//    createItem(price = 200, name = "Зелья")
//    createItem(price = 150, name = "посох", isMagic = true)
//    val sword = mutableListOf<String>("Меч")
//    upgargeWeapon(sword)
//    println(sword)
//    val damage = calculateDamage(50,1.5)
//    println(damage)
//    showWarning("Низкий уровень здоровья")
//    println(isPlayerAlive(10))
//    println(isPlayerAlive(0))
//    val a = sum(1,2)
//    val b = sum(1/5,2.5)
//    val c = sum(1,2,3)
//    val d = sum(2,1.5)
//    val e = sum(1.5,2)
//    println(a)
//    println(b)
//    println(c)
//    println(d)
//    println(e)
//    atteck()
//    attack("Гоблин")
//    attack("дракон",50)
//    attack("ork")
//    attack(1001)
//    usePotion("Лечебное",50)
//    usePotion(30,"Магическое")
//    greet("Игрок")

//    val sum = fun(x:Int,y:Int): Int = x + y
//    println(sum(10,15))
//    val sum = fun(a: Int, b:Int):Int = a+b
//    println(sum(10,15))
//    println(
//        fun(a:Int,b:Int): Int{
//        return a+b
//    }(10,15))
//    val hello = {println("Hello kotlin")}
//    hello()

//    val hello: ()->Unit = {println("Hello kotlin")}
//    attack("Гобдлин")





//    println("Урон: ${calculateDamage(10,1.5)}")


//    val numbers = listOf<Int>(1,2,3)
//    val doubled = numbers.map{it *2}
//    println(doubled)

//    val numbers = listOf<Int>(1,2,3,4,34,56,67,89,10,23)
//    val doubled = numbers.map{it % 2 ==0}
//    println(doubled)
//    val numbers = listOf<Int>(1, 2, 3, 4, 34, 56, 67, 89, 10, 23)
//    val doubled = numbers.filter{ it % 2 == 0 }
//    println(doubled)

//    applyEffect { it + 20  }
//    applyEffect { it- 50  }


//    onevent("Дождь"){
//        println("Игрок получает эффект 'мокрый'")
//    }


//    val kills = createCounter()
//    println(kills())
//    println(kills())




}


fun createCounter():()->Int{
    var count = 0
    return {++count}
}


fun greetPlayer() {
    println("Добро пожаловать в игру")
}

fun showmessage(text: String) {
    println(text)
}

fun showplayerstats(name: String, health: Int) {
    println("Игрок: $name | Здоровье: $health HP")
}

fun createCharacter(name: String, level: Int = 1, classtype: String = "Новичек") {
    println("Имя: $name | Уровень: $level |Класс: $classtype")
}

fun createItem(name: String, price: Int, isMagic: Boolean = false) {
    println("Предмет: $name | Цена: $price${if (isMagic) "(магический)" else ""}")
}

fun upgargeWeapon(weapon: MutableList<String>) {
    weapon.add("улучшение +1")
}

fun calculateDamage(basedamage: Int, multiplier: Double): Int {
    return (basedamage * multiplier).toInt()
}

fun showWarning(message: String): Unit {
    println("Внимание: $message")
}

fun isPlayerAlive(health: Int): Boolean = health > 0

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum(a: Double, b: Double): Double {
    return a + b
}

fun sum(a: Int, b: Int, c: Int): Int {
    return a + b + c
}

fun sum(a: Int, b: Double): Double {
    return a + b
}

fun sum(a: Double, b: Int): Double {
    return a + b
}

//fun attack(){
//    println("атака по воздуху")
//}
//fun attack(enemy: String){
//    println("Атакован $enemy!")
//}
//fun attack(enemy: String,damage: Int){
//    println("Атакован $enemy с уроном $damage HP!")
//}
fun attack(target: String) {
    println("Атакован $target")
}

fun attack(targetId: Int) {
    println("Атакован враг с ID $targetId")
}


fun usePotion(name: String, power: Int) {
    println("Использовано $name (+$power HP)")
}
fun usePotion(power: Int, name: String) {
    println("Использовано $name (+$power MP)")
}

val greet = fun(name: String){
    println("привет, $name")
}
val attack = {enemy: String -> println("Атакован $enemy")}
val calculateDamage = {base: Int,multiplier: Double -> (base * multiplier).toInt()}

val sum1 = fun(x:Int,y:Int):Int{
    return x+y
}
val sum2 = fun(x: Int,y:Int):Int = x+y
val sum3 = {x:Int,y:Int->x+y}
val sum4 : (Int, Int)-> Int = {x,y->x+y}

fun applyEffect(effect: (Int)->Int){
    val health = 100
    println("новое здоровье $effect(health)")
}

fun onevent(eventType: String,action:(String)->Unit){
    println("Событие: $eventType")
    action(eventType)
}

