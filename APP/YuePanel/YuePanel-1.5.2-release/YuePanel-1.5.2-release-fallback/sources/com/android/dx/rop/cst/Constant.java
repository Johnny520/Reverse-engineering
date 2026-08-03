package com.android.dx.rop.cst;

/* JADX INFO: loaded from: classes.dex */
public abstract class Constant implements com.android.dx.util.ToHuman, java.lang.Comparable<com.android.dx.rop.cst.Constant> {
    public Constant() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public final int compareTo2(com.android.dx.rop.cst.Constant r3) {
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto L17
            java.lang.String r3 = r0.getName()
            java.lang.String r0 = r1.getName()
            int r3 = r3.compareTo(r0)
            return r3
        L17:
            int r3 = r2.compareTo0(r3)
            return r3
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(com.android.dx.rop.cst.Constant r1) {
            r0 = this;
            com.android.dx.rop.cst.Constant r1 = (com.android.dx.rop.cst.Constant) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public abstract int compareTo0(com.android.dx.rop.cst.Constant r1);

    public abstract boolean isCategory2();

    public abstract java.lang.String typeName();
}
