package metrics;

import metrics.DistanceMetric;

import java.util.Arrays;

public class SquaredEuclideanMetric implements DistanceMetric {
    @Override
    public double distBetween(double[] pos1, double[] pos2) {
        assert pos1.length == pos2.length : "points must be of equal dimension";
        int dim = pos1.length;
        double[] squaredDifferences = new double[dim];
        for(int i = 0; i < dim; i++) {
            squaredDifferences[i] = Math.pow(pos1[i] - pos2[i], 2);
        }

        return Arrays.stream(squaredDifferences).sum();
    }
}
