package org.example;

import java.util.HashMap;


public class CONCISE implements Reply{
    HashMap<String,String> mp = new HashMap<>();
    private void p() {
        mp.put("hi", "Hello. How can I help?");
        mp.put("hello", "Hello. How can I help?");
        mp.put("how are you", "I’m good. How can I help?");
        mp.put("i need help", "Share details; I’ll help.");
        mp.put("can you help me with my account", "Describe the account issue…");
        mp.put("thanks", "You’re welcome.");
        mp.put("bye", "Goodbye.");
        mp.put("what is your name", "I’m your assistant.");
    }
    public CONCISE(){
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
            return "Please clarify.";
        }
    }
}
