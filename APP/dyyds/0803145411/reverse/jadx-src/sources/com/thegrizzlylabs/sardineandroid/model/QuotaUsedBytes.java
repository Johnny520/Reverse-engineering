package com.thegrizzlylabs.sardineandroid.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
@Namespace(prefix = "D", reference = "DAV:")
@Root
public class QuotaUsedBytes {

    @ElementList(required = false)
    protected List<String> content;

    public List<String> getContent() {
        List<String> list = this.content;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        this.content = arrayList;
        return arrayList;
    }
}
