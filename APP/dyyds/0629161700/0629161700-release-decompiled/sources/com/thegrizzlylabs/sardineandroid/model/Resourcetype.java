package com.thegrizzlylabs.sardineandroid.model;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
@org.simpleframework.xml.Namespace(prefix = "D", reference = "DAV:")
@org.simpleframework.xml.Root
public class Resourcetype implements com.thegrizzlylabs.sardineandroid.model.EntityWithAnyElement {
    private java.util.List<org.w3c.dom.Element> any;

    @org.simpleframework.xml.Element(required = false)
    private com.thegrizzlylabs.sardineandroid.model.Collection collection;
    private com.thegrizzlylabs.sardineandroid.model.Principal principal;

    public Resourcetype() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.thegrizzlylabs.sardineandroid.model.EntityWithAnyElement
    public java.util.List<org.w3c.dom.Element> getAny() {
            r1 = this;
            java.util.List<org.w3c.dom.Element> r0 = r1.any
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.any = r0
        Lb:
            return r0
    }

    public com.thegrizzlylabs.sardineandroid.model.Collection getCollection() {
            r0 = this;
            com.thegrizzlylabs.sardineandroid.model.Collection r0 = r0.collection
            return r0
    }

    public com.thegrizzlylabs.sardineandroid.model.Principal getPrincipal() {
            r0 = this;
            com.thegrizzlylabs.sardineandroid.model.Principal r0 = r0.principal
            return r0
    }

    public void setCollection(com.thegrizzlylabs.sardineandroid.model.Collection r1) {
            r0 = this;
            r0.collection = r1
            return
    }

    public void setPrincipal(com.thegrizzlylabs.sardineandroid.model.Principal r1) {
            r0 = this;
            r0.principal = r1
            return
    }
}
