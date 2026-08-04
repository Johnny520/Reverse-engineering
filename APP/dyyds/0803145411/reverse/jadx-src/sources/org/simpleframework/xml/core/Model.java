package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
interface Model extends Iterable<String> {
    LabelMap getAttributes();

    LabelMap getElements();

    Expression getExpression();

    int getIndex();

    ModelMap getModels();

    String getName();

    String getPrefix();

    Label getText();

    boolean isAttribute(String str);

    boolean isComposite();

    boolean isElement(String str);

    boolean isEmpty();

    boolean isModel(String str);

    Model lookup(String str, int i);

    Model lookup(Expression expression);

    Model register(String str, String str2, int i);

    void register(Label label);

    void registerAttribute(String str);

    void registerAttribute(Label label);

    void registerElement(String str);

    void registerElement(Label label);

    void registerText(Label label);

    void validate(Class cls);
}
