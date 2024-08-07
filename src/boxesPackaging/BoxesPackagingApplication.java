package boxesPackaging;

import java.util.Scanner;

public class BoxesPackagingApplication {
    public static void main(String[] args) {

        BoxesPackaging boxesPackaging = new BoxesPackaging();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first edge 'b' of rectangle cuboid");
        double bEdgeRect = scanner.nextDouble();
        System.out.println("Please enter second edge 'c' of rectangle cuboid");
        double cEdgeRect = scanner.nextDouble();
        System.out.println("Please enter third edge 'd' of rectangle cuboid");
        double dEdgeRect = scanner.nextDouble();

        // double vRect = bEdgeRect*cEdgeRect*dEdgeRect;
        double i = 0.01;
        //double vCube = i*i*i;

        while ((i % bEdgeRect != 0) && (i % cEdgeRect != 0) && (i % dEdgeRect != 0)) {
            if (i <= 10000000.00) {
                i += 0.01;
                //TODO tady bude ještě
            }
        }
        System.out.println("The value of 'a' cube edge is now" + i);
        //TODO else větev pro případ že i není vypočítano

        // while ((vCube%vRect !== 0) && (i%bEdgeRect !== 0)){
        //     i=i+0.01;
        //     i++;
        // }


        // Boolean aEdgeCubeDivisibleWoRemainder = ((i % bEdgeRect=0) && (i % cEdgeRect = 0) && (i % dEdgeRect = 0) && (vCube % vRect = 0));


    }
}
