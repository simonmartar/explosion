object DemoLibrary {

    fun create():Library{

        val library = Library()

        library.add(
            Book(
                "The Hobbit",
                "J.R.R. Tolkien",
                "Fantasy",
                1937,
                ReadingStatus.READ
            )
        )

        library.add(
            Book(
                "Dune",
                "Frank Herbert",
                "Science Fiction",
                1965,
                ReadingStatus.READING
            )
        )

        library.add(
            Book(
                "Foundation",
                "Isaac Asimov",
                "Science Fiction",
                1951,
                ReadingStatus.PLANNED
            )
        )

        library.add(
            Book(
                "Sapiens",
                "Yuval Noah Harari",
                "History",
                2011,
                ReadingStatus.READ
            )
        )

        library.add(
            Book(
                "The Silmarillion",
                "J.R.R. Tolkien",
                "Fantasy",
                1977,
                ReadingStatus.PLANNED
            )
        )

        return library

    }

}
