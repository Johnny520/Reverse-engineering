package com.android.dx.rop.cst;

import com.android.dx.rop.type.TypeBearer;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class TypedConstant extends Constant implements TypeBearer {
    @Override // com.android.dx.rop.type.TypeBearer
    public final int getBasicFrameType() {
        return getType().getBasicFrameType();
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public final int getBasicType() {
        return getType().getBasicType();
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public final boolean isConstant() {
        return true;
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public final TypeBearer getFrameType() {
        return this;
    }
}
