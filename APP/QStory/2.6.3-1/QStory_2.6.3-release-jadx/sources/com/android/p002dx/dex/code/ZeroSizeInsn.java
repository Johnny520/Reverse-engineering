package com.android.p002dx.dex.code;

import com.android.p002dx.rop.code.RegisterSpecList;
import com.android.p002dx.rop.code.SourcePosition;
import com.android.p002dx.util.AnnotatedOutput;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ZeroSizeInsn extends DalvInsn {
    public ZeroSizeInsn(SourcePosition sourcePosition) {
        super(Dops.SPECIAL_FORMAT, sourcePosition, RegisterSpecList.EMPTY);
    }

    @Override // com.android.p002dx.dex.code.DalvInsn
    public final int codeSize() {
        return 0;
    }

    @Override // com.android.p002dx.dex.code.DalvInsn
    public final DalvInsn withOpcode(Dop dop) {
        throw new RuntimeException("unsupported");
    }

    @Override // com.android.p002dx.dex.code.DalvInsn
    public DalvInsn withRegisterOffset(int i) {
        return withRegisters(getRegisters().withOffset(i));
    }

    @Override // com.android.p002dx.dex.code.DalvInsn
    public final void writeTo(AnnotatedOutput annotatedOutput) {
    }
}
