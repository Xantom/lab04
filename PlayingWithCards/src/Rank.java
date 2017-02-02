import java.util.Random;

public enum Rank {
    ace, two, three, four, five, six,
    seven, eight, nine, ten, jack, queen, king;
    
    static Rank randomRank() {
        int pick = new Random().nextInt(Rank.values().length);
        return Rank.values()[pick];
    }
 
}
