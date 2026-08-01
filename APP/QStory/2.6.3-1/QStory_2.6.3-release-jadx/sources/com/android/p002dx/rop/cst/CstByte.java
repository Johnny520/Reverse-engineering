package com.android.p002dx.rop.cst;

import com.android.p002dx.rop.type.Type;
import com.android.p002dx.util.Hex;
import p025.AbstractC7012;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class CstByte extends CstLiteral32 {
    public static final CstByte VALUE_0 = make((byte) 0);

    private CstByte(byte b) {
        super(b);
    }

    public static CstByte make(int i) {
        byte b = (byte) i;
        if (b == i) {
            return make(b);
        }
        C6755.m11869(AbstractC7012.m12147(i, "bogus byte value: "));
        return null;
    }

    @Override // com.android.p002dx.rop.type.TypeBearer
    public Type getType() {
        return Type.BYTE;
    }

    public byte getValue() {
        return (byte) getIntBits();
    }

    @Override // com.android.p002dx.util.ToHuman
    public String toHuman() {
        return Integer.toString(getIntBits());
    }

    public String toString() {
        int intBits = getIntBits();
        return "byte{0x" + Hex.m27u1(intBits) + " / " + intBits + '}';
    }

    @Override // com.android.p002dx.rop.cst.Constant
    public String typeName() {
        return "byte";
    }

    public static CstByte make(byte b) {
        return new CstByte(b);
    }
}
