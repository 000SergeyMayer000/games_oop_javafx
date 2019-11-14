package ru.job4j;

import com.sun.prism.impl.shape.BasicEllipseRep;
import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest {
    @Test
    public void whenPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertThat(bishopBlack.position(), is(Cell.C1));
    }

    @Test
    public void whenCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Figure bishopBlackCopy = bishopBlack.copy(Cell.C1);
        assertThat(bishopBlackCopy.position(), is(Cell.C1));
    }

    @Test
    public void thenWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] expect = bishopBlack.way(Cell.C1, Cell.G5);
        Cell[] actual = new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(expect, is(actual));
    }

    public static void main(String[] args) {
        int size = 8;
        Cell[] steps = new Cell[size];
        Cell source = Cell();
        int deltaY = 1;
       // steps[0] =new  Cell(0, 1 );
        Cell

    }
}
