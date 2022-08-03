package Day4;

public class EX3 {

        float x;
        float y;
        int raduis;
        float xDelta;
        float yDelta;

        public EX3(float x, float y, int raduis, float xDelta, float yDelta) {
            super();
            this.x = x;
            this.y = y;
            this.raduis = raduis;
            this.xDelta = xDelta;
            this.yDelta = yDelta;
        }


        public float getX() {
            return x;
        }
        public void setX(float x) {
            this.x = x;
        }
        public float getY() {
            return y;
        }
        public void setY(float y) {
            this.y = y;
        }
        public int getRaduis() {
            return raduis;
        }
        public void setRaduis(int raduis) {
            this.raduis = raduis;
        }
        public float getxDelta() {
            return xDelta;
        }
        public void setxDelta(float xDelta) {
            this.xDelta = xDelta;
        }
        public float getyDelta() {
            return yDelta;
        }
        public void setyDelta(float yDelta) {
            this.yDelta = yDelta;
        }

        public void move() {
            x += xDelta;
            y += yDelta;
        }

        public void reflectHorizontal() {
            xDelta = -xDelta;
        }

        public void reflectVertical() {
            yDelta = -yDelta;
        }


        @Override
        public String toString() {
            return "Ball [(" + x + ", " + y + "), speed (" + xDelta + ", " + yDelta + ")]";
        }

    }

