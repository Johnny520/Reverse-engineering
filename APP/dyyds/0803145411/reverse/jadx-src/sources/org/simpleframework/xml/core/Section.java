package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
interface Section extends Iterable<String> {
    String getAttribute(String str);

    LabelMap getAttributes();

    Label getElement(String str);

    LabelMap getElements();

    String getName();

    String getPath(String str);

    String getPrefix();

    Section getSection(String str);

    Label getText();

    boolean isSection(String str);
}
