package com.android.dx.dex.code;

import com.android.dx.rop.code.RegisterSpecList;
import com.android.dx.rop.code.SourcePosition;
import com.android.dx.util.AnnotatedOutput;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class OddSpacer extends VariableSizeInsn {
    public OddSpacer(SourcePosition sourcePosition) {
        super(sourcePosition, RegisterSpecList.EMPTY);
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public String argString() {
        return null;
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public int codeSize() {
        return getAddress() & 1;
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public String listingString0(boolean z) {
        if (codeSize() == 0) {
            return null;
        }
        return "nop // spacer";
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public DalvInsn withRegisters(RegisterSpecList registerSpecList) {
        return new OddSpacer(getPosition());
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public void writeTo(AnnotatedOutput annotatedOutput) {
        if (codeSize() != 0) {
            annotatedOutput.writeShort(InsnFormat.codeUnit(0, 0));
        }
    }
}
