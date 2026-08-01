package com.android.p002dx.rop.cst;

import bsh.C3466;
import com.android.p002dx.rop.type.Prototype;
import com.android.p002dx.rop.type.Type;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class CstCallSiteRef extends Constant {

    /* JADX INFO: renamed from: id */
    private final int f50id;
    private final CstInvokeDynamic invokeDynamic;

    public CstCallSiteRef(CstInvokeDynamic cstInvokeDynamic, int i) {
        if (cstInvokeDynamic == null) {
            C3466.m5903("invokeDynamic == null");
            throw null;
        }
        this.invokeDynamic = cstInvokeDynamic;
        this.f50id = i;
    }

    @Override // com.android.p002dx.rop.cst.Constant
    public int compareTo0(Constant constant) {
        CstCallSiteRef cstCallSiteRef = (CstCallSiteRef) constant;
        int iCompareTo = this.invokeDynamic.compareTo((Constant) cstCallSiteRef.invokeDynamic);
        return iCompareTo != 0 ? iCompareTo : Integer.compare(this.f50id, cstCallSiteRef.f50id);
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

    @Override // com.android.p002dx.rop.cst.Constant
    public boolean isCategory2() {
        return false;
    }

    @Override // com.android.p002dx.util.ToHuman
    public String toHuman() {
        return getCallSite().toHuman();
    }

    public String toString() {
        return getCallSite().toString();
    }

    @Override // com.android.p002dx.rop.cst.Constant
    public String typeName() {
        return "CallSiteRef";
    }
}
