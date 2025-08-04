public class Rotor {
    private int[] wiring;
    private int[] reverseWiring;
    private int position;
    private int notch;

    public Rotor(int[] wiring,int notch){
        this.wiring = wiring;
        this.notch=notch;
        this.reverseWiring= new int[26];
        for(int i=0;i<26;i++){
            reverseWiring[wiring[i]]= i;
        }
        this.position =0;
    }

    public void setPosition(int pos){
        this.position = pos%26;
    }

    public boolean rotate(){
        position = (position+1)%26;
        return position==notch;
    }

    public int forward(int c){
        return (wiring[(c+position)%26]+ (26-position))%26; // Shift input by rotor position, pass through wiring, then shift output back to original frame
    }

    public int backward(int c){
        return (reverseWiring[(c+position)%26]+ (26-position))%26;
    }
}
