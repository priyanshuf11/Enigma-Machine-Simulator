public class Reflector {
    private int[] wiring;

    public Reflector(int[] wiring){
        this.wiring = wiring;
    }

    public int reflect(int c){
        return wiring[c];
    }
}
