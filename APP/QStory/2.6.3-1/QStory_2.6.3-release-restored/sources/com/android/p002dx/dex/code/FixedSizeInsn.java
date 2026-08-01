package com.android.p002dx.dex.code;

import com.android.p002dx.rop.code.RegisterSpecList;
import com.android.p002dx.rop.code.SourcePosition;
import com.android.p002dx.util.AnnotatedOutput;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class FixedSizeInsn extends DalvInsn {
    public FixedSizeInsn(Dop dop, SourcePosition sourcePosition, RegisterSpecList registerSpecList) {
        super(dop, sourcePosition, registerSpecList);
    }

    @Override // com.android.p002dx.dex.code.DalvInsn
    public final int codeSize() {
        return getOpcode().getFormat().codeSize();
    }

    @Override // com.android.p002dx.dex.code.DalvInsn
    public final String listingString0(boolean z) {
        return getOpcode().getFormat().listingString(this, z);
    }

    @Override // com.android.p002dx.dex.code.DalvInsn
    public final DalvInsn withRegisterOffset(int i) {
        return withRegisters(getRegisters().withOffset(i));
    }

    @Override // com.android.p002dx.dex.code.DalvInsn
    public final void writeTo(AnnotatedOutput annotatedOutput) {
        getOpcode().getFormat().writeTo(annotatedOutput, this);
    }
}
