package protocol;

import org.jetbrains.annotations.NotNull;

/**
 * @author apomosov
 */
public class CommandMove extends Command {
  @NotNull
  public static final String NAME = "move";

  private final float dx;
  private final float dy;
  public CommandMove(float dx, float dy) {
    super(NAME);
    this.dx = dx;
    this.dy = dy;
  }
}
