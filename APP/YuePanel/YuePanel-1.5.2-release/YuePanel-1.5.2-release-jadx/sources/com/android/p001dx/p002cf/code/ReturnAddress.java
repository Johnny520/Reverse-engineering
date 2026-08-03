package com.android.p001dx.p002cf.code;

import com.android.p001dx.rop.type.Type;
import com.android.p001dx.rop.type.TypeBearer;
import com.android.p001dx.util.Hex;

/* JADX INFO: loaded from: classes.dex */
public final class ReturnAddress implements TypeBearer {
    private final int subroutineAddress;

    public ReturnAddress(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("subroutineAddress < 0");
        }
        this.subroutineAddress = i;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ReturnAddress) && this.subroutineAddress == ((ReturnAddress) obj).subroutineAddress;
    }

    @Override // com.android.p001dx.rop.type.TypeBearer
    public int getBasicFrameType() {
        return Type.RETURN_ADDRESS.getBasicFrameType();
    }

    @Override // com.android.p001dx.rop.type.TypeBearer
    public int getBasicType() {
        return Type.RETURN_ADDRESS.getBasicType();
    }

    @Override // com.android.p001dx.rop.type.TypeBearer
    public TypeBearer getFrameType() {
        return this;
    }

    public int getSubroutineAddress() {
        return this.subroutineAddress;
    }

    @Override // com.android.p001dx.rop.type.TypeBearer
    public Type getType() {
        return Type.RETURN_ADDRESS;
    }

    public int hashCode() {
        return this.subroutineAddress;
    }

    @Override // com.android.p001dx.rop.type.TypeBearer
    public boolean isConstant() {
        return false;
    }

    @Override // com.android.p001dx.util.ToHuman
    public String toHuman() {
        return toString();
    }

    public String toString() {
        return "<addr:" + Hex.m5035u2(this.subroutineAddress) + ">";
    }
}
