package zad_5_2;

class MovablePoint implements Movable {
    private int x;
    private int y;

    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "X: %d, Y: %d".formatted(x,y);
    }
    @Override
    public void moveUp() {
        y++;
    }
    @Override
    public void moveDown() {
        y--;
    }
    @Override
    public void moveRight() {
        x++;
    }
    @Override
    public void moveLeft() {
        x--;
    }
}
