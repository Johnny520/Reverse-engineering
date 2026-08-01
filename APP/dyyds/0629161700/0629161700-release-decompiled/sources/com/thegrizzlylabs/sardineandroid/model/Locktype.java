package com.thegrizzlylabs.sardineandroid.model;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
@org.simpleframework.xml.Namespace(prefix = "D", reference = "DAV:")
@org.simpleframework.xml.Root
public class Locktype {

    @org.simpleframework.xml.Element(required = false)
    private com.thegrizzlylabs.sardineandroid.model.Write write;

    public Locktype() {
            r0 = this;
            r0.<init>()
            return
    }

    public com.thegrizzlylabs.sardineandroid.model.Write getWrite() {
            r0 = this;
            com.thegrizzlylabs.sardineandroid.model.Write r0 = r0.write
            return r0
    }

    public void setWrite(com.thegrizzlylabs.sardineandroid.model.Write r1) {
            r0 = this;
            r0.write = r1
            return
    }
}
