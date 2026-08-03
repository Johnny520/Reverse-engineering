package com.android.dx.cf.attrib;

/* JADX INFO: loaded from: classes.dex */
public final class AttCode extends com.android.dx.cf.attrib.BaseAttribute {
    public static final java.lang.String ATTRIBUTE_NAME = "Code";
    private final com.android.dx.cf.iface.AttributeList attributes;
    private final com.android.dx.cf.code.ByteCatchList catches;
    private final com.android.dx.cf.code.BytecodeArray code;
    private final int maxLocals;
    private final int maxStack;

    public AttCode(int r2, int r3, com.android.dx.cf.code.BytecodeArray r4, com.android.dx.cf.code.ByteCatchList r5, com.android.dx.cf.iface.AttributeList r6) {
            r1 = this;
            java.lang.String r0 = "Code"
            r1.<init>(r0)
            if (r2 < 0) goto L52
            if (r3 < 0) goto L4a
            if (r4 == 0) goto L42
            boolean r0 = r5.isMutable()     // Catch: java.lang.NullPointerException -> L3a
            if (r0 != 0) goto L32
            boolean r0 = r6.isMutable()     // Catch: java.lang.NullPointerException -> L2a
            if (r0 != 0) goto L22
            r1.maxStack = r2
            r1.maxLocals = r3
            r1.code = r4
            r1.catches = r5
            r1.attributes = r6
            return
        L22:
            com.android.dx.util.MutabilityException r2 = new com.android.dx.util.MutabilityException     // Catch: java.lang.NullPointerException -> L2a
            java.lang.String r3 = "attributes.isMutable()"
            r2.<init>(r3)     // Catch: java.lang.NullPointerException -> L2a
            throw r2     // Catch: java.lang.NullPointerException -> L2a
        L2a:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "attributes == null"
            r2.<init>(r3)
            throw r2
        L32:
            com.android.dx.util.MutabilityException r2 = new com.android.dx.util.MutabilityException     // Catch: java.lang.NullPointerException -> L3a
            java.lang.String r3 = "catches.isMutable()"
            r2.<init>(r3)     // Catch: java.lang.NullPointerException -> L3a
            throw r2     // Catch: java.lang.NullPointerException -> L3a
        L3a:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "catches == null"
            r2.<init>(r3)
            throw r2
        L42:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "code == null"
            r2.<init>(r3)
            throw r2
        L4a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "maxLocals < 0"
            r2.<init>(r3)
            throw r2
        L52:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "maxStack < 0"
            r2.<init>(r3)
            throw r2
    }

    @Override // com.android.dx.cf.iface.Attribute
    public int byteLength() {
            r2 = this;
            com.android.dx.cf.code.BytecodeArray r0 = r2.code
            int r0 = r0.byteLength()
            int r0 = r0 + 10
            com.android.dx.cf.code.ByteCatchList r1 = r2.catches
            int r1 = r1.byteLength()
            int r0 = r0 + r1
            com.android.dx.cf.iface.AttributeList r1 = r2.attributes
            int r1 = r1.byteLength()
            int r0 = r0 + r1
            return r0
    }

    public com.android.dx.cf.iface.AttributeList getAttributes() {
            r1 = this;
            com.android.dx.cf.iface.AttributeList r0 = r1.attributes
            return r0
    }

    public com.android.dx.cf.code.ByteCatchList getCatches() {
            r1 = this;
            com.android.dx.cf.code.ByteCatchList r0 = r1.catches
            return r0
    }

    public com.android.dx.cf.code.BytecodeArray getCode() {
            r1 = this;
            com.android.dx.cf.code.BytecodeArray r0 = r1.code
            return r0
    }

    public int getMaxLocals() {
            r1 = this;
            int r0 = r1.maxLocals
            return r0
    }

    public int getMaxStack() {
            r1 = this;
            int r0 = r1.maxStack
            return r0
    }
}
