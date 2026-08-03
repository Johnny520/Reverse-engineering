package com.android.p001dx.rop.cst;

import Yue.C6193;
import com.android.p001dx.rop.type.Type;
import com.android.p001dx.util.Hex;

/* JADX INFO: loaded from: classes.dex */
public final class CstByte extends CstLiteral32 {
    public static final CstByte VALUE_0 = make((byte) 0);

    private CstByte(byte b) {
        super(b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static CstByte make(byte b) {
        return new CstByte(b);
    }

    @Override // com.android.p001dx.rop.type.TypeBearer
    public Type getType() {
        return Type.BYTE;
    }

    public byte getValue() {
        return (byte) getIntBits();
    }

    @Override // com.android.p001dx.util.ToHuman
    public String toHuman() {
        return Integer.toString(getIntBits());
    }

    public String toString() {
        int intBits = getIntBits();
        return "byte{0x" + Hex.m5034u1(intBits) + " / " + intBits + C6193.f1885;
    }

    @Override // com.android.p001dx.rop.cst.Constant
    public String typeName() {
        return "byte";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static CstByte make(int i) {
        byte b = (byte) i;
        if (b == i) {
            return make(b);
        }
        throw new IllegalArgumentException("bogus byte value: " + i);
    }
}
