package ASS_4_ObserverPattern;

public class WebEventListenerImpl implements WebEventListener {
    private String name;

    public WebEventListenerImpl(String name) {
        this.name = name;
    }

    @Override
    public void update(WebEvent event) {
        if (name.equals("Observer 1") && event.getData().contains("Donald Trump's birthday")) {
            System.out.println(name + " received event data: " + event.getData());
        } else if (name.equals("Observer 2") && event.getData().contains("Attack of the Titans")) {
            System.out.println(name + " received event data: " + event.getData());
        }
    }
}
