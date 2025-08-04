import java.util.HashMap;
import java.util.Map;

public class Plugboard {
    private Map<Character,Character> plugs = new HashMap<>();

    public void addSwap(char a, char b ){
        plugs.put(a,b);
        plugs.put(b,a);
    }

    public char swap(char input){
        return plugs.getOrDefault(input,input);
    }
}
