package com.android.p001dx.dex.code;

import com.android.p001dx.rop.code.RegisterSpecList;
import com.android.p001dx.rop.code.SourcePosition;

/* JADX INFO: loaded from: classes.dex */
public abstract class VariableSizeInsn extends DalvInsn {
    public VariableSizeInsn(SourcePosition sourcePosition, RegisterSpecList registerSpecList) {
        super(Dops.SPECIAL_FORMAT, sourcePosition, registerSpecList);
    }

    @Override // com.android.p001dx.dex.code.DalvInsn
    public final DalvInsn withOpcode(Dop dop) {
        throw new RuntimeException("unsupported");
    }

    @Override // com.android.p001dx.dex.code.DalvInsn
    public final DalvInsn withRegisterOffset(int i) {
        return withRegisters(getRegisters().withOffset(i));
    }
}
