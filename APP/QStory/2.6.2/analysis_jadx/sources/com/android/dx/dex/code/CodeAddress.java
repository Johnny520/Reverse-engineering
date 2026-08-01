package com.android.dx.dex.code;

import com.android.dx.rop.code.RegisterSpecList;
import com.android.dx.rop.code.SourcePosition;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
