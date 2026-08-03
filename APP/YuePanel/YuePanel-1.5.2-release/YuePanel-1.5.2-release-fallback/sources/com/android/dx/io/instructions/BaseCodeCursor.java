package com.android.dx.io.instructions;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseCodeCursor implements com.android.dx.io.instructions.CodeCursor {
    private final com.android.dx.io.instructions.AddressMap baseAddressMap;
    private int cursor;

    public BaseCodeCursor() {
            r1 = this;
            r1.<init>()
            com.android.dx.io.instructions.AddressMap r0 = new com.android.dx.io.instructions.AddressMap
            r0.<init>()
            r1.baseAddressMap = r0
            r0 = 0
            r1.cursor = r0
            return
    }

    public final void advance(int r2) {
            r1 = this;
            int r0 = r1.cursor
            int r0 = r0 + r2
            r1.cursor = r0
            return
    }

    @Override // com.android.dx.io.instructions.CodeCursor
    public final int baseAddressForCursor() {
            r2 = this;
            com.android.dx.io.instructions.AddressMap r0 = r2.baseAddressMap
            int r1 = r2.cursor
            int r0 = r0.get(r1)
            if (r0 < 0) goto Lb
            goto Ld
        Lb:
            int r0 = r2.cursor
        Ld:
            return r0
    }

    @Override // com.android.dx.io.instructions.CodeCursor
    public final int cursor() {
            r1 = this;
            int r0 = r1.cursor
            return r0
    }

    @Override // com.android.dx.io.instructions.CodeCursor
    public final void setBaseAddress(int r2, int r3) {
            r1 = this;
            com.android.dx.io.instructions.AddressMap r0 = r1.baseAddressMap
            r0.put(r2, r3)
            return
    }
}
