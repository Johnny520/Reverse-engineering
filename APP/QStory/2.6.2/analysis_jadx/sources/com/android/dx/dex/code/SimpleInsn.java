package com.android.dx.dex.code;

import com.android.dx.rop.code.RegisterSpecList;
import com.android.dx.rop.code.SourcePosition;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class SimpleInsn extends FixedSizeInsn {
    public SimpleInsn(Dop dop, SourcePosition sourcePosition, RegisterSpecList registerSpecList) {
        super(dop, sourcePosition, registerSpecList);
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public String argString() {
        return null;
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public DalvInsn withOpcode(Dop dop) {
        return new SimpleInsn(dop, getPosition(), getRegisters());
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public DalvInsn withRegisters(RegisterSpecList registerSpecList) {
        return new SimpleInsn(getOpcode(), getPosition(), registerSpecList);
    }
}
