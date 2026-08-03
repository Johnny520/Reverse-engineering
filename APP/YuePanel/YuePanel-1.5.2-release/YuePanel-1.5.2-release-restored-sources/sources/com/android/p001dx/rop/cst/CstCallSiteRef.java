package com.android.p001dx.rop.cst;

import com.android.p001dx.rop.type.Prototype;
import com.android.p001dx.rop.type.Type;

/* JADX INFO: loaded from: classes.dex */
public class CstCallSiteRef extends Constant {

    /* JADX INFO: renamed from: id */
    private final int f4037id;
    private final CstInvokeDynamic invokeDynamic;

    public CstCallSiteRef(CstInvokeDynamic cstInvokeDynamic, int i) {
        if (cstInvokeDynamic == null) {
            throw new NullPointerException("invokeDynamic == null");
        }
        this.invokeDynamic = cstInvokeDynamic;
        this.f4037id = i;
    }

    @Override // com.android.p001dx.rop.cst.Constant
    public int compareTo0(Constant constant) {
        CstCallSiteRef cstCallSiteRef = (CstCallSiteRef) constant;
        int iCompareTo = this.invokeDynamic.compareTo((Constant) cstCallSiteRef.invokeDynamic);
        return iCompareTo != 0 ? iCompareTo : Integer.compare(this.f4037id, cstCallSiteRef.f4037id);
    }

    public CstCallSite getCallSite() {
        return this.invokeDynamic.getCallSite();
    }

    public Prototype getPrototype() {
        return this.invokeDynamic.getPrototype();
    }

    public Type getReturnType() {
        return this.invokeDynamic.getReturnType();
    }

    @Override // com.android.p001dx.rop.cst.Constant
    public boolean isCategory2() {
        return false;
    }

    @Override // com.android.p001dx.util.ToHuman
    public String toHuman() {
        return getCallSite().toHuman();
    }

    public String toString() {
        return getCallSite().toString();
    }

    @Override // com.android.p001dx.rop.cst.Constant
    public String typeName() {
        return "CallSiteRef";
    }
}
