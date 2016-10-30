package protocol;

import org.jetbrains.annotations.NotNull;

/**
 * @author apomosov
 */
public class CommandResetLevel extends Command {
  @NotNull
  public static final String NAME = "reset";

  public CommandResetLevel() {
    super(NAME);
  }
}
