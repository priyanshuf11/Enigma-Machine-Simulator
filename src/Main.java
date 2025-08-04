
public class Main {
    public static void main(String[] args) {
        String rotor1Str = "EKMFLGDQVZNTOWYHXUSPAIBRCJ"; // Rotor 1
        String rotor2Str = "AJDKSIRUXBLHWTMCQGZNPYFVOE"; // Rotor 2
        String rotor3Str = "BDFHJLCPRTXVZNYEIWGAKMUSQO"; // Rotor 3
        String reflectorStr = "YRUHQSLDPXNGOKMIEBFZCWVJAT"; // Reflector

        int[] rotor1Wiring = toIntArray(rotor1Str.toCharArray());
        int[] rotor2Wiring = toIntArray(rotor2Str.toCharArray());
        int[] rotor3Wiring = toIntArray(rotor3Str.toCharArray());
        int[] reflectorWiring = toIntArray(reflectorStr.toCharArray());

        Rotor rotor1 = new Rotor(rotor1Wiring,5);
        Rotor rotor2 = new Rotor(rotor2Wiring,10);
        Rotor rotor3 = new Rotor(rotor3Wiring,15);
        rotor1.setPosition(0);
        rotor2.setPosition(0);
        rotor3.setPosition(0);

        Rotor[] rotors = {rotor1, rotor2,rotor3};

        Reflector reflector = new Reflector(reflectorWiring);
        Plugboard plugboard = new Plugboard();
        plugboard.addSwap('A','G');
        plugboard.addSwap('F','T');
        plugboard.addSwap('E','Q');
        plugboard.addSwap('N','S');

        EnigmaMachine enigmaMachine = new EnigmaMachine(rotors, reflector, plugboard);

        String inputStr = "miscxdpetk".toUpperCase();
        String cipher = enigmaMachine.encrypt(inputStr);
        System.out.println("encrypted"+ cipher);

        rotor1.setPosition(0);
        rotor2.setPosition(0);
        rotor3.setPosition(0);
        String decipher = enigmaMachine.encrypt(cipher);
        System.out.println("decrypted"+ decipher);

    }

    private static int[] toIntArray(char[] chars){
        int[] result = new int[chars.length];
        for(int i=0;i<chars.length;i++){
            result[i]= chars[i]-'A';
        }
        return result;
    }
}