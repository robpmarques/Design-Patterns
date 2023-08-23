package memento.notStrict;

public class Editor {
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

    public void restore(EditorState editorState) {
        content = editorState.content();
        mousePosition = editorState.mousePosition();
    }
}
