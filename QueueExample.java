import java.util.LinkedList;

class MyQueue<T> {
    private LinkedList<T> queue; // 使用 LinkedList 當作底層儲存結構

    public MyQueue() {
        queue = new LinkedList<>();
    }

    // 入列：放到尾端
    public void enqueue(T item) {
        queue.addLast(item);
    }

    // 出列：取出並移除第一個元素
    public T dequeue() {
        if (queue.isEmpty()) {
            return null; // 或可丟例外，看測試需求
        }
        return queue.removeFirst();
    }

    // 判斷是否為空
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // 回傳元素數量
    public int size() {
        return queue.size();
    }
}

public class QueueExample {
    public static void main(String[] args) {
        MyQueue<Integer> intQueue = new MyQueue<>();
        intQueue.enqueue(10);
        intQueue.enqueue(20);
        System.out.println(intQueue.dequeue()); // 10
        System.out.println(intQueue.dequeue()); // 20
        System.out.println(intQueue.isEmpty()); // true

        // 測試自訂物件
        MyQueue<Person> people = new MyQueue<>();
        people.enqueue(new Person("Alice", 25));
        people.enqueue(new Person("Bob", 30));
        System.out.println(people.dequeue()); // Person{name='Alice', age=25}
        System.out.println(people.dequeue()); // Person{name='Bob', age=30}
    }
}

// ---------------------------------------------------------------------------------
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
