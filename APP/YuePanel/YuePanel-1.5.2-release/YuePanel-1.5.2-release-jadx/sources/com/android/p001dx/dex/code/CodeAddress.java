package com.android.p001dx.dex.code;

import com.android.p001dx.rop.code.RegisterSpecList;
import com.android.p001dx.rop.code.SourcePosition;

/* JADX INFO: loaded from: classes.dex */
public final class CodeAddress extends ZeroSizeInsn {
    private final boolean bindsClosely;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CodeAddress(SourcePosition sourcePosition) {
        this(sourcePosition, false);
    }

    @Override // com.android.p001dx.dex.code.DalvInsn
    public String argString() {
        return null;
    }

    public boolean getBindsClosely() {
        return this.bindsClosely;
    }

    @Override // com.android.p001dx.dex.code.DalvInsn
    public String listingString0(boolean z) {
        return "code-address";
    }

    @Override // com.android.p001dx.dex.code.DalvInsn
    public final DalvInsn withRegisters(RegisterSpecList registerSpecList) {
        return new CodeAddress(getPosition());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public CodeAddress(SourcePosition sourcePosition, boolean z) {
        super(sourcePosition);
        this.bindsClosely = z;
    }
}
