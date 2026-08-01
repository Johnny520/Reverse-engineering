package com.thegrizzlylabs.sardineandroid.model;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
@org.simpleframework.xml.Namespace(prefix = "D", reference = "DAV:")
@org.simpleframework.xml.Root
public class Propfind {

    @org.simpleframework.xml.Element(required = false)
    private com.thegrizzlylabs.sardineandroid.model.Allprop allprop;

    @org.simpleframework.xml.Element(required = false)
    private com.thegrizzlylabs.sardineandroid.model.Prop prop;

    @org.simpleframework.xml.Element(required = false)
    private com.thegrizzlylabs.sardineandroid.model.Propname propname;

    public Propfind() {
            r0 = this;
            r0.<init>()
            return
    }

    public com.thegrizzlylabs.sardineandroid.model.Allprop getAllprop() {
            r0 = this;
            com.thegrizzlylabs.sardineandroid.model.Allprop r0 = r0.allprop
            return r0
    }

    public com.thegrizzlylabs.sardineandroid.model.Prop getProp() {
            r0 = this;
            com.thegrizzlylabs.sardineandroid.model.Prop r0 = r0.prop
            return r0
    }

    public com.thegrizzlylabs.sardineandroid.model.Propname getPropname() {
            r0 = this;
            com.thegrizzlylabs.sardineandroid.model.Propname r0 = r0.propname
            return r0
    }

    public void setAllprop(com.thegrizzlylabs.sardineandroid.model.Allprop r1) {
            r0 = this;
            r0.allprop = r1
            return
    }

    public void setProp(com.thegrizzlylabs.sardineandroid.model.Prop r1) {
            r0 = this;
            r0.prop = r1
            return
    }

    public void setPropname(com.thegrizzlylabs.sardineandroid.model.Propname r1) {
            r0 = this;
            r0.propname = r1
            return
    }
}
