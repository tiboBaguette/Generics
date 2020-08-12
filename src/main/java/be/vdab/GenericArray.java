package be.vdab;


public class GenericArray<E> {
    private E[] array;

    public int getSize() {
        return array.length;
    }

    public E peek() {
        return array[array.length - 1];
    }

    public void push(E o) {
        int counter = 0;
        for (E object : array) {
            counter++;
        }
        if (counter >= array.length) {

        }
    }

    /*
    public E pop() {
        E o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }
     */
}