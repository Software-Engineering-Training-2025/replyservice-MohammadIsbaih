package org.example;

public class ReplyService {

    public String reply(String message, ReplyType type) {

        if (message == null || message.trim().isEmpty()) {
            return "Please say something.";
        }
        Reply r ;
        switch (type) {
            case FRIENDLY:
                r = new FRIENDLY();
                return r.reply(message);
            case CONCISE:
                r = new CONCISE();
                return r.reply(message);
            case FORMAL:
                r = new FORMAL();
                return r.reply(message);
            default:
                return "Some things went wrong.";
        }
    }
}

