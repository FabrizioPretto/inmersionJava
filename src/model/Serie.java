package src.model;

public class Serie extends Title{
    
    private int seasons;
    private int seasonsEpisodes;
    private int episodesMinutesDuration;

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    @Override
    public int getDurationTimeInMinutes() {
        return episodesMinutesDuration * seasonsEpisodes * seasons;
    }

    


    public int getEpisodesMinutesDuration() {
        return episodesMinutesDuration;
    }

    public void setEpisodesMinutesDuration(int episodesMinutesDuration) {
        this.episodesMinutesDuration = episodesMinutesDuration;
    }

    public int getSeasonsEpisodes() {
        return seasonsEpisodes;
    }

    public void setSeasonsEpisodes(int seasonsEpisodes) {
        this.seasonsEpisodes = seasonsEpisodes;
    }

    
}
