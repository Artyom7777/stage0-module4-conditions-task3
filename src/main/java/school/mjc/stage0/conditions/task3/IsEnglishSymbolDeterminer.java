package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        String strSymbol = String.valueOf(symbol);
        if (strSymbol.matches("[a-zA-Z]")){
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }
}
