public enum Season {
    AUTUMN("秋天"), SPRING("春天"), SUMMER("夏天"), WINTER("冬天");
    private String season;

    Season(String season) {
        this.season = season;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    @Override
    public String toString() {
        return season;
    }
}
