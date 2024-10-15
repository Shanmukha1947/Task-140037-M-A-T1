import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc; // Import for image processing

public class ObjectDetection {
    public static void main(String[] args) {
        // Load the OpenCV library
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        // Load the input image
        String imagePath = "input.jpg";
        Mat image = Imgcodecs.imread(imagePath);

        if (image.empty()) {
            System.out.println("Error: Cannot load image");
            return;
        }

        // Draw a rectangle (example object detection)
        int topLeftX = 100;
        int topLeftY = 100;
        int width = 200;
        int height = 200;
        Imgproc.rectangle(image, new Point(topLeftX, topLeftY), new Point(topLeftX + width, topLeftY + height), new Scalar(0, 255, 0), 2);

        // Save the output image
        String outputImagePath = "output.jpg";
        Imgcodecs.imwrite(outputImagePath, image);

        System.out.println("Object detected and highlighted in the image!");
    }
}
