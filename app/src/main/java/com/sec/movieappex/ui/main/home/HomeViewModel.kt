package com.sec.movieappex.ui.main.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sec.movieappex.ui.main.home.item.FilmUiItem

class HomeViewModel : ViewModel() {
    private var _newFilmData = MutableLiveData<ArrayList<FilmUiItem>>()
    val newFilmData: LiveData<ArrayList<FilmUiItem>> = _newFilmData
    private var _commingFilmData = MutableLiveData<ArrayList<FilmUiItem>>()
    val commingFilmData: LiveData<ArrayList<FilmUiItem>> = _commingFilmData


    fun generateNewFilmData() {
        val items = arrayListOf<FilmUiItem>(
            FilmUiItem(
                id = 1,
                poster = "https://moviesapi.ir/images/tt0111161_poster.jpg",
                title = "The Shawshank Redemption",
                imdb_rating = "9.3",
                rated = "R",
                released = "14 Oct 1994",
                runtime = "142 min",
                plot = "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.",
                actors = "Tim Robbins, Morgan Freeman, Bob Gunton, William Sadler"

            ),
            FilmUiItem(
                id = 2,
                poster = "https://moviesapi.ir/images/tt0068646_poster.jpg",
                title = "The Godfather",
                imdb_rating = "9.2",
                rated = "R",
                released = "24 Mar 1972",
                runtime = "175 min",
                plot = "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.",
                actors = "Marlon Brando, Al Pacino, James Caan, Richard S. Castellano"
            ),
            FilmUiItem(
                id = 3,
                poster = "https://moviesapi.ir/images/tt0071562_poster.jpg",
                title = "The Godfather: Part II",
                imdb_rating = "9.0",
                rated = "R",
                released = "20 Dec 1974",
                runtime = "202 min",
                plot = "The early life and career of Vito Corleone in 1920s New York is portrayed while his son, Michael, expands and tightens his grip on his crime syndicate stretching from Lake Tahoe, Nevada to pre-revolution 1958 Cuba.",
                actors = "Al Pacino, Robert Duvall, Diane Keaton, Robert De Niro"
            ), FilmUiItem(
                id = 4,
                poster = "https://moviesapi.ir/images/tt0468569_poster.jpg",
                title = "The Dark Knight",
                imdb_rating = "9.0",
                rated = "PG-13",
                released = "18 Jul 2008",
                runtime = "152 min",
                plot = "When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, the caped crusader must come to terms with one of the greatest psychological tests of his ability to fight injustice.",
                actors = "Christian Bale, Heath Ledger, Aaron Eckhart, Michael Caine"
            ),
            FilmUiItem(
                id = 5,
                poster = "https://moviesapi.ir/images/tt0050083_poster.jpg",
                title = "12 Angry Men",
                imdb_rating = "8.9",
                rated = "APPROVED",
                released = "01 Apr 1957",
                runtime = "96 min",
                plot = "A jury holdout attempts to prevent a miscarriage of justice by forcing his colleagues to reconsider the evidence.",
                actors = "Martin Balsam, John Fiedler, Lee J. Cobb, E.G. Marshall"
            ),
            FilmUiItem(
                id = 6,
                poster = "https://moviesapi.ir/images/tt0108052_poster.jpg",
                title = "Schindler's List",
                imdb_rating = "8.9",
                rated = "R",
                released = "04 Feb 1994",
                runtime = "195 min",
                plot = "In German-occupied Poland during World War II, Oskar Schindler gradually becomes concerned for his Jewish workforce after witnessing their persecution by the Nazi Germans.",
                actors = "Liam Neeson, Ben Kingsley, Ralph Fiennes, Caroline Goodall"
            ),
            FilmUiItem(
                id = 7,
                poster = "https://moviesapi.ir/images/tt0110912_poster.jpg",
                title = "Pulp Fiction",
                imdb_rating = "8.9",
                rated = "R",
                released = "14 Oct 1994",
                runtime = "154 min",
                plot = "The lives of two mob hit men, a boxer, a gangster's wife, and a pair of diner bandits intertwine in four tales of violence and redemption.",
                actors = "Tim Roth, Amanda Plummer, Laura Lovelace, John Travolta"
            ),
            FilmUiItem(
                id = 8,
                poster = "https://moviesapi.ir/images/tt0167260_poster.jpg",
                title = "The Lord of the Rings: The Return of the King",
                imdb_rating = "8.9",
                rated = "PG-13",
                released = "17 Dec 2003",
                runtime = "201 min",
                plot = "Gandalf and Aragorn lead the World of Men against Sauron's army to draw his gaze from Frodo and Sam as they approach Mount Doom with the One Ring.",
                actors = "Noel Appleby, Ali Astin, Sean Astin, David Aston"
            ),
            FilmUiItem(
                id = 9,
                poster = "https://moviesapi.ir/images/tt0060196_poster.jpg",
                title = "The Good, the Bad and the Ugly",
                imdb_rating = "8.9",
                rated = "APPROVED",
                released = "29 Dec 1967",
                runtime = "161 min",
                plot = "A bounty hunting scam joins two men in an uneasy alliance against a third in a race to find a fortune in gold buried in a remote cemetery.",
                actors = "Eli Wallach, Clint Eastwood, Lee Van Cleef, Aldo Giuffr"
            ),
            FilmUiItem(
                id = 10,
                poster = "https://moviesapi.ir/images/tt0137523_poster.jpg",
                title = "Fight Club",
                imdb_rating = "8.8",
                rated = "R",
                released = "15 Oct 1999",
                runtime = "139 min",
                plot = "An insomniac office worker, looking for a way to change his life, crosses paths with a devil-may-care soap maker, forming an underground fight club that evolves into something much, much more.",
                actors = "Edward Norton, Brad Pitt, Meat Loaf, Zach Grenier"
            )


        )
        _newFilmData.value = items
    }


