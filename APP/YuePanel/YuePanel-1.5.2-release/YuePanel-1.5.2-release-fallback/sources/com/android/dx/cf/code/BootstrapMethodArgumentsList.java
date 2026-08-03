package com.android.dx.cf.code;

/* JADX INFO: loaded from: classes.dex */
public class BootstrapMethodArgumentsList extends com.android.dx.util.FixedSizeList {
    public BootstrapMethodArgumentsList(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public com.android.dx.rop.cst.Constant get(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.get0(r1)
            com.android.dx.rop.cst.Constant r1 = (com.android.dx.rop.cst.Constant) r1
            return r1
    }

    public void set(int r3, com.android.dx.rop.cst.Constant r4) {
            r2 = this;
            boolean r0 = r4 instanceof com.android.dx.rop.cst.CstString
            if (r0 != 0) goto L3c
            boolean r0 = r4 instanceof com.android.dx.rop.cst.CstType
            if (r0 != 0) goto L3c
            boolean r0 = r4 instanceof com.android.dx.rop.cst.CstInteger
            if (r0 != 0) goto L3c
            boolean r0 = r4 instanceof com.android.dx.rop.cst.CstLong
            if (r0 != 0) goto L3c
            boolean r0 = r4 instanceof com.android.dx.rop.cst.CstFloat
            if (r0 != 0) goto L3c
            boolean r0 = r4 instanceof com.android.dx.rop.cst.CstDouble
            if (r0 != 0) goto L3c
            boolean r0 = r4 instanceof com.android.dx.rop.cst.CstMethodHandle
            if (r0 != 0) goto L3c
            boolean r0 = r4 instanceof com.android.dx.rop.cst.CstProtoRef
            if (r0 == 0) goto L21
            goto L3c
        L21:
            java.lang.Class r3 = r4.getClass()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "bad type for bootstrap argument: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L3c:
            r2.set0(r3, r4)
            return
    }
}
