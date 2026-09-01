package org.example;

import java.util.Objects;

public class Coords {
    Long x;
    Long y;

    public Coords() {
    }

    public Coords(Long y, Long x) {
        this.y = y;
        this.x = x;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Coords coords = (Coords) o;
        return Objects.equals(x, coords.x) && Objects.equals(y, coords.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public Long getY() {
        return y;
    }

    public void setY(Long y) {
        this.y = y;
    }

    public Long getX() {
        return x;
    }

    public void setX(Long x) {
        this.x = x;
    }
}
