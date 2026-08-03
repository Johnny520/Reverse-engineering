package com.android.dx.cf.iface;

/* JADX INFO: loaded from: classes.dex */
public interface Member extends com.android.dx.cf.iface.HasAttribute {
    int getAccessFlags();

    @Override // com.android.dx.cf.iface.HasAttribute
    com.android.dx.cf.iface.AttributeList getAttributes();

    com.android.dx.rop.cst.CstType getDefiningClass();

    com.android.dx.rop.cst.CstString getDescriptor();

    com.android.dx.rop.cst.CstString getName();

    com.android.dx.rop.cst.CstNat getNat();
}
