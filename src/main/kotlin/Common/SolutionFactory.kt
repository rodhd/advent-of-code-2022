package Common

import Solutions.DayOne
import Solutions.DayTwo

object SolutionFactory {
    fun generateSolution(day: String): AoCSolution? {
        return when (day) {
            "1" -> DayOne(day)
            "2" -> DayTwo(day)
            "3" -> TODO("Not Implemented")
            "4" -> TODO("Not Implemented")
            "5" -> TODO("Not Implemented")
            "6" -> TODO("Not Implemented")
            "7" -> TODO("Not Implemented")
            "8" -> TODO("Not Implemented")
            "9" -> TODO("Not Implemented")
            "10" -> TODO("Not Implemented")
            "11" -> TODO("Not Implemented")
            "12" -> TODO("Not Implemented")
            "13" -> TODO("Not Implemented")
            "14" -> TODO("Not Implemented")
            "15" -> TODO("Not Implemented")
            "16" -> TODO("Not Implemented")
            "17" -> TODO("Not Implemented")
            "18" -> TODO("Not Implemented")
            "19" -> TODO("Not Implemented")
            "20" -> TODO("Not Implemented")
            "21" -> TODO("Not Implemented")
            "22" -> TODO("Not Implemented")
            "23" -> TODO("Not Implemented")
            "24" -> TODO("Not Implemented")
            "25" -> TODO("Not Implemented")
            else -> null
        }
    }
}