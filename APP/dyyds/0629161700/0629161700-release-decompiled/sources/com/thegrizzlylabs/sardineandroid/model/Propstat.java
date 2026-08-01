package com.thegrizzlylabs.sardineandroid.model;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
@org.simpleframework.xml.Namespace(prefix = "D", reference = "DAV:")
@org.simpleframework.xml.Root
public class Propstat {

    @org.simpleframework.xml.Element(required = false)
    protected com.thegrizzlylabs.sardineandroid.model.Error error;

    @org.simpleframework.xml.Element
    protected com.thegrizzlylabs.sardineandroid.model.Prop prop;

    @org.simpleframework.xml.Element(required = false)
    protected java.lang.String responsedescription;

    @org.simpleframework.xml.Element
    protected java.lang.String status;

    public Propstat() {
            r0 = this;
            r0.<init>()
            return
    }

    public com.thegrizzlylabs.sardineandroid.model.Error getError() {
            r0 = this;
            com.thegrizzlylabs.sardineandroid.model.Error r0 = r0.error
            return r0
    }

    public com.thegrizzlylabs.sardineandroid.model.Prop getProp() {
            r0 = this;
            com.thegrizzlylabs.sardineandroid.model.Prop r0 = r0.prop
            return r0
    }

    public java.lang.String getResponsedescription() {
            r0 = this;
            java.lang.String r0 = r0.responsedescription
            return r0
    }

    public java.lang.String getStatus() {
            r0 = this;
            java.lang.String r0 = r0.status
            return r0
    }

    public void setError(com.thegrizzlylabs.sardineandroid.model.Error r1) {
            r0 = this;
            r0.error = r1
            return
    }

    public void setProp(com.thegrizzlylabs.sardineandroid.model.Prop r1) {
            r0 = this;
            r0.prop = r1
            return
    }

    public void setResponsedescription(java.lang.String r1) {
            r0 = this;
            r0.responsedescription = r1
            return
    }

    public void setStatus(java.lang.String r1) {
            r0 = this;
            r0.status = r1
            return
    }
}
