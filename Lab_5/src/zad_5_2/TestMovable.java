package zad_5_2;

class TestMovable {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(0, 0);
        System.out.println("Punkt znajduje się na współrzędnych: " + movablePoint);
        movablePoint.moveUp();
        System.out.println("Następnie ruch w górę daje współrzędne: " + movablePoint);
        movablePoint.moveDown();
        System.out.println("Następnie ruch w dół daje współrzędne: " + movablePoint);
        movablePoint.moveRight();
        System.out.println("Następnie ruch w prawo daje współrzędne: " + movablePoint);
        movablePoint.moveLeft();
        System.out.println("Następnie ruch w lewo daje współrzędne: " + movablePoint);

    }
}
