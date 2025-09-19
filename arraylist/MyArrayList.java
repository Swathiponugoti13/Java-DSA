public class MyArrayList {

    private int[] data;
    private int size;
    private int capacity;


    public MyArrayList(){
        capacity = 10;
        data = new int[capacity];
        size = 0;
    }

    public void add(int value) {
        if (size == capacity) {
            resize();
        }
        data[size] = value;
        size++;
        System.out.println("Added: " + value);
    }


    public int get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return -1;
        }
        return data[index];
    }


    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return;
        }


        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        size--;
        System.out.println("Removed element at index: " + index);
    }


    public int size() {
        return size;
    }


    private void resize() {
        capacity *= 2;
        int[] newData = new int[capacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
        System.out.println("Resized array to capacity: " + capacity);
    }


    public void printList() {
        System.out.print("MyArrayList: ");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }



}
