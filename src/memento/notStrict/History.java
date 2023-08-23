package memento.notStrict;

import java.util.Stack;

public class History {
    private Stack<EditorState> states = new Stack<>();

    public void push(EditorState editorState) {
        states.push(editorState);
    }

    public EditorState pop() {
        return states.pop();
    }
}
