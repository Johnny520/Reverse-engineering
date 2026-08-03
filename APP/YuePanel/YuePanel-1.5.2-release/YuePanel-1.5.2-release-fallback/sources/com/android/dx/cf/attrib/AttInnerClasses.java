package com.android.dx.cf.attrib;

/* JADX INFO: loaded from: classes.dex */
public final class AttInnerClasses extends com.android.dx.cf.attrib.BaseAttribute {
    public static final java.lang.String ATTRIBUTE_NAME = "InnerClasses";
    private final com.android.dx.cf.attrib.InnerClassList innerClasses;

    public AttInnerClasses(com.android.dx.cf.attrib.InnerClassList r2) {
            r1 = this;
            java.lang.String r0 = "InnerClasses"
            r1.<init>(r0)
            boolean r0 = r2.isMutable()     // Catch: java.lang.NullPointerException -> L16
            if (r0 != 0) goto Le
            r1.innerClasses = r2
            return
        Le:
            com.android.dx.util.MutabilityException r2 = new com.android.dx.util.MutabilityException     // Catch: java.lang.NullPointerException -> L16
            java.lang.String r0 = "innerClasses.isMutable()"
            r2.<init>(r0)     // Catch: java.lang.NullPointerException -> L16
            throw r2     // Catch: java.lang.NullPointerException -> L16
        L16:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "innerClasses == null"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.android.dx.cf.iface.Attribute
    public int byteLength() {
            r1 = this;
            com.android.dx.cf.attrib.InnerClassList r0 = r1.innerClasses
            int r0 = r0.size()
            int r0 = r0 * 8
            int r0 = r0 + 8
            return r0
    }

    public com.android.dx.cf.attrib.InnerClassList getInnerClasses() {
            r1 = this;
            com.android.dx.cf.attrib.InnerClassList r0 = r1.innerClasses
            return r0
    }
}
