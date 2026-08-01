package com.android.dx.rop.cst;

import com.android.dx.rop.type.Type;
import com.android.dx.util.Hex;
import p007.AbstractC6136;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class CstChar extends CstLiteral32 {
    public static final CstChar VALUE_0 = make((char) 0);

    private CstChar(char c) {
        super(c);
    }

    public static CstChar make(int i) {
        char c = (char) i;
        if (c == i) {
            return make(c);
        }
        C5919.m11249(AbstractC6136.m11556(i, "bogus char value: "));
        return null;
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public Type getType() {
        return Type.CHAR;
    }

    public char getValue() {
        return (char) getIntBits();
    }

    @Override // com.android.dx.util.ToHuman
    public String toHuman() {
        return Integer.toString(getIntBits());
    }

    public String toString() {
        int intBits = getIntBits();
        return "char{0x" + Hex.u2(intBits) + " / " + intBits + '}';
    }

    @Override // com.android.dx.rop.cst.Constant
    public String typeName() {
        return "char";
    }

    public static CstChar make(char c) {
        return new CstChar(c);
    }
}
