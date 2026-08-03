package com.android.p001dx.rop.cst;

import Yue.C6193;
import com.android.p001dx.rop.type.Type;
import com.android.p001dx.util.Hex;

/* JADX INFO: loaded from: classes.dex */
public final class CstLong extends CstLiteral64 {
    public static final CstLong VALUE_0 = make(0);
    public static final CstLong VALUE_1 = make(1);

    private CstLong(long j) {
        super(j);
    }

    public static CstLong make(long j) {
        return new CstLong(j);
    }

    @Override // com.android.p001dx.rop.type.TypeBearer
    public Type getType() {
        return Type.LONG;
    }

    public long getValue() {
        return getLongBits();
    }

    @Override // com.android.p001dx.util.ToHuman
    public String toHuman() {
        return Long.toString(getLongBits());
    }

    public String toString() {
        long longBits = getLongBits();
        return "long{0x" + Hex.m5038u8(longBits) + " / " + longBits + C6193.f1885;
    }

    @Override // com.android.p001dx.rop.cst.Constant
    public String typeName() {
        return "long";
    }
}
