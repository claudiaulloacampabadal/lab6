/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Claudia
 */
public class ArrayStack implements Stack {

    private int n;//n es el tamaño máximo del arreglo
    private int top; //top es el tope de la pila

    private Object stack[];

    //constructor
    public ArrayStack(int n) {
        if (n <= 0) {
            System.exit(1);
        }//end if 

        this.n = n;
        this.top = -1; //indica que la pila esta vacia
        this.stack = new Object[n];//arreglo de objetos para la pila
    }//end constructor

    @Override
    public int size() {//tamaño de la pila

        return top + 1;//retorna el último elemento(índice) más uno, o sea, el tamaño total 

    }//end size

    @Override
    public void clear() {//limpiar la pila

        stack = new Object[n];
        top = -1;//para que la pila esté vacía

    }//end clear

    @Override
    public boolean isEmpty() {

        return top == -1;
    }//end is empty

    @Override
    public Object peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("The array stack is empty");
        }
        return stack[top];

    }//end peek

    @Override
    public Object top() throws StackException {
        if (isEmpty()) {
            throw new StackException("The array stack is empty");
        }
        return stack[top];
    }//end top

    @Override
    public void push(Object element) throws StackException {

        if (top == stack.length - 1) {
            throw new StackException("The array stack is full");
        }
        stack[++top] = element;

    }

    @Override
    public Object pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("The array stack is empty");
        }
        return stack[top--];

    }//end pop

    @Override
    public String toString() {

        String result = "\nArray Stack\n";

        try {
            
            ArrayStack auxStack = new ArrayStack(size());

            while (!isEmpty()) {//mientras sea diferente de vacio
                result += "\n" + peek() + " ";
                auxStack.push(pop());
                //Se sale del while cuando la pila esta vacia
            }
            //dejar la pila es su estado original
            while (!auxStack.isEmpty()) {
                push(auxStack.pop());
            }
        } catch (StackException ex) {
            System.out.println(ex.getMessage());
        }
        return result;//Retorna el resultado

    }//End toString

}//END END
