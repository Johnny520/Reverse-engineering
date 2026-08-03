package com.android.dx.rop.code;

/* JADX INFO: loaded from: classes.dex */
public class LocalItem implements java.lang.Comparable<com.android.dx.rop.code.LocalItem> {
    private final com.android.dx.rop.cst.CstString name;
    private final com.android.dx.rop.cst.CstString signature;

    private LocalItem(com.android.dx.rop.cst.CstString r1, com.android.dx.rop.cst.CstString r2) {
            r0 = this;
            r0.<init>()
            r0.name = r1
            r0.signature = r2
            return
    }

    private static int compareHandlesNulls(com.android.dx.rop.cst.CstString r0, com.android.dx.rop.cst.CstString r1) {
            if (r0 != r1) goto L4
            r0 = 0
            return r0
        L4:
            if (r0 != 0) goto L8
            r0 = -1
            return r0
        L8:
            if (r1 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            int r0 = r0.compareTo2(r1)
            return r0
    }

    public static com.android.dx.rop.code.LocalItem make(com.android.dx.rop.cst.CstString r1, com.android.dx.rop.cst.CstString r2) {
            if (r1 != 0) goto L6
            if (r2 != 0) goto L6
            r1 = 0
            return r1
        L6:
            com.android.dx.rop.code.LocalItem r0 = new com.android.dx.rop.code.LocalItem
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(com.android.dx.rop.code.LocalItem r3) {
            r2 = this;
            com.android.dx.rop.cst.CstString r0 = r2.name
            com.android.dx.rop.cst.CstString r1 = r3.name
            int r0 = compareHandlesNulls(r0, r1)
            if (r0 == 0) goto Lb
            return r0
        Lb:
            com.android.dx.rop.cst.CstString r0 = r2.signature
            com.android.dx.rop.cst.CstString r3 = r3.signature
            int r3 = compareHandlesNulls(r0, r3)
            return r3
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(com.android.dx.rop.code.LocalItem r1) {
            r0 = this;
            com.android.dx.rop.code.LocalItem r1 = (com.android.dx.rop.code.LocalItem) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof com.android.dx.rop.code.LocalItem
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.android.dx.rop.code.LocalItem r3 = (com.android.dx.rop.code.LocalItem) r3
            int r3 = r2.compareTo2(r3)
            if (r3 != 0) goto Lf
            r1 = 1
        Lf:
            return r1
    }

    public com.android.dx.rop.cst.CstString getName() {
            r1 = this;
            com.android.dx.rop.cst.CstString r0 = r1.name
            return r0
    }

    public com.android.dx.rop.cst.CstString getSignature() {
            r1 = this;
            com.android.dx.rop.cst.CstString r0 = r1.signature
            return r0
    }

    public int hashCode() {
            r3 = this;
            com.android.dx.rop.cst.CstString r0 = r3.name
            r1 = 0
            if (r0 != 0) goto L7
            r0 = r1
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 * 31
            com.android.dx.rop.cst.CstString r2 = r3.signature
            if (r2 != 0) goto L12
            goto L16
        L12:
            int r1 = r2.hashCode()
        L16:
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            com.android.dx.rop.cst.CstString r0 = r3.name
            if (r0 == 0) goto Ld
            com.android.dx.rop.cst.CstString r1 = r3.signature
            if (r1 != 0) goto Ld
            java.lang.String r0 = r0.toQuoted()
            return r0
        Ld:
            java.lang.String r1 = ""
            if (r0 != 0) goto L16
            com.android.dx.rop.cst.CstString r0 = r3.signature
            if (r0 != 0) goto L16
            return r1
        L16:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "["
            r0.append(r2)
            com.android.dx.rop.cst.CstString r2 = r3.name
            if (r2 != 0) goto L26
            r2 = r1
            goto L2a
        L26:
            java.lang.String r2 = r2.toQuoted()
        L2a:
            r0.append(r2)
            java.lang.String r2 = "|"
            r0.append(r2)
            com.android.dx.rop.cst.CstString r2 = r3.signature
            if (r2 != 0) goto L37
            goto L3b
        L37:
            java.lang.String r1 = r2.toQuoted()
        L3b:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
