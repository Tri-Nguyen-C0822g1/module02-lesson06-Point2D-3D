public class Point3D extends Point2D{
    private float z = 0.0f;

    public Point3D(){}

    public Point3D(float x, float y, float z){
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public String getXYZ(){
        float [] XYZ = new float[3];
        XYZ[0] = getX();
        XYZ[1] = getY();
        XYZ[2] = z;
        return "(" + XYZ[0] + "," + XYZ[1] + "," + XYZ[2] + ")";
    }

    @Override
    public String toString() {
        return getXYZ();
    }
}
