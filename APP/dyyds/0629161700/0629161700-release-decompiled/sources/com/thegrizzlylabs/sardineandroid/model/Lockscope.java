package com.thegrizzlylabs.sardineandroid.model;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
@org.simpleframework.xml.Namespace(prefix = "D", reference = "DAV:")
@org.simpleframework.xml.Root
public class Lockscope {

    @org.simpleframework.xml.Element(required = false)
    private com.thegrizzlylabs.sardineandroid.model.Exclusive exclusive;

    @org.simpleframework.xml.Element(required = false)
    private com.thegrizzlylabs.sardineandroid.model.Shared shared;

    public Lockscope() {
            r0 = this;
            r0.<init>()
            return
    }

    public com.thegrizzlylabs.sardineandroid.model.Exclusive getExclusive() {
            r0 = this;
            com.thegrizzlylabs.sardineandroid.model.Exclusive r0 = r0.exclusive
            return r0
    }

    public com.thegrizzlylabs.sardineandroid.model.Shared getShared() {
            r0 = this;
            com.thegrizzlylabs.sardineandroid.model.Shared r0 = r0.shared
            return r0
    }

    public void setExclusive(com.thegrizzlylabs.sardineandroid.model.Exclusive r1) {
            r0 = this;
            r0.exclusive = r1
            return
    }

    public void setShared(com.thegrizzlylabs.sardineandroid.model.Shared r1) {
            r0 = this;
            r0.shared = r1
            return
    }
}
