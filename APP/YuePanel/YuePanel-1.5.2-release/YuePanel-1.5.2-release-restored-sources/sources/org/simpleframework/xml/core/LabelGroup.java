package org.simpleframework.xml.core;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class LabelGroup {
    private final List<Label> list;
    private final int size;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public LabelGroup(List<Label> list) {
        this.size = list.size();
        this.list = list;
    }
}
