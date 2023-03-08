public class LimitingRectangle {
    int[][] points;

    public LimitingRectangle(int[][] points) {
        this.points = points;
    }
    public int min (int x){
        int min = 10000;
        for (int i = 0; i< points.length; i++){
            if(points[i][x] <= min) min = points[i][x];
        }
        return min;
    }
    public int max(int x){
        int max = - 10000;
        for (int i = 0; i< points.length; i++){
            if (points[i][x] >= max) max = points[i][x];
        }
        return max;
    }
    public int getWidth(){
        return this.max(0) - this.min(0);
    }
    public int getHeight(){
        return this.max(1) - this.min(1);
    }
    String getBorders(){
        return this.min(1) + ", " + this.max(1) + ", " + this.min(0) + ", " + this.max(0);
    }
}
