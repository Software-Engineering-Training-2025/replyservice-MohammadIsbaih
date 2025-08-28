package org.example;
import java.util.HashMap;

public class FRIENDLY implements Reply{
    HashMap<String,String> mp = new HashMap<>();
    private void p() {
        mp.put("hi", "Hey there! \uD83D\uDE0A How can I help?");
        mp.put("hello", "Hi! \uD83D\uDC4B What’s up?");
        mp.put("how are you", "Doing great! \uD83D\uDE04 How can I help?");
        mp.put("i need help", "I’ve got you! \uD83D\uDE42 Tell me a bit more.");
        mp.put("can you help me with my account", "Sure thing! \uD83D\uDE0A What’s wrong with the account?");
        mp.put("thanks", "Anytime! \uD83D\uDE4C");
        mp.put("bye", "See you later! \uD83D\uDC4B");
        mp.put("what is your name", "I’m your helper bot \uD83E\uDD16");

    }
    public FRIENDLY(){
        p();
    }
    public String reply(String message) {
        try {
            if (mp.containsKey(message)) {
                return mp.get(message);
            }
            else {
                throw new Exception();
            }
        }
        catch (Exception e){
            return "Could you tell me more?";
        }
    }
}
