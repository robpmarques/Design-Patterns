package memento.strict;

public class Editor {
    public class EditorState implements Memento {
        private final String content;
        private final String mousePosition;

        public EditorState(String content, String mousePosition) {
            this.content = content;
            this.mousePosition = mousePosition;
        }
    }

    private String content = "";
    private String mousePosition = "";

    public void setContent(String content) {
        this.content = content;
    }

    public void setMousePosition(String mousePosition) {
        this.mousePosition = mousePosition;
    }

    public EditorState createState() {
        return new EditorState(content, mousePosition);
    }

    public void restore(Memento editorState) {
        var oldState = (EditorState) editorState;

        content = oldState.content;
        mousePosition = oldState.mousePosition;
    }

    @Override
    public String toString() {
        return "Editor{" +
                "content='" + content + '\'' +
                ", mousePosition='" + mousePosition + '\'' +
                '}';
    }
}
