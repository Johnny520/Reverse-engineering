package com.android.dx.cf.attrib;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseAttribute implements com.android.dx.cf.iface.Attribute {
    private final java.lang.String name;

    public BaseAttribute(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.name = r2
            return
        L8:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "name == null"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.android.dx.cf.iface.Attribute
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }
}
