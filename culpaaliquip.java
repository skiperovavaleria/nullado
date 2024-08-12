import java.util.ArrayList;
import java.util.List;

interface Handler {
    void handle(Event event);
}

class Event {
    String type;

    Event(String type) {
        this.type = type;
    }
}

class EventManager {
    private List<Handler> handlers;

    public EventManager() {
        this.handlers = new ArrayList<>(); // Initialize the handlers list
    }

    public void addHandler(Handler handler) {
        handlers.add(handler); // Add a handler to the list
    }

    public void removeHandler(Handler handler) {
        handlers.remove(handler); // Remove a handler from the list
    }

    public void trigger(Event event) {
        for (Handler handler : handlers) {
            handler.handle(event); // Call each handler with the event
        }
    }
}

public class Main {
    public static void main(String[] args) {
        EventManager manager = new EventManager();

        manager.addHandler(event -> System.out.println("Handler 1 " + event.type));
        manager.addHandler(event -> System.out.println("Handler 2 " + event.type));

        manager.trigger(new Event("click")); // Trigger an event
    }
}
