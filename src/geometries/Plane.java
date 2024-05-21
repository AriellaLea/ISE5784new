package geometries;

import primitives.*;


/**
 * Plane class represents a 3-dimensional plane.
 * A plane is defined by a point and a normal vector.
 */

public class Plane implements Geometry {
    /** A point on the plane */
    protected final Point point;
    /** The normal vector to the plane */
    protected final Vector normal;

    /**
     *Constructs a Plane from three points.
     *      * The plane is defined by the three points, and the normal vector is calculated.
     * @param v0
     * @param v1
     * @param v2
     */
    public Plane(Point v0, Point v1, Point v2) {
        this.point = v1;
        this.normal = v1.subtract(v0).crossProduct(v1.subtract(v2)).normalize();

    }
    /**
     * Constructs a Plane from a point and a normal vector.
     *
     * @param p the point on the plane
     * @param v the normal vector to the plane
     */

public Plane(Point p, Vector v){
        this.point = p;
       this.normal=v.normalize();

}
    /**
     * Returns the normal vector to the plane.
     *
     * @return the normal vector to the plane
     */
    public Vector getNormal() {
        return this.normal;
    }
    /**
     * Returns the normal vector to the plane at a given point.
     * This method is required by the Geometry interface but is not used here.
     *
     * @param point the point on the plane
     * @return null as this method is not implemented
     */
    @Override
    public Vector getNormal(Point point) {
        return null;
    }
}