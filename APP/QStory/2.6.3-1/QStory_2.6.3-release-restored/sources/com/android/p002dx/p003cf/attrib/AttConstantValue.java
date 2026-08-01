package com.android.p002dx.p003cf.attrib;

import bsh.C3466;
import com.android.p002dx.rop.cst.CstDouble;
import com.android.p002dx.rop.cst.CstFloat;
import com.android.p002dx.rop.cst.CstInteger;
import com.android.p002dx.rop.cst.CstLong;
import com.android.p002dx.rop.cst.CstString;
import com.android.p002dx.rop.cst.TypedConstant;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class AttConstantValue extends BaseAttribute {
    public static final String ATTRIBUTE_NAME = "ConstantValue";
    private final TypedConstant constantValue;

    public AttConstantValue(TypedConstant typedConstant) {
        super(ATTRIBUTE_NAME);
        if ((typedConstant instanceof CstString) || (typedConstant instanceof CstInteger) || (typedConstant instanceof CstLong) || (typedConstant instanceof CstFloat) || (typedConstant instanceof CstDouble)) {
            this.constantValue = typedConstant;
        } else {
            if (typedConstant == null) {
                C3466.m5903("constantValue == null");
                throw null;
            }
            C6755.m11869("bad type for constantValue");
            throw null;
        }
    }

    @Override // com.android.p002dx.p003cf.iface.Attribute
    public int byteLength() {
        return 8;
    }

    public TypedConstant getConstantValue() {
        return this.constantValue;
    }
}
