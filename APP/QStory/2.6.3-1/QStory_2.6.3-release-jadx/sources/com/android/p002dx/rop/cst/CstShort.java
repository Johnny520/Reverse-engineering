package com.android.p002dx.rop.cst;

import com.android.p002dx.rop.type.Type;
import com.android.p002dx.util.Hex;
import p025.AbstractC7012;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class CstShort extends CstLiteral32 {
    public static final CstShort VALUE_0 = make((short) 0);

    private CstShort(short s) {
        super(s);
    }

    public static CstShort make(int i) {
        short s = (short) i;
        if (s == i) {
            return make(s);
        }
        C6755.m11869(AbstractC7012.m12147(i, "bogus short value: "));
        return null;
    }

    @Override // com.android.p002dx.rop.type.TypeBearer
    public Type getType() {
        return Type.SHORT;
    }

    public short getValue() {
        return (short) getIntBits();
    }

    @Override // com.android.p002dx.util.ToHuman
    public String toHuman() {
        return Integer.toString(getIntBits());
    }

    public String toString() {
        int intBits = getIntBits();
        return "short{0x" + Hex.m28u2(intBits) + " / " + intBits + '}';
    }

    @Override // com.android.p002dx.rop.cst.Constant
    public String typeName() {
        return "short";
    }

    public static CstShort make(short s) {
        return new CstShort(s);
    }
}
