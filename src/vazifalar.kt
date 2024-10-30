import java.time.LocalDate
import java.time.temporal.ChronoUnit

fun main() {
    val currentDate = LocalDate.now()

    val newYear = LocalDate.of(currentDate.year + 1, 1, 1)

    val daysUntilNewYear = ChronoUnit.DAYS.between(currentDate, newYear)

    println("Hozirgi vaqt: $currentDate")
    println("Yangi yilgacha kunlar soni: $daysUntilNewYear")
}
