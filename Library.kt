class Library {

    private val books = mutableListOf<Book>()

    fun add(book:Book){

        books.add(book)

    }

    fun all():List<Book>{

        return books

    }

}
