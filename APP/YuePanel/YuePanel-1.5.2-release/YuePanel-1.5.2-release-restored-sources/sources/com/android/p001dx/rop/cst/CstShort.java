package com.android.p001dx.rop.cst;

import Yue.C6193;
import com.android.p001dx.rop.type.Type;
import com.android.p001dx.util.Hex;

/* JADX INFO: loaded from: classes.dex */
public final class CstShort extends CstLiteral32 {
    public static final CstShort VALUE_0 = make((short) 0);

    private CstShort(short s) {
        super(s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static CstShort make(short s) {
        return new CstShort(s);
    }

    @Override // com.android.p001dx.rop.type.TypeBearer
    public Type getType() {
        return Type.SHORT;
    }

    public short getValue() {
        return (short) getIntBits();
    }

    @Override // com.android.p001dx.util.ToHuman
    public String toHuman() {
        return Integer.toString(getIntBits());
    }

    public String toString() {
        int intBits = getIntBits();
        return "short{0x" + Hex.m5035u2(intBits) + " / " + intBits + C6193.f1885;
    }

    @Override // com.android.p001dx.rop.cst.Constant
    public String typeName() {
        return "short";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static CstShort make(int i) {
        short s = (short) i;
        if (s == i) {
            return make(s);
        }
        throw new IllegalArgumentException("bogus short value: " + i);
    }
}
