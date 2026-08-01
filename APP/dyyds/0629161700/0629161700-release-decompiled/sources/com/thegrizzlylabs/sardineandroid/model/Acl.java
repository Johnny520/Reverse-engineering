package com.thegrizzlylabs.sardineandroid.model;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
@org.simpleframework.xml.Namespace(prefix = "D", reference = "DAV:")
@org.simpleframework.xml.Root
public class Acl {

    @org.simpleframework.xml.ElementList(inline = true, required = false)
    private java.util.List<com.thegrizzlylabs.sardineandroid.model.Ace> ace;

    public Acl() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.util.List<com.thegrizzlylabs.sardineandroid.model.Ace> getAce() {
            r0 = this;
            java.util.List<com.thegrizzlylabs.sardineandroid.model.Ace> r0 = r0.ace
            return r0
    }

    public void setAce(java.util.List<com.thegrizzlylabs.sardineandroid.model.Ace> r1) {
            r0 = this;
            r0.ace = r1
            return
    }
}
