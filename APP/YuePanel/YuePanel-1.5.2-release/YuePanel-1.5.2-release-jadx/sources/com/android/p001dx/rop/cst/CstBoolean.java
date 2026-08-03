package com.android.p001dx.rop.cst;

import com.android.p001dx.rop.type.Type;

/* JADX INFO: loaded from: classes.dex */
public final class CstBoolean extends CstLiteral32 {
    public static final CstBoolean VALUE_FALSE = new CstBoolean(false);
    public static final CstBoolean VALUE_TRUE = new CstBoolean(true);

    private CstBoolean(boolean z) {
        super(z ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static CstBoolean make(boolean z) {
        return z ? VALUE_TRUE : VALUE_FALSE;
    }

    @Override // com.android.p001dx.rop.type.TypeBearer
    public Type getType() {
        return Type.BOOLEAN;
    }

    public boolean getValue() {
        return getIntBits() != 0;
    }

    @Override // com.android.p001dx.util.ToHuman
    public String toHuman() {
        return getValue() ? "true" : "false";
    }

    public String toString() {
        return getValue() ? "boolean{true}" : "boolean{false}";
    }

    @Override // com.android.p001dx.rop.cst.Constant
    public String typeName() {
        return "boolean";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static CstBoolean make(int i) {
        if (i == 0) {
            return VALUE_FALSE;
        }
        if (i == 1) {
            return VALUE_TRUE;
        }
        throw new IllegalArgumentException("bogus value: " + i);
    }
}
