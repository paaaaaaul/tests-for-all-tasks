package ArraysManipulationTask1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Scanner;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class ArrayRotationTest {

    @Test
    public void testArrayRotation() {
        Scanner scanner = new Scanner(System.in);
        Scanner kScanner = new Scanner(System.in);

        int size = scanner.nextInt(); // задаем размер массива
        int elToMove = kScanner.nextInt(); // задаем кол-во элементов, которые нуэно переместить

        int arr[] = new int[size]; // массив, кладем size, как размер массива
        int n = arr.length; // длина массива

        for (int i = 0; i < size; i++) { // в цикле заполняем массив
            arr[i] = scanner.nextInt();
        }

//        moveToEnd(arr, n, elToMove); //передаем параметры в метод, который будет переносить элементы массива

        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " "); //выводим результат в консоль
        }
    }

}