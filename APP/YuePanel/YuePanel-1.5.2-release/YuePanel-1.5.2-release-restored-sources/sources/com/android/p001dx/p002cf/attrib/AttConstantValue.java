package com.android.p001dx.p002cf.attrib;

import com.android.p001dx.rop.cst.CstDouble;
import com.android.p001dx.rop.cst.CstFloat;
import com.android.p001dx.rop.cst.CstInteger;
import com.android.p001dx.rop.cst.CstLong;
import com.android.p001dx.rop.cst.CstString;
import com.android.p001dx.rop.cst.TypedConstant;

/* JADX INFO: loaded from: classes.dex */
public final class AttConstantValue extends BaseAttribute {
    public static final String ATTRIBUTE_NAME = "ConstantValue";
    private final TypedConstant constantValue;

    public AttConstantValue(TypedConstant typedConstant) {
        super(ATTRIBUTE_NAME);
        if ((typedConstant instanceof CstString) || (typedConstant instanceof CstInteger) || (typedConstant instanceof CstLong) || (typedConstant instanceof CstFloat) || (typedConstant instanceof CstDouble)) {
            this.constantValue = typedConstant;
        } else {
            if (typedConstant != null) {
                throw new IllegalArgumentException("bad type for constantValue");
            }
            throw new NullPointerException("constantValue == null");
        }
    }

    @Override // com.android.p001dx.p002cf.iface.Attribute
    public int byteLength() {
        return 8;
    }

    public TypedConstant getConstantValue() {
        return this.constantValue;
    }
}
