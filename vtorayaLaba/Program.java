
import VectorPackage.*;
public class Program {
    public static void main(String[] args) {
        
        Vector a = new Vector(5);
        Vector b = new Vector(5);
        a.set(0, 2);a.set(1, 1);a.set(2, 0);a.set(3, 1);a.set(4, 2);
        b.set(0, 4);b.set(1, 2);b.set(2, 5);b.set(3, 7);b.set(4, 3);
        System.out.print("Вектор а: ");
        a.print();
        System.out.print("Вектор b: ");
        b.print();
        System.out.println("a.size(): " + a.size());
        System.out.println("a.min(): " + a.min());
        System.out.println("a.max(): " + a.max());
        System.out.println("a.normEuclidean(): " + a.normEuclidean());
        System.out.println("a.mul(b): " + a.mul(b));
        System.out.println("a.max(): " + a.max()); System.out.println("b.min(): " + b.min()); System.out.println("b.max(): " + b.max()); System.out.println("a.normEuclidean(): " + a.normEuclidean()); System.out.println("b.normEuclidean(): " + b.normEuclidean()); System.out.println("a.mul(b): " + a.mul(b)); System.out.println("b.mul(a): " + b.mul(a)); System.out.print("Вектор a после сортировки: ");
        a.sort();
        a.print();
        System.out.print("Вектор b после сортировки: "); b.sort();
        b.print(); System.out.print("a.mul(2.5): "); a.mul(2.5).print(); System.out.print("a.sum(b): "); a.sum(b).print(); System.out.print("b.sum(a): "); b.sum(a).print(); System.out.print("a.sum(a): "); a.sum(a).print();
    }
}