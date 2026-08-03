package com.android.p001dx.rop.cst;

import com.android.p001dx.rop.type.TypeBearer;

/* JADX INFO: loaded from: classes.dex */
public abstract class TypedConstant extends Constant implements TypeBearer {
    @Override // com.android.p001dx.rop.type.TypeBearer
    public final int getBasicFrameType() {
        return getType().getBasicFrameType();
    }

    @Override // com.android.p001dx.rop.type.TypeBearer
    public final int getBasicType() {
        return getType().getBasicType();
    }

    @Override // com.android.p001dx.rop.type.TypeBearer
    public final TypeBearer getFrameType() {
        return this;
    }

    @Override // com.android.p001dx.rop.type.TypeBearer
    public final boolean isConstant() {
        return true;
    }
}
