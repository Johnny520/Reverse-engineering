package com.android.dx.rop.cst;

/* JADX INFO: loaded from: classes.dex */
public final class CstCallSite extends com.android.dx.rop.cst.CstArray {
    private CstCallSite(com.android.dx.rop.cst.CstArray.List r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static com.android.dx.rop.cst.CstCallSite make(com.android.dx.rop.cst.CstMethodHandle r3, com.android.dx.rop.cst.CstNat r4, com.android.dx.cf.code.BootstrapMethodArgumentsList r5) {
            if (r3 == 0) goto L53
            if (r4 == 0) goto L4b
            com.android.dx.rop.cst.CstArray$List r0 = new com.android.dx.rop.cst.CstArray$List
            int r1 = r5.size()
            int r1 = r1 + 3
            r0.<init>(r1)
            r1 = 0
            r0.set(r1, r3)
            com.android.dx.rop.cst.CstString r3 = r4.getName()
            r2 = 1
            r0.set(r2, r3)
            com.android.dx.rop.cst.CstProtoRef r3 = new com.android.dx.rop.cst.CstProtoRef
            com.android.dx.rop.cst.CstString r4 = r4.getDescriptor()
            java.lang.String r4 = r4.getString()
            com.android.dx.rop.type.Prototype r4 = com.android.dx.rop.type.Prototype.fromDescriptor(r4)
            r3.<init>(r4)
            r4 = 2
            r0.set(r4, r3)
        L30:
            int r3 = r5.size()
            if (r1 >= r3) goto L42
            int r3 = r1 + 3
            com.android.dx.rop.cst.Constant r4 = r5.get(r1)
            r0.set(r3, r4)
            int r1 = r1 + 1
            goto L30
        L42:
            r0.setImmutable()
            com.android.dx.rop.cst.CstCallSite r3 = new com.android.dx.rop.cst.CstCallSite
            r3.<init>(r0)
            return r3
        L4b:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "nat == null"
            r3.<init>(r4)
            throw r3
        L53:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "bootstrapMethodHandle == null"
            r3.<init>(r4)
            throw r3
    }

    @Override // com.android.dx.rop.cst.CstArray, com.android.dx.rop.cst.Constant
    public int compareTo0(com.android.dx.rop.cst.Constant r2) {
            r1 = this;
            com.android.dx.rop.cst.CstArray$List r0 = r1.getList()
            com.android.dx.rop.cst.CstCallSite r2 = (com.android.dx.rop.cst.CstCallSite) r2
            com.android.dx.rop.cst.CstArray$List r2 = r2.getList()
            int r2 = r0.compareTo2(r2)
            return r2
    }

    @Override // com.android.dx.rop.cst.CstArray
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.android.dx.rop.cst.CstCallSite
            if (r0 == 0) goto L13
            com.android.dx.rop.cst.CstArray$List r0 = r1.getList()
            com.android.dx.rop.cst.CstCallSite r2 = (com.android.dx.rop.cst.CstCallSite) r2
            com.android.dx.rop.cst.CstArray$List r2 = r2.getList()
            boolean r2 = r0.equals(r2)
            return r2
        L13:
            r2 = 0
            return r2
    }

    @Override // com.android.dx.rop.cst.CstArray
    public int hashCode() {
            r1 = this;
            com.android.dx.rop.cst.CstArray$List r0 = r1.getList()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.android.dx.rop.cst.CstArray, com.android.dx.rop.cst.Constant
    public boolean isCategory2() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.android.dx.rop.cst.CstArray, com.android.dx.util.ToHuman
    public java.lang.String toHuman() {
            r4 = this;
            com.android.dx.rop.cst.CstArray$List r0 = r4.getList()
            java.lang.String r1 = ", "
            java.lang.String r2 = "}"
            java.lang.String r3 = "{"
            java.lang.String r0 = r0.toHuman(r3, r1, r2)
            return r0
    }

    @Override // com.android.dx.rop.cst.CstArray
    public java.lang.String toString() {
            r4 = this;
            com.android.dx.rop.cst.CstArray$List r0 = r4.getList()
            java.lang.String r1 = ", "
            java.lang.String r2 = "}"
            java.lang.String r3 = "call site{"
            java.lang.String r0 = r0.toString(r3, r1, r2)
            return r0
    }

    @Override // com.android.dx.rop.cst.CstArray, com.android.dx.rop.cst.Constant
    public java.lang.String typeName() {
            r1 = this;
            java.lang.String r0 = "call site"
            return r0
    }
}
