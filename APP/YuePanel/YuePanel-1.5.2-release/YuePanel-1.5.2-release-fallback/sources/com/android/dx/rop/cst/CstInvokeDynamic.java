package com.android.dx.rop.cst;

/* JADX INFO: loaded from: classes.dex */
public final class CstInvokeDynamic extends com.android.dx.rop.cst.Constant {
    private final int bootstrapMethodIndex;
    private com.android.dx.rop.cst.CstCallSite callSite;
    private com.android.dx.rop.cst.CstType declaringClass;
    private final com.android.dx.rop.cst.CstNat nat;
    private final com.android.dx.rop.type.Prototype prototype;
    private final java.util.List<com.android.dx.rop.cst.CstCallSiteRef> references;

    private CstInvokeDynamic(int r1, com.android.dx.rop.cst.CstNat r2) {
            r0 = this;
            r0.<init>()
            r0.bootstrapMethodIndex = r1
            r0.nat = r2
            com.android.dx.rop.cst.CstString r1 = r2.getDescriptor()
            java.lang.String r1 = r1.toHuman()
            com.android.dx.rop.type.Prototype r1 = com.android.dx.rop.type.Prototype.fromDescriptor(r1)
            r0.prototype = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.references = r1
            return
    }

    public static com.android.dx.rop.cst.CstInvokeDynamic make(int r1, com.android.dx.rop.cst.CstNat r2) {
            com.android.dx.rop.cst.CstInvokeDynamic r0 = new com.android.dx.rop.cst.CstInvokeDynamic
            r0.<init>(r1, r2)
            return r0
    }

    public com.android.dx.rop.cst.CstCallSiteRef addReference() {
            r2 = this;
            com.android.dx.rop.cst.CstCallSiteRef r0 = new com.android.dx.rop.cst.CstCallSiteRef
            java.util.List<com.android.dx.rop.cst.CstCallSiteRef> r1 = r2.references
            int r1 = r1.size()
            r0.<init>(r2, r1)
            java.util.List<com.android.dx.rop.cst.CstCallSiteRef> r1 = r2.references
            r1.add(r0)
            return r0
    }

    @Override // com.android.dx.rop.cst.Constant
    public int compareTo0(com.android.dx.rop.cst.Constant r3) {
            r2 = this;
            com.android.dx.rop.cst.CstInvokeDynamic r3 = (com.android.dx.rop.cst.CstInvokeDynamic) r3
            int r0 = r2.bootstrapMethodIndex
            int r1 = r3.getBootstrapMethodIndex()
            int r0 = java.lang.Integer.compare(r0, r1)
            if (r0 == 0) goto Lf
            return r0
        Lf:
            com.android.dx.rop.cst.CstNat r0 = r2.nat
            com.android.dx.rop.cst.CstNat r1 = r3.getNat()
            int r0 = r0.compareTo2(r1)
            if (r0 == 0) goto L1c
            return r0
        L1c:
            com.android.dx.rop.cst.CstType r0 = r2.declaringClass
            com.android.dx.rop.cst.CstType r1 = r3.getDeclaringClass()
            int r0 = r0.compareTo2(r1)
            if (r0 == 0) goto L29
            return r0
        L29:
            com.android.dx.rop.cst.CstCallSite r0 = r2.callSite
            com.android.dx.rop.cst.CstCallSite r3 = r3.getCallSite()
            int r3 = r0.compareTo2(r3)
            return r3
    }

    public int getBootstrapMethodIndex() {
            r1 = this;
            int r0 = r1.bootstrapMethodIndex
            return r0
    }

    public com.android.dx.rop.cst.CstCallSite getCallSite() {
            r1 = this;
            com.android.dx.rop.cst.CstCallSite r0 = r1.callSite
            return r0
    }

    public com.android.dx.rop.cst.CstType getDeclaringClass() {
            r1 = this;
            com.android.dx.rop.cst.CstType r0 = r1.declaringClass
            return r0
    }

    public com.android.dx.rop.cst.CstNat getNat() {
            r1 = this;
            com.android.dx.rop.cst.CstNat r0 = r1.nat
            return r0
    }

    public com.android.dx.rop.type.Prototype getPrototype() {
            r1 = this;
            com.android.dx.rop.type.Prototype r0 = r1.prototype
            return r0
    }

    public java.util.List<com.android.dx.rop.cst.CstCallSiteRef> getReferences() {
            r1 = this;
            java.util.List<com.android.dx.rop.cst.CstCallSiteRef> r0 = r1.references
            return r0
    }

    public com.android.dx.rop.type.Type getReturnType() {
            r1 = this;
            com.android.dx.rop.type.Prototype r0 = r1.prototype
            com.android.dx.rop.type.Type r0 = r0.getReturnType()
            return r0
    }

    @Override // com.android.dx.rop.cst.Constant
    public boolean isCategory2() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void setCallSite(com.android.dx.rop.cst.CstCallSite r2) {
            r1 = this;
            com.android.dx.rop.cst.CstCallSite r0 = r1.callSite
            if (r0 != 0) goto L11
            if (r2 == 0) goto L9
            r1.callSite = r2
            return
        L9:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "callSite == null"
            r2.<init>(r0)
            throw r2
        L11:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "already added call site"
            r2.<init>(r0)
            throw r2
    }

    public void setDeclaringClass(com.android.dx.rop.cst.CstType r2) {
            r1 = this;
            com.android.dx.rop.cst.CstType r0 = r1.declaringClass
            if (r0 != 0) goto L11
            if (r2 == 0) goto L9
            r1.declaringClass = r2
            return
        L9:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "declaringClass == null"
            r2.<init>(r0)
            throw r2
        L11:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "already added declaring class"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.android.dx.util.ToHuman
    public java.lang.String toHuman() {
            r3 = this;
            com.android.dx.rop.cst.CstType r0 = r3.declaringClass
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.toHuman()
            goto Lb
        L9:
            java.lang.String r0 = "Unknown"
        Lb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "InvokeDynamic("
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ":"
            r1.append(r0)
            int r0 = r3.bootstrapMethodIndex
            r1.append(r0)
            java.lang.String r0 = ", "
            r1.append(r0)
            com.android.dx.rop.cst.CstNat r0 = r3.nat
            java.lang.String r0 = r0.toHuman()
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.toHuman()
            return r0
    }

    @Override // com.android.dx.rop.cst.Constant
    public java.lang.String typeName() {
            r1 = this;
            java.lang.String r0 = "InvokeDynamic"
            return r0
    }
}
