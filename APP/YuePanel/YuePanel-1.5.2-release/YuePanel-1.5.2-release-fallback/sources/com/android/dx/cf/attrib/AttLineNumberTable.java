package com.android.dx.cf.attrib;

/* JADX INFO: loaded from: classes.dex */
public final class AttLineNumberTable extends com.android.dx.cf.attrib.BaseAttribute {
    public static final java.lang.String ATTRIBUTE_NAME = "LineNumberTable";
    private final com.android.dx.cf.code.LineNumberList lineNumbers;

    public AttLineNumberTable(com.android.dx.cf.code.LineNumberList r2) {
            r1 = this;
            java.lang.String r0 = "LineNumberTable"
            r1.<init>(r0)
            boolean r0 = r2.isMutable()     // Catch: java.lang.NullPointerException -> L16
            if (r0 != 0) goto Le
            r1.lineNumbers = r2
            return
        Le:
            com.android.dx.util.MutabilityException r2 = new com.android.dx.util.MutabilityException     // Catch: java.lang.NullPointerException -> L16
            java.lang.String r0 = "lineNumbers.isMutable()"
            r2.<init>(r0)     // Catch: java.lang.NullPointerException -> L16
            throw r2     // Catch: java.lang.NullPointerException -> L16
        L16:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "lineNumbers == null"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.android.dx.cf.iface.Attribute
    public int byteLength() {
            r1 = this;
            com.android.dx.cf.code.LineNumberList r0 = r1.lineNumbers
            int r0 = r0.size()
            int r0 = r0 * 4
            int r0 = r0 + 8
            return r0
    }

    public com.android.dx.cf.code.LineNumberList getLineNumbers() {
            r1 = this;
            com.android.dx.cf.code.LineNumberList r0 = r1.lineNumbers
            return r0
    }
}
