package memento.strict;

import memento.notStrict.EditorState;

import java.util.Stack;

public class History {
    private Stack<Memento> states = new Stack<>();

    public void push(Memento editorState) {
        states.push(editorState);
    }

    public Memento pop() {
        return states.pop();
    }
}
