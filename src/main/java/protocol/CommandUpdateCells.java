package protocol;

import org.jetbrains.annotations.NotNull;
import protocol.model.Cell;

/**
 * @author apomosov
 */
public class CommandUpdateCells extends Command {
  @NotNull
  public static final String NAME = "update";

  @NotNull
  private final Cell[] cells;
  public CommandUpdateCells(@NotNull Cell[] cells) {
    super(NAME);
    this.cells = cells;
  }
}
