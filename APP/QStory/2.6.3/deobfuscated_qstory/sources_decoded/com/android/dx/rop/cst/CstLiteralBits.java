package com.android.dx.rop.cst;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
