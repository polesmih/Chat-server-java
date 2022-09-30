package chat_server.client.gui.api;

@FunctionalInterface
public interface Receiver {
    void receive(String data);
}
