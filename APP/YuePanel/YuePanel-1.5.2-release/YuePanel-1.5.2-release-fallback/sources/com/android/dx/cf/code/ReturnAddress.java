package com.android.dx.cf.code;

/* JADX INFO: loaded from: classes.dex */
public final class ReturnAddress implements com.android.dx.rop.type.TypeBearer {
    private final int subroutineAddress;

    public ReturnAddress(int r2) {
            r1 = this;
            r1.<init>()
            if (r2 < 0) goto L8
            r1.subroutineAddress = r2
            return
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "subroutineAddress < 0"
            r2.<init>(r0)
            throw r2
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof com.android.dx.cf.code.ReturnAddress
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r2.subroutineAddress
            com.android.dx.cf.code.ReturnAddress r3 = (com.android.dx.cf.code.ReturnAddress) r3
            int r3 = r3.subroutineAddress
            if (r0 != r3) goto Lf
            r1 = 1
        Lf:
            return r1
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public int getBasicFrameType() {
            r1 = this;
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.RETURN_ADDRESS
            int r0 = r0.getBasicFrameType()
            return r0
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public int getBasicType() {
            r1 = this;
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.RETURN_ADDRESS
            int r0 = r0.getBasicType()
            return r0
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public com.android.dx.rop.type.TypeBearer getFrameType() {
            r0 = this;
            return r0
    }

    public int getSubroutineAddress() {
            r1 = this;
            int r0 = r1.subroutineAddress
            return r0
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public com.android.dx.rop.type.Type getType() {
            r1 = this;
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.RETURN_ADDRESS
            return r0
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.subroutineAddress
            return r0
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public boolean isConstant() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.android.dx.util.ToHuman
    public java.lang.String toHuman() {
            r1 = this;
            java.lang.String r0 = r1.toString()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "<addr:"
            r0.append(r1)
            int r1 = r2.subroutineAddress
            java.lang.String r1 = com.android.dx.util.Hex.u2(r1)
            r0.append(r1)
            java.lang.String r1 = ">"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
