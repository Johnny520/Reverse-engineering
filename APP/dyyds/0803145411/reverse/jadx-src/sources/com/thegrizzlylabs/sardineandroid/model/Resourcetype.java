package com.thegrizzlylabs.sardineandroid.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import org.w3c.dom.Element;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
@Namespace(prefix = "D", reference = "DAV:")
@Root
public class Resourcetype implements EntityWithAnyElement {
    private List<Element> any;

    @org.simpleframework.xml.Element(required = false)
    private Collection collection;
    private Principal principal;

    @Override // com.thegrizzlylabs.sardineandroid.model.EntityWithAnyElement
    public List<Element> getAny() {
        List<Element> list = this.any;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        this.any = arrayList;
        return arrayList;
    }

    public Collection getCollection() {
        return this.collection;
    }

    public Principal getPrincipal() {
        return this.principal;
    }

    public void setCollection(Collection collection) {
        this.collection = collection;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }
}
