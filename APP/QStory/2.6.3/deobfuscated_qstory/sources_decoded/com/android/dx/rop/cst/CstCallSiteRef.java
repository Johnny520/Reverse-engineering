package com.android.dx.rop.cst;

import bsh.C2633;
import com.android.dx.rop.type.Prototype;
import com.android.dx.rop.type.Type;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class CstCallSiteRef extends Constant {
    private final int id;
    private final CstInvokeDynamic invokeDynamic;

    public CstCallSiteRef(CstInvokeDynamic cstInvokeDynamic, int i) {
        if (cstInvokeDynamic == null) {
            C2633.m5343("invokeDynamic == null");
            throw null;
        }
        this.invokeDynamic = cstInvokeDynamic;
        this.id = i;
    }

    @Override // com.android.dx.rop.cst.Constant
    public int compareTo0(Constant constant) {
        CstCallSiteRef cstCallSiteRef = (CstCallSiteRef) constant;
        int iCompareTo = this.invokeDynamic.compareTo((Constant) cstCallSiteRef.invokeDynamic);
        return iCompareTo != 0 ? iCompareTo : Integer.compare(this.id, cstCallSiteRef.id);
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

    @Override // com.android.dx.rop.cst.Constant
    public boolean isCategory2() {
        return false;
    }

    @Override // com.android.dx.util.ToHuman
    public String toHuman() {
        return getCallSite().toHuman();
    }

    public String toString() {
        return getCallSite().toString();
    }

    @Override // com.android.dx.rop.cst.Constant
    public String typeName() {
        return "CallSiteRef";
    }
}
