package com.android.p002dx.p003cf.attrib;

import bsh.C3466;
import com.android.p002dx.p003cf.code.LocalVariableList;
import com.android.p002dx.util.MutabilityException;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
            C3466.m5903("localVariables == null");
            throw null;
        }
    }

    @Override // com.android.p002dx.p003cf.iface.Attribute
    public final int byteLength() {
        return (this.localVariables.size() * 10) + 8;
    }

    public final LocalVariableList getLocalVariables() {
        return this.localVariables;
    }
}
