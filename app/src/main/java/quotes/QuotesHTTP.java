package quotes;

public class QuotesHTTP {
   String quoteAuthor;
   String quoteText;

    public QuotesHTTP(String quoteAuthor, String quoteText) {
        this.quoteAuthor = quoteAuthor;
        this.quoteText = quoteText;
    }

    public String getQuoteAuthor() {
        return quoteAuthor;
    }

    public String getQuoteText() {
        return quoteText;
    }

    @Override
    public String toString() {
        return "QuotesHTTP{" +
                "quoteAuthor='" + quoteAuthor + '\'' +
                ", quoteText='" + quoteText + '\'' +
                '}';
    }
}
