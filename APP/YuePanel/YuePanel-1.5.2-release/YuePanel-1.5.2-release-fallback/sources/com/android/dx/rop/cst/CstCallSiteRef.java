package com.android.dx.rop.cst;

/* JADX INFO: loaded from: classes.dex */
public class CstCallSiteRef extends com.android.dx.rop.cst.Constant {
    private final int id;
    private final com.android.dx.rop.cst.CstInvokeDynamic invokeDynamic;

    public CstCallSiteRef(com.android.dx.rop.cst.CstInvokeDynamic r1, int r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto La
            r0.invokeDynamic = r1
            r0.id = r2
            return
        La:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "invokeDynamic == null"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.android.dx.rop.cst.Constant
    public int compareTo0(com.android.dx.rop.cst.Constant r3) {
            r2 = this;
            com.android.dx.rop.cst.CstCallSiteRef r3 = (com.android.dx.rop.cst.CstCallSiteRef) r3
            com.android.dx.rop.cst.CstInvokeDynamic r0 = r2.invokeDynamic
            com.android.dx.rop.cst.CstInvokeDynamic r1 = r3.invokeDynamic
            int r0 = r0.compareTo2(r1)
            if (r0 == 0) goto Ld
            return r0
        Ld:
            int r0 = r2.id
            int r3 = r3.id
            int r3 = java.lang.Integer.compare(r0, r3)
            return r3
    }

    public com.android.dx.rop.cst.CstCallSite getCallSite() {
            r1 = this;
            com.android.dx.rop.cst.CstInvokeDynamic r0 = r1.invokeDynamic
            com.android.dx.rop.cst.CstCallSite r0 = r0.getCallSite()
            return r0
    }

    public com.android.dx.rop.type.Prototype getPrototype() {
            r1 = this;
            com.android.dx.rop.cst.CstInvokeDynamic r0 = r1.invokeDynamic
            com.android.dx.rop.type.Prototype r0 = r0.getPrototype()
            return r0
    }

    public com.android.dx.rop.type.Type getReturnType() {
            r1 = this;
            com.android.dx.rop.cst.CstInvokeDynamic r0 = r1.invokeDynamic
            com.android.dx.rop.type.Type r0 = r0.getReturnType()
            return r0
    }

    @Override // com.android.dx.rop.cst.Constant
    public boolean isCategory2() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.android.dx.util.ToHuman
    public java.lang.String toHuman() {
            r1 = this;
            com.android.dx.rop.cst.CstCallSite r0 = r1.getCallSite()
            java.lang.String r0 = r0.toHuman()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            com.android.dx.rop.cst.CstCallSite r0 = r1.getCallSite()
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.android.dx.rop.cst.Constant
    public java.lang.String typeName() {
            r1 = this;
            java.lang.String r0 = "CallSiteRef"
            return r0
    }
}
