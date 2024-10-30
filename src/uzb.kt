import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

data class User(val name: String, val registrationTime: LocalDateTime)

fun main() {
    val users = mutableListOf<User>()

    fun registerUser(name: String) {
        val registrationTime = LocalDateTime.now()
        val user = User(name, registrationTime)
        users.add(user)
        println("Foydalanuvchi $name ro'yxatdan o'tdi, vaqt: ${registrationTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))}")
    }

    registerUser("asad")
    registerUser("ozod")

    println("\nRo'yxatdagi foydalanuvchilar:")
    for (user in users) {
        println("Foydalanuvchi: ${user.name}, Ro'yxatdan o'tgan vaqt: ${user.registrationTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))}")
    }
}
