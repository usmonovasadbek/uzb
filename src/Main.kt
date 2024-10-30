import java.time.LocalDate
import java.time.Period


fun main() {
        val birthDate = LocalDate.of(2010, 7, 24)
        val currentDate = LocalDate.now()

        val period = Period.between(birthDate, currentDate)

        val years = period.years
        val days = period.days

        println("Yillar: $years, Kunlar: $days")
    }

