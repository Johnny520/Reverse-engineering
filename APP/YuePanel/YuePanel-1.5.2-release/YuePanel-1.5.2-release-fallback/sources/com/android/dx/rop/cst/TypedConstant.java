package com.android.dx.rop.cst;

/* JADX INFO: loaded from: classes.dex */
public abstract class TypedConstant extends com.android.dx.rop.cst.Constant implements com.android.dx.rop.type.TypeBearer {
    public TypedConstant() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public final int getBasicFrameType() {
            r1 = this;
            com.android.dx.rop.type.Type r0 = r1.getType()
            int r0 = r0.getBasicFrameType()
            return r0
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public final int getBasicType() {
            r1 = this;
            com.android.dx.rop.type.Type r0 = r1.getType()
            int r0 = r0.getBasicType()
            return r0
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public final com.android.dx.rop.type.TypeBearer getFrameType() {
            r0 = this;
            return r0
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public final boolean isConstant() {
            r1 = this;
            r0 = 1
            return r0
    }
}
