package com.android.dx.cf.code;

import com.android.dx.rop.type.Type;
import com.android.dx.rop.type.TypeBearer;
import com.android.dx.util.Hex;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ReturnAddress implements TypeBearer {
    private final int subroutineAddress;

    public ReturnAddress(int i) {
        if (i >= 0) {
            this.subroutineAddress = i;
        } else {
            C5925.m11310("subroutineAddress < 0");
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
