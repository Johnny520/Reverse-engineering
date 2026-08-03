package com.android.dx.cf.attrib;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseAnnotations extends com.android.dx.cf.attrib.BaseAttribute {
    private final com.android.dx.rop.annotation.Annotations annotations;
    private final int byteLength;

    public BaseAnnotations(java.lang.String r1, com.android.dx.rop.annotation.Annotations r2, int r3) {
            r0 = this;
            r0.<init>(r1)
            boolean r1 = r2.isMutable()     // Catch: java.lang.NullPointerException -> L16
            if (r1 != 0) goto Le
            r0.annotations = r2
            r0.byteLength = r3
            return
        Le:
            com.android.dx.util.MutabilityException r1 = new com.android.dx.util.MutabilityException     // Catch: java.lang.NullPointerException -> L16
            java.lang.String r2 = "annotations.isMutable()"
            r1.<init>(r2)     // Catch: java.lang.NullPointerException -> L16
            throw r1     // Catch: java.lang.NullPointerException -> L16
        L16:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "annotations == null"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.android.dx.cf.iface.Attribute
    public final int byteLength() {
            r1 = this;
            int r0 = r1.byteLength
            int r0 = r0 + 6
            return r0
    }

    public final com.android.dx.rop.annotation.Annotations getAnnotations() {
            r1 = this;
            com.android.dx.rop.annotation.Annotations r0 = r1.annotations
            return r0
    }
}
