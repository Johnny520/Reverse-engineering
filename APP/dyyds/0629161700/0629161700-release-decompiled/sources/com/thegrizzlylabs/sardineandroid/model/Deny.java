package com.thegrizzlylabs.sardineandroid.model;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
@org.simpleframework.xml.Namespace(prefix = "D", reference = "DAV:")
@org.simpleframework.xml.Root
public class Deny {

    @org.simpleframework.xml.ElementList(required = false)
    private java.util.List<java.lang.Object> content;

    @org.simpleframework.xml.ElementList(inline = true)
    private java.util.List<com.thegrizzlylabs.sardineandroid.model.Privilege> privilege;

    public Deny() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.util.List<java.lang.Object> getContent() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.content
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.content = r0
        Lb:
            return r0
    }

    public java.util.List<com.thegrizzlylabs.sardineandroid.model.Privilege> getPrivilege() {
            r0 = this;
            java.util.List<com.thegrizzlylabs.sardineandroid.model.Privilege> r0 = r0.privilege
            return r0
    }

    public void setPrivilege(java.util.List<com.thegrizzlylabs.sardineandroid.model.Privilege> r1) {
            r0 = this;
            r0.privilege = r1
            return
    }
}
