package com.android.dx.cf.attrib;

/* JADX INFO: loaded from: classes.dex */
public final class AttAnnotationDefault extends com.android.dx.cf.attrib.BaseAttribute {
    public static final java.lang.String ATTRIBUTE_NAME = "AnnotationDefault";
    private final int byteLength;
    private final com.android.dx.rop.cst.Constant value;

    public AttAnnotationDefault(com.android.dx.rop.cst.Constant r2, int r3) {
            r1 = this;
            java.lang.String r0 = "AnnotationDefault"
            r1.<init>(r0)
            if (r2 == 0) goto Lc
            r1.value = r2
            r1.byteLength = r3
            return
        Lc:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "value == null"
            r2.<init>(r3)
            throw r2
    }

    @Override // com.android.dx.cf.iface.Attribute
    public int byteLength() {
            r1 = this;
            int r0 = r1.byteLength
            int r0 = r0 + 6
            return r0
    }

    public com.android.dx.rop.cst.Constant getValue() {
            r1 = this;
            com.android.dx.rop.cst.Constant r0 = r1.value
            return r0
    }
}
