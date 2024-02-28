import java.util.LinkedList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println("Создан массив");
        int firstElement = array[0];
        System.out.println("Выбран первый элемент массива: " + firstElement);
        System.arraycopy(array, 3, array, 4, array.length - 4);
        array[3] = 100;
        System.out.println("Вставлен элемент 100 на позицию 3 массива");
        System.arraycopy(array, 4, array, 3, array.length - 4);
        System.out.println("Удален элемент на позиции 3 массива");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addFirst(0); // Добавляем элемент перед выборкой
        System.out.println("Создан связный список и добавлен первый элемент");
        firstElement = linkedList.get(0);
        System.out.println("Выбран первый элемент связного списка: " + firstElement);
        if (linkedList.size() > 3) {
            linkedList.add(3, 100);
            System.out.println("Вставлен элемент 100 на позицию 3 связного списка");
        } else {
            linkedList.addLast(100);
            System.out.println("Вставлен элемент 100 в конец связного списка");
        }
        if (linkedList.size() > 3) {
            linkedList.remove(3);
            System.out.println("Удален элемент на позиции 3 связного списка");
        } else if (!linkedList.isEmpty()) {
            linkedList.removeLast();
            System.out.println("Удален последний элемент связного списка");
        }
        TreeSet<Integer> binaryTree = new TreeSet<>();
        System.out.println("Создано бинарное дерево");
        boolean exists = binaryTree.contains(100);
        System.out.println("Проверка наличия элемента 100 в бинарном дереве: " + exists);
        binaryTree.add(100);
        System.out.println("Вставлен элемент 100 в бинарное дерево");
        binaryTree.remove(100);
        System.out.println("Удален элемент 100 из бинарного дерева");
    }
}
