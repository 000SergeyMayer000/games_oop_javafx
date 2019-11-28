package ru.job4j.chess.firuges.black;

import ru.job4j.chess.Logic;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

/**
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {
        if (!isDiagonal(source, dest)) {
            throw new IllegalStateException(
                    String.format("Could not way by diagonal from %s to %s", source, dest)
            );
        }
        int deltaX = 0;
        int deltaY = 0;
        int size = Math.abs(dest.x - source.x);
        Cell[] steps = new Cell[size];
        if ((dest.x - source.x) > 0) {
            deltaX = 1;
        } else {
            deltaX = -1;
        }
        if ((dest.y - source.y) > 0) {
            deltaY = 1;
        } else {
            deltaY = -1;
        }
        Cell cell = null;
        for (int index = 0; index < size; index++) {
            cell = Cell.findBy((dest.x + deltaX), (dest.y + deltaY));
            steps[index] = cell;
        }
        return steps;
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        boolean checkDiagonal = false;
        if ((Math.abs(dest.y - source.y)) == (Math.abs(dest.x - source.x))) {
            checkDiagonal = true;
        }
        return checkDiagonal;
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}

