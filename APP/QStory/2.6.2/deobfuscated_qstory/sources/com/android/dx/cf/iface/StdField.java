package com.android.dx.cf.iface;

import com.android.dx.cf.attrib.AttConstantValue;
import com.android.dx.rop.cst.CstNat;
import com.android.dx.rop.cst.CstType;
import com.android.dx.rop.cst.TypedConstant;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class StdField extends StdMember implements Field {
    public StdField(CstType cstType, int i, CstNat cstNat, AttributeList attributeList) {
        super(cstType, i, cstNat, attributeList);
    }

    @Override // com.android.dx.cf.iface.Field
    public TypedConstant getConstantValue() {
        AttConstantValue attConstantValue = (AttConstantValue) getAttributes().findFirst(AttConstantValue.ATTRIBUTE_NAME);
        if (attConstantValue == null) {
            return null;
        }
        return attConstantValue.getConstantValue();
    }
}
