package com.android.dx.cf.attrib;

import bsh.C2632;
import com.android.dx.cf.code.ByteCatchList;
import com.android.dx.cf.code.BytecodeArray;
import com.android.dx.cf.iface.AttributeList;
import com.android.dx.util.MutabilityException;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class AttCode extends BaseAttribute {
    public static final String ATTRIBUTE_NAME = "Code";
    private final AttributeList attributes;
    private final ByteCatchList catches;
    private final BytecodeArray code;
    private final int maxLocals;
    private final int maxStack;

    public AttCode(int i, int i2, BytecodeArray bytecodeArray, ByteCatchList byteCatchList, AttributeList attributeList) {
        super(ATTRIBUTE_NAME);
        if (i < 0) {
            C5919.m11249("maxStack < 0");
            throw null;
        }
        if (i2 < 0) {
            C5919.m11249("maxLocals < 0");
            throw null;
        }
        if (bytecodeArray == null) {
            C2632.m5298("code == null");
            throw null;
        }
        try {
            if (byteCatchList.isMutable()) {
                throw new MutabilityException("catches.isMutable()");
            }
            try {
                if (attributeList.isMutable()) {
                    throw new MutabilityException("attributes.isMutable()");
                }
                this.maxStack = i;
                this.maxLocals = i2;
                this.code = bytecodeArray;
                this.catches = byteCatchList;
                this.attributes = attributeList;
            } catch (NullPointerException unused) {
                C2632.m5298("attributes == null");
                throw null;
            }
        } catch (NullPointerException unused2) {
            C2632.m5298("catches == null");
            throw null;
        }
    }

    @Override // com.android.dx.cf.iface.Attribute
    public int byteLength() {
        return this.attributes.byteLength() + this.catches.byteLength() + this.code.byteLength() + 10;
    }

    public AttributeList getAttributes() {
        return this.attributes;
    }

    public ByteCatchList getCatches() {
        return this.catches;
    }

    public BytecodeArray getCode() {
        return this.code;
    }

    public int getMaxLocals() {
        return this.maxLocals;
    }

    public int getMaxStack() {
        return this.maxStack;
    }
}
