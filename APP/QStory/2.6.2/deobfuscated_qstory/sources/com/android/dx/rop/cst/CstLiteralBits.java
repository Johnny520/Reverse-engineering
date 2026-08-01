package com.android.dx.rop.cst;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class CstLiteralBits extends TypedConstant {
    public boolean fitsIn16Bits() {
        if (!fitsInInt()) {
            return false;
        }
        int intBits = getIntBits();
        return ((short) intBits) == intBits;
    }

    public boolean fitsIn8Bits() {
        if (!fitsInInt()) {
            return false;
        }
        int intBits = getIntBits();
        return ((byte) intBits) == intBits;
    }

    public abstract boolean fitsInInt();

    public abstract int getIntBits();

    public abstract long getLongBits();
}
