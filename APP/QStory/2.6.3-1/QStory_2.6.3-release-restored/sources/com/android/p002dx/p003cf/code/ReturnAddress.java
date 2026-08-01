package com.android.p002dx.p003cf.code;

import com.android.p002dx.rop.type.Type;
import com.android.p002dx.rop.type.TypeBearer;
import com.android.p002dx.util.Hex;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ReturnAddress implements TypeBearer {
    private final int subroutineAddress;

    public ReturnAddress(int i) {
        if (i >= 0) {
            this.subroutineAddress = i;
        } else {
            C6755.m11869("subroutineAddress < 0");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof ReturnAddress) && this.subroutineAddress == ((ReturnAddress) obj).subroutineAddress;
    }

    @Override // com.android.p002dx.rop.type.TypeBearer
    public int getBasicFrameType() {
        return Type.RETURN_ADDRESS.getBasicFrameType();
    }

    @Override // com.android.p002dx.rop.type.TypeBearer
    public int getBasicType() {
        return Type.RETURN_ADDRESS.getBasicType();
    }

    public int getSubroutineAddress() {
        return this.subroutineAddress;
    }

    @Override // com.android.p002dx.rop.type.TypeBearer
    public Type getType() {
        return Type.RETURN_ADDRESS;
    }

    public int hashCode() {
        return this.subroutineAddress;
    }

    @Override // com.android.p002dx.rop.type.TypeBearer
    public boolean isConstant() {
        return false;
    }

    @Override // com.android.p002dx.util.ToHuman
    public String toHuman() {
        return toString();
    }

    public String toString() {
        return "<addr:" + Hex.m28u2(this.subroutineAddress) + ">";
    }

    @Override // com.android.p002dx.rop.type.TypeBearer
    public TypeBearer getFrameType() {
        return this;
    }
}
