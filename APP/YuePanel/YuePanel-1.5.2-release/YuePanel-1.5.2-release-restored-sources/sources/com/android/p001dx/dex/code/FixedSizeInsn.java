package com.android.p001dx.dex.code;

import com.android.p001dx.rop.code.RegisterSpecList;
import com.android.p001dx.rop.code.SourcePosition;
import com.android.p001dx.util.AnnotatedOutput;

/* JADX INFO: loaded from: classes.dex */
public abstract class FixedSizeInsn extends DalvInsn {
    public FixedSizeInsn(Dop dop, SourcePosition sourcePosition, RegisterSpecList registerSpecList) {
        super(dop, sourcePosition, registerSpecList);
    }

    @Override // com.android.p001dx.dex.code.DalvInsn
    public final int codeSize() {
        return getOpcode().getFormat().codeSize();
    }

    @Override // com.android.p001dx.dex.code.DalvInsn
    public final String listingString0(boolean z) {
        return getOpcode().getFormat().listingString(this, z);
    }

    @Override // com.android.p001dx.dex.code.DalvInsn
    public final DalvInsn withRegisterOffset(int i) {
        return withRegisters(getRegisters().withOffset(i));
    }

    @Override // com.android.p001dx.dex.code.DalvInsn
    public final void writeTo(AnnotatedOutput annotatedOutput) {
        getOpcode().getFormat().writeTo(annotatedOutput, this);
    }
}
