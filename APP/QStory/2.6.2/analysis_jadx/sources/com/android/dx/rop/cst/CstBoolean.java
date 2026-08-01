package com.android.dx.rop.cst;

import com.android.dx.rop.type.Type;
import p007.AbstractC6136;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class CstBoolean extends CstLiteral32 {
    public static final CstBoolean VALUE_FALSE = new CstBoolean(false);
    public static final CstBoolean VALUE_TRUE = new CstBoolean(true);

    private CstBoolean(boolean z) {
        super(z ? 1 : 0);
    }

    public static CstBoolean make(int i) {
        if (i == 0) {
            return VALUE_FALSE;
        }
        if (i == 1) {
            return VALUE_TRUE;
        }
        C5919.m11249(AbstractC6136.m11556(i, "bogus value: "));
        return null;
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public Type getType() {
        return Type.BOOLEAN;
    }

    public boolean getValue() {
        return getIntBits() != 0;
    }

    @Override // com.android.dx.util.ToHuman
    public String toHuman() {
        return getValue() ? "true" : "false";
    }

    public String toString() {
        return getValue() ? "boolean{true}" : "boolean{false}";
    }

    @Override // com.android.dx.rop.cst.Constant
    public String typeName() {
        return "boolean";
    }

    public static CstBoolean make(boolean z) {
        return z ? VALUE_TRUE : VALUE_FALSE;
    }
}
