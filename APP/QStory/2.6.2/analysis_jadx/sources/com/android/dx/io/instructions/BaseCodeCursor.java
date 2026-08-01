package com.android.dx.io.instructions;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseCodeCursor implements CodeCursor {
    private final AddressMap baseAddressMap = new AddressMap();
    private int cursor = 0;

    public final void advance(int i) {
        this.cursor += i;
    }

    @Override // com.android.dx.io.instructions.CodeCursor
    public final int baseAddressForCursor() {
        int i = this.baseAddressMap.get(this.cursor);
        return i >= 0 ? i : this.cursor;
    }

    @Override // com.android.dx.io.instructions.CodeCursor
    public final int cursor() {
        return this.cursor;
    }

    @Override // com.android.dx.io.instructions.CodeCursor
    public final void setBaseAddress(int i, int i2) {
        this.baseAddressMap.put(i, i2);
    }
}
