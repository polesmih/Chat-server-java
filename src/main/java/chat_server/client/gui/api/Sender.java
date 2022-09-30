package chat_server.client.gui.api;

@FunctionalInterface
public interface Sender {
    void send(String data);
}
