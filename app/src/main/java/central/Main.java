package central;

public class Main {

    public static void main(String[] args) {
        String[] moduleName = {
                "linearSearch",
                "binarySearch",
                "bubbleSort",
                "insertionSort",
                "selectionSort",
                "mergeSort",
                "linkedList",
        };
        System.out.println("Available Module: ");
        for (String module : moduleName) {
            System.out.println(module);
        }
        System.out.println();
        System.out.println("Run 'gradle test --tests kata.Kata.[moduleName]' to test your code");
    }
}
