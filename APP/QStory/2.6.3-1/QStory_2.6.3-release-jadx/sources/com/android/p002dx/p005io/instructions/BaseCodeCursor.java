package com.android.p002dx.p005io.instructions;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseCodeCursor implements CodeCursor {
    private final AddressMap baseAddressMap = new AddressMap();
    private int cursor = 0;

    public final void advance(int i) {
        this.cursor += i;
    }

    @Override // com.android.p002dx.p005io.instructions.CodeCursor
    public final int baseAddressForCursor() {
        int i = this.baseAddressMap.get(this.cursor);
        return i >= 0 ? i : this.cursor;
    }

    @Override // com.android.p002dx.p005io.instructions.CodeCursor
    public final int cursor() {
        return this.cursor;
    }

    @Override // com.android.p002dx.p005io.instructions.CodeCursor
    public final void setBaseAddress(int i, int i2) {
        this.baseAddressMap.put(i, i2);
    }
}
