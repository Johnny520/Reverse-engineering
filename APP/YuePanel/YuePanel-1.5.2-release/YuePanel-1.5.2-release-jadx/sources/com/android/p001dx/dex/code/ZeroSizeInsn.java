package com.android.p001dx.dex.code;

import com.android.p001dx.rop.code.RegisterSpecList;
import com.android.p001dx.rop.code.SourcePosition;
import com.android.p001dx.util.AnnotatedOutput;

/* JADX INFO: loaded from: classes.dex */
public abstract class ZeroSizeInsn extends DalvInsn {
    public ZeroSizeInsn(SourcePosition sourcePosition) {
        super(Dops.SPECIAL_FORMAT, sourcePosition, RegisterSpecList.EMPTY);
    }

    @Override // com.android.p001dx.dex.code.DalvInsn
    public final int codeSize() {
        return 0;
    }

    @Override // com.android.p001dx.dex.code.DalvInsn
    public final DalvInsn withOpcode(Dop dop) {
        throw new RuntimeException("unsupported");
    }

    @Override // com.android.p001dx.dex.code.DalvInsn
    public DalvInsn withRegisterOffset(int i) {
        return withRegisters(getRegisters().withOffset(i));
    }

    @Override // com.android.p001dx.dex.code.DalvInsn
    public final void writeTo(AnnotatedOutput annotatedOutput) {
    }
}
