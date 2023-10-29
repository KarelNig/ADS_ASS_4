package ASS_4_ObserverPattern;

public interface WebEventPublisher {
    void subscribe(WebEventListener listener);
    void unsubscribe(WebEventListener listener);
    void notifySubscribers(WebEvent event);
}
