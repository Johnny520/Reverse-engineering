package com.android.dx.cf.attrib;

import bsh.C2632;
import com.android.dx.rop.cst.CstDouble;
import com.android.dx.rop.cst.CstFloat;
import com.android.dx.rop.cst.CstInteger;
import com.android.dx.rop.cst.CstLong;
import com.android.dx.rop.cst.CstString;
import com.android.dx.rop.cst.TypedConstant;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
                C2632.m5298("constantValue == null");
                throw null;
            }
            C5919.m11249("bad type for constantValue");
            throw null;
        }
    }

    @Override // com.android.dx.cf.iface.Attribute
    public int byteLength() {
        return 8;
    }

    public TypedConstant getConstantValue() {
        return this.constantValue;
    }
}
