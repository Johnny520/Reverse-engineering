package com.android.dx.dex.code;

import com.android.dx.rop.code.RegisterSpecList;
import com.android.dx.rop.code.SourcePosition;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class CodeAddress extends ZeroSizeInsn {
    private final boolean bindsClosely;

    public CodeAddress(SourcePosition sourcePosition, boolean z) {
        super(sourcePosition);
        this.bindsClosely = z;
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public String argString() {
        return null;
    }

    public boolean getBindsClosely() {
        return this.bindsClosely;
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public String listingString0(boolean z) {
        return "code-address";
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public final DalvInsn withRegisters(RegisterSpecList registerSpecList) {
        return new CodeAddress(getPosition());
    }

    public CodeAddress(SourcePosition sourcePosition) {
        this(sourcePosition, false);
    }
}
