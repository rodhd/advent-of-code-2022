package Solutions

import Common.AoCSolution

class DayOne(day: String) : AoCSolution(day) {

    override fun FirstSolution() {
        val input = readInputAsString()
            .split("\n\n")
            .map {x -> x.split("\n")}
            .map {x -> x.filter {y -> y != ""}.map {z -> Integer.parseInt(z)}}
            .map {x -> x.sum()}
            .maxOrNull()
        print(input)
    }

    override fun SecondSolution() {
        val input = readInputAsString()
            .split("\n\n")
            .map {x -> x.split("\n")}
            .map {x -> x.filter {y -> y != ""}.map {z -> Integer.parseInt(z)}}
            .map {x -> x.sum()}
            .sortedBy { -it }
            .slice(0..2)
            .sum()
        print(input)
    }

}