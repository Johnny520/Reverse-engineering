package com.android.p001dx.p002cf.iface;

import com.android.p001dx.rop.code.AccessFlags;
import com.android.p001dx.rop.cst.CstNat;
import com.android.p001dx.rop.cst.CstType;
import com.android.p001dx.rop.type.Prototype;

/* JADX INFO: loaded from: classes.dex */
public final class StdMethod extends StdMember implements Method {
    private final Prototype effectiveDescriptor;

    public StdMethod(CstType cstType, int i, CstNat cstNat, AttributeList attributeList) {
        super(cstType, i, cstNat, attributeList);
        this.effectiveDescriptor = Prototype.intern(getDescriptor().getString(), cstType.getClassType(), AccessFlags.isStatic(i), cstNat.isInstanceInit());
    }

    @Override // com.android.p001dx.p002cf.iface.Method
    public Prototype getEffectiveDescriptor() {
        return this.effectiveDescriptor;
    }
}
