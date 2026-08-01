package com.thegrizzlylabs.sardineandroid.model;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
@org.simpleframework.xml.Namespace(prefix = "D", reference = "DAV:")
@org.simpleframework.xml.Root
public class Response {
    protected com.thegrizzlylabs.sardineandroid.model.Error error;

    @org.simpleframework.xml.Element
    protected java.lang.String href;
    protected com.thegrizzlylabs.sardineandroid.model.Location location;

    @org.simpleframework.xml.ElementList(inline = true, required = false)
    protected java.util.List<com.thegrizzlylabs.sardineandroid.model.Propstat> propstat;
    protected java.lang.String responsedescription;
    protected java.lang.String status;

    public Response() {
            r0 = this;
            r0.<init>()
            return
    }

    public com.thegrizzlylabs.sardineandroid.model.Error getError() {
            r0 = this;
            com.thegrizzlylabs.sardineandroid.model.Error r0 = r0.error
            return r0
    }

    public java.lang.String getHref() {
            r0 = this;
            java.lang.String r0 = r0.href
            return r0
    }

    public com.thegrizzlylabs.sardineandroid.model.Location getLocation() {
            r0 = this;
            com.thegrizzlylabs.sardineandroid.model.Location r0 = r0.location
            return r0
    }

    public java.util.List<com.thegrizzlylabs.sardineandroid.model.Propstat> getPropstat() {
            r1 = this;
            java.util.List<com.thegrizzlylabs.sardineandroid.model.Propstat> r0 = r1.propstat
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.propstat = r0
        Lb:
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

    public void setLocation(com.thegrizzlylabs.sardineandroid.model.Location r1) {
            r0 = this;
            r0.location = r1
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
