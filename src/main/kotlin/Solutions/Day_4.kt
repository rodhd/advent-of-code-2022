package Solutions

import Common.AoCSolution

class Day_4: AoCSolution() {
    override val day = "4"

    override fun FirstSolution() {
        var r = readInputAsListOfLines()
            .map {x -> isFullOverlap(x)}
            .filter { x -> x }
            .size

        println(r)
    }

    override fun SecondSolution() {
        var r = readInputAsListOfLines()
            .map {x -> isPartialOverlap(x)}
            .filter { x -> x }
            .size

        println(r)
    }

    fun isFullOverlap(assignmentPairs: String): Boolean {
        val (firstAssignments, secondAssignments) = generateAssignmets(assignmentPairs)
        if(firstAssignments.size >= secondAssignments.size) {
            val intersect = firstAssignments.intersect(secondAssignments)
            return secondAssignments == intersect
        } else {
            val intersect = secondAssignments.intersect(firstAssignments)
            return firstAssignments == intersect
        }
    }

    fun isPartialOverlap(assignmentPairs: String): Boolean {
        val (firstAssignments, secondAssignments) = generateAssignmets(assignmentPairs)
        return firstAssignments.intersect(secondAssignments).any()
    }

    private fun generateAssignmets(assignmentPairs: String): Pair<Set<Int>, Set<Int>> {
        var r = assignmentPairs
            .split(",")
            .map {x -> x.split("-")}
            .map {y -> Integer.parseInt(y[0])..Integer.parseInt(y[1])}
            .map {z -> z.toSet()}
        return Pair(r[0], r[1])
    }
}