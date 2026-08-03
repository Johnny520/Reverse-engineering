package com.android.p001dx.p002cf.iface;

import com.android.p001dx.p002cf.attrib.AttConstantValue;
import com.android.p001dx.rop.cst.CstNat;
import com.android.p001dx.rop.cst.CstType;
import com.android.p001dx.rop.cst.TypedConstant;

/* JADX INFO: loaded from: classes.dex */
public final class StdField extends StdMember implements Field {
    public StdField(CstType cstType, int i, CstNat cstNat, AttributeList attributeList) {
        super(cstType, i, cstNat, attributeList);
    }

    @Override // com.android.p001dx.p002cf.iface.Field
    public TypedConstant getConstantValue() {
        AttConstantValue attConstantValue = (AttConstantValue) getAttributes().findFirst(AttConstantValue.ATTRIBUTE_NAME);
        if (attConstantValue == null) {
            return null;
        }
        return attConstantValue.getConstantValue();
    }
}
