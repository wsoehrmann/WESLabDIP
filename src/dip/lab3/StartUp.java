package dip.lab3;

public class StartUp {

    public static void main(String[] args) {

        MessageInputStratagy input = new GuiInputStratagy();

        MessageOutputStratagy output = new ConsoleOutputStratagy();
        MessageService service = new MessageService(input, output);
        service.produceMessage();


    }
}
