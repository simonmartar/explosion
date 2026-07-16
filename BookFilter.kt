class BookFilter {

    fun byAuthor(

        books:List<Book>,

        author:String

    ) = books.filter {

        it.author.equals(

            author,

            true

        )

    }

    fun byGenre(

        books:List<Book>,

        genre:String

    ) = books.filter {

        it.genre.equals(

            genre,

            true

        )

    }

    fun byYear(

        books:List<Book>,

        year:Int

    ) = books.filter {

        it.year==year

    }

    fun byStatus(

        books:List<Book>,

        status:ReadingStatus

    ) = books.filter {

        it.status==status

    }

}
