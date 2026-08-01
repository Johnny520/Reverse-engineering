package com.android.dx.cf.iface;

import com.android.dx.rop.cst.CstNat;
import com.android.dx.rop.cst.CstString;
import com.android.dx.rop.cst.CstType;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public interface Member extends HasAttribute {
    int getAccessFlags();

    @Override // com.android.dx.cf.iface.HasAttribute
    AttributeList getAttributes();

    CstType getDefiningClass();

    CstString getDescriptor();

    CstString getName();

    CstNat getNat();
}
