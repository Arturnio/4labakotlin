fun main(){
    val board = Array(3){Array(3){' '} }
    var currentPlayer = 'X'
    println("крестики-Нолики: Ты (Х) против компьютера(0)")
    printBoard(board)
    println("Твой ход! Введите строку и столбец (0,1 или 2):")
    val row = readln().toInt()
    val col = readln().toInt()
    if (row !in 0 ..2 || col !in 0..2){
        println("Неверные координаты. Должны быть 0 или 1 или 2")
        return
    }
    if (board[row][col] != ' '){
        println("Ячейка уже занята. Попробуйте снова")
        return
    }
    board[row][col] = currentPlayer
    printBoard(board)
}
fun printBoard(board: Array<Array<Char>>){
    println("  0 1 2")
    for (i in board.indices){
        print("$i ")
        println(board[i].joinToString("|"){if (it == ' ')"_" else it.toString()})
    }
    println()
}
