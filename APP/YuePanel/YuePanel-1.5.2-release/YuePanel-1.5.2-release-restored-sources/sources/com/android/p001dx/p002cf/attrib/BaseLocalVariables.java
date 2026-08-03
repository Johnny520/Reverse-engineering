package com.android.p001dx.p002cf.attrib;

import com.android.p001dx.p002cf.code.LocalVariableList;
import com.android.p001dx.util.MutabilityException;

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
            throw new NullPointerException("localVariables == null");
        }
    }

    @Override // com.android.p001dx.p002cf.iface.Attribute
    public final int byteLength() {
        return (this.localVariables.size() * 10) + 8;
    }

    public final LocalVariableList getLocalVariables() {
        return this.localVariables;
    }
}
