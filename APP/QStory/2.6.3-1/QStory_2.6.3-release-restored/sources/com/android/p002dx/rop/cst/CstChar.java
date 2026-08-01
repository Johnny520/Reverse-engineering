package com.android.p002dx.rop.cst;

import com.android.p002dx.rop.type.Type;
import com.android.p002dx.util.Hex;
import p025.AbstractC7012;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
        C6755.m11869(AbstractC7012.m12147(i, "bogus char value: "));
        return null;
    }

    @Override // com.android.p002dx.rop.type.TypeBearer
    public Type getType() {
        return Type.CHAR;
    }

    public char getValue() {
        return (char) getIntBits();
    }

    @Override // com.android.p002dx.util.ToHuman
    public String toHuman() {
        return Integer.toString(getIntBits());
    }

    public String toString() {
        int intBits = getIntBits();
        return "char{0x" + Hex.m28u2(intBits) + " / " + intBits + '}';
    }

    @Override // com.android.p002dx.rop.cst.Constant
    public String typeName() {
        return "char";
    }

    public static CstChar make(char c) {
        return new CstChar(c);
    }
}
