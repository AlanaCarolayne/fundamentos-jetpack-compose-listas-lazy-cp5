package alanacarolayne.com.github.listaslazy.repository
import alanacarolayne.com.github.listaslazy.model.Game

fun getAllGames(): List<Game> {
    return listOf(
        Game(id = 1, title = "The Sims", studio = "Maxis", releaseYear = 2000),
        Game(id = 2, title = "Stardew Valley", studio = "ConcernedApe", releaseYear = 2016),
        Game(id = 3, title = "Hollow Knight", studio = "Team Cherry", releaseYear = 2017),
        Game(id = 4, title = "Animal Crossing: New Horizons", studio = "Nintendo", releaseYear = 2020),
        Game(id = 5, title = "Celeste", studio = "Maddy Makes Games", releaseYear = 2018),
        Game(id = 6, title = "Terraria", studio = "Re-Logic", releaseYear = 2011),
        Game(id = 7, title = "Minecraft", studio = "Mojang", releaseYear = 2011),
        Game(id = 8, title = "Slay the Spire", studio = "MegaCrit", releaseYear = 2017),
        Game(id = 9, title = "Hades", studio = "Supergiant Games", releaseYear = 2020),
        Game(id = 10, title = "Untitled Goose Game", studio = "House House", releaseYear = 2019)

    )
}

fun getGamesByStudio(studio: String): List<Game> {
    return getAllGames().filter {
        it.studio.startsWith(prefix = studio, ignoreCase = true)
    }
}