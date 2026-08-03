package com.android.p001dx.rop.cst;

import Yue.C6193;
import com.android.p001dx.rop.type.Type;
import com.android.p001dx.util.Hex;

/* JADX INFO: loaded from: classes.dex */
public final class CstFloat extends CstLiteral32 {
    public static final CstFloat VALUE_0 = make(Float.floatToIntBits(0.0f));
    public static final CstFloat VALUE_1 = make(Float.floatToIntBits(1.0f));
    public static final CstFloat VALUE_2 = make(Float.floatToIntBits(2.0f));

    private CstFloat(int i) {
        super(i);
    }

    public static CstFloat make(int i) {
        return new CstFloat(i);
    }

    @Override // com.android.p001dx.rop.type.TypeBearer
    public Type getType() {
        return Type.FLOAT;
    }

    public float getValue() {
        return Float.intBitsToFloat(getIntBits());
    }

    @Override // com.android.p001dx.util.ToHuman
    public String toHuman() {
        return Float.toString(Float.intBitsToFloat(getIntBits()));
    }

    public String toString() {
        int intBits = getIntBits();
        return "float{0x" + Hex.m5037u4(intBits) + " / " + Float.intBitsToFloat(intBits) + C6193.f1885;
    }

    @Override // com.android.p001dx.rop.cst.Constant
    public String typeName() {
        return "float";
    }
}
