package org.example;
import java.util.HashMap;


public class FORMAL implements Reply{
    HashMap<String,String> mp = new HashMap<>();
    private void p() {
        mp.put("hi", "Hello. How may I assist you today?");
        mp.put("hello", "Hello. How may I assist you today?");
        mp.put("how are you", "I am functioning properly. How may I assist you?");
        mp.put("i need help", "I can assist with that. Please provide more details.");
        mp.put("can you help me with my account", "Certainly. Please describe the account issue.");
        mp.put("thanks", "You are welcome.");
        mp.put("bye", "Goodbye.");
        mp.put("what is your name", "I am your virtual assistant.");

    }
    public FORMAL(){
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
            return "Could you clarify your request?";
        }
    }
}
