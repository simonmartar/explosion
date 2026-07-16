class Catalog {

    fun print(

        books:List<Book>

    ){

        books.forEach{

            println(it.title)

            println(it.author)

            println(it.genre)

            println(it.year)

            println(it.status)

            println()

        }

    }

}
