package com.thegrizzlylabs.sardineandroid.model;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
@org.simpleframework.xml.Namespace(prefix = "D", reference = "DAV:")
@org.simpleframework.xml.Root
public class Principal {

    @org.simpleframework.xml.Element(required = false)
    private com.thegrizzlylabs.sardineandroid.model.All all;

    @org.simpleframework.xml.Element(required = false)
    private com.thegrizzlylabs.sardineandroid.model.Authenticated authenticated;

    @org.simpleframework.xml.Element(required = false)
    private java.lang.String href;

    @org.simpleframework.xml.Element(required = false)
    private com.thegrizzlylabs.sardineandroid.model.Property property;

    @org.simpleframework.xml.Element(required = false)
    private com.thegrizzlylabs.sardineandroid.model.Self self;

    @org.simpleframework.xml.Element(required = false)
    private com.thegrizzlylabs.sardineandroid.model.Unauthenticated unauthenticated;

    public Principal() {
            r0 = this;
            r0.<init>()
            return
    }

    public com.thegrizzlylabs.sardineandroid.model.All getAll() {
            r0 = this;
            com.thegrizzlylabs.sardineandroid.model.All r0 = r0.all
            return r0
    }

    public com.thegrizzlylabs.sardineandroid.model.Authenticated getAuthenticated() {
            r0 = this;
            com.thegrizzlylabs.sardineandroid.model.Authenticated r0 = r0.authenticated
            return r0
    }

    public java.lang.String getHref() {
            r0 = this;
            java.lang.String r0 = r0.href
            return r0
    }

    public com.thegrizzlylabs.sardineandroid.model.Property getProperty() {
            r0 = this;
            com.thegrizzlylabs.sardineandroid.model.Property r0 = r0.property
            return r0
    }

    public com.thegrizzlylabs.sardineandroid.model.Self getSelf() {
            r0 = this;
            com.thegrizzlylabs.sardineandroid.model.Self r0 = r0.self
            return r0
    }

    public com.thegrizzlylabs.sardineandroid.model.Unauthenticated getUnauthenticated() {
            r0 = this;
            com.thegrizzlylabs.sardineandroid.model.Unauthenticated r0 = r0.unauthenticated
            return r0
    }

    public void setAll(com.thegrizzlylabs.sardineandroid.model.All r1) {
            r0 = this;
            r0.all = r1
            return
    }

    public void setAuthenticated(com.thegrizzlylabs.sardineandroid.model.Authenticated r1) {
            r0 = this;
            r0.authenticated = r1
            return
    }

    public void setHref(java.lang.String r1) {
            r0 = this;
            r0.href = r1
            return
    }

    public void setProperty(com.thegrizzlylabs.sardineandroid.model.Property r1) {
            r0 = this;
            r0.property = r1
            return
    }

    public void setSelf(com.thegrizzlylabs.sardineandroid.model.Self r1) {
            r0 = this;
            r0.self = r1
            return
    }

    public void setUnauthenticated(com.thegrizzlylabs.sardineandroid.model.Unauthenticated r1) {
            r0 = this;
            r0.unauthenticated = r1
            return
    }
}
