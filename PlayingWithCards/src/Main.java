

public class Main {

    public static void main(String[] args) {
        Rank highCard;
        Rank faceCard;
        Rank card1;
        Rank card2;
        int card1Val;
        int card2Val;
        
        highCard = Rank.ace;
        faceCard = Rank.jack;
        card1 = Rank.randomRank();
        card2 = Rank.randomRank();
        card1Val = card1.ordinal() + 1;
        card2Val = card2.ordinal() + 1;
        
        
        
        System.out.println("A blackjack hand: ace and " + faceCard);
        System.out.println("A two card hand: " + card1 + " and " + card2);
        System.out.println("Hand value: " + (card1Val + card2Val));

    }

}
