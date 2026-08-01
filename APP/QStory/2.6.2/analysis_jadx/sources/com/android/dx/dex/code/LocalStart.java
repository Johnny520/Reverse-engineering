package com.android.dx.dex.code;

import bsh.C2632;
import com.android.dx.rop.code.RegisterSpec;
import com.android.dx.rop.code.RegisterSpecList;
import com.android.dx.rop.code.SourcePosition;
import com.android.dx.ssa.RegisterMapper;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class LocalStart extends ZeroSizeInsn {
    private final RegisterSpec local;

    public LocalStart(SourcePosition sourcePosition, RegisterSpec registerSpec) {
        super(sourcePosition);
        if (registerSpec != null) {
            this.local = registerSpec;
        } else {
            C2632.m5298("local == null");
            throw null;
        }
    }

    public static String localString(RegisterSpec registerSpec) {
        return registerSpec.regString() + ' ' + registerSpec.getLocalItem().toString() + ": " + registerSpec.getTypeBearer().toHuman();
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public String argString() {
        return this.local.toString();
    }

    public RegisterSpec getLocal() {
        return this.local;
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public String listingString0(boolean z) {
        return "local-start " + localString(this.local);
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public DalvInsn withMapper(RegisterMapper registerMapper) {
        return new LocalStart(getPosition(), registerMapper.map(this.local));
    }

    @Override // com.android.dx.dex.code.ZeroSizeInsn, com.android.dx.dex.code.DalvInsn
    public DalvInsn withRegisterOffset(int i) {
        return new LocalStart(getPosition(), this.local.withOffset(i));
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public DalvInsn withRegisters(RegisterSpecList registerSpecList) {
        return new LocalStart(getPosition(), this.local);
    }
}
