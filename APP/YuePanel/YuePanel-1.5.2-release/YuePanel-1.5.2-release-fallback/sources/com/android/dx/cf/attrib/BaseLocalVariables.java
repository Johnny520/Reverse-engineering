package com.android.dx.cf.attrib;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseLocalVariables extends com.android.dx.cf.attrib.BaseAttribute {
    private final com.android.dx.cf.code.LocalVariableList localVariables;

    public BaseLocalVariables(java.lang.String r1, com.android.dx.cf.code.LocalVariableList r2) {
            r0 = this;
            r0.<init>(r1)
            boolean r1 = r2.isMutable()     // Catch: java.lang.NullPointerException -> L14
            if (r1 != 0) goto Lc
            r0.localVariables = r2
            return
        Lc:
            com.android.dx.util.MutabilityException r1 = new com.android.dx.util.MutabilityException     // Catch: java.lang.NullPointerException -> L14
            java.lang.String r2 = "localVariables.isMutable()"
            r1.<init>(r2)     // Catch: java.lang.NullPointerException -> L14
            throw r1     // Catch: java.lang.NullPointerException -> L14
        L14:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "localVariables == null"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.android.dx.cf.iface.Attribute
    public final int byteLength() {
            r1 = this;
            com.android.dx.cf.code.LocalVariableList r0 = r1.localVariables
            int r0 = r0.size()
            int r0 = r0 * 10
            int r0 = r0 + 8
            return r0
    }

    public final com.android.dx.cf.code.LocalVariableList getLocalVariables() {
            r1 = this;
            com.android.dx.cf.code.LocalVariableList r0 = r1.localVariables
            return r0
    }
}
