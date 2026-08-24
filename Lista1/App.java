package Lista1;

import Lista1.model.TextEditor;

public class App {
    public static void main(String[] args) {
        TextEditor txt = new TextEditor("teste");

        System.out.println(txt.open());

        txt.edit("novo texto]");
        System.out.println(txt.open());
        txt.edit("Mais um pouco de texto");

        txt.rename("Novo teste");
        txt.clear();
        System.out.println(txt.open());

    }
    
}
