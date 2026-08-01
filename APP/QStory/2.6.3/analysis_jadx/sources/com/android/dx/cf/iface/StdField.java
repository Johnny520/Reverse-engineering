package com.android.dx.cf.iface;

import com.android.dx.cf.attrib.AttConstantValue;
import com.android.dx.rop.cst.CstNat;
import com.android.dx.rop.cst.CstType;
import com.android.dx.rop.cst.TypedConstant;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
