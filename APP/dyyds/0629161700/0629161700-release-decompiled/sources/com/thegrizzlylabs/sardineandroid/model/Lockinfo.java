package com.thegrizzlylabs.sardineandroid.model;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
@org.simpleframework.xml.Namespace(prefix = "D", reference = "DAV:")
@org.simpleframework.xml.Root
public class Lockinfo {

    @org.simpleframework.xml.Element
    private com.thegrizzlylabs.sardineandroid.model.Lockscope lockscope;

    @org.simpleframework.xml.Element
    private com.thegrizzlylabs.sardineandroid.model.Locktype locktype;

    @org.simpleframework.xml.Element(required = false)
    private com.thegrizzlylabs.sardineandroid.model.Owner owner;

    public Lockinfo() {
            r0 = this;
            r0.<init>()
            return
    }

    public com.thegrizzlylabs.sardineandroid.model.Lockscope getLockscope() {
            r0 = this;
            com.thegrizzlylabs.sardineandroid.model.Lockscope r0 = r0.lockscope
            return r0
    }

    public com.thegrizzlylabs.sardineandroid.model.Locktype getLocktype() {
            r0 = this;
            com.thegrizzlylabs.sardineandroid.model.Locktype r0 = r0.locktype
            return r0
    }

    public com.thegrizzlylabs.sardineandroid.model.Owner getOwner() {
            r0 = this;
            com.thegrizzlylabs.sardineandroid.model.Owner r0 = r0.owner
            return r0
    }

    public void setLockscope(com.thegrizzlylabs.sardineandroid.model.Lockscope r1) {
            r0 = this;
            r0.lockscope = r1
            return
    }

    public void setLocktype(com.thegrizzlylabs.sardineandroid.model.Locktype r1) {
            r0 = this;
            r0.locktype = r1
            return
    }

    public void setOwner(com.thegrizzlylabs.sardineandroid.model.Owner r1) {
            r0 = this;
            r0.owner = r1
            return
    }
}
