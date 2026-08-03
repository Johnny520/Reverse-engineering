package com.android.p001dx.rop.cst;

import Yue.C6193;
import com.android.p001dx.rop.type.Type;
import com.android.p001dx.util.Hex;

/* JADX INFO: loaded from: classes.dex */
public final class CstDouble extends CstLiteral64 {
    public static final CstDouble VALUE_0 = new CstDouble(Double.doubleToLongBits(0.0d));
    public static final CstDouble VALUE_1 = new CstDouble(Double.doubleToLongBits(1.0d));

    private CstDouble(long j) {
        super(j);
    }

    public static CstDouble make(long j) {
        return new CstDouble(j);
    }

    @Override // com.android.p001dx.rop.type.TypeBearer
    public Type getType() {
        return Type.DOUBLE;
    }

    public double getValue() {
        return Double.longBitsToDouble(getLongBits());
    }

    @Override // com.android.p001dx.util.ToHuman
    public String toHuman() {
        return Double.toString(Double.longBitsToDouble(getLongBits()));
    }

    public String toString() {
        long longBits = getLongBits();
        return "double{0x" + Hex.m5038u8(longBits) + " / " + Double.longBitsToDouble(longBits) + C6193.f1885;
    }

    @Override // com.android.p001dx.rop.cst.Constant
    public String typeName() {
        return "double";
    }
}
