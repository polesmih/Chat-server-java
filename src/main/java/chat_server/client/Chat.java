package chat_server.client;

import chat_server.client.gui.ChatFrame;
import chat_server.client.gui.api.Receiver;

public class Chat {
    private final ChatFrame frame;
    private final ChatCommunication communication;

    public Chat(String host, int port) {
        communication = new ChatCommunication(host, port);
        frame = new ChatFrame(data -> communication.transmit(data));

        new Thread(() -> {
            Receiver receiver = frame.getReceiver();
            while (true) {
                String msg = communication.receive();
                if (!msg.isEmpty()) {
                    receiver.receive(msg);
                }
            }
        })
                .start();
    }
}
