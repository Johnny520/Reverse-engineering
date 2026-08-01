package com.android.dx.cf.attrib;

import bsh.C2632;
import com.android.dx.cf.code.LocalVariableList;
import com.android.dx.util.MutabilityException;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseLocalVariables extends BaseAttribute {
    private final LocalVariableList localVariables;

    public BaseLocalVariables(String str, LocalVariableList localVariableList) {
        super(str);
        try {
            if (localVariableList.isMutable()) {
                throw new MutabilityException("localVariables.isMutable()");
            }
            this.localVariables = localVariableList;
        } catch (NullPointerException unused) {
            C2632.m5298("localVariables == null");
            throw null;
        }
    }

    @Override // com.android.dx.cf.iface.Attribute
    public final int byteLength() {
        return (this.localVariables.size() * 10) + 8;
    }

    public final LocalVariableList getLocalVariables() {
        return this.localVariables;
    }
}
