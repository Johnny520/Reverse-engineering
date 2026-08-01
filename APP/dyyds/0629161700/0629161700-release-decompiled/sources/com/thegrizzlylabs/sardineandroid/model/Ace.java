package com.thegrizzlylabs.sardineandroid.model;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
@org.simpleframework.xml.Namespace(prefix = "D", reference = "DAV:")
@org.simpleframework.xml.Root
public class Ace {

    @org.simpleframework.xml.Element(required = false)
    private com.thegrizzlylabs.sardineandroid.model.Deny deny;

    @org.simpleframework.xml.Element(required = false)
    private com.thegrizzlylabs.sardineandroid.model.Grant grant;

    @org.simpleframework.xml.Element(required = false)
    private com.thegrizzlylabs.sardineandroid.model.Inherited inherited;

    @org.simpleframework.xml.Element(required = false)
    private com.thegrizzlylabs.sardineandroid.model.Principal principal;

    @org.simpleframework.xml.Element(name = "protected", required = false)
    private com.thegrizzlylabs.sardineandroid.model.Protected protected1;

    public Ace() {
            r0 = this;
            r0.<init>()
            return
    }

    public com.thegrizzlylabs.sardineandroid.model.Deny getDeny() {
            r0 = this;
            com.thegrizzlylabs.sardineandroid.model.Deny r0 = r0.deny
            return r0
    }

    public com.thegrizzlylabs.sardineandroid.model.Grant getGrant() {
            r0 = this;
            com.thegrizzlylabs.sardineandroid.model.Grant r0 = r0.grant
            return r0
    }

    public com.thegrizzlylabs.sardineandroid.model.Inherited getInherited() {
            r0 = this;
            com.thegrizzlylabs.sardineandroid.model.Inherited r0 = r0.inherited
            return r0
    }

    public com.thegrizzlylabs.sardineandroid.model.Principal getPrincipal() {
            r0 = this;
            com.thegrizzlylabs.sardineandroid.model.Principal r0 = r0.principal
            return r0
    }

    public com.thegrizzlylabs.sardineandroid.model.Protected getProtected() {
            r0 = this;
            com.thegrizzlylabs.sardineandroid.model.Protected r0 = r0.protected1
            return r0
    }

    public void setDeny(com.thegrizzlylabs.sardineandroid.model.Deny r1) {
            r0 = this;
            r0.deny = r1
            return
    }

    public void setGrant(com.thegrizzlylabs.sardineandroid.model.Grant r1) {
            r0 = this;
            r0.grant = r1
            return
    }

    public void setInherited(com.thegrizzlylabs.sardineandroid.model.Inherited r1) {
            r0 = this;
            r0.inherited = r1
            return
    }

    public void setPrincipal(com.thegrizzlylabs.sardineandroid.model.Principal r1) {
            r0 = this;
            r0.principal = r1
            return
    }

    public void setProtected(com.thegrizzlylabs.sardineandroid.model.Protected r1) {
            r0 = this;
            r0.protected1 = r1
            return
    }
}
