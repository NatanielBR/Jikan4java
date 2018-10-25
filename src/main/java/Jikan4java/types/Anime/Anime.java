package Jikan4java.types.Anime;
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
public class Anime {
    private String url;
    private String title;
    private String iconURL;
    private String description;
    private int[] seasons;

    public Anime(String url, String title,String iconURL, String description, int[] seasons)
    {
        this.url = url;
        this.title = title;
        this.iconURL = iconURL;
        this.description = description;
        this.seasons = seasons;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int[] getSeasons() {
        return seasons;
    }

    public int getNumOfSeasons(){return seasons.length;};
    public String getIconURL() {
        return iconURL;
    }

    public String getUrl() {
        return url;
    }
}