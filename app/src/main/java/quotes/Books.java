package quotes;

public class Books {
    private String author;
    private String text;
    private String likes;

    public Books(String author, String text, String likes) {
        this.author = author;
        this.text = text;
        this.likes = likes;
    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }

    public String getLikes() {
        return likes;
    }


    @Override
    public String toString() {
        return "Books{" +
                "author='" + author + '\'' +
                ", text='" + text + '\'' +
                ", likes=" + likes +
                '}';
    }
}
