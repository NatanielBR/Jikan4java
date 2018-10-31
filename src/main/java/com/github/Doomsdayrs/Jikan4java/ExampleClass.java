package com.github.Doomsdayrs.Jikan4java;
/**
 * Jikan4java
 * 28 / October / 2018
 *
 * @author github.com/doomsdayrs
 */
/*
This file is part of Jikan4java.

Jikan4java is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Foobar is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Jikan4java.  If not, see <https://www.gnu.org/licenses/>.
*/

import com.github.Doomsdayrs.Jikan4java.connection.Anime.AnimeConnection;
import com.github.Doomsdayrs.Jikan4java.connection.Character.CharacterConnection;
import com.github.Doomsdayrs.Jikan4java.connection.Manga.MangaConnection;
import com.github.Doomsdayrs.Jikan4java.connection.Person.PersonConnection;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class ExampleClass {
    /**
     * Example method
     *
     * @param args
     * @throws IOException    IOException
     * @throws ParseException ParseException
     */
    public static void main(String[] args) throws IOException, ParseException {
        System.out.println(new MangaConnection().search("Attack on titan").getMoreInfo().toString());

        System.out.println(new AnimeConnection().search("Caster"));

        System.out.println(new CharacterConnection().search("Attack on titan").toString());

        System.out.println(new PersonConnection().search("Hajime Isayama").getPictures().toString());

    }

}