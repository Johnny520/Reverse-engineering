package com.android.p001dx.rop.cst;

import Yue.C6193;
import com.android.p001dx.rop.type.Type;
import com.android.p001dx.util.Hex;

/* JADX INFO: loaded from: classes.dex */
public final class CstChar extends CstLiteral32 {
    public static final CstChar VALUE_0 = make((char) 0);

    private CstChar(char c) {
        super(c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static CstChar make(char c) {
        return new CstChar(c);
    }

    @Override // com.android.p001dx.rop.type.TypeBearer
    public Type getType() {
        return Type.CHAR;
    }

    public char getValue() {
        return (char) getIntBits();
    }

    @Override // com.android.p001dx.util.ToHuman
    public String toHuman() {
        return Integer.toString(getIntBits());
    }

    public String toString() {
        int intBits = getIntBits();
        return "char{0x" + Hex.m5035u2(intBits) + " / " + intBits + C6193.f1885;
    }

    @Override // com.android.p001dx.rop.cst.Constant
    public String typeName() {
        return "char";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static CstChar make(int i) {
        char c = (char) i;
        if (c == i) {
            return make(c);
        }
        throw new IllegalArgumentException("bogus char value: " + i);
    }
}
