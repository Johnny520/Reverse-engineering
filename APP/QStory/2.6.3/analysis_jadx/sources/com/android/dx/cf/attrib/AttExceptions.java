package com.android.dx.cf.attrib;

import bsh.C2633;
import com.android.dx.rop.type.TypeList;
import com.android.dx.util.MutabilityException;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class AttExceptions extends BaseAttribute {
    public static final String ATTRIBUTE_NAME = "Exceptions";
    private final TypeList exceptions;

    public AttExceptions(TypeList typeList) {
        super(ATTRIBUTE_NAME);
        try {
            if (typeList.isMutable()) {
                throw new MutabilityException("exceptions.isMutable()");
            }
            this.exceptions = typeList;
        } catch (NullPointerException unused) {
            C2633.m5343("exceptions == null");
            throw null;
        }
    }

    @Override // com.android.dx.cf.iface.Attribute
    public int byteLength() {
        return (this.exceptions.size() * 2) + 8;
    }

    public TypeList getExceptions() {
        return this.exceptions;
    }
}
