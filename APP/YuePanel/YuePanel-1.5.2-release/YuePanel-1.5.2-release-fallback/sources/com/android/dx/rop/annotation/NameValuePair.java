package com.android.dx.rop.annotation;

/* JADX INFO: loaded from: classes.dex */
public final class NameValuePair implements java.lang.Comparable<com.android.dx.rop.annotation.NameValuePair> {
    private final com.android.dx.rop.cst.CstString name;
    private final com.android.dx.rop.cst.Constant value;

    public NameValuePair(com.android.dx.rop.cst.CstString r1, com.android.dx.rop.cst.Constant r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L14
            if (r2 == 0) goto Lc
            r0.name = r1
            r0.value = r2
            return
        Lc:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "value == null"
            r1.<init>(r2)
            throw r1
        L14:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "name == null"
            r1.<init>(r2)
            throw r1
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(com.android.dx.rop.annotation.NameValuePair r3) {
            r2 = this;
            com.android.dx.rop.cst.CstString r0 = r2.name
            com.android.dx.rop.cst.CstString r1 = r3.name
            int r0 = r0.compareTo2(r1)
            if (r0 == 0) goto Lb
            return r0
        Lb:
            com.android.dx.rop.cst.Constant r0 = r2.value
            com.android.dx.rop.cst.Constant r3 = r3.value
            int r3 = r0.compareTo2(r3)
            return r3
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(com.android.dx.rop.annotation.NameValuePair r1) {
            r0 = this;
            com.android.dx.rop.annotation.NameValuePair r1 = (com.android.dx.rop.annotation.NameValuePair) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.android.dx.rop.annotation.NameValuePair
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.android.dx.rop.annotation.NameValuePair r4 = (com.android.dx.rop.annotation.NameValuePair) r4
            com.android.dx.rop.cst.CstString r0 = r3.name
            com.android.dx.rop.cst.CstString r2 = r4.name
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1d
            com.android.dx.rop.cst.Constant r0 = r3.value
            com.android.dx.rop.cst.Constant r4 = r4.value
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L1d
            r1 = 1
        L1d:
            return r1
    }

    public com.android.dx.rop.cst.CstString getName() {
            r1 = this;
            com.android.dx.rop.cst.CstString r0 = r1.name
            return r0
    }

    public com.android.dx.rop.cst.Constant getValue() {
            r1 = this;
            com.android.dx.rop.cst.Constant r0 = r1.value
            return r0
    }

    public int hashCode() {
            r2 = this;
            com.android.dx.rop.cst.CstString r0 = r2.name
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            com.android.dx.rop.cst.Constant r1 = r2.value
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.android.dx.rop.cst.CstString r1 = r2.name
            java.lang.String r1 = r1.toHuman()
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            com.android.dx.rop.cst.Constant r1 = r2.value
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
