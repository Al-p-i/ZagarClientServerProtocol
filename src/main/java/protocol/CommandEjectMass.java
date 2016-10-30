package protocol;

import org.jetbrains.annotations.NotNull;

/**
 * @author apomosov
 */
public class CommandEjectMass extends Command {
  @NotNull
  public static final String NAME = "eject";

  public CommandEjectMass() {
    super(NAME);
  }
}
