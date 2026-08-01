package com.android.dx.rop.cst;

import com.android.dx.rop.type.TypeBearer;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
