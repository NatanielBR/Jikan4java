package com.github.Doomsdayrs.Jikan4java.types.Main.Top.Objects.Person;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.Doomsdayrs.Jikan4java.core.Retriever;
import com.github.Doomsdayrs.Jikan4java.types.Main.Person.Person;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

/*
 * This file is part of Jikan4java.
 *
 * Jikan4java is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Jikan4java is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Jikan4java.  If not, see <https://www.gnu.org/licenses/>.
 * ====================================================================
 * Jikan4java
 * 01 / November / 2018
 *
 * @author github.com/doomsdayrs
 */
public class TopPerson extends Retriever {
    @JsonProperty("mal_id")
    public int mal_id;
    @JsonProperty("rank")
    public int rank;
    @JsonProperty("title")
    public String title;
    @JsonProperty("url")
    public String url;
    @JsonProperty("name_kanji")
    public String name_kanji;
    @JsonProperty("favorites")
    public int favorites;
    @JsonProperty("image_url")
    public String image_url;
    @JsonProperty("birthday")
    public String birthday;
    
    /**
     * Returns the Person object of this object
     *
     * @return Person Object
     * @throws IOException
     * @throws ParseException
     */
    public CompletableFuture<Person> getPerson() throws IOException, ParseException {
        return retrieve(Person.class, baseURL + "/person/" + mal_id);
    }

    @Override
    public String toString() {
        return "TopPerson{" +
                "mal_id=" + mal_id +
                ", rank=" + rank +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", name_kanji='" + name_kanji + '\'' +
                ", favorites=" + favorites +
                ", image_url='" + image_url + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
