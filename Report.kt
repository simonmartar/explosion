object Report {

    fun summary(

        books:List<Book>

    ){

        println("-------------------------")

        println()

        println("Books: ${books.size}")

        println()

        books.groupBy {

            it.genre

        }.forEach{

            println(

                "${it.key}: ${it.value.size}"

            )

        }

    }

}
