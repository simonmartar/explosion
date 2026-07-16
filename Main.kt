fun main(){

    val library = DemoLibrary.create()

    val books = library.all()

    println("Library")

    println()

    Catalog().print(books)

    println("Books by Tolkien")

    println()

    BookFilter()

        .byAuthor(

            books,

            "J.R.R. Tolkien"

        )

        .forEach{

            println(it.title)

        }

    println()

    Report.summary(books)

}
