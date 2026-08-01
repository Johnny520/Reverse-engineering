package com.android.p002dx.dex.code;

import bsh.C3466;
import com.android.p002dx.rop.code.RegisterSpec;
import com.android.p002dx.rop.code.RegisterSpecList;
import com.android.p002dx.rop.code.SourcePosition;
import com.android.p002dx.ssa.RegisterMapper;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class LocalStart extends ZeroSizeInsn {
    private final RegisterSpec local;

    public LocalStart(SourcePosition sourcePosition, RegisterSpec registerSpec) {
        super(sourcePosition);
        if (registerSpec != null) {
            this.local = registerSpec;
        } else {
            C3466.m5903("local == null");
            throw null;
        }
    }

    public static String localString(RegisterSpec registerSpec) {
        return registerSpec.regString() + ' ' + registerSpec.getLocalItem().toString() + ": " + registerSpec.getTypeBearer().toHuman();
    }

    @Override // com.android.p002dx.dex.code.DalvInsn
    public String argString() {
        return this.local.toString();
    }

    public RegisterSpec getLocal() {
        return this.local;
    }

    @Override // com.android.p002dx.dex.code.DalvInsn
    public String listingString0(boolean z) {
        return "local-start " + localString(this.local);
    }

    @Override // com.android.p002dx.dex.code.DalvInsn
    public DalvInsn withMapper(RegisterMapper registerMapper) {
        return new LocalStart(getPosition(), registerMapper.map(this.local));
    }

    @Override // com.android.p002dx.dex.code.ZeroSizeInsn, com.android.p002dx.dex.code.DalvInsn
    public DalvInsn withRegisterOffset(int i) {
        return new LocalStart(getPosition(), this.local.withOffset(i));
    }

    @Override // com.android.p002dx.dex.code.DalvInsn
    public DalvInsn withRegisters(RegisterSpecList registerSpecList) {
        return new LocalStart(getPosition(), this.local);
    }
}
