public class AreaOfCircle {
    public static void main(String[] args) {
        double radius = 5.0;
        if (args.length > 0) {
            radius = Double.parseDouble(args[0]);
        }
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of a circle with radius " + radius + " is: " + area);
        try { Thread.sleep(3600000); } catch (InterruptedException e) {}
    }
}

















// docker login
// docker build -t username/imagename .
//docker push username/imagename
// kubectl apply -f deployment.yaml
// kubectl get pods 
//kubectl log <pods>