    fun generateUpcommingFilmData() {
        val items = arrayListOf<FilmUiItem>(
            FilmUiItem(
                id = 21,
                poster = "https://moviesapi.ir/images/tt0317248_poster.jpg",
                title = "City of God",
                imdb_rating = "8.7",
                rated = "R",
                released = "13 Feb 2004",
                runtime = "130 min",
                plot = "Two boys growing up in a violent neighborhood of Rio de Janeiro take different paths: one becomes a photographer, the other a drug dealer.",
                actors = "Alexandre Rodrigues, Leandro Firmino, Phellipe Haagensen, Douglas Silva"
            ),
            FilmUiItem(
                id = 22,
                poster = "https://moviesapi.ir/images/tt0114369_poster.jpg",
                title = "Se7en",
                imdb_rating = "8.6",
                rated = "R",
                released = "22 Sep 1995",
                runtime = "127 min",
                plot = "Two detectives, a rookie and a veteran, hunt a serial killer who uses the seven deadly sins as his modus operandi",
                actors = "Morgan Freeman, Andrew Kevin Walker, Daniel Zacapa, Brad Pitt"
            ),
            FilmUiItem(
                id = 23,
                poster = "https://moviesapi.ir/images/tt0102926_poster.jpg",
                title = "The Silence of the Lambs",
                imdb_rating = "8.6",
                rated = "R",
                released = "14 Feb 1991",
                runtime = "118 min",
                plot = "A young F.B.I. cadet must confide in an incarcerated and manipulative killer to receive his help on catching another serial killer who skins his victims.",
                actors = "Jodie Foster, Lawrence A. Bonney, Kasi Lemmons, Lawrence T. Wrentz"
            ), FilmUiItem(
                id = 24,
                poster = "https://moviesapi.ir/images/tt0038650_poster.jpg",
                title = "It's a Wonderful Life",
                imdb_rating = "8.6",
                rated = "PG",
                released = "07 Jan 1947",
                runtime = "130 min",
                plot = "An angel helps a compassionate but despairingly frustrated businessman by showing what life would have been like if he never existed",
                actors = "James Stewart, Donna Reed, Lionel Barrymore, Thomas Mitchell"
            ),
            FilmUiItem(
                id = 25,
                poster = "https://moviesapi.ir/images/tt0114814_poster.jpg",
                title = "The Usual Suspects",
                imdb_rating = "8.6",
                rated = "R",
                released = "15 Sep 1995",
                runtime = "106 min",
                plot = "A sole survivor tells of the twisty events leading up to a horrific gun battle on a boat, which begin when five criminals meet at a seemingly random police lineup.",
                actors = "Stephen Baldwin, Gabriel Byrne, Benicio Del Toro, Kevin Pollak"
            ),
            FilmUiItem(
                id = 26,
                poster = "https://moviesapi.ir/images/tt0118799_poster.jpg",
                title = "Life Is Beautiful",
                imdb_rating = "8.6",
                rated = "PG-13",
                released = "12 Feb 1999",
                runtime = "116 min",
                plot = "When an open-minded Jewish librarian and his son become victims of the Holocaust, he uses a perfect mixture of will, humor and imagination to protect his son from the dangers around their camp.",
                actors = "Roberto Benigni, Nicoletta Braschi, Giorgio Cantarini, Giustino Durano"
            ),
            FilmUiItem(
                id = 27,
                poster = "https://moviesapi.ir/images/tt0110413_poster.jpg",
                title = "Leon The Professional",
                imdb_rating = "8.6",
                rated = "R",
                released = "18 Nov 1994",
                runtime = "110 min",
                plot = "Mathilda, a 12-year-old girl, is reluctantly taken in by Leon, a professional assassin, after her family is murdered. Leon and Mathilda form an unusual relationship, as she becomes his protest and learns the assassin's trade",
                actors = "Jean Reno, Gary Oldman, Natalie Portman, Danny Aiello"
            ),
            FilmUiItem(
                id = 28,
                poster = "https://moviesapi.ir/images/tt0245429_poster.jpg",
                title = "Spirited Away",
                imdb_rating = "8.6"
                ,
                rated = "PG",
                released = "28 Mar 2003",
                runtime = "125 min",
                plot = "During her family's move to the suburbs, a sullen 10-year-old girl wanders into a world ruled by gods, witches, and spirits, and where humans are changed into beasts.",
                actors = "Rumi Hiiragi, Miyu Irino, Mari Natsuki, Takashi Nait"
            ),

            FilmUiItem(
                id = 29,
                poster = "https://moviesapi.ir/images/tt0120815_poster.jpg",
                title = "Saving Private Ryan",
                imdb_rating = "8.6",
                rated = "R",
                released = "24 Jul 1998",
                runtime = "169 min",
                plot = "ollowing the Normandy Landings, a group of U.S. soldiers go behind enemy lines to retrieve a paratrooper whose brothers have been killed in action.",
                actors = "Tom Hanks, Tom Sizemore, Edward Burns, Barry Pepper"
            ),

            FilmUiItem(
                id = 30,
                poster = "https://moviesapi.ir/images/tt0064116_poster.jpg",
                title = "Once Upon a Time in the West",
                imdb_rating = "8.6"
                ,
                rated = "PG-13",
                released = "04 Jul 1969",
                runtime = "175 min",
                plot = "A mysterious stranger with a harmonica joins forces with a notorious desperado to protect a beautiful widow from a ruthless assassin working for the railroad.",
                actors = "Claudia Cardinale, Henry Fonda, Jason Robards, Charles Bronson"

            )

        )
        _commingFilmData.value = items
    }

}