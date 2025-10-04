import jdk.jfr.DataAmount

fun main() {
//    showGamelogo("Babaika")
//    showGamelogo("AAAAA")
//    showEnemy("ba",2342)
//    showEnemy("ku",1)
//    spawnEnemy("arbuz")
//    spawnEnemy(name = "Arbuz", isBoss = true)
//    spawnEnemy("Arbuz",300)
//    spawnEnemy("Король Тьмы",500, true)
//    println(calculateXP(5))
//    println(checkInventory("Меч"))
//    println(checkInventory("Зелье"))
//    castSpell()
//    castSpell("Arbuz")
//    castSpell("Arbuz",12)
//    createweapon("Arbuz")
//    createweapon("Arbuz",12)
//    createweapon(12,true)
//    heal()
//    heal(12)
//    heal(12,true)
//    heal(12,false)

}

fun showGamelogo(name: String) {
    println("=== $name ===")
}

fun showEnemy(name: String, level: Int) {
    println("враг $name уровень$level")
}

fun spawnEnemy(
    name: String, health: Int = 100, isBoss:
    Boolean = false
) {
    println("Враг: $name (Здоровье: $health HP${if (isBoss) " | БОСС!)" else ""}")
}

fun calculateXP(level: Int): Int {
    return level * 1000
}

fun checkInventory(item: String): Boolean {
    return if (item == "Меч") true else false
}

fun castSpell() {
    println("каст случайного заклинания")
}

fun castSpell(spell: String) {
    println("каст заклинания $spell")
}

fun castSpell(spell: String, power: Int) {
    println("Каст $spell с силой $power!")
}

fun createweapon(name: String) {
    println("Оружие: $name")
}

fun createweapon(name: String, damage: Int) {
    println(
        "Оружие: $name (Урон:$damage)"
    )
}

fun createweapon(damage: Int, isMagic: Boolean) {
    println(
        "${
            if (isMagic)
                "Магическое" else "Обычное"
        } оружие (Урон: $damage)"
    )
}
fun heal(){
    println("вылечили 10 хп")
}
fun heal(amount: Int){
    println("вылечили $amount хп")
}
fun heal(amount: Int, isPotion: Boolean){
    println(if (isPotion)"Выпито зелье (+$amount HP)" else "Заклинание лечения (+$amount HP)")
}