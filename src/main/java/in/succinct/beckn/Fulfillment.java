package in.succinct.beckn;

import java.util.HashSet;
import java.util.Set;

public class Fulfillment extends BecknObjectWithId {

    public Fulfillment() {
        super();
    }

    public Fulfillment(String payload) {
        super(payload);
    }

    public String getType() {
        return get("type");
    }

    public void setType(String type) {
        if (!getFulfillmentTypes().contains(type)) {
            throw new IllegalArgumentException();
        }
        set("type", type);
    }

    public Set<String> getFulfillmentTypes() {
        return new HashSet<>() {{
            add("home_delivery");
            add("store_pickup");
            add("return_to_origin");
        }};
    }

    public FulfillmentStop getStart() {
        return get(FulfillmentStop.class, "start");
    }

    public void setStart(FulfillmentStop start) {
        set("start", start);
    }

    public FulfillmentStop getEnd() {
        return get(FulfillmentStop.class, "end");
    }

    public void setEnd(FulfillmentStop end) {
        set("end", end);
    }

    public boolean getTracking() {
        return getBoolean("tracking");
    }

    public void setTracking(boolean tracking) {
        set("tracking", tracking);
    }

    public Agent getAgent() {
        return get("agent");
    }

    public void setAgent(Agent agent) {
        set("agent", agent);
    }

    public State getState() {
        return getState(false);
    }

    public State getState(boolean create) {
        return get(State.class, "state", create);
    }

    public void setState(State state) {
        set("state", state);
    }

    public void setState(String state) {
        getState(true).getDescriptor(true).setCode(state);
    }

    public User getCustomer() {
        return get(User.class, "customer");
    }

    public void setCustomer(User customer) {
        set("customer", customer);
    }

    public Vehicle getVehicle() {
        return get(Vehicle.class, "vehicle");
    }

    public void setVehicle(Vehicle vehicle) {
        set("vehicle", vehicle);
    }

    public Tags getTags() {
        return get(Tags.class, "tags");
    }

    public void setTags(Tags tags) {
        set("tags", tags);
    }

    public boolean getRateable() {
        return getBoolean("rateable");
    }

    public void setRateable(boolean rateable) {
        set("rateable", rateable);
    }

    public String getProviderId() {
        return get("provider_id");
    }

    public void setProviderId(String provider_id) {
        set("provider_id", provider_id);
    }

    public int getRating() {
        return get("rating");
    }

    public void setRating(int rating) {
        set("rating", rating);
    }

    public Contact getContact() {
        return get(Contact.class, "contact");
    }

    public void setContact(Contact contact) {
        set("contact", contact.getInner());
    }
}


