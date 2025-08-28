package org.example;
import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your reply type: ");
        String replyType = scanner.nextLine().toUpperCase();

        System.out.print("Enter your message: ");
        String message = scanner.nextLine();

        ReplyType type= ReplyType.valueOf(replyType);
        ReplyService service = new ReplyService();

        System.out.println(service.reply(message.toLowerCase(),type));

        scanner.close();
    }
}
