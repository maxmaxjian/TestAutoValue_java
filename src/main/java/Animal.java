import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.auto.value.AutoValue;

@AutoValue
abstract class Animal {
    @JsonProperty("name")
    public abstract String name();
    @JsonProperty("numOfLegs")
    public abstract int numOfLegs();

    @JsonCreator
    public static Animal create(@JsonProperty("name") String name, @JsonProperty("numOfLegs") int numOfLegs) {
        return new AutoValue_Animal(name, numOfLegs);
    }
}