package boxesPackaging;

public class BoxesPackaging {
    private double aEdgeCube;
    private double bEdgeRect;
    private double cEdgeRect;
    private double dEdgeRect;
    private double cubeVolume;
    private double rectVolume;

    public BoxesPackaging() {
    }

    public BoxesPackaging(double aEdgeCube, double bEdgeRect, double cEdgeRect, double dEdgeRect, double cubeVolume, double rectVolume) {
        this.aEdgeCube = aEdgeCube;
        this.bEdgeRect = bEdgeRect;
        this.cEdgeRect = cEdgeRect;
        this.dEdgeRect = dEdgeRect;
        this.cubeVolume = cubeVolume;
        this.rectVolume = rectVolume;
    }

    public double getaEdgeCube() {
        return aEdgeCube;
    }

    public void setaEdgeCube(double aEdgeCube) {
        this.aEdgeCube = aEdgeCube;
    }

    public double getbEdgeRect() {
        return bEdgeRect;
    }

    public void setbEdgeRect(double bEdgeRect) {
        this.bEdgeRect = bEdgeRect;
    }

    public double getcEdgeRect() {
        return cEdgeRect;
    }

    public void setcEdgeRect(double cEdgeRect) {
        this.cEdgeRect = cEdgeRect;
    }

    public double getdEdgeRect() {
        return dEdgeRect;
    }

    public void setdEdgeRect(double dEdgeRect) {
        this.dEdgeRect = dEdgeRect;
    }

    public double getCubeVolume() {
        return cubeVolume;
    }

    public void setCubeVolume(double cubeVolume) {
        this.cubeVolume = cubeVolume;
    }

    public double getRectVolume() {
        return rectVolume;
    }

    public void setRectVolume(double rectVolume) {
        this.rectVolume = rectVolume;
    }
}
