package com.thegrizzlylabs.sardineandroid.model;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
@org.simpleframework.xml.Namespace(prefix = "D", reference = "DAV:")
@org.simpleframework.xml.Root(strict = false)
public class Privilege {

    @org.simpleframework.xml.ElementListUnion({@org.simpleframework.xml.ElementList(entry = "read", inline = true, type = com.thegrizzlylabs.sardineandroid.model.Read.class), @org.simpleframework.xml.ElementList(entry = "write", inline = true, type = com.thegrizzlylabs.sardineandroid.model.Write.class), @org.simpleframework.xml.ElementList(entry = "write-properties", inline = true, type = com.thegrizzlylabs.sardineandroid.model.WriteProperties.class), @org.simpleframework.xml.ElementList(entry = "write-content", inline = true, type = com.thegrizzlylabs.sardineandroid.model.WriteContent.class), @org.simpleframework.xml.ElementList(entry = "unlock", inline = true, type = com.thegrizzlylabs.sardineandroid.model.Unlock.class), @org.simpleframework.xml.ElementList(entry = "read-acl", inline = true, type = com.thegrizzlylabs.sardineandroid.model.ReadAcl.class), @org.simpleframework.xml.ElementList(entry = "write-acl", inline = true, type = com.thegrizzlylabs.sardineandroid.model.WriteAcl.class), @org.simpleframework.xml.ElementList(entry = "bind", inline = true, type = com.thegrizzlylabs.sardineandroid.model.Bind.class), @org.simpleframework.xml.ElementList(entry = "unbind", inline = true, type = com.thegrizzlylabs.sardineandroid.model.UnBind.class), @org.simpleframework.xml.ElementList(entry = "read-current-user-privilege-set", inline = true, type = com.thegrizzlylabs.sardineandroid.model.ReadCurrentUserPrivilegeSet.class), @org.simpleframework.xml.ElementList(entry = "all", inline = true, type = com.thegrizzlylabs.sardineandroid.model.All.class), @org.simpleframework.xml.ElementList(entry = "write_acl", inline = true, type = com.thegrizzlylabs.sardineandroid.model.WriteAcl.class), @org.simpleframework.xml.ElementList(entry = "read_acl", inline = true, type = com.thegrizzlylabs.sardineandroid.model.ReadAcl.class)})
    private java.util.List<com.thegrizzlylabs.sardineandroid.model.SimplePrivilege> content;

    public Privilege() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.util.List<com.thegrizzlylabs.sardineandroid.model.SimplePrivilege> getContent() {
            r1 = this;
            java.util.List<com.thegrizzlylabs.sardineandroid.model.SimplePrivilege> r0 = r1.content
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.content = r0
        Lb:
            return r0
    }

    public void setContent(java.util.List<com.thegrizzlylabs.sardineandroid.model.SimplePrivilege> r1) {
            r0 = this;
            r0.content = r1
            return
    }
}
