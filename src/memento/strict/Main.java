package memento.strict;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");

        var lastState = history.pop();
        editor.restore(lastState);

        System.out.println(editor);
    }
}
