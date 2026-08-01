package com.android.dx.cf.code;

import com.android.dx.rop.type.Type;
import com.android.dx.rop.type.TypeBearer;
import com.android.dx.util.Hex;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ReturnAddress implements TypeBearer {
    private final int subroutineAddress;

    public ReturnAddress(int i) {
        if (i >= 0) {
            this.subroutineAddress = i;
        } else {
            C5919.m11249("subroutineAddress < 0");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof ReturnAddress) && this.subroutineAddress == ((ReturnAddress) obj).subroutineAddress;
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public int getBasicFrameType() {
        return Type.RETURN_ADDRESS.getBasicFrameType();
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public int getBasicType() {
        return Type.RETURN_ADDRESS.getBasicType();
    }

    public int getSubroutineAddress() {
        return this.subroutineAddress;
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public Type getType() {
        return Type.RETURN_ADDRESS;
    }

    public int hashCode() {
        return this.subroutineAddress;
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public boolean isConstant() {
        return false;
    }

    @Override // com.android.dx.util.ToHuman
    public String toHuman() {
        return toString();
    }

    public String toString() {
        return "<addr:" + Hex.u2(this.subroutineAddress) + ">";
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public TypeBearer getFrameType() {
        return this;
    }
}
