package com.android.dx.cf.attrib;

/* JADX INFO: loaded from: classes.dex */
public class AttBootstrapMethods extends com.android.dx.cf.attrib.BaseAttribute {
    private static final int ATTRIBUTE_HEADER_BYTES = 8;
    public static final java.lang.String ATTRIBUTE_NAME = "BootstrapMethods";
    private static final int BOOTSTRAP_ARGUMENT_BYTES = 2;
    private static final int BOOTSTRAP_METHOD_BYTES = 4;
    private final com.android.dx.cf.code.BootstrapMethodsList bootstrapMethods;
    private final int byteLength;

    public AttBootstrapMethods(com.android.dx.cf.code.BootstrapMethodsList r4) {
            r3 = this;
            java.lang.String r0 = "BootstrapMethods"
            r3.<init>(r0)
            r3.bootstrapMethods = r4
            int r0 = r4.size()
            int r0 = r0 * 4
            int r0 = r0 + 8
            r1 = 0
        L10:
            int r2 = r4.size()
            if (r1 >= r2) goto L28
            com.android.dx.cf.code.BootstrapMethodsList$Item r2 = r4.get(r1)
            com.android.dx.cf.code.BootstrapMethodArgumentsList r2 = r2.getBootstrapMethodArguments()
            int r2 = r2.size()
            int r2 = r2 * 2
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto L10
        L28:
            r3.byteLength = r0
            return
    }

    @Override // com.android.dx.cf.iface.Attribute
    public int byteLength() {
            r1 = this;
            int r0 = r1.byteLength
            return r0
    }

    public com.android.dx.cf.code.BootstrapMethodsList getBootstrapMethods() {
            r1 = this;
            com.android.dx.cf.code.BootstrapMethodsList r0 = r1.bootstrapMethods
            return r0
    }
}
