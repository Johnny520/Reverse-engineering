package com.thegrizzlylabs.sardineandroid.model;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
@org.simpleframework.xml.Namespace(prefix = "D", reference = "DAV:")
@org.simpleframework.xml.Root
public class Multistatus {

    @org.simpleframework.xml.ElementList(inline = true)
    protected java.util.List<com.thegrizzlylabs.sardineandroid.model.Response> response;

    @org.simpleframework.xml.Element(required = false)
    protected java.lang.String responsedescription;
    protected java.lang.String syncToken;

    public Multistatus() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.util.List<com.thegrizzlylabs.sardineandroid.model.Response> getResponse() {
            r1 = this;
            java.util.List<com.thegrizzlylabs.sardineandroid.model.Response> r0 = r1.response
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.response = r0
        Lb:
            return r0
    }

    public java.lang.String getResponsedescription() {
            r0 = this;
            java.lang.String r0 = r0.responsedescription
            return r0
    }

    public java.lang.String getSyncToken() {
            r0 = this;
            java.lang.String r0 = r0.syncToken
            return r0
    }

    public void setResponsedescription(java.lang.String r1) {
            r0 = this;
            r0.responsedescription = r1
            return
    }

    public void setSyncToken(java.lang.String r1) {
            r0 = this;
            r0.syncToken = r1
            return
    }
}
