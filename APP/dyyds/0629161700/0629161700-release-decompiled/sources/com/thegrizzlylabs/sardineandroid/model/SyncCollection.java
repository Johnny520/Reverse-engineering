package com.thegrizzlylabs.sardineandroid.model;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
@org.simpleframework.xml.Namespace(prefix = "D", reference = "DAV:")
@org.simpleframework.xml.Root
public class SyncCollection {
    protected com.thegrizzlylabs.sardineandroid.model.Limit limit;
    protected com.thegrizzlylabs.sardineandroid.model.Prop prop;
    protected java.lang.String syncLevel;
    protected java.lang.String syncToken;

    public SyncCollection() {
            r0 = this;
            r0.<init>()
            return
    }

    public com.thegrizzlylabs.sardineandroid.model.Limit getLimit() {
            r0 = this;
            com.thegrizzlylabs.sardineandroid.model.Limit r0 = r0.limit
            return r0
    }

    public com.thegrizzlylabs.sardineandroid.model.Prop getProp() {
            r0 = this;
            com.thegrizzlylabs.sardineandroid.model.Prop r0 = r0.prop
            return r0
    }

    public java.lang.String getSyncLevel() {
            r0 = this;
            java.lang.String r0 = r0.syncLevel
            return r0
    }

    public java.lang.String getSyncToken() {
            r0 = this;
            java.lang.String r0 = r0.syncToken
            return r0
    }

    public void setLimit(com.thegrizzlylabs.sardineandroid.model.Limit r1) {
            r0 = this;
            r0.limit = r1
            return
    }

    public void setProp(com.thegrizzlylabs.sardineandroid.model.Prop r1) {
            r0 = this;
            r0.prop = r1
            return
    }

    public void setSyncLevel(java.lang.String r1) {
            r0 = this;
            r0.syncLevel = r1
            return
    }

    public void setSyncToken(java.lang.String r1) {
            r0 = this;
            r0.syncToken = r1
            return
    }
}
