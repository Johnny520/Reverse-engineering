package com.android.p002dx.dex.code;

import com.android.p002dx.rop.code.RegisterSpecList;
import com.android.p002dx.rop.code.SourcePosition;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class SimpleInsn extends FixedSizeInsn {
    public SimpleInsn(Dop dop, SourcePosition sourcePosition, RegisterSpecList registerSpecList) {
        super(dop, sourcePosition, registerSpecList);
    }

    @Override // com.android.p002dx.dex.code.DalvInsn
    public String argString() {
        return null;
    }

    @Override // com.android.p002dx.dex.code.DalvInsn
    public DalvInsn withOpcode(Dop dop) {
        return new SimpleInsn(dop, getPosition(), getRegisters());
    }

    @Override // com.android.p002dx.dex.code.DalvInsn
    public DalvInsn withRegisters(RegisterSpecList registerSpecList) {
        return new SimpleInsn(getOpcode(), getPosition(), registerSpecList);
    }
}
