package Day4;

public class MyPoint {

        int x = 0;
        int y = 0;

        public MyPoint() {

        }

        public MyPoint(int x, int y) {
            super();
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int[] getXY() {
            int[] arr = {x, y};
            return arr;
        }

        public void setXY(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }

        public double distance(int x, int y) {
            return Math.sqrt((x - getX()) * (y - getY()) + (x - getX()) * (x - getX()));
        }

        public double distance(MyPoint another) {
            return Math.sqrt((another.x - getX()) * (another.y - getY()) + (another.x - getX()) * (another.x - getX()));
        }

        public double distance() {
            return Math.sqrt((0 - getX()) * (0 - getY()) + (0 - getX()) * (0 - getX()));
        }
    }


