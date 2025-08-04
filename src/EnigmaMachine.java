import javax.print.DocFlavor;

public class EnigmaMachine {
    private Rotor[] rotors;
    private Reflector reflector;
    private Plugboard plugboard;

    public EnigmaMachine(Rotor[] rotors, Reflector reflector, Plugboard plugboard){
        this.rotors = rotors;
        this.reflector= reflector;
        this.plugboard=plugboard;

    }

    public char encryptChar(char input){

        boolean rotateNext= true;
        for(Rotor rotor: rotors){
            if(rotateNext){
                rotateNext=rotor.rotate();
            }else{
                break;
            }
        }

        char c = plugboard.swap(input);
        int signal = c-'A'; // convert char into int

        // move forward in rotors
        for(Rotor rotor: rotors){
            signal = rotor.forward(signal);
        }

        signal= reflector.reflect(signal); // reflect the signal

        // return through rotors and exit
        for(int i= rotors.length-1;i>=0;i--){
            signal = rotors[i].backward(signal);
        }

        char result = (char) (signal+'A');
        result = plugboard.swap(result);

        // to rotate all those rotors whose notch matches

        return result;
    }

    public String encrypt(String message){
        StringBuilder result = new StringBuilder();
        for(char c: message.toCharArray()){
            result.append(encryptChar(c));
        }
        return result.toString();
    }
}
