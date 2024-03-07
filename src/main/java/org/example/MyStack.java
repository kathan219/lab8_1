package org.example;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<E> {

    private final ArrayList<E> delegate;

    public MyStack() {
        delegate = new ArrayList<>();
    }


    public void push(E e) {
        delegate.add(e);
    }

    public E pop() {
        if (isEmpty()) throw new EmptyStackException();
        return delegate.remove(getSize() - 1);
    }

    public boolean isEmpty(){
        return delegate.isEmpty();
    }

    public int getSize(){
        return delegate.size();
    }

}
