package ASS_4_ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WebEventPublisherImpl implements WebEventPublisher {
    private List<WebEventListener> listeners = new ArrayList<>();

    @Override
    public void subscribe(WebEventListener listener) {
        listeners.add(listener);
    }

    @Override
    public void unsubscribe(WebEventListener listener) {
        listeners.remove(listener);
    }

    @Override
    public void notifySubscribers(WebEvent event) {
        for (WebEventListener listener : listeners) {
            listener.update(event);
        }
    }

    public void donaldTrumpsBirthdayEventOccurred() {
        WebEvent event = new WebEvent("Donald Trump's birthday!");
        notifySubscribers(event);
    }

    public void customEventOccurred() {
        WebEvent event = new WebEvent("The finale of Attack of the Titans is out!");
        notifySubscribers(event);
    }
}



