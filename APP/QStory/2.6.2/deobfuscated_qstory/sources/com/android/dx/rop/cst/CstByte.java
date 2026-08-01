package com.android.dx.rop.cst;

import com.android.dx.rop.type.Type;
import com.android.dx.util.Hex;
import p007.AbstractC6136;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
        C5919.m11249(AbstractC6136.m11556(i, "bogus byte value: "));
        return null;
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public Type getType() {
        return Type.BYTE;
    }

    public byte getValue() {
        return (byte) getIntBits();
    }

    @Override // com.android.dx.util.ToHuman
    public String toHuman() {
        return Integer.toString(getIntBits());
    }

    public String toString() {
        int intBits = getIntBits();
        return "byte{0x" + Hex.u1(intBits) + " / " + intBits + '}';
    }

    @Override // com.android.dx.rop.cst.Constant
    public String typeName() {
        return "byte";
    }

    public static CstByte make(byte b) {
        return new CstByte(b);
    }
}
