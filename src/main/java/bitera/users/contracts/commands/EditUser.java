package bitera.users.contracts.commands;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
public class EditUser {

    @TargetAggregateIdentifier
    private String customerId;
    private String firstName;
    private String lastName;
    private String dni;
}
