package com.thegrizzlylabs.sardineandroid.model;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
@org.simpleframework.xml.Namespace(prefix = "D", reference = "DAV:")
@org.simpleframework.xml.Root
public class Propertyupdate {

    @org.simpleframework.xml.ElementListUnion({@org.simpleframework.xml.ElementList(entry = "remove", inline = true, type = com.thegrizzlylabs.sardineandroid.model.Remove.class), @org.simpleframework.xml.ElementList(entry = "set", inline = true, type = com.thegrizzlylabs.sardineandroid.model.Set.class)})
    private java.util.List<java.lang.Object> removeOrSet;

    public Propertyupdate() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.util.List<java.lang.Object> getRemoveOrSet() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.removeOrSet
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.removeOrSet = r0
        Lb:
            return r0
    }
}
