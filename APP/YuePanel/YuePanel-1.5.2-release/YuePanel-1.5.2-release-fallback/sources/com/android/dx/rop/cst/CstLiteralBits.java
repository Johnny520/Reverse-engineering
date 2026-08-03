package com.android.dx.rop.cst;

/* JADX INFO: loaded from: classes.dex */
public abstract class CstLiteralBits extends com.android.dx.rop.cst.TypedConstant {
    public CstLiteralBits() {
            r0 = this;
            r0.<init>()
            return
    }

    public boolean fitsIn16Bits() {
            r3 = this;
            boolean r0 = r3.fitsInInt()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r3.getIntBits()
            short r2 = (short) r0
            if (r2 != r0) goto L10
            r1 = 1
        L10:
            return r1
    }

    public boolean fitsIn8Bits() {
            r3 = this;
            boolean r0 = r3.fitsInInt()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r3.getIntBits()
            byte r2 = (byte) r0
            if (r2 != r0) goto L10
            r1 = 1
        L10:
            return r1
    }

    public abstract boolean fitsInInt();

    public abstract int getIntBits();

    public abstract long getLongBits();
}
