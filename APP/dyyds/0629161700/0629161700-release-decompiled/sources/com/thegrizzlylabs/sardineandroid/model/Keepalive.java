package com.thegrizzlylabs.sardineandroid.model;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
@org.simpleframework.xml.Namespace(prefix = "D", reference = "DAV:")
@org.simpleframework.xml.Root
public class Keepalive {

    @org.simpleframework.xml.ElementList
    private java.util.List<java.io.Serializable> content;

    public Keepalive() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.util.List<java.io.Serializable> getContent() {
            r1 = this;
            java.util.List<java.io.Serializable> r0 = r1.content
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.content = r0
        Lb:
            return r0
    }
}
