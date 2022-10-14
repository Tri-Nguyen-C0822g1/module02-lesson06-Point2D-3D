public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;
    public Point2D(){}

    public Point2D (float x, float y){
        this.x = x;
        this.y = y;
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
    public String getXY(){
        float [] XY = new float[2];
        XY[0] = x;
        XY[1] = y;
        return "(" + XY[0] + "," + XY[1] + ")";
    }
    @Override
    public String toString(){
        return "Array = " + getXY();
    }
}
