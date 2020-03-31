package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.white.KingWhite;
import ru.job4j.chess.firuges.white.RookWhite;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class LogicTest {

    @Test
    public void whenMoveFalse() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.A1));
        logic.add(new KingWhite(Cell.C3));
        boolean rsl = logic.move(Cell.A1, Cell.D4);
        assertThat(rsl, is(false));
    }

    @Test
    public void whenMoveTrue() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.A1));
        boolean rsl = logic.move(Cell.A1, Cell.D4);
        assertThat(rsl, is(true));
    }
}
