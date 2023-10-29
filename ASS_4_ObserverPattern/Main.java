package ASS_4_ObserverPattern;

public class Main {
    public static void main(String[] args) {
        WebEventPublisher publisher = new WebEventPublisherImpl();

        WebEventListener observer1 = new WebEventListenerImpl("Observer 1");
        WebEventListener observer2 = new WebEventListenerImpl("Observer 2");

        publisher.subscribe(observer1);
        publisher.subscribe(observer2);

        ((WebEventPublisherImpl) publisher).donaldTrumpsBirthdayEventOccurred();
        ((WebEventPublisherImpl) publisher).customEventOccurred();
    }
}
