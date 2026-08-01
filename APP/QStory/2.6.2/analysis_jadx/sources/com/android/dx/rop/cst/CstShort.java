package com.android.dx.rop.cst;

import com.android.dx.rop.type.Type;
import com.android.dx.util.Hex;
import p007.AbstractC6136;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
        C5919.m11249(AbstractC6136.m11556(i, "bogus short value: "));
        return null;
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public Type getType() {
        return Type.SHORT;
    }

    public short getValue() {
        return (short) getIntBits();
    }

    @Override // com.android.dx.util.ToHuman
    public String toHuman() {
        return Integer.toString(getIntBits());
    }

    public String toString() {
        int intBits = getIntBits();
        return "short{0x" + Hex.u2(intBits) + " / " + intBits + '}';
    }

    @Override // com.android.dx.rop.cst.Constant
    public String typeName() {
        return "short";
    }

    public static CstShort make(short s) {
        return new CstShort(s);
    }
}
