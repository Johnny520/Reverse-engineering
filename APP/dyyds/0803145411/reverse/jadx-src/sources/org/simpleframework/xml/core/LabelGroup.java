package org.simpleframework.xml.core;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
class LabelGroup {
    private final List<Label> list;
    private final int size;

    public LabelGroup(Label label) {
        this((List<Label>) Arrays.asList(label));
    }

    public List<Label> getList() {
        return this.list;
    }

    public Label getPrimary() {
        if (this.size > 0) {
            return this.list.get(0);
        }
        return null;
    }

    public LabelGroup(List<Label> list) {
        this.size = list.size();
        this.list = list;
    }
}
