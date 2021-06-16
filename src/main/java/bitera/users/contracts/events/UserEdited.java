package bitera.users.contracts.events;

import lombok.Value;
import java.time.Instant;

@Value
public class UserEdited {
    private String customerId;
    private String firstName;
    private String lastName;
    private String dni;
    private Instant occurredOn;
}
