package Lista1.model;

public class TextEditor {
    // Atributos
    private String name;
    private String content;
    private int size;
    
    // Construtor

    public TextEditor(String name) {
        this.name = name;
        content = "";
        size = 0;
    }

    public TextEditor(String name, String content) {
        this.name = name;
        this.content=content;
        updateSize();
    }

    // Metodos

    public String open(){
        return toString();
    }

    public void edit (String newContent){
        this.content += newContent;
        updateSize();
    }

    private void updateSize(){
        size = content .length()*8;
    }

    public boolean rename (String newName){
        if(newName.isEmpty())
            return false;
        name = newName;
        return true;
    }

    public void clear(){
        content = "";
        updateSize();
    }
    //Gatters e Setters

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public int getSize() {
        return size;
    }

    //tooString

    @Override
    public String toString() {
        return "TextEditor [name=" + name + ", content=" + content + ", size=" + size + "]";
    }
    
    


}
