package com.android.p001dx.p002cf.iface;

import com.android.p001dx.rop.cst.CstNat;
import com.android.p001dx.rop.cst.CstString;
import com.android.p001dx.rop.cst.CstType;

/* JADX INFO: loaded from: classes.dex */
public interface Member extends HasAttribute {
    int getAccessFlags();

    @Override // com.android.p001dx.p002cf.iface.HasAttribute
    AttributeList getAttributes();

    CstType getDefiningClass();

    CstString getDescriptor();

    CstString getName();

    CstNat getNat();
}
